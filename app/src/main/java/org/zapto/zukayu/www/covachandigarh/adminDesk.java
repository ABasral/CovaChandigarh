package org.zapto.zukayu.www.covachandigarh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class adminDesk extends AppCompatActivity {

    private WebView myWebView,myWebView2;
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

        myWebView2 = (WebView) findViewById( R.id.webview_id2);
        myWebView2.setClickable(true);
        myWebView2.getSettings().setSupportMultipleWindows(true);
        myWebView2.getSettings().setDisplayZoomControls(true);
        myWebView2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        myWebView2.getSettings().setJavaScriptEnabled(true);

        String playVideo= "<html><body><iframe class=\"youtube-player\" type=\"text/html\" width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZW8-SSotJ-c\" frameborder=\"0\"></body></html>";

        String playVideo2= "<html><body><iframe class=\"youtube-player\" type=\"text/html\" width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qKl8HgFiBV0\" frameborder=\"0\"></body></html>";

        myWebView2.loadData(playVideo2,"text/html","utf-8");
        myWebView.loadData(playVideo, "text/html", "utf-8");

    }
}
