package com.ao.freelibrery.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ao.freelibrery.R
import com.ao.freelibrery.ui.theme.FreeLibreryTheme


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home() {

    val itemsList = listOf(Livros(), Livros(), Livros(), Livros(), Livros(), Livros())

    Scaffold(
        modifier = Modifier,
        containerColor = Color.Black,

        /**Top app bar
         * Barra localizado acima, e contém elementos como icon de pesquisa,
         * icon contendo a imagem ou letras abreviadas do nome do usuário.
         */
        topBar = {
            TopAppBar(
                title = {},
                modifier = Modifier.padding(6.dp),
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Black),
                navigationIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "Settings",
                        modifier = Modifier.size(50.dp)
                    )
                },
                actions = {
                    IconButton(
                        onClick = {},
                        modifier = Modifier,
                        content = {
                            Image(
                                imageVector = Icons.Outlined.Search,
                                contentDescription = "Search",
                                colorFilter = ColorFilter.tint(color = Color.White)
                            )
                        }
                    )
                    IconButton(
                        onClick = {},
                        modifier = Modifier,
                        content = {
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription = ""
                            )
                        }
                    )

                }
            )
        },

        /**Bottom app bar
         * Barra localizado no extremo, contendo elementos como:
         * icon de favoritos, icon de menu e icon de home/casa.
         */
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                containerColor = Color.Black,
                contentColor = Color.White
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    content = {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                        ) {
                            IconButton(
                                onClick = {}
                            ) {
                                Image(
                                    imageVector = Icons.Outlined.Home,
                                    contentDescription = "Home",
                                    colorFilter = ColorFilter.tint(color = Color.White)
                                )
                            }
                            Text(text = "Ínicio", color = Color.White)
                        }
                        Spacer(modifier = Modifier.width(50.dp))
                        Column(
                            modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(
                                onClick = {},
                                modifier = Modifier,
                                content = {
                                    Image(
                                        imageVector = Icons.Outlined.FavoriteBorder,
                                        contentDescription = "FavoriteBorder",
                                        colorFilter = ColorFilter.tint(color = Color.White)
                                    )
                                }
                            )
                            Text(text = "Favoritos", color = Color.White)
                        }

                        Spacer(modifier = Modifier.width(50.dp))
                        Column(
                            modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(
                                onClick = {},
                                modifier = Modifier,
                                content = {
                                    Image(
                                        imageVector = Icons.Outlined.Menu,
                                        contentDescription = "Menu",
                                        colorFilter = ColorFilter.tint(color = Color.White)
                                    )
                                }
                            )
                            Text(text = "Mais", color = Color.White)
                        }
                    }
                )
            }
        }
    ) { contentPadding ->
        Column (
            modifier = Modifier
                .padding(contentPadding)
        ){
            Text(
                text = "Ciência",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier.padding(horizontal = 13.dp)
            )
            LazyRow(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp) // Espaçamento entre os itens
            ) {
                // Supondo que você queira exibir 10 itens, mas isso pode ser baseado em dados dinâmicos
                items(10) {
                    Livros()
                }
            }

            Text(
                text = "Ficção",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier.padding(horizontal = 13.dp)
            )
            LazyRow(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp) // Espaçamento entre os itens
            ) {
                // Supondo que você queira exibir 10 itens, mas isso pode ser baseado em dados dinâmicos
                items(10) {
                    Livros()
                }
            }

            Text(
                text = "Romance",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier.padding(horizontal = 13.dp)
            )
            LazyRow(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp) // Espaçamento entre os itens
            ) {
                // Supondo que você queira exibir 10 itens, mas isso pode ser baseado em dados dinâmicos
                items(10) {
                    Livros()
                }
            }

            Text(
                text = "Mágia",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier.padding(horizontal = 13.dp)
            )
            LazyRow(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp) // Espaçamento entre os itens
            ) {
                // Supondo que você queira exibir 10 itens, mas isso pode ser baseado em dados dinâmicos
                items(10) {
                    Livros()
                }
            }

            Text(
                text = "Educação",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier.padding(horizontal = 13.dp)
            )
            LazyRow(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp) // Espaçamento entre os itens
            ) {
                // Supondo que você queira exibir 10 itens, mas isso pode ser baseado em dados dinâmicos
                items(10) {
                    Livros()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FreeLibreryTheme {
        Home()
    }
}