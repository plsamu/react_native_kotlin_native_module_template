package com.rn_with_kotlin_native_modules

import com.facebook.react.ReactActivity

class MainActivity : ReactActivity() {
    /**
     * Returns the name of the main component registered from JavaScript. This is used to schedule
     * rendering of the component.
     */
    override fun getMainComponentName(): String {
        return "rn_with_kotlin_native_modules"
    }
}
