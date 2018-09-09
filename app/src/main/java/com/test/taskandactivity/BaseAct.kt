package com.test.taskandactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast

open class BaseAct: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("xie", this.toString()+":onCreate");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("xie", this.toString()+":onDestroy");
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        val msg = this.toString() + "_onNewIntent"
        Log.e("xie", msg)
        Toast.makeText(this@BaseAct, msg, Toast.LENGTH_LONG).show()
    }
}