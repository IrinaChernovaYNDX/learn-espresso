package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.SlideshowButtonElement

class SlideshowButtonStep {
    private val slideshowBtn = SlideshowButtonElement()

    fun clickOnSlideshowButton() {
        slideshowBtn
            .slideshowButtonText()
            .check(matches(isDisplayed()))
            .perform(click())
    }
}
