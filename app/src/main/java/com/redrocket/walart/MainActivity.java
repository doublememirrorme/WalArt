package com.redrocket.walart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView backgroundImage = (ImageView) findViewById(R.id.background);

        Picasso.with(this.getContext())
                .load(currentArticle.getmImageUrl())
                .centerCrop()
                .transform(new CircleTransform(50,0))
                .fit()
                .into(image);
    }

}