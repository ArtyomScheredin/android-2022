package com.old.leopards.restaurant

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.old.leopards.restaurant.pageObjects.StartPage
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MyTest : BaseTest() {

    @Test
    fun loginTest() {
        val user = UserFactory.createCorrectUser()

        val startPage = StartPage()
        val loginPage = startPage.clickOnLoginBtn()
        val feedPage = loginPage.typeName(user.login)
            .typePassword(user.password)
            .clickOnLoginBtn()

        feedPage.isDisplayed()
    }
}