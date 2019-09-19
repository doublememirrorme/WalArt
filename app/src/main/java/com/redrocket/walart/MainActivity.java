package com.redrocket.walart;

import android.app.WallpaperManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final String API_KEY = "RJ4ejKEfig7PWGFgXVqhm8K3VG9aGxDeD8YVnNUsv8k5T9p9QfQFK7WJy19TBdPk";

    ImageView mBackgroundImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBackgroundImage = (ImageView) findViewById(R.id.background);

        Picasso.get().setLoggingEnabled(true);


        Picasso
            .get()
            .load("https://art.thewalters.org/detail/download/48478/")
            .into(mBackgroundImage);
    }


}