package com.ao.freelibrery.ui.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login() {

    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(color = Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Sign In",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Red
            )

            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(
                value = email,
                onValueChange = { newText -> email = newText },
                label = {
                    Text(
                        text = "E-mail",
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                },
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = senha,
                onValueChange = { newText -> senha = newText },
                label = {
                    Text(
                        text = "Senha",
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                },
            )











            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp)
            ) {
                Text(
                    text = "*",
                    color = Color.Red,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "Registrar-se",
                    color = Color.White,
                    modifier = Modifier.clickable {

                    }
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                modifier = Modifier,
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                )
            ) {
                Text(
                    text = "Entrar",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Login()
}