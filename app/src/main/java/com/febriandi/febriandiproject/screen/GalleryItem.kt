package com.febriandi.febriandiproject.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.febriandi.febriandiproject.R
import com.febriandi.febriandiproject.model.Gallery
import com.febriandi.febriandiproject.ui.theme.FebriandiProjectTheme

@Composable
fun GalleryItem(
    gallery: Gallery,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Card (
        modifier = modifier.fillMaxWidth()
            .clickable {
                onItemClicked(gallery.id) },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.blue_50))
    ) {
        Image(
            painter = painterResource(id = gallery.photo),
            contentDescription = gallery.name,
            modifier = Modifier.fillMaxWidth(),

        )

    }
}

@Preview
@Composable
private fun GalleryItemPreview() {
    FebriandiProjectTheme {
        GalleryItem(
            gallery = Gallery(
                1,
                "Sawi",
                R.drawable.sawi
            ),
            onItemClicked = { galleryId ->
                println("Gallery Id : $galleryId")
            }
        )
    }
}