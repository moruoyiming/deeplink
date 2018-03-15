package com.qw.applink.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;

import com.qw.applink.R;

public class MainActivity extends AppCompatActivity {
    private final static String TARGET_ONE = "1";
    private final static String TARGET_TWO = "2";

    public final static String TEXT_EXTRA = "text";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dealWithIntent();

    }

    private void dealWithIntent() {

        Intent intent = getIntent();
        if (null == intent)
            return;

        Uri uri = intent.getData();
        if (null == uri)
            return;

        String pageTarget = uri.getQueryParameter("page");
        String pageText = uri.getQueryParameter("text");
        if (TextUtils.isEmpty(pageTarget))
            pageTarget = "";
        if (TextUtils.isEmpty(pageText))
            pageText = "";

        Intent launchIntent;
        switch (pageTarget) {
            default:
            case TARGET_ONE:
                launchIntent = new Intent(this, OneActivity.class);
                break;
            case TARGET_TWO:
                launchIntent = new Intent(this, TwoActivity.class);
                break;

        }
        launchIntent.putExtra(TEXT_EXTRA, pageText);
        startActivity(launchIntent);

    }
}
