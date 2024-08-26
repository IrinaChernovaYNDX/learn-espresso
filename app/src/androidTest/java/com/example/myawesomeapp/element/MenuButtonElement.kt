package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription

class MenuButtonElement {
    fun menuButtonDescription(): ViewInteraction =
        onView(
            withContentDescription("Open navigation drawer"),
        )
}
