package com.reactnativenoke.module

import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise
import com.reactnativenoke.activity.NokeActivity

class NokeModule(context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {


  private val reactContext = context;

  override fun getName(): String {
    return "Noke"
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  fun multiply(a: Int, b: Int, promise: Promise) {
    promise.resolve(a * b)
  }

  @ReactMethod
  fun openNoke() {
    reactContext.startActivity(Intent(reactContext.currentActivity, NokeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
  }
}
