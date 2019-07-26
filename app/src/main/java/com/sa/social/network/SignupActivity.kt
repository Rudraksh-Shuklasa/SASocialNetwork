package com.sa.social.network

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var signUpString ="Already have an account?<font color='#504de4'>Log in</font>"
        txtLogin.setText(Html.fromHtml(signUpString))
        val ss = SpannableString(txtLogin.text.toString())

        txtLogin.setOnClickListener {
            var goToSignUp= Intent(this,LoginActivity::class.java)
            startActivity(goToSignUp)
            finish()

        }
        txtLogin.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
