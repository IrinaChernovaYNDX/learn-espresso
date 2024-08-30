package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.MenuScreenStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SecondTest {
    private lateinit var scenario: ActivityScenario<MainActivity>
    private val toolbar = MainScreenStep()
    private val menuButton = MainScreenStep()
    private val menuScreen = MenuScreenStep()
    private val homeButton = MenuScreenStep()
    private val main = MainScreenStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkMenuScreen() {
        toolbar.checkToolbarElements()
        menuButton.clickOnMenuButton()
        menuScreen.checkMenuElementsAreDisplayed()
        homeButton.clickOnHomeButton()
        main.checkMainScreenTextIsDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}