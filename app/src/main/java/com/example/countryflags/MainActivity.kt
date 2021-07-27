package com.example.countryflags

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnAvst : Button
    private lateinit var btnPol : Button
    private lateinit var btnIt : Button
    private lateinit var btnColum : Button
    private lateinit var btnMadaga : Button
    private lateinit var btnTai : Button
    private lateinit var btnDan : Button
    private lateinit var btnShveitc : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initLogicButton(btnAvst, AvstActivity::class.java)
        initLogicButton(btnPol, PolActivity::class.java)
        initLogicButton(btnIt, ItActivity::class.java)
        initLogicButton(btnColum, ColumActivity::class.java)
        initLogicButton(btnMadaga, MadagaActivity::class.java)
        initLogicButton(btnTai, TaiActivity::class.java)
        initLogicButton(btnDan, DanActivity::class.java)
        initLogicButton(btnShveitc, ShveitcActivity::class.java)
    }

    private fun initView(){
        btnAvst = findViewById(R.id.btn_avst)
        btnPol = findViewById(R.id.btn_pol)
        btnIt = findViewById(R.id.btn_it)
        btnColum = findViewById(R.id.btn_colum)
        btnMadaga = findViewById(R.id.btn_madaga)
        btnTai = findViewById(R.id.btn_tai)
        btnDan = findViewById(R.id.btn_dan)
        btnShveitc = findViewById(R.id.btn_shveitc)
    }

    private fun initLogicButton(btn: Button, cls: Class<*>?) {
        btn.setOnClickListener {
            val myIntent = Intent(this, cls)
            startActivity(myIntent)
        }
    }

}