package com.example.task21.ui.layout.componnent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CardContact(headLine: String, content: @Composable () -> Unit) {


    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                headLine, style = MaterialTheme.typography.headlineLarge,
                fontStyle = FontStyle.Italic,
                fontSize = 24.sp
            )
            content()
            Spacer(modifier = Modifier.height(16.dp))
            Row(){
                Button(onClick = {}) { Text("Confirm") }
                Button(onClick = {}) { Text("Cancel") }
            }

        }
    }
}

