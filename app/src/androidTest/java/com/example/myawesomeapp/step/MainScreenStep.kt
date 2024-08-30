package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MainScreenElement

class MainScreenStep {
    private val mainElement = MainScreenElement()
    private val menuBtn = MainScreenElement()
    private val menuHeading = MainScreenElement()
    private val menuSetting = MainScreenElement()

    fun checkMainScreenTextIsDisplayed() {
        mainElement.mainScreenText().check(matches(isDisplayed()))
    }

    fun clickOnMenuButton() {
        menuBtn.menuButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun checkToolbarElements() {
        menuBtn.menuButton().check(matches(isDisplayed()))
        menuHeading.menuHeading().check(matches(isDisplayed()))
        menuSetting.menuOptions().check(matches(isDisplayed()))
    }
}
