package com.example.task21.ui.layout.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

import androidx.compose.ui.tooling.preview.Preview
import com.example.task21.ui.layout.componnent.CardContact
import com.example.task21.ui.layout.componnent.MyFloatingActionButton
import com.example.task21.ui.layout.componnent.MyInputField


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun AddScreen() {
    val showDialog = remember { mutableStateOf(false) }

    // Main Content
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        floatingActionButton = { MyFloatingActionButton(showDialog) }) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .systemBarsPadding(),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (showDialog.value) {


                CardContact("Contact") {
                    val name = remember { mutableStateOf("") }
                    val messaegeErrrorName = remember { mutableStateOf("") }

                    val address = remember { mutableStateOf("") }
                    val messaegeErrrorAddress = remember { mutableStateOf("") }

                    val phone = remember { mutableStateOf("") }
                    val messaegeErrrorPhone = remember { mutableStateOf("") }

                    val email = remember { mutableStateOf("") }
                    val messaegeErrrorEmail = remember { mutableStateOf("") }

                    MyInputField(
                        name,
                        messaegeErrrorName,
                        Modifier,
                        KeyboardOptions(keyboardType = KeyboardType.Text, imeAction = ImeAction.Next),
                        "Name"
                    )
                    MyInputField(
                        address,
                        messaegeErrrorAddress,
                        Modifier,
                        KeyboardOptions(keyboardType = KeyboardType.Text, imeAction = ImeAction.Next),
                        "Address"
                    )
                    MyInputField(
                        phone,
                        messaegeErrrorPhone,
                        Modifier,
                        KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Next),
                        "Phone"
                    )
                    MyInputField(
                        email,
                        messaegeErrrorEmail,
                        Modifier,
                        KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Done),
                        "Email"
                    )

                }
            }        }
        }

    }



/*





 */