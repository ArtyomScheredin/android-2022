package com.old.leopards.restaurant.pageObjects

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.old.leopards.restaurant.R

class FeedPage {
    fun isDisplayed() {
        Espresso.onView(ViewMatchers.withId(R.id.nav_view))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}
