package com.oolong.compose_embedded_keyboard.ui.screen.example

sealed class ExampleScreenEvent {
    data class KeyboardInput(val value: String): ExampleScreenEvent()
}
