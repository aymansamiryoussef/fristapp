package android.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class reigisteration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reigisteration)

    }
    fun GoLogin(view:View)
    {
        intent= Intent(this,MainActivity::class.java)
        val toast =Toast.makeText(applicationContext,"login now",Toast.LENGTH_SHORT)
        toast.show()
        startActivity(intent)


    }
}