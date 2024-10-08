package com.example.task21.ui.layout.componnent

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.res.painterResource
import com.example.task21.R

@Composable
fun MyFloatingActionButton(showDailog: MutableState<Boolean>) {
    FloatingActionButton(onClick = { showDailog.value = !showDailog.value }) {
        Icon(painter = painterResource(id = R.drawable.baseline_add_24), contentDescription = "")
    }

}