package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.MenuScreenStep
import com.example.myawesomeapp.step.SlideshowScreenStep
import com.example.myawesomeapp.step.ToolbarStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SlideshowTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val menu = MenuScreenStep()
    private val slideshow = SlideshowScreenStep()
    private val toolbar = ToolbarStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkSlideshowScreen() {
        // clicking on menu button
        toolbar.clickOnMenuButton()
        // clicking on slideshow option
        menu.clickOnSlideshowButton()
        // checking slideshow screen
        slideshow.checkSlideshowScreenTextIsDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}