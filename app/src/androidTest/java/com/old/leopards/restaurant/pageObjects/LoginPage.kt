package com.old.leopards.restaurant.pageObjects

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.old.leopards.restaurant.R

class LoginPage {
    private val nameInput = R.id.editTextTextPersonName
    private val passwordInput = R.id.editTextTextPersonName1
    private val loginBtn = R.id.btn_login

    fun typeName(name: String): LoginPage {
        val nameInput = Espresso.onView(ViewMatchers.withId(nameInput))
        nameInput.check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            .perform(ViewActions.click()).perform(
            ViewActions.replaceText(name)
        )
        Espresso.onView(ViewMatchers.isRoot()).perform(ViewActions.closeSoftKeyboard())
        return this
    }

    fun typePassword(password: String): LoginPage {
        val passwordInput = Espresso.onView(ViewMatchers.withId(passwordInput))
        passwordInput.check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed())).perform(
            ViewActions.click()
        )
            .perform(ViewActions.replaceText(password))

        Espresso.onView(ViewMatchers.isRoot()).perform(ViewActions.closeSoftKeyboard())
        return LoginPage()
    }

    fun clickOnLoginBtn(): FeedPage {
        Espresso.onView(ViewMatchers.withId(loginBtn))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
            .perform(ViewActions.click())
        return FeedPage()
    }


}
