package com.loc.newsapp.presentation.onboarding

import android.content.ClipDescription
import androidx.annotation.DrawableRes
import androidx.paging.PagingSource
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Welcome to Khabar!",
        description = "Stay informed with the latest news and updates from around the world. Khabar brings you the headlines that matter, delivered straight to your device",
        image = R.drawable.ronaldo

    ),
    Page(
        title = "Tailor Your News",
        description = "Choose your interests and follow your favorite topics. Khabar will curate a news feed just for you, so you never miss out on what matters most",
        image = R.drawable.tree

    ),
    Page(
        title = "Real-Time Updates",
        description = "Receive breaking news alerts and updates as they happen. Stay ahead with instant notifications and never miss a moment",
        image = R.drawable.fede

    )

)