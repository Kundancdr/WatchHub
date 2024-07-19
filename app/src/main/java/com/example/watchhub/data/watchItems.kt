package com.example.watchhub.data

import com.example.watchhub.Model.CategoryViewPager
import com.example.watchhub.Model.Watch
import com.example.watchhub.R

val watchItems = listOf(
    Watch(
        name = "Apple Watch",
        type = "Series 7",
        image = R.drawable.img_watch_1,
        price = "$799"
    ),
    Watch(
        name = "Galaxy Watch",
        type = "Series 4",
        image = R.drawable.img_watch_2,
        price = "$599"
    ),
    Watch(
        name = "Mi Watch",
        type = "All Series",
        image = R.drawable.img_watch_3,
        price = "$299"
    ),
    Watch(
        name = "Amazfit Bip U",
        type = "Pro Series",
        image = R.drawable.img_watch_4,
        price = "$199"
    ),
)

val itemsViewPager = listOf(
    CategoryViewPager(name = "Search Product"),
    CategoryViewPager(name = "Brand")
)