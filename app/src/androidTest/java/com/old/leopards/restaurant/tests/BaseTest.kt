package com.old.leopards.restaurant.tests

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.old.leopards.restaurant.MainActivity
import com.old.leopards.restaurant.R
import com.old.leopards.restaurant.model.UserFactory
import com.old.leopards.restaurant.pageObjects.FeedPage
import org.junit.After
import org.junit.Before

open class BaseTest {
    private lateinit var activityScenario: ActivityScenario<MainActivity>

    @Before
    fun setupActivity() {
        activityScenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun cleanActivity() {
        activityScenario.close()
    }

    fun login(): FeedPage {
        val user = UserFactory.createCorrectUser()
        Espresso.onView(ViewMatchers.withId(R.id.btnLogin))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(ViewActions.click())

        val nameInput = Espresso.onView(ViewMatchers.withId(R.id.editTextTextPersonName))
        nameInput.check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(ViewActions.click()).perform(
            ViewActions.typeText(user.login)
        )

        val passwordInput = Espresso.onView(ViewMatchers.withId(R.id.editTextTextPersonName1))
        passwordInput.check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(ViewActions.click()).perform(
            ViewActions.typeText(user.login)
        )

        Espresso.onView(ViewMatchers.withId(R.id.btn_login))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.nav_view))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        return FeedPage()
    }
}