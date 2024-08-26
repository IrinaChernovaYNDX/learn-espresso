package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R

class SlideshowButtonElement {
    fun slideshowButtonText(): ViewInteraction =
        onView(
            withText(R.string.menu_slideshow),
        )
}
