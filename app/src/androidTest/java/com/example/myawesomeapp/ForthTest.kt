package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import com.example.myawesomeapp.step.GalleryScreenStep
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.MenuScreenStep
import com.example.myawesomeapp.step.NotificationStep
import com.example.myawesomeapp.step.ToolbarStep
import org.junit.After
import org.junit.Before
import org.junit.Test

class ForthTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val main = MainScreenStep()
    private val toolbar = ToolbarStep()
    private val menu = MenuScreenStep()
    private val gallery = GalleryScreenStep()
    private val notification = NotificationStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun galleryScreenCheck() {
        main.checkMainScreenTextIsDisplayed()
        toolbar.clickOnMenuButton()
        menu.checkMenuElementsAreDisplayed()
        menu.clickOnGalleryButton()
        menu.galleryButtonIsChecked()
        Thread.sleep(1000)
        gallery.checkGalleryToolbarIsDisplayed()
        gallery.checkGalleryScreenListOfItemsIsDisplayed()
        gallery.clickOnFirstItem()
        gallery.checkFirstItemNotificationTextIsDisplayed()
        notification.swipeNotificationPopup()
        Thread.sleep(1000)
        gallery.swipeUpGalleryItems()
        gallery.clickOnLastItem()
        gallery.checkLastItemNotificationTextIsDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}