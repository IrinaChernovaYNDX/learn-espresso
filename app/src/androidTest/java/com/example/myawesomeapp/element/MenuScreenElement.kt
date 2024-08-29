package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription

class MenuScreenElement {
    fun menuButton(): ViewInteraction =
        onView(
            withContentDescription("Open navigation drawer")
        )
}
