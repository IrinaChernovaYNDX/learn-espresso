package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MenuScreenElement

class MenuScreenStep {
    private val userPicture = MenuScreenElement()
    private val userName = MenuScreenElement()
    private val userEmail = MenuScreenElement()
    private val homeButton = MenuScreenElement()
    private val galleryButton = MenuScreenElement()
    private val slideshowBtn = MenuScreenElement()

    fun checkMenuElementsAreDisplayed() {
        userPicture.userPicture().check(matches(isDisplayed()))
        userName.userName().check(matches(isDisplayed()))
        userEmail.userEmail().check(matches(isDisplayed()))
        homeButton.homeButton().check(matches(isDisplayed()))
        galleryButton.galleryButton().check(matches(isDisplayed()))
        slideshowBtn.slideshowButton().check(matches(isDisplayed()))
    }

    fun clickOnSlideshowButton() {
        slideshowBtn.slideshowButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun clickOnHomeButton() {
        homeButton.homeButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }
}

