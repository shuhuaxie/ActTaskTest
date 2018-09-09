package com.test.taskandactivity

import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class TestActivity : BaseAct() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val intent = Intent(this@TestActivity, MainActivity::class.java)
        intent.putExtra("msg",this.toString()+"msg")
        findViewById<Button>(R.id.button).setOnClickListener{

            startActivity(intent)
        }

//        findViewById<View>(R.id.two_act).setOnClickListener {
//            // start twice
//            startActivity(Intent(this@MainActivity, TestActivity::class.java))
//            startActivity(Intent(this@MainActivity, TestActivity::class.java))
//        }
    }


}
class Test2Activity : BaseAct() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_top)
        val intent = Intent(this@Test2Activity, Test2Activity::class.java)
        intent.putExtra("msg",this.toString()+"msg")
        findViewById<TextView>(R.id.textView).setOnClickListener{
            startActivity(intent)
        }
        findViewById<TextView>(R.id.textView2).setOnClickListener{
            startActivity(Intent(this@Test2Activity, TestActivity::class.java))
            startActivity(intent)
        }
//        findViewById<View>(R.id.two_act).setOnClickListener {
//            // start twice
//            startActivity(Intent(this@MainActivity, TestActivity::class.java))
//            startActivity(Intent(this@MainActivity, TestActivity::class.java))
//        }
    }



}