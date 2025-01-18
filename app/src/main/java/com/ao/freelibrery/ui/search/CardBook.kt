package com.ao.freelibrery.ui.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ao.freelibrery.R

@Composable
fun CardBook() {
    Card(
        modifier = Modifier.width(150.dp).height(80.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Red),
        shape = RoundedCornerShape(10.dp),
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Ação", color = Color.White)
            Spacer(modifier = Modifier.width(50.dp))
            Image(
                painter = painterResource(id = R.drawable.thumbnail_397_x_595),
                contentDescription = "Java image",
                modifier = Modifier.size(90.dp).offset(x = 10.dp, y = 0.dp).graphicsLayer(rotationZ = 30f) // Rotaciona a imagem em 45 graus
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardBookPreview() {
    CardBook()
}