package com.febriandi.febriandiproject.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.febriandi.agrojaya.model.Paket
import com.febriandi.febriandiproject.R
import com.febriandi.febriandiproject.data.DummyData
import com.febriandi.febriandiproject.ui.theme.CustomFontFamily


@Composable
fun DetailPaketScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    paketId: Int?
) {
    val newPaketList = DummyData.paket.filter { paket ->
        paket.id == paketId
    }

    if (newPaketList.isNotEmpty()) {
        DetailPaketContent(
            paket = newPaketList[0],
            onItemClicked = {
                navController.navigate("pemesanan/$paketId")
            },
            onBackClick = {
                navController.navigateUp()
            })
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DetailPaketContent(
    paket: Paket,
    onBackClick: () -> Unit,
    onItemClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    val categories = listOf(
        "Cabai", "Bayam", "Kangkung", "Selada", "Tomat",
        "Pak Choi", "Kailan", "Sawi", "Basil", "Mint"
    )
    val selectedCategory = ""

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Detail Paket",
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
                .verticalScroll(scrollState)
                .padding(innerPadding) // Apply the inner padding here
        ) {
            // Image
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(data = paket.photo)
                    .build(),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(horizontal = 20.dp, vertical = 10.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentDescription = "Foto Paket"
            )

            // Package Details
            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = paket.nama_paket,
                fontSize = 16.sp,
                style = TextStyle(lineHeight = 22.sp),
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.text_color)
            )

            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                style = TextStyle(lineHeight = 22.sp),
                text = paket.harga,
                fontSize = 18.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_color)
            )

            Text(
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                text = "Variasi Benih",
                fontSize = 16.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.text_color)
            )

            // Grid Layout for Categories
            LazyRow(
                contentPadding = PaddingValues(horizontal = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
            ) {
                items(categories.chunked(2)) { rowItems ->
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        rowItems.forEach { category ->
                            CategoryItem(
                                category = category,
                                isSelected = category == selectedCategory
                            )
                        }
                    }
                }
            }

            Text(
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                text = "Fitur",
                fontSize = 16.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.text_color)
            )

            Text(
                text = paket.fitur,
                modifier = Modifier.padding(horizontal = 20.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = CustomFontFamily,
                color = colorResource(id = R.color.text_color),
                style = TextStyle(lineHeight = 25.sp)
            )

            Text(
                modifier = Modifier.padding(20.dp, 20.dp, 0.dp),
                text = "Detail Paket",
                fontSize = 16.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.text_color)
            )

            Text(
                text = paket.detail,
                modifier = Modifier.padding(horizontal = 20.dp),
                fontSize = 14.sp,
                style = TextStyle(
                    lineHeight = 22.sp,
                    textAlign = TextAlign.Justify
                ),
                fontFamily = CustomFontFamily,
                color = colorResource(id = R.color.text_color),
            )
        }
    }
}

@Composable
private fun CategoryItem(
    category: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .border(
                width = 1.dp,
                color = colorResource(id = R.color.blue_400),
                shape = RoundedCornerShape(8.dp)
            )
            .background(
                color = if (isSelected) colorResource(id = R.color.blue_400)
                else Color.Transparent,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = category,
            color = if (isSelected) Color.White else colorResource(id = R.color.blue_400),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = CustomFontFamily
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailPaketPreview() {
    DetailPaketContent(
        paket = DummyData.paket[0],
        onBackClick = {},
        onItemClicked = { paketId ->
            println("Paket Id : $paketId")
        }
    )
}
