package com.qw.applink.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.qw.applink.R;

/**
 * Created by cd5160866 on 12/03/2018.
 */

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);

        Intent intent = getIntent();
        if (null != intent.getExtras()) {
            Toast.makeText(this, intent.getExtras().getString(MainActivity.TEXT_EXTRA) + "", Toast.LENGTH_LONG).show();
        }
    }
}
