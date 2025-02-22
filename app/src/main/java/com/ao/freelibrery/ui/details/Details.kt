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
import com.ao.freelibrery.models.Livro
import com.ao.freelibrery.ui.home.Livros
import java.time.LocalDate

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Details(livro: Livro) {
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
            Livros(livro.capaUrl)


            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = livro.titulo,
                color = Color.White,
                fontWeight = FontWeight.W500,
                fontSize = 25.sp
            )
            Text(
                text = livro.autores.toString(),
                color = Color.White,
                fontWeight = FontWeight.W500
            )

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
                    Text(text = "${livro.numeroDePagina} páginas", color = Color.White, fontWeight = FontWeight.W500)
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
                text = livro.sinopse,
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

    var livro = Livro(
        titulo = "JavaScript: O Guia Definitivo",
        anoDePublicacao = LocalDate.of(2021,5,15),
        isbn = "9788575225631",
        numeroDePagina = 1096,
        idioma = "Português",
        sinopse =
        "Considerado a bíblia do JavaScript, este livro cobre desde os conceitos básicos até os mais avançados, sendo uma leitura essencial para desenvolvedores que desejam dominar a linguagem e suas complexidades.",
        editora = "Alta Books",
        generos = listOf("Programação", "JavaScript"),
        autores = listOf("David Flanagan"),
        capaUrl = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMTEhUTEhMTFhUWFyAYGBgXFiAaGhsYGBkYGhoeGBkeHigiGRolHRgaIjEhJSkrLi4wHh8zODMsNykwLiwBCgoKDg0OGxAQGjMlICU0Ly0rKy8vNy4yKystNy4wLS8xLS4vLS4tNy0uMDUvLS0rLTc2Li0tLS0vLSstLS0rL//AABEIAQ4AugMBIgACEQEDEQH/xAAcAAEAAgMBAQEAAAAAAAAAAAAABQcDBAYCCAH/xABLEAACAQIEAwUBDAYIBAcBAAABAhEAAwQSITEFIkEGEzJRYXEHFBUjQlJTgZGTsdEWM3Kho9IXJFRikqLB4zWCs/BDRGNzg4SyNP/EABoBAQADAQEBAAAAAAAAAAAAAAABAgMEBQb/xAAwEQACAQIBCwMDBQEAAAAAAAAAAQIDEVEEBRITFBUhMUFSkWGh0TKB4SJCcbHwwf/aAAwDAQACEQMRAD8A7binuem9euXffIXO5aO6mJMxOcT9lav9GR/tQ+5/3KsWlaKrNdThlm7JpNtx938ldf0ZH+1D7n/cp/Rkf7UPuf8AcqxaVOuniRuzJe33fyV1/Rkf7UPuf9yn9GR/tQ+5/wByrFpTXTxG7Ml7fd/JXX9GR/tQ+5/3K1P0DWY99jeP1BjTIN+8iOdas9lkEHY6VgbBWzMqDO8+wD8AKa6eI3Zkvb7v5K7HufKZ/rq6AsfiToBEz8ZpuPtFfje5+oBJxiiN/iDPXp3k/Jb7D5GrIGHUTA339fX26DWsR4fa+Yv2dNdPZzGmuniN2ZL2+7+Svm9zwCD77EEkT3BiRJOufQCDrtWL9A11/rg0/wDR35c2nxmxEkTvBqx2wSGJGgBGXocxBJPmZFeRw63Mx7ROh9vnTXTxG7Ml7fd/JXv9H6/2xd4/UHeSv0nzhHtrze7AhVVvfUqxgEWN52/8TbrNWM2BtndB/wB5f5R9le3wqEBSqkAyAROpmT7TJ+00108RuzJe33fyVqOwayB77Ekx+p23EmLm0iPrExW0/uXyCDiVIIgg2JBHr8ZVgDCpM5RuT9ZIJ/eAfbrvWamuniSs25Mv2+7+T5j90f3Nr3DYuo3e4ZjBcLBtsToriTyno0+h1ieU4LwS/inKYdM7AZm5lUKvmzMQAK+wsVhkuI1u4qujgqysJBUiCCOor547fdir/B8QMZgmb3vm5W3Non5FyfFbOwY77HWC0KR1OCRW960yMVdWVlMMrAggjcEHUGsmCxb2nDoYI+wjqCOorveIcIXi2HONwiBcWpjEWpHxhAktbAGrGViQJ5pJbfn+yXBsLcm7jr5s2ApK5d7jL4kzANkYaHLlzEMCBGtTpFXC/DoWR2F4PZ4nZz28UEuLpcsm1LITsZzjMh6NH2EEV33ZbsacJeN03xclCkd3l3KmZzn5tfP903OGYv3zgLxuW0aBdUZkGeSLN5wMjvkAJAPqII0+huwXbSxxKxnt8t1IF20TqhPUfOQ9G/AgikqkmufAwpZDk8JKUY2a9WdPSlKyO0UpSgFKUoBSlKAUpSgFKUoBSlKAUpSgFKUoBWLFYdLiNbuKro4KsrCQVOhBB3FZaUB83+6P2Cu8Lu++cLLYRjGst3cn9Ve+fabYE7+FtYLSuHu2OLYdnRUXEoqrdsSFV0AgEHZQpnI4ANvVSGBhr2xWHS4jW7iq6OCrKwkFSIIIO4Ir557e9ir/AAbELjcEz+983K2pNotp3dz51szAY+w6wWsncryJ3gl2zibK4DFI4EZLdsA2Fbu8jsty2hUpiAVVnttyEAOpQEvXBYmziuE4zv8AD51RHi3dPNbdWGbI7ABWkAyuhBU7ESOitcQt4m0cVhri28ZchMRhkZ0N3Rwq2sonvTEoygwNGnnLYe1nbBHwj4PEWmuXxoriLQWCBN5FOl5ShBtwVPKVIUgEsAy6OwfbOxxKx3lvlurAu2iZKMfL5yHo34EEDp6+Oez/ABu/g764jDvluL/hZequPlKeo9hEEA1ddj3eMJlXPhcSHgZguQqGjXKS4JE7EgUcWgpJlt0pSqlhSlKAUpSgFKUoBSlKAUpSgFKUoBSlKAUpSgFYsVh0uI1u4qujgqysJBU6EEHcGstKA+cfdE7DX+E3vfeCe4MOSQrqTnsl9MjncoZgMfYdYLa+H4NY4raZ8MLWGxFsBRYUE5iZLPdutzOWOgOuXqSAxX6RxOHS4jW7iq6OCrKwkFSIIIO4Ir557fdir/B8QuNwTN73zcrak2iT+ru/OttsCd/CdYLWTuVasVviLDW2ZHUqymGU7g1jroO2PaJca6XBZFu5l+MfOWLMegGy212AiepJJJPP1qjNn2vSlKwNhSlaGM4zh7XjuoD5TLeXhGsTQG/SoRO1WGOpZgCJkoQPw3jWt+xxWw/hupPkWg/YdeooDcpSlAKVhu4pF8ToPawFa7cXsj5f+Un/AEoDepWGxiUfwsD1jr9m9ZqAUpSgFKUoBSlKAUpSgFYsTh0uI1u4qujgqysJBUiCCDuCKy0oD5q91P3OH4e5v2Az4Nj7TZYnRXPVCdFc+w6wWr2vtLE4dLiNbuKro4KsrCQVIggg7giqxv8AuF4AsxW/i0BJIUMhCgnQAshJA21JNXU8SjhgWnUV2i45bwtvMxGdpCL1YgSTG+VRqT5e0VKE1WHbNhi2N1A4NkHJ81h4jodDmEbx0E1QuaOL4lfvM3eu7GTNskZQpmOUGACJWd4kmDWk1jJzEa5tjCgaabGSRC6yCI0O1bmLQHK4BhlVgNtW3BHnqNNvP09YsAg+HUxrr1jWDB3IjU+VSD0lzOBzSCdehgaqR6bCNz5A7elAJMwIgAHLpr1M8wIknWJOkwa0LByrIIiSY+USAGksxkbaAzOWNZivbFs06iekKPKeY+LRX1+qZkKBK2bsaayfqHNB2O8amfxishxR2OsDqBuN9TAjSZ3EDfeo2xdzEEhubYzl1mG3mCCo0A1Om0E5mYEZfXwg6DQGWE7ARCz6RpUA3UvaBiRGhGaYjTVjtBkakA/bXm1xG3MC4AzaSTDT00+v7KhcTiNAiDkBJcs25nmOu8zPTYaivBtg875SJkSJUHMBABjXRvUbxGoA6ROIOrwYnxIwmDEzr8kjY+hHnXS8M44fDdIPTMNDIIBBHU+zXfSuL4hdLAhfGgVww1kgwVH94hWEeceUVktcRyqG0AYQY38/Z83r1nfcCz0cEAggg7EV6rieAdoBJycyTqojTfUDQjb8Z2kdnauBgGBkHUUB7pXMdvsYUtWrfNlvXQjFTBACs8AjUE5dxtqZEVLcKxX9XV7jDlBDMdByErJ8tpoCRr8ZgASSABqSegrm7PHLly/ayQLTEiCvMRGhJnTeYidvZXSMoIIOx0NAFM6jav2oXsnic1ju5k2Wayf/AImKfipqaoBSlKAUpSgOY7fcSFux3Uwb0rvHKIza+sgewmuHw2MygAWrjITBeDAk6kCCSOpBPWun7fgXL1m2dkUvH959EO3TI2kjcVD4dzlhSBpprO+m+ojUdKkGgb39XtSSD3SgnYgAAyOgiCYGmm9eBcmTqAJPpC6eKN9/QR6UwdoixZYwGEr12EDXX+6OukxPn5ZlJEkExK5l8ttdtI6QJjcCgI3EYxgM69dgSRG7ATsAGAMaRHqY83cSzAQyrJWVKldub524MEkk9CImKY15LIsgk/O8gRtGbYnUCBGwgg6d+6pMA5tSBmYkFxqNpgxEz0M9RAHo3CLY5m0O4AHKZLAAEGdJEewdK3eAP8VfvqRmMKJaRAUdTOUyxkEnz9sKzsyLKqwn5YzGJgjYZWmIgjQnfrIJfa3htG1NwQYK7KOm+40n0PlQDh2MVmYA3Dyx4soWTIMAArGYQR/enapAvBCh5Kagd4oJyqBCkCcxBBLAQYMmQRUBfxR8QUNkjLyZ8gIZgchhmBClZYwAxmamLI2zkqoEpMAqDr1JKRciIA1y7QJAl5PfggHQqJgROi+JZGnnpBJAmBXm3aScRa0i25IUD5JhyB18N1d/IetaSJrMEljOg0AZz1kyusH7dxruqAmNZyDDKoJJMSyKI19bY+w9V1AcPulXlgRqdPRT5HfYTG0mN5PQ2e0dywZUFlJjKdJPTLAnMddh0Ohrm2C2Wd3YZA0EATJaMoGkMdCfr+utTifEcyqeXvrmlkb5BpncfOAWRmOk6DwxQHT9s+1eEv4Z7YfJiLRF1UdZAZejMpyrKsQCWEZlO2tROL7Wd7Z7qwHZFfMxVDLOQO6RJ0Y58zk7AJJ61ztjhyXGNs+BGCD5RM5DccnzzkD/AJQQd63+FOq4fCvaBRO8XUAgs0czkwCVzqoHTlDc2goCxex3C7oAu4hcpE5V669TG2hiNf8AU9ZUfwXG94kEyy7+oOx9u4PqDUhUA5fgrlMdirXQuHjy722hH+a3cMD51dRXG2r8cWviBotgzJ6rcTbYeIe36hXZUApSlAKUpQFU9qMbc9/YkMStsFUVtAf1KMYJ8zI2/Ga1bGOTKGY65TuYGvimToJBn0nzg7Hb7Cg3MWy5iQ6FspMgdymmhmCM+0bdZNc7YTkeZnMZJBy682oOhOWOgHsmpBNYEFrNxBAKXWbQbK7M6gwZGlyNPU66V+X7QUkk8u+msQILAxPlp7fKo/h2NWzelwMlxUzFdgSCFkwMqnm1O0iYArexzKJk6DWTIkDTQnVfCNZn/UCKxziSIljr0kAQSepgDy9faI/EXECMxA5wCPIxoJ208UadCY6iV4iwVCxBJO+7EyurZd9ASdhAnfQVHk8q6Ore3YzAEjoSubTUADbUUBr3bw5cvKSTI6QSI13LABTHl5bHadkezykT3hIgkjYAEg7bESNSJjetK8RlcrvGyiTqRETqTBJ12gaa6MHOQpMswL6kGSCB4jykghv8QPoQFxwCM8Zg4KkkqeYNEyYGojzIDEbiZPAMAAueBBhCykZUADBgBDNoogjMQWma517vMQwK5lbp4pjxcuoOczptNdBhry92W1hSczdCqKS7Fl1AjIJOweek0Aw9xbZu2iHBEkETBCs5BzAwIknl+cuh3ObHSLljEZ4By2TIggrnILxoSBOkj1mdNd7bq7BibZ8Ryr8kglVzTAIAgtIjMCNzXuzge8tXLIYhg2dAQOVgTExO4A/xayTNAY72IN/FKh5kQgtBESwJ1UrHLbMjfU6TGkScY4F7F3NWZitogAhOdrShdCFCBN43jSTNZ+z91UvQwCnmUhQc2e6vLAIIZNDrJ6dNK94ZVbh0QWJe0CGY73WzGCRr4hv1GsUBm7O3ThcLfvvlKwTb08d15hVgakEanU6neBHR3rHeqiOZVUXkEczIyv7dSijy33MVzjg3DhrIm2oTviABDM7sNY25UG8/rCNQa3+DYtWvYa405b1iFYyCGE6STOqsNTMkAgmQSB1vBOPpa7m+zkWY7u4zbBGjI5iZAMSxjRmO1WQjggEEEHUEbGqHa61u4MOGcqhhlVyOWRGUCdTB+uNpqQu8Zu4N+7tPltXlkA6cpVgwKnZlIBzDLoYIJFQCV4ZjlucTxeIVgwe/atLE6C1ctIQPPwXGPlpMTVq1S3ZjCXbRVM1t1LA3CTFy0zkSzKBDcubUQNBGm100ApSlAKUpQFe2eHXL97iII1DDKR13IUeoWY28emkRxHD4ZQxMQsMM0GRmg7kgiQPRgtXpbw6qzMBBeC3qQIH7oFUhxC6ua8bam4ty9cdGKgwhdnUqSNQBlgCTt5VIPNyznTKVjkbYZgFgMpX98T59CYrzw7FFFW3cy5QNCY021PkohdekidoGVIRCz5VGnLEMSx2VfMgjyk9BUBcLO2cQIkKM58JGjBhDCJJmdJLetAS93CG3KsB3ZjRT7THSDoBoJjbUGta/h9BJ0ymera6kAGcwGv1j1JqS4cZt6MHtnRhpuYUgAmFMiSpPUx0FYOIsk5hcETmIJE9JGsHczrv50BFCyACSRodoIAK7TJkajaCennTMM5IIDRuToA4aYMCTJE9ddtddy1bzZVVCIGUALMRlJCyTI0A02JGmvLkxdplIGWR1k7wAN9oJJAmTqI6igObt4aXynYE+xVgZpJBMnRQQDEk6wI7Hhtu00jvVa4kEwSIPhJUxzSpIIBJIIEfOiGswzKQGQBSYHypIlogkeEadABG4rNg+DjMDnuZwDmKzEZjHMNAQI+pQPI0BLHhOacolTrKgay0nWR5jQzrB9RhItYZ+Z4LCc0HUKCvmS2mh9nrB2L+fCqrq+YFsoDLrqCwJiM+h3ETrGhERvEcMXL3XbLOheIMEQQCf+yMp0mQBE4MxiHNls0Nockbq7EA+cAqdDJA2GgzWbbpZWyAGDKboLAeIQLa5dtOVs3nMHoNjC4Ld7ZYrGj9A+VgGHLJSCZJnUDzmtS9cbItsklrXxYYE5TOqiYIM7aaDUyY1A1MbeNvFA5mAVVRQCAIyIpKgkBTmY7k779DPYGwGwlsKTnsOAskjMVYrqY2bMZjQkjciubt+LwjUBFBAVSPmqsgaQPI7fVOcPtXrQztYumYlwhZZUrlkicsqZg9D0hhQE5jOHLcxdtgQD3RztBJy5laN4BzZ953P17ps4dHDkQ+UJmGYzrpudQDtrOpjeofh3fPdN9LV+40gHLadlVPIHLLGSSY0mZ6V+4VsTbcqcGMuYkjuyLhkjnZYAJJ3iCcugO5A2L4JIOHF1nWH0dVBljo4IJJmYAAAg6rMG1ezN0mwFJnISgPmB4enRSB9VVzw/CG86i1hbtq+QAGay6BRrmzMVHIQOp0OXLOgNkdn8G9q1FwKGJkgaxoAJPU6f6axNQCTpSlAKUpQHi9bDKymYYEGN9RGlUh2gwL4fENYz5u72ZEyypAYB9ZmH1Kj7I1vKqt90/Dtbxdu4FBt30gwNc9oN4j0BDJHsPsIHJ4PDfHJcuMbhttm30yh0YKfPTTUyR0JE1YfFOyGDwdjEYiLjxbfKrsCqZwVhdBAk7sTGprkOwvDzexSFhyZs2p1OSWIgQMoIAgjr5zVv8W4emIsvZecrrlJG48iPUGCPZQHz5hcRlyi3JLcpCkAwRpmgnN1gH12rouzXB7+Mdkbu1KqXUlSNAwUhlI3LE8wHQ9TpFcR4PcwV82b6kgmQ2XlYMWClTtGuo3WToNCe97EY5BfWYAa2VBJiCzKQIk7wRuSIAOpqQRQ7BY1W8NgzqSh667ZoPU/96VIr2ExTlRcuWlUeRJPpA2/Lp62RSoBVfFPc2uWg+ITEKzJbIyC0VlZBOpuNzaA6AbeyIPgONzKQRLK2oPKDA00ERpIkxoCCQNKu8ia+dOF4mL5IJyu+WJB6qNNxIze3U7TAAsLhHBUxbi3cNxUQF5QrzFSV1bLtzN5H2RJ4vt9wu1Zx7215VHdhJ5godEESdjKkz6roYqw/c/tnvWIAgW4O51LAgTAnr0rivdAwITil17veQ+R1g5QVKBBrO4ZGWdYiTppQG/wqwCtq2mXn5IhZJOhhQDpvPlruAanO2PY23ZHvrCowKupu21lgU1BZFmVYFgxjSAdK1uxiA4myynOuvMVj5Lkb+z93WrOoCh+y3AWxF8rPfXEOac3IsjRn3yKRsskmdoki5+BcKGHt5ZzMzZ3aIliANB0EAAD0863MNhktjLbRUEzCqFEncwOtZaAUpSgFKUoBSlKAUpSgFVZ7qONF+9Yt2hm7rOWYTAJyeHTmIIAMfOO5EHUxPbTGh2AvaBiB8WmwJ/u1ywv3QVOVNDvmMwRB+SIPXc1q6MkcFPOVCbabtbEm+ynFxh8Qlwq5RSQ58lYESFJEmTm0BJAOlXUjggEGQRIPoa+fMcCzlrTMggAA80cqqSBMDw79Z18qn8P2xxqIqLe0VQo+LTYCB8mpVGTK1c6ZPB2vf8Ag7r3SeFpdwjXTAuWOa20xq0KynQyrAxG0x5VWeGxuQZhmYCJjXLuYeTosKRMSYPlW9j+1eKvW3tXbga3cUqym2moOh1CyPaKg0EI1uZQxodwQQdD9QGs9anUSKRzvk753X2LC4J2ouWnW3fuSsAjNBzKQdVeZLCCY1+aAN6sMGqHwvEXt5SoQlRClravGs6BgQuvkBUt+m+O+m/hp/LTZ5EPPGT4Px+S3sViFtozuYVFLEnoAJNfPVp82IJDAHNBCwBPKQANyZbrvpA0k9Jc7S38SVw9+8GV/k5QshYJzFV0ESQTPhPUVrXLdoWxfnVWyTciEzgMczD9kEkwvqNIylHRdmehRrKrBTjyZZ/YnCBMMDuXJ+xTlH1aT9fsqG91Ph4e3ZuQshzbMjdGUuZ9Jtj7a5q92iv2Anve7CXV7yCFfmnKdSDsAv49ajuKdpMVfVVuurhWzBSqqCYI1Kr5E+fsq6pSaujmq5wpUqurndevQk+CYu5Y7toy5SWXMpAG4gnYAhv3R6Dt+EdqxduC3cTuyxhDmlSdNM0ATqNNwTBHU1dguOXVJW7bV7bEyA5EL0geYMwRtptEnxh+J3kygODkZWUsoYymqnUQG6ExtGxE1CpTfQtPOGTwV9O/8cS+aVTn6b476b+Gn8tP03x3038NP5avs8jl3xQwfj8lx0qnP03x3038NP5afpvjvpv4afy02eQ3xQwfj8lx0qnP03x3038NP5afpvjvpv4afy02eQ3xQwfj8lx0qnP03x3038NP5a673PeO4jEveF98wVVK8qiJLTsB5Cqyoyirs2oZypVpqEU7v/Yna0pSsj0Cgcd+sf8AbP4mmEvIrS9sXBEZSzLrprKkH/TWmO/WP+2fxNYK9Jcj4eTtNs7Htbw/C4ZLJt4eTeQtLXX5dFiAGE+Lr5Vx1d523w4ufB6F1QNbILuYVRFqSSfSub4pirVq4beFW2yJp3jotxrjdW51IUToAoHnrNZU5cPU7supJVG+Circl6J8vkh6V13aq3asNhr1uxa+NshnQryE8p0UeHeNK/e22GtLbsXMPatrZvJmkLzBt4JnTQjT0arKpe3DmYzyNxU/1fTb35HIUqb4TiETD3XuWbTwQlvMupuNzGSDqqqCY9V86ycQFizbQobV3EXOZyAGt2gdQqp4S2vWYg6CanT42sU2daOlpdLnPPbB3APtFSuE4HaTCHEXbZdDdyW7RZhbZ4JL3AG1AjQaGRvpUuLCXeF3b7W7Yu2rwUOiKkqTb0YIAD4z06CsnZXjeH7hsHjB8UzSra8pMbxquuoYeZmqS4q9jqoJ05KLnZSjdYXeJGcFxOHa6lq/h7ItMQk2wbZSTAIIaMoJ1BqHvJDEeRI+w11/FOwjZO9wl1b9vcCRmj+6w5X/AHew1BdnuDNibuSciKC1xyPCi7/X0j8qtGUbXRnWpV3KNOceL5PH7kVSpPEcSQNFi1aW2Dpntrcdh5uzg6nyWANvWtjiuJwlw2XVDblT36Whsw2yBjlAP7h61bSeBz6qNnaSuv8AcCErd4K9lb9s4hS1oHnA9hjbcTEjymuq7SYbCYO5hytgXAbc5WMSM0lnPymMwBsIOmwGlw23gsVjgvdXLdtyMiLAEhSWzweUGNl+0VXTur24G+yunUUdJaV1wOf4m9s3XNkFbZY5AdwvStWugbCWDxB7VwOts3yiraAETcyqNfCuvQTW52nuYfC4p0s4e0xULPegsi8i6KgIBkQxZpJJO25KfJJFZZPdSnKSSTt/fQ5OtnB4F7ocoNLaF2PQKP8AU7AV1XC7WH4irWu5t4fEquZGtDKjxuCnTp5nqDoRWfsvimXA41GS3NlfCUBlucN3nz9o18qiVThy4mlLI1KSbleLTs16dPQ4Wu+9yfx4j9lPxeuLx2MNwglLSR9HbCA+0Lua7T3J/HiP2U/F6VfoYzcksqjZ4/0yx6UpXCfWFA479Y/7Z/E1grPjv1j/ALTfia83MM6sEZHDGIUqQTO0A6melekuR8NJNydsTtu3WGa57wtoJZ7ZAHqRa+wetc5xGxbwrtagXbqaMzfq1aJIRPlxMS+hjw9al+1vGyuJsCywnCqFzbjPpnHqNAD9daHFe03fN3gw9hLp3uBczSNiJ0B03gkaQdKxgpWWB6eUzoupN3/VddL8EuNvW+JI+6Fmy4PN4u410jWEnTpr0r94D/W+H3sLvcsnvbQ6kakges5h/wA4qIxvaW7dspadbbFFKi6y5rmUiCJJ0JAgmJ+vWtPg3FbmGud7bjNlK67Qw6+wwfqFSoPQt1RnLKae0Od7xkrPxY98aIQpYERZBDR1utBumesEBPYgrYvcKGHtW7uIBZroLW7QMcojmuNuJkco19RUMT56+2uhudqy9lLd7D2LptiEdwZAgDUAidhOomBpV2mrWMKc6cpSlPg/29V/rEnZvM3BsQSqqO/UKFXKIzWdup1nUkn1rlsVgClqzdmReDECNijlCJ69D9dSOE7UXUt3LTLbuW7kcjryKREZFUgAaDQdQD5ziTjzG13N63bu2wxZQRkZCxJORkjKJJ0gjptVYqS6GtWpRqpXlx0bcuqf/UZexvEblnFWhbJy3HVHXoQxAJI8xMz6eU11nCTbuYvidi2QDeWF9oVluf53n7a4i3xQW5Ni2LbEEZyxdwDochMBdJEgT61pYbENbdXRirKZDDcGkoaV2KOVKiox+pJ3+zVrK55u2mVirAqymCDuCNwa8GugxnaRb+uIwtm5c+eC9smNs2Vhm+2o1+IZmBe3bKLMWhKIJ3jKQ0+ZJJOknSrpvqjmnTpp/pnf7P3/ABc6L3R/Hhv/AGB+JqL7E/8A91j9o/8A4avPG+0JxQHeWbQZRlVkzgqs7RmIP1itbg3FPe7i4tq29xTKs5blkEHQMAd+tUUWoWOmpVpyypVE+F0+vQ38R/xX/wC4P+sKdvf+IX/an/St1jscQF/G2LndIjtiELlC0MTcXWGYx9Ub1I9usahxt1bllWyZQGUlGgorQx1B1Y/Jn1qFdSXDoWloyozelwcr344Mwe55ZJxqPsttWZz0C5Sup9rD7DUnwrEC5Y4tcXwuSw9hNwj91c1e4y3dGzZRbNtvGFks/wC25MkeggeleuA8cfDG4Ai3EurluI+zDX7NyPrNJQbuxRyinT0ad+HG79WrexFV3vuT+PEfsp+L1xeOxYeAttLaCYVZO8SWZiWY6DcwOgFdp7k/jxH7Kfi9TV+hlc3JLKopO/P+mWPSlK4T6wozFcPv94xFm74yQRbbzPpUvxLjWOvBc2Hh1EC4uHYXADvDGcs/3Yq3KVvrr80eTHNbjfRqNX5lC/Bl/wChvfdt+VPgy/8AQ3vu2/Kr6pVtoeBluWHe/BQvwZf+hvfdt+VPgy/9De+7b8qvqlNoeA3LDvfgoX4Mv/Q3vu2/KnwZf+hvfdt+VX1Sm0PAblh3vwUL8GX/AKG99235U+DL/wBDe+7b8qvqlNoeA3LDvfgoX4Mv/Q3vu2/KnwZf+hvfdt+VX1Sm0PAblh3vwUL8GX/ob33bflT4Mv8A0N77tvyq+qi24ocpuQMgvCyAfET3wsk+nOTAgyANROjaHgNyw734KZ+DL/0N77tvyp8GX/ob33bflV2YriaWyQ2bTc6RojOdz0VSZ229Y8XOLoPMQ2Vi2gWLfetm10hP3kesNoeA3LDvfgqPhGGa1cW5cw2JfIysoUFRmUzzShkaDaK2e0bNibjXlwuIS45GYGWWFUKIHdgg6DrVsWeIo3eEyot+MtAA5cxnXQhSCZ8xWqeMAO4IOVVEKBzl4LMInopt6by4G5Aquu43sarNaUNXp8P4RTfwZf8Aob33bflT4Mv/AEN77tvyq4n4xDOWVu7VXIgAlu6KK2ubQ5mYZY1jcbVkxHGAJyoxIzmNBmyAeHXcuyr7ZB1q20PAy3LDvfgpn4Mv/Q3vu2/Ku49y3Cuj386OsqkZlInVtpFdkvFBLAq2mYjaIt5A2s6nM0fUaz4TGrcMLPhV9REo+bKfScp0OtVnWclaxvk+a40aiqKV7GzSlKwPUFKUoBSlKAUpSgFKUoBSlKAUpSgFYRhUnNl1mR5AncgbA6nXfU+dZqUBHtwsFmZmJDZgw1GZWEZWgxAEQQAdBrvOW5wy0ZlAc0zv8oQf3Vt0oDXGBt5XXKIueP10y6n2VjbhqSWVQHJnNqZkKDm1GYEKJEwYnetylAalrh1sBZGYgDmO5IbPJ9S3N7aNw20d0G5PXdnDk/4gD9VbdKA1reBtqZCgGST6ksWM+epJ9OlZLGHVPCI2H1DQCfIVlpQClKUArWxmPS2CXIGUSdQAB5sxICjQ6sRtXvFXcqkiJ2E7STAn0EyfSa+deJ8YucZ4klgORhs7m2jTDraR7he5EfGXFtxPyAwA21AudPdA4eWyjF4WfLv0n7SQn+aujw+KV/Cekx6HYjzHqJB86qI+5TYUnMZUaRqCQlzFtqfNkSyhPo561zXYLtBd4djzw+5dzWRfawCfCl3OUDoPkozaMvkZ3FAfRFK8WLmZQ0RI28j1B9RtXugFKUoBSlKAUpSgFKUoBSlKAUpSgFKUoBSlKAUpSgIztDZZ7LKpgkMo9r23Rf8AMy18vdi+L+8cVYxb2mdLTMrLtOa06ESRGYB5yny6b19Y3bYYFTsft9oPQ+tVP2s7K43DXLt7hvd/HPnuWWAGa4dC1liQpzeI2yZBDRmUwQM9z3TeHoO8L3WVkDqndnO4BZcuvLIKOrNOXxa81U3iMS2Lx7PbXK+IxWZVmSrXbvKJ6wTE+ldd8IceZggwmIBkf+VYDQzBcjKV9pg13nYzspibt5MZxA2zeSe6W3qtkOqqxLAw12FgBSQpLMSWIFSCxsB4J82Zh7GdiD9hFbFfiqAAAIA0Ar9qAKUpQClKUApSlAKUpQClKUApSlAKUpQClKUApSlARXw/ZkeMIX7sXChFs3C2UDN6tyhvCSQASSK/LPHbLutuH5yFGZDlLNbNzKT0OQE66dN9K114JdyLY75Pe6upAFv4zu0YMtstmyxIALZZK6aHnr3e4DN84hWUXO8VlJWQECC26ET1XNDCCpI3Egga9vjWENlL5tFbdxcyMbIGZe6e9IG/gQnX0qZxGPVCywxKJ3hCqSSskcoHiOh0GtcxZ7GuuEt4YXLINu3kDraIzH3tdsZnGfUzcDaEbEdZE2uCxHei73lmcuRh3beENm059DqfPpQGXD8as3D8WS6yq50GZJdcwhhoeUgn9oVI1pcHwHcWykgzcuXNBH62692I9M8T1ia3aAUpSgFKUoBSlKAUpSgFKV+PMGInpO0+tAftKi04a65ctzKAFEAb5CDJgiSRmB9o8pr9fhznQ3JBUKwMmQNDrPUEg+utASdKjsRw9mYsGAJaRKzChYA9obmn12NBgbmh70+u8bkn5XkxH1L5UBI0qGtYe62Ze9IIETr80rMTpzANp5kajeRw1hlLFnLA7A9OZj5+TAfUKA2KUpQH/9k="
    )

    Details(livro)
}