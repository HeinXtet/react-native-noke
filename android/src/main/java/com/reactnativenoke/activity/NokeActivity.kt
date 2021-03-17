package com.reactnativenoke.activity

import android.os.Bundle
import com.facebook.react.ReactActivity
import com.reactnativenoke.R

class NokeActivity : ReactActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_noke)
  }
}
