package com.old.leopards.restaurant.pageObjects

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.old.leopards.restaurant.R

class StartPage {
    private val loginBtn = R.id.btnLogin

    fun clickOnLoginBtn(): LoginPage {
        Espresso.onView(ViewMatchers.withId(loginBtn))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(ViewActions.click())
        return LoginPage()
    }
}