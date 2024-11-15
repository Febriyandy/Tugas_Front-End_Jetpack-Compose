package com.febriandi.febriandiproject.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.febriandi.febriandiproject.R
import com.febriandi.febriandiproject.ui.theme.CustomFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Profile",
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
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .size(250.dp)
                    .border(2.dp, colorResource(id = R.color.blue_400), CircleShape)
                    .padding(3.dp)
                    .clip(CircleShape)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile Picture",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Nama : Febriandi",
                fontSize = 18.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Email : febriandinfi@gmail.com",
                fontSize = 18.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Perguruan Tinggi : Universitas Maritim Raja Ali Haji (UMRAH)",
                fontSize = 18.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.Bold,
                style = TextStyle(
                    textAlign = TextAlign.Center
                )
            )
            Text(
                text = "Prodi : Teknik Informatika",
                fontSize = 18.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.Bold
            )
        }
    }
}