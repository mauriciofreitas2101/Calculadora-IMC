package com.example.calculadoraimc

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val h = (height.text).toString().toFloat() /100
            val w = weight.text.toString().toFloat()
            val res = w/(h*h)
                result.text = "%.2f".format(res)
            if (res < 17) {
                status.text = "Muito abaixo do peso"
            }else if(res in 17.0..18.4) {
                status.text = "Abaixo do peso"
            }else if(res in 18.5..24.9) {
                status.text = "Peso normal"
            }else if(res in 25.0..29.9) {
                status.text = "Acima do peso"
            }else if(res in 30.0..34.9) {
                status.text = "Obesidade grau I"
            }else if(res in 35.0..40.0) {
                status.text = "Obesidade grau II"
            }else if(res > 40) {
                status.text = "Obesidade grau III"
            }
    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.feminino -> {
                    if (checked) {

                    } else {

                    }
                }
                R.id.masculino -> {
                    if (checked) {

                    } else {

                    }
                }

            }
        }
    }

}

    fun onCheckboxClicked(view: View) {}
}