package ga.vargasangel.chatgptwebview

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pantalla = findViewById<WebView>(R.id.pantalla)
        pantalla.webViewClient = WebViewClient()
        pantalla.settings.javaScriptEnabled=true
        pantalla.loadUrl("https://chat.openai.com/")

        val refresh_button = findViewById<Button>(R.id.refresh_button)
        refresh_button.setOnClickListener {
            pantalla.reload()
        }
    }
}