package org.zapto.zukayu.www.covachandigarh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class adminDesk extends AppCompatActivity {

    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_desk);


        myWebView = (WebView) findViewById( R.id.webview_id );
        myWebView.setClickable(true);
        myWebView.getSettings().setSupportMultipleWindows(true);
        myWebView.getSettings().setDisplayZoomControls(true);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        myWebView.getSettings().setJavaScriptEnabled(true);

        String playVideo= "<html><body><iframe class=\"youtube-player\" type=\"text/html\" width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZW8-SSotJ-c\" frameborder=\"0\"></body></html>";

        myWebView.loadData(playVideo, "text/html", "utf-8");

    }
}
