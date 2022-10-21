package com.oolong.compose_embedded_keyboard.ui.screen.example

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.oolong.compose_embedded_keyboard.ui.component.KeyboardLayout

@Composable
fun ExampleScreen(
    viewModel: ExampleScreenViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    val state = viewModel.exampleScreenViewState
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = state.value.text)

        KeyboardLayout{ letter ->
            viewModel.onEvent(ExampleScreenEvent.KeyboardInput(letter))
        }
    }
}