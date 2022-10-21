package com.oolong.compose_embedded_keyboard.ui.screen.example

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ExampleScreenViewModel: ViewModel() {

    private val _exampleStateViewState = mutableStateOf(ExampleScreenViewState())
    val exampleScreenViewState: State<ExampleScreenViewState> = _exampleStateViewState

    fun onEvent(event: ExampleScreenEvent) {
        when(event) {
            is ExampleScreenEvent.KeyboardInput -> {
                _exampleStateViewState.value = exampleScreenViewState.value.copy(
                    text = _exampleStateViewState.value.text + event.value
                )
                Log.d("ExampleScreen", _exampleStateViewState.value.text)
            }
        }
    }
}