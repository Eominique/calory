package com.example.calory.navigation

import androidx.navigation.NavController
import com.example.core_base.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}