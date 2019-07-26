package com.sa.social.network

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import kotlinx.android.synthetic.main.activity_login.*
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ClickableSpan
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat


class LoginActivity : AppCompatActivity() {

    var TAG = this.javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimary)
        var signUpString ="Dont have an account?<font color='#504de4'> Sgn Up</font>"
        txtSignup.setText(Html.fromHtml(signUpString))
        val ss = SpannableString(txtSignup.text.toString())

        txtSignup.setOnClickListener {
            var goToSignUp= Intent(this,SignupActivity::class.java)
            startActivity(goToSignUp)
            finish()

        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
