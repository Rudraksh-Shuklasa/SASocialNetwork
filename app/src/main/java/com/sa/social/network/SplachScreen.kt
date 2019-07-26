package com.sa.social.network

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.sa.social.network.utils.SharedPrefrenceUtils

class SplachScreen : AppCompatActivity() {

    private var delayHandler : Handler?= null
    private val delay : Long = 5000



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach_screen)

        delayHandler= Handler()

        delayHandler!!.postDelayed(runnable,delay)


    }

    internal  val runnable : Runnable= Runnable {
        if(!isFinishing)
        {
            var sharedPrefManager= SharedPrefrenceUtils.Companion.getSharefPrefrenceManager(this)
            if(sharedPrefManager!!.getBoolean(SharedPrefrenceUtils.Companion.IsLogin,false))
            {

            }
            else{
                var goToLogin=Intent(this,LoginActivity::class.java)
                startActivity(goToLogin)
                finish()
            }


        }
    }

    override fun onDestroy() {

        if(delayHandler!=null)
            delayHandler!!.removeCallbacks(runnable)

        super.onDestroy()
    }
}
