package com.rn_with_kotlin_native_modules

import android.app.Application
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.react.shell.MainReactPackage
import com.facebook.soloader.SoLoader
import com.rn_with_kotlin_native_modules.pkg_module_1.MyNativeModulePackage

class MainApplication : Application(), ReactApplication {
    private val mReactNativeHost = object : ReactNativeHost(this) {

        override fun getUseDeveloperSupport(): Boolean {
            return BuildConfig.DEBUG
        }

        override fun getPackages(): List<ReactPackage> {
            return listOf(
                MainReactPackage(),
                MyNativeModulePackage()
            )
        }

        override fun getJSMainModuleName(): String {
            return "index"
        }
    }

    override fun getReactNativeHost(): ReactNativeHost {
        return mReactNativeHost
    }

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, /* native exopackage */ false)
        // initializeFlipper(this, reactNativeHost.reactInstanceManager)
    }

    /*companion object {
        *//**
         * Loads Flipper in React Native templates. Call this in the onCreate method with something like
         * initializeFlipper(this, getReactNativeHost().getReactInstanceManager());
         *
         * @param context
         * @param reactInstanceManager
         *//*
        private fun initializeFlipper(
            context: Context, reactInstanceManager: ReactInstanceManager
        ) {
            if (BuildConfig.DEBUG) {
                try {
                    *//*
                        We use reflection here to pick up the class that initializes Flipper,
                        since Flipper library is not available in release mode
                    *//*
                    val aClass =
                        Class.forName("com.rn_with_kotlin_native_modules.ReactNativeFlipper")
                    aClass
                        .getMethod(
                            "initializeFlipper",
                            Context::class.java,
                            ReactInstanceManager::class.java
                        )
                        .invoke(null, context, reactInstanceManager)
                } catch (e: ClassNotFoundException) {
                    e.printStackTrace()
                } catch (e: NoSuchMethodException) {
                    e.printStackTrace()
                } catch (e: IllegalAccessException) {
                    e.printStackTrace()
                } catch (e: InvocationTargetException) {
                    e.printStackTrace()
                }
            }
        }
    }*/
}

