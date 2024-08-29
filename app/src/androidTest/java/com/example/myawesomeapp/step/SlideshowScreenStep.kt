package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.SlideshowButtonElement
import com.example.myawesomeapp.element.SlideshowScreenElement

class SlideshowButtonClick {
    private val slideshowBtn = SlideshowButtonElement()

    fun clickOnSlideshowButton() {
        slideshowBtn.slideshowButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }
}

class SlideshowScreenCheck {
    private val slideshowScreen = SlideshowScreenElement()

    fun checkSlideshowScreenIsDisplayed() {
        slideshowScreen.slideshowScreen().check(matches(isDisplayed()))
    }
}
