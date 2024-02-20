package com.example.swipeanddeletecompose

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var languages = mutableStateListOf(
        "Kotlin",
        "Java",
        "C++",
        "C#",
        "JavaScript",
    )
        private set


    fun onDelete(language: String) {
        languages -= language
    }
}