package com.example.robotstats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var strengthNumberTextView: TextView
    private lateinit var atackMinusButton: Button
    private lateinit var atackPlusButton: Button

    private lateinit var speedNumberTextView: TextView
    private lateinit var speedMinusButton: Button
    private lateinit var speedPlusButton: Button

    private lateinit var defenseNumberTextView: TextView
    private lateinit var defenseMinusButton: Button
    private lateinit var defensePlusButton: Button

    private lateinit var chargeNumberTextView: TextView
    private lateinit var chargeMinusButton: Button
    private lateinit var chargePlusButton: Button

    private lateinit var resetButton: Button

    private var strengthNumber: Int = 0;
    private var speedNumber: Int = 0;
    private var defenseNumber: Int = 0;
    private var chargeNumber: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // Ocultar barra de navegación
                        or View.SYSTEM_UI_FLAG_FULLSCREEN // Ocultar barra de estado
                        or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        strengthNumberTextView = findViewById(R.id.streghthNumber)
        atackMinusButton = findViewById(R.id.atackMinus)
        atackPlusButton = findViewById(R.id.atackPlus)

        speedNumberTextView = findViewById(R.id.speedNumber)
        speedMinusButton = findViewById(R.id.speedMinus)
        speedPlusButton = findViewById(R.id.speedPlus)

        defenseNumberTextView = findViewById(R.id.defenseNumber)
        defenseMinusButton = findViewById(R.id.defenseMinus)
        defensePlusButton = findViewById(R.id.defensePlus)

        chargeNumberTextView = findViewById(R.id.chargeNumber)
        chargeMinusButton = findViewById(R.id.chargeMinus)
        chargePlusButton = findViewById(R.id.chargePlus)

        resetButton = findViewById(R.id.reset)

        strengthNumberTextView.text = strengthNumber.toString()
        speedNumberTextView.text = speedNumber.toString()
        defenseNumberTextView.text = defenseNumber.toString()
        chargeNumberTextView.text = chargeNumber.toString()

        // Ataque
        atackMinusButton.setOnClickListener {
            if (strengthNumber > -10) {
                strengthNumber -= 1
                strengthNumberTextView.text = strengthNumber.toString() // Actualiza el TextView
            }
        }

        atackPlusButton.setOnClickListener {
            if(strengthNumber < 30) {
                strengthNumber += 1
                strengthNumberTextView.text = strengthNumber.toString() // Actualiza el TextView
            }
        }
    // Velocidad
        speedMinusButton.setOnClickListener {
            if (speedNumber > -10) {
                speedNumber -= 1
                speedNumberTextView.text = speedNumber.toString() // Actualiza el TextView
            }
        }

        speedPlusButton.setOnClickListener {
            if(speedNumber < 30) {
                speedNumber += 1
                speedNumberTextView.text = speedNumber.toString() // Actualiza el TextView
            }
        }
        // Defensa
        defenseMinusButton.setOnClickListener {
            if (defenseNumber > -10) {
                defenseNumber -= 1
                defenseNumberTextView.text = defenseNumber.toString() // Actualiza el TextView
            }
        }

        defensePlusButton.setOnClickListener {
            if(defenseNumber < 30) {
                defenseNumber += 1
                defenseNumberTextView.text = defenseNumber.toString() // Actualiza el TextView
            }
        }
        // Carga
        chargeMinusButton.setOnClickListener {
            if (chargeNumber > -10) {
                chargeNumber -= 1
                chargeNumberTextView.text = chargeNumber.toString() // Actualiza el TextView
            }
        }

        chargePlusButton.setOnClickListener {
            if(chargeNumber < 30) {
                chargeNumber += 1
                chargeNumberTextView.text = chargeNumber.toString() // Actualiza el TextView
            }
        }

        resetButton.setOnClickListener{
            strengthNumber = 0
            speedNumber = 0
            defenseNumber = 0
            chargeNumber = 0

            strengthNumberTextView.text = strengthNumber.toString()
            speedNumberTextView.text = speedNumber.toString()
            defenseNumberTextView.text = defenseNumber.toString()
            chargeNumberTextView.text = chargeNumber.toString()
        }



    }


}