/*
 * © 2018 Match Group, LLC.
 */

package com.tinder.app.root.view

import android.support.v7.app.AppCompatActivity
import com.tinder.app.echo.view.EchoBotFragment
import com.tinder.app.gdax.view.GdaxFragment

class DemoActivity : AppCompatActivity() {

    companion object {
        private val TAB_ITEMS = listOf(
                "Echo Bot" to { EchoBotFragment() },
                "GDAX" to { GdaxFragment() }
        )
    }
}
