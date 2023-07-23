package com.example.client_view_android_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import java.io.File;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        //
        String root = Environment.getDataDirectory().getPath() + "/data/com.example.client_view_android_11/";
        File myDir = new File(root);
        String fname = "data" + ".txt";
        File file = new File(myDir, fname);
        Intent intent;
        if (file.exists()) {
            // file exists, start MainActivity
            intent = new Intent(this, MainActivity.class);
        } else {
            // file does not exist, start LoginActivity
            intent = new Intent(this, RegisterFormActivity.class);
        }
        startActivity(intent);
        // finish the splash activity
        finish();
    }
}