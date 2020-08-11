package my.com.anak2u.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = findViewById(R.id.webView);
        webView.loadUrl("https://www.itrain.com.my");
        webView.getSettings().setJavaScriptEnabled(true);
        // Always open within the app
        webView.setWebChromeClient(new WebChromeClient());
    }
}
