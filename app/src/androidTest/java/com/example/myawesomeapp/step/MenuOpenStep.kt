package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MenuButtonElement

class MenuOpenStep {
    private val menuBtn = MenuButtonElement()

    fun clickOnMenuButton() {
        menuBtn
            .menuButtonDescription()
            .check(matches(isDisplayed()))
            .perform(click())
    }
}
