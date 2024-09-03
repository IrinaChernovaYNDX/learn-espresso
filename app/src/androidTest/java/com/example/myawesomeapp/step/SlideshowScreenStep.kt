package com.example.myawesomeapp.step

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.SlideshowScreenElement

class SlideshowScreenStep {
    private val slideshowScreenText = SlideshowScreenElement()

    fun checkSlideshowScreenTextIsDisplayed() {
        slideshowScreenText.slideshowScreenText().check(matches(isDisplayed()))
    }
}
