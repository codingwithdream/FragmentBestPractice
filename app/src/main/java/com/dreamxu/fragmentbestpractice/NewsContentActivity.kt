package com.dreamxu.fragmentbestpractice

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dreamxu.fragmentbestpractice.fragment.NewsContentFragment
import kotlinx.android.synthetic.main.activity_news_content.*

class NewsContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_content)
        val title = intent.getStringExtra("news_title")
        val content = intent.getStringExtra("news_content")
        if (title != null && content != null ) {
            val fragment = news_content_frag as NewsContentFragment
            fragment.refresh(title, content)
        }
    }

    companion object {
        fun actionStart(context: Context, newsTitle: String, newsContent: String) {
            val intent = Intent(context, NewsContentActivity::class.java).apply {
                putExtra("news_title", newsTitle)
                putExtra("news_content", newsContent)
            }
            context.startActivity(intent)
        }
    }
}
