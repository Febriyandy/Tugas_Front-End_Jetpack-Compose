package com.febriandi.febriandiproject.navigation

import com.febriandi.febriandiproject.R

sealed class Screen(val route: String, val icon: Int, val label: String) {
    object Home : Screen("home", R.drawable.icon_home, "Beranda")
    object Paket : Screen("paket", R.drawable.icon_paket, "Paket")
    object Profile : Screen("profile", R.drawable.icon_profile, "Profile")

    companion object {
        fun fromRoute(route: String?): Screen {
            return when (route) {
                Home.route -> Home
                Paket.route -> Paket
                Profile.route -> Profile
                else -> Home
            }
        }
    }
}


