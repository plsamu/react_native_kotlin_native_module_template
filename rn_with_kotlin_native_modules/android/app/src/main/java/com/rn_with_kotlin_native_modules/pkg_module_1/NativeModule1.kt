package com.rn_with_kotlin_native_modules.pkg_module_1

import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class NativeModule1 internal constructor(context: ReactApplicationContext?) :
    ReactContextBaseJavaModule(context) {

    private val TAG = NativeModule1::class.simpleName

    override fun getName() = "NativeModule1"

    @ReactMethod
    fun logSomething(name: String, location: String) {
        Log.d(TAG, "Create event called with name: $name and location: $location")
    }

}