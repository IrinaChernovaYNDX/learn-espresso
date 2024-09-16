package com.example.myawesomeapp.element

import android.widget.RelativeLayout
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf

class GalleryScreenElement {
    fun galleryListOfItemsElement(): ViewInteraction =
        onView(
            withId(R.id.recycle_view),
        )

    fun galleryItemElement(number: String): ViewInteraction =
        onView(
            allOf(
                isDescendantOfA(isAssignableFrom(RelativeLayout::class.java)),
                withId(R.id.item_title),
                hasSibling(
                    allOf(
                        withText(number),
                        withId(R.id.item_number)
                    )
                )
            )
        )
}