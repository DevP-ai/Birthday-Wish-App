package com.Devai.card.wish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final_card.*

class FinalCard : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_card)

        val name=intent.getStringExtra(NAME_EXTRA)
        Greet.text="Happy Birthday $name"
    }
}