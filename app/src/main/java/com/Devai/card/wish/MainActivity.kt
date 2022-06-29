package com.Devai.card.wish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnpass.setOnClickListener {

            val name=etname.editableText.toString()
            Toast.makeText(this,"You Entered ${name}",Toast.LENGTH_LONG).show()
        intent=Intent(this,FinalCard::class.java)


            intent.putExtra(FinalCard.NAME_EXTRA,name)

            startActivity(intent)

        }
    }
}