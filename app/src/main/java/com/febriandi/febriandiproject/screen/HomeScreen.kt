package com.febriandi.febriandiproject.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.febriandi.agrojaya.component.PaketItem
import com.febriandi.agrojaya.model.Artikel
import com.febriandi.agrojaya.model.Paket
import com.febriandi.febriandiproject.R
import com.febriandi.febriandiproject.data.DummyData
import com.febriandi.febriandiproject.ui.theme.CustomFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    pakets: List<Paket> = DummyData.paket,
    artikels: List<Artikel> = DummyData.artikel
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Home",
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
            ) {
                item {
                    LazyRow(
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        items(pakets, key = { it.id }) {
                            PaketItem(paket = it) { paketId ->
                                navController.navigate("detailPaket/$paketId")
                            }
                        }
                    }
                }

                items(artikels, key = { it.id }) {
                    ArtikelItem(artikel = it) { artikelId ->
                        navController.navigate("detailArtikel/$artikelId")
                    }
                }
            }

        }
    }
}