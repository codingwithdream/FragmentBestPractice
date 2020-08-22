package com.dreamxu.fragmentbestpractice

import java.lang.StringBuilder

fun main() {
    for (new in getNews()) {
        println(new.title)
    }
}

fun getNews(): List<News> {
    val newsList = ArrayList<News>()
    for (i in 1..5) {
        val news = News("This is news title $i", getRandomLengthString("This is news content $i"))
        newsList.add(news)
    }
    return newsList
}

fun getRandomLengthString(str: String): String {
    val n = (1..20).random()
    val stringBuilder = StringBuilder()
    repeat(n) {
        stringBuilder.append(str)
    }
    return stringBuilder.toString()
}