package com.rn_with_kotlin_native_modules.pkg_module_1

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.*

class MyNativeModulePackage : ReactPackage {

    /**
     * this way of registering native modules eagerly initializes
     * all native modules when the application starts, which adds
     * to the startup time of an application.
     */
    override fun createNativeModules(
        reactContext: ReactApplicationContext
    ): List<NativeModule> {
        val modules: MutableList<NativeModule> = ArrayList()
        modules.add(NativeModule1(reactContext))
        return modules
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<View, ReactShadowNode<*>>> {
        return Collections.emptyList()
    }

}