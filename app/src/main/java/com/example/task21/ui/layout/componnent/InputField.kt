package com.example.task21.ui.layout.componnent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyInputField(
    textState: MutableState<String>,
    errorMessage: MutableState<String>,
    modifier: Modifier,
    keyboardOptions: KeyboardOptions,
    hint: String = ""
) {
    Column {
        OutlinedTextField(
            modifier = modifier
                .padding(horizontal = 12.dp, vertical = 4.dp)
                .fillMaxWidth()
                .background(Color.White),
            value = textState.value,
            label = { Text(hint) },
            onValueChange = {
                textState.value = it
                errorMessage.value = if (it.isEmpty()) "$hint cannot be empty" else ""
            },
            keyboardOptions = keyboardOptions
        )
        Spacer(modifier = Modifier.height(2.dp))
        if (errorMessage.value != "") {
            Text(text = errorMessage.value, fontSize = 12.sp, color = Color.Red)
        }


    }
    Text(text = errorMessage.value, fontSize = 12.sp, color = Color.Red)
}

