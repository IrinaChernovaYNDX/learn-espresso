package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import org.hamcrest.core.AllOf.allOf
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R

class MenuScreenElement {
    fun userPicture(): ViewInteraction =
        onView(
            withId(R.id.imageView)
        )

    fun userName(): ViewInteraction =
        onView(
            allOf(
                withText(R.string.nav_header_title),
                isDescendantOfA(withId(R.id.nav_view))
            )
        )

    fun userEmail(): ViewInteraction =
        onView(
            withId(R.id.textView)
        )

    fun homeButton(): ViewInteraction =
        onView(
            allOf(
                withId(R.id.nav_home),
                hasDescendant(withText(R.string.menu_home))
            )
        )

    fun galleryButton(): ViewInteraction =
        onView(
            allOf(
                withId(R.id.nav_gallery),
                hasDescendant(withText(R.string.menu_gallery))
            )
        )

    fun slideshowButton(): ViewInteraction =
        onView(
            allOf(
                withId(R.id.nav_slideshow),
                hasDescendant(withText(R.string.menu_slideshow))
            )
        )
}
