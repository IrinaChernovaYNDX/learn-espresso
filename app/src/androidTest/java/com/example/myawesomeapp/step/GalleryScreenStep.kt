package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GalleryScreenElement
import com.example.myawesomeapp.element.NotificationElement
import com.example.myawesomeapp.element.ToolbarElement

class GalleryScreenStep {
    private val toolbarElement = ToolbarElement()
    private val galleryElement = GalleryScreenElement()
    private val notificationElement = NotificationElement()

    fun checkGalleryToolbarIsDisplayed() {
        toolbarElement.menuButton().check(matches(isDisplayed()))
        toolbarElement.menuHeading("Gallery").check(matches(isDisplayed()))
        toolbarElement.menuOptionsButton().check(matches(isDisplayed()))
    }

    fun checkGalleryScreenListOfItemsIsDisplayed() {
        galleryElement.galleryListOfItemsElement().check(matches(isDisplayed()))
    }

    fun clickOnFirstItem() {
        galleryElement.galleryItemElement("1")
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun clickOnLastItem() {
        galleryElement.galleryItemElement("10")
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun checkFirstItemNotificationTextIsDisplayed() {
        notificationElement.notificationText("Item #1 clicked successfully!").check(matches(isDisplayed()))
    }

    fun checkLastItemNotificationTextIsDisplayed() {
        notificationElement.notificationText("Item #10 clicked successfully!").check(matches(isDisplayed()))
    }

    fun swipeUpGalleryItems() {
        galleryElement.galleryListOfItemsElement().perform(swipeUp())
    }
}