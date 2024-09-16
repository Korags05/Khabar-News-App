package com.loc.newsapp.presentation.NavGraph

import okhttp3.Route

sealed class Routes(
    val route: String
) {
    object OnBoardingScreen : Routes(route = "OnBoardingScreen")
    object HomeScreen : Routes(route = "homeScreen")
    object SearchScreen : Routes(route = "searchScreen")
    object BookMarkScreen : Routes(route = "bookMarkScreen")
    object DetailScreen : Routes(route = "detailScreen")
    object AppStartNavigation : Routes(route = "appStartNavigation")
    object NewsNavigation : Routes(route = "newsNavigation")
    object NewsNavigatorScreen : Routes(route = "newsNavigator")
}