package com.ao.freelibrery.ui.details

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.MenuBook
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.twotone.MenuBook
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ao.freelibrery.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Details() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = Color.Black,
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Black),
                title = {
                    Text(
                        text = "Detalhes",
                        modifier = Modifier,
                        fontSize = 25.sp,
                        color = Color.White
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = { },
                        content = {
                            Image(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "ArrowBack",
                                colorFilter = ColorFilter.tint(color = Color.White)
                            )
                        }
                    )
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Black,
            ) { }
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 10.dp)
                .padding(contentPadding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Image contém a imagem da capa;
            Image(
                painter = painterResource(id = R.drawable.thumbnail_397_x_595),
                contentDescription = "Java Retro",
                modifier = Modifier.padding(10.dp)
            )


            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Retro Java",
                color = Color.White,
                fontWeight = FontWeight.W500,
                fontSize = 30.sp
            )
            Text(text = "Kulembe, Cláudio", color = Color.White, fontWeight = FontWeight.W500)

            Spacer(modifier = Modifier.height(10.dp))

            // Button com funcionalidade para leitura;
            Row {
                Button(
                    onClick = {},
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                ) {
                    Row {
                        Image(
                            imageVector = Icons.Filled.PlayArrow,
                            contentDescription = "PlayArrow",
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = "Ler",
                            fontSize = 15.sp)
                    }
                }

                Spacer(modifier = Modifier.width(6.dp))

                Button(
                    onClick = {},
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Download,
                        contentDescription = "Download",
                        tint = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            /**
             * Row responsável por conter os icons de fovoritar e números de páginas;
             */
            Row {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Outlined.MenuBook,
                        contentDescription = "Menu Book",
                        tint = Color.White
                    )
                    Text(text = "100 páginas", color = Color.White, fontWeight = FontWeight.W500)
                }

                Spacer(modifier = Modifier.width(30.dp))

                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Outlined.FavoriteBorder,
                        contentDescription = "FavoriteBorder",
                        tint = Color.White
                    )
                    Text(text = "Favoritar", color = Color.White, fontWeight = FontWeight.W500)
                }
            }

            Spacer(modifier = Modifier.height(15.dp))

            // Texto para a descrição dos livros;
            Text(
                text = "lorem lorem amas lenme laofn  ld a afdajlksj af lslsj da a dsfjdslkd  as dkf s sldk fals sl sadsldsldfja " +
                        "sl dafsldjf as dfsld falk dafs aldfs dkf las dkfsl f lsfsfjfoiejwe snvdoncsoanfjkaz f alwj saf soidfla falejaoida " +
                        "dn adodsie rjsod aid fne oais dfoaneodjoei ia ofiie ao foaiefnoi ieoitiuyfa",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.W700
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsPreview() {
    Details()
}