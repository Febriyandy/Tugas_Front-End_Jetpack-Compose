package com.febriandi.febriandiproject.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import com.febriandi.agrojaya.model.Artikel
import com.febriandi.febriandiproject.R
import com.febriandi.febriandiproject.data.DummyData
import com.febriandi.febriandiproject.ui.theme.CustomFontFamily


@Composable
fun DetailArtikelScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    artikelId: Int?
) {
    val newArtikelList = DummyData.artikel.filter { artikel ->
        artikel.id == artikelId
    }

    if (newArtikelList.isNotEmpty()) {
        DetailArtikelContent(
            artikel = newArtikelList[0],
            onBackClick = {
                navController.navigateUp()
            }
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DetailArtikelContent(
    artikel: Artikel,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    var isLiked by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Detail Arikel",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = CustomFontFamily
                    )
                },
                navigationIcon = {
                    androidx.compose.material3.IconButton(onClick = onBackClick) {
                        androidx.compose.material3.Icon(
                            painter = painterResource(id = R.drawable.icon_back), // Replace with your back icon resource
                            contentDescription = "Back",
                            tint = colorResource(id = R.color.blue_400)
                        )
                    }
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(innerPadding) // Apply the inner padding here
                .verticalScroll(scrollState)
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = artikel.judul,
                fontSize = 20.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.text_color)
            )

            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = artikel.penulis,
                fontSize = 14.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.text_color)
            )

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(data = artikel.photo)
                    .build(),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(horizontal = 20.dp, vertical = 10.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentDescription = "Foto Artikel"
            )

            Text(
                modifier = Modifier.padding(
                    horizontal = 20.dp,
                    vertical = 10.dp
                ),
                text = artikel.isi,
                fontSize = 14.sp,
                style = TextStyle(
                    lineHeight = 22.sp,
                    textAlign = TextAlign.Justify
                ),
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.Normal,
                color = colorResource(id = R.color.text_color)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DetailArtikelPreview() {
    DetailArtikelContent(
        artikel = DummyData.artikel[0],
        onBackClick = {}
    )
}