package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.MenuOpenStep
import com.example.myawesomeapp.step.SlideshowButtonStep
import com.example.myawesomeapp.step.SlideshowScreenStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SlideshowTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val menu = MenuOpenStep()
    private val slideshowButton = SlideshowButtonStep()
    private val slideshowScreen = SlideshowScreenStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkSlideshowScreen() {
        // clicking on menu button
        menu.clickOnMenuButton()
        // clicking on slideshow option
        slideshowButton.clickOnSlideshowButton()
        // checking slideshow screen
        slideshowScreen.checkSlideshowScreenIsDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}
