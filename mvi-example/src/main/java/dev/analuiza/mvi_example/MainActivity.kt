package dev.analuiza.mvi_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.analuiza.mvi_example.ui.login.LoginFragment
import dev.analuiza.mvi_example.ui.profile.ProfileFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment())
                .commitNow()
        }
    }

    fun navigateToProfile(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ProfileFragment())
            .commitNow()
    }
}