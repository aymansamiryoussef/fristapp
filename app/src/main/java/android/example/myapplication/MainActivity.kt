package android.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun registaration(view: View)
    {
        intent = Intent(this,reigisteration::class.java)
       val toast=Toast.makeText(applicationContext,"welcome user",Toast.LENGTH_SHORT)
        toast.show()
        startActivity(intent)



    }
}