package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MenuScreenElement

class MenuScreenStep {
    private val slideshowBtn = MenuScreenElement()

    fun clickOnSlideshowButton() {
        slideshowBtn.slideshowButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }
}
