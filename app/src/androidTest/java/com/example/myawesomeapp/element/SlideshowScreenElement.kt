package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class SlideshowButtonElement {
    fun slideshowButton(): ViewInteraction =
        onView(
            allOf(
                withId(R.id.nav_slideshow),
                hasDescendant(withText(R.string.menu_slideshow))
            )
        )
}

class SlideshowScreenElement {
    fun slideshowScreen(): ViewInteraction =
        onView(
            allOf(
                withId(R.id.text_slideshow),
                withText("This is slideshow Fragment")
            )
        )
}
