package com.androiddevs.mvvmnewsapp.ui.main.view.article

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.ui.main.NewsActivity
import com.androiddevs.mvvmnewsapp.ui.view.ArticleFragmentArgs
import com.androiddevs.mvvmnewsapp.ui.main.viewmodel.NewsViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_article.*

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

        val article = args.article

        webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }
        fab.setOnClickListener {
            viewModel.savedArticle(article)
            Snackbar.make(view, "Article Saved Successfully", Snackbar.LENGTH_SHORT).show()
        }
    }
}