package prabhakar.manish.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate","Nothing Visible")
        Toast.makeText(this,"OnCreate - Nothing Visible",Toast.LENGTH_SHORT).show()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","UI Visible but Not Interactive")
        Toast.makeText(this,"OnStart - UI Visible but Not Interactive",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","Visible and Interactive")
        Toast.makeText(this,"OnResume - Visible and Interactive",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","Maybe Visible or Not Visible")
        Toast.makeText(this,"OnPause - Maybe Visible or Not Visible",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","Nolonger Visible")
        Toast.makeText(this,"OnStop - Nolonger Visible",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy","Resources get free")
        Toast.makeText(this,"OnDestroy - Resources get free",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","OnRestart")
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show()
    }
}