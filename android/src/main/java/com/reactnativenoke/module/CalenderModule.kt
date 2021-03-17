package com.reactnativenoke.module

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.reactnativenoke.activity.NokeActivity

class CalenderModule(context: ReactApplicationContext) : ReactContextBaseJavaModule() {
  private val reactContext = context;
  override fun getName(): String {
    return "CalendarModule"
  }


  @ReactMethod
  fun createCalendarEvent(name: String, location: String) {
    Log.d("CalendarModule", "Create event called with name: " + name
      + " and location: " + location)
  }
}
