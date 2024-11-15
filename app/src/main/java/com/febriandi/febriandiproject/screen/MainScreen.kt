package com.febriandi.agrojaya.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.febriandi.febriandiproject.screen.HomeScreen
import com.febriandi.febriandiproject.screen.NavItem
import com.febriandi.febriandiproject.screen.ProfileScreen
import com.febriandi.febriandiproject.ui.theme.CustomFontFamily as CustomFontFamily1
import com.febriandi.febriandiproject.R
import com.febriandi.febriandiproject.screen.DetailArtikelScreen
import com.febriandi.febriandiproject.screen.DetailGalleryScreen
import com.febriandi.febriandiproject.screen.DetailPaketScreen
import com.febriandi.febriandiproject.screen.GalleryScreen


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val navItemList = listOf(
        NavItem("Beranda", R.drawable.icon_home),
        NavItem("Gallery", R.drawable.icon_gallery),
        NavItem("Profile", R.drawable.icon_profile),
    )

    var selectedIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(
                containerColor = colorResource(id = R.color.blue_50)
            ) {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = {
                            selectedIndex = index
                            when (index) {
                                0 -> navController.navigate("home")
                                1 -> navController.navigate("gallery")
                                2 -> navController.navigate("profile")
                            }
                        },
                        icon = {
                            Icon(
                                painter = painterResource(id = navItem.icon),
                                contentDescription = navItem.label,
                                tint = if (selectedIndex == index) colorResource(id = R.color.blue_400) else colorResource(
                                    id = R.color.text_color
                                )
                            )
                        },
                        label = {
                            Text(
                                text = navItem.label,
                                color = if (selectedIndex == index) colorResource(id = R.color.blue_400) else colorResource(
                                    id = R.color.text_color,
                                ),
                                fontWeight = if (selectedIndex == index) FontWeight.SemiBold else FontWeight.Normal,
                                fontSize = 12.sp,
                                fontFamily = CustomFontFamily1,
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = colorResource(id = R.color.blue_400),
                            unselectedIconColor = colorResource(id = R.color.text_color),
                            selectedTextColor = colorResource(id = R.color.blue_400),
                            unselectedTextColor = colorResource(id = R.color.text_color),
                            indicatorColor = colorResource(id = R.color.blue_50)
                        ),
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            composable("home") { HomeScreen(navController) }
            composable("gallery") { GalleryScreen(navController) }
            composable("profile") { ProfileScreen() }
            composable(
                "detailArtikel/{artikelId}",
                arguments = listOf(
                    navArgument("artikelId") {
                        type = NavType.IntType
                        nullable = false
                    }
                )
            ) { backStackEntry ->
                DetailArtikelScreen(
                    navController = navController,
                    artikelId = backStackEntry.arguments?.getInt("artikelId")
                )
            }
            composable(
                "detailPaket/{paketId}",
                arguments = listOf(
                    navArgument("paketId") {
                        type = NavType.IntType
                        nullable = false
                    }
                )
            ) { backStackEntry ->
                DetailPaketScreen(
                    navController = navController,
                    paketId = backStackEntry.arguments?.getInt("paketId")
                )
            }
            composable(
                "detailGallery/{galleryId}",
                arguments = listOf(
                    navArgument("galleryId") {
                        type = NavType.IntType
                        nullable = false
                    }
                )
            ) { backStackEntry ->
                DetailGalleryScreen(
                    navController = navController,
                    galleryId  = backStackEntry.arguments?.getInt("galleryId")
                )
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}