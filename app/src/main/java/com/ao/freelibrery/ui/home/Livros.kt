package com.ao.freelibrery.ui.home

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.ao.freelibrery.R

@Composable
fun Livros(capaUrl: String) {

    val base64Image = capaUrl

    // Extraia os dados reais da imagem (remova o cabeçalho "data:image/jpeg;base64,")
    val base64Data = base64Image.substringAfter(",")

    // Decodifique o Base64 para ByteArray
    val imageBytes = android.util.Base64.decode(base64Data, android.util.Base64.DEFAULT)

    // Crie um objeto ImageBitmap
    val bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)

    Card (
        modifier = Modifier
            .height(140.dp)
            .width(100.dp)
            .clickable {  },
        colors = CardDefaults.cardColors(
            containerColor = Color.Black
        )
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ){
            Image(
                painter = rememberImagePainter(data = bitmap),
                contentDescription = "Imagem carregada via Base64",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun LivrosPeview() {
    Livros()
}

 */