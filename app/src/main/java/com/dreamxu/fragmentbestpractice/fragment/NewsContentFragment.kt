package com.dreamxu.fragmentbestpractice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dreamxu.fragmentbestpractice.R
import kotlinx.android.synthetic.main.fragment_news_content.*

class NewsContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news_content, container, false)
    }

    fun refresh(title: String, content: String) {
        content_layout.visibility = View.VISIBLE
        news_title.text = title
        news_content.text = content
    }
}
