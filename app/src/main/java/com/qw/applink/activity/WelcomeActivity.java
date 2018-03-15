package com.qw.applink.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.qw.applink.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wlecome);


        final Intent intent = getIntent();

        //接受数据
//        if (null != intent.getData()) {
//            Uri uri = intent.getData();
//            Log.d("qw", uri.toString());
//            String pageTarget = uri.getQueryParameter("page");
//            String pageText = uri.getQueryParameter("text");
//            if (TextUtils.isEmpty(pageTarget))
//                pageTarget = "";
//            if (TextUtils.isEmpty(pageText))
//                pageText = "";
//
//            Toast.makeText(this, "去页面：" + pageTarget + "\n" + "text： " + pageText, Toast.LENGTH_LONG).show();
//
//        }


        //延迟2秒去主页，模拟数据初始化操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainActivityIntent = new Intent(WelcomeActivity.this, MainActivity.class);
                //我们不再在这个页面处理数据，改到首页去做这件事
                if(null != intent.getData()){
                    mainActivityIntent.setData(intent.getData());
                }
                startActivity(mainActivityIntent);
                finish();
            }
        }, 2000);
    }
}
