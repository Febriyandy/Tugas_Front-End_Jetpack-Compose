package com.febriandi.febriandiproject.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.febriandi.febriandiproject.R
import com.febriandi.febriandiproject.data.DummyData
import com.febriandi.febriandiproject.model.Gallery
import com.febriandi.febriandiproject.ui.theme.CustomFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GalleryScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    gallerys: List<Gallery> = DummyData.gallery
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Gallery",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = CustomFontFamily
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.blue_50),
                    titleContentColor = colorResource(id = R.color.blue_400),
                    navigationIconContentColor = colorResource(id = R.color.blue_400),
                    actionIconContentColor = colorResource(id = R.color.blue_400)
                )
            )
        }
    ) { innerPadding ->
        LazyVerticalGrid(
            contentPadding = PaddingValues(
                top = innerPadding.calculateTopPadding(),
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp
            ),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            columns = GridCells.Adaptive(140.dp),
            modifier = Modifier.fillMaxSize()
                .padding(vertical = 20.dp)
        ) {
            items(
                gallerys,
                key = { it.id }
            ) {
                GalleryItem(gallery = it) { gallerylId ->
                    navController.navigate("detailGallery/$gallerylId")
                }
            }
        }
    }
}