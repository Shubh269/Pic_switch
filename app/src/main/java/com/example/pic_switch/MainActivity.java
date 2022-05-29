package com.example.pic_switch;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{
    ImageSwitcher IS;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IS = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        IS.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView()
            {
                ImageView IV = new ImageView(getApplicationContext());
                IV.setScaleType(ImageView.ScaleType.FIT_CENTER);
                IV.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                return IV;
            }
        });
    }
    public void left(View v) {
        IS.setImageResource(R.drawable.modiji);
    }
    public void right(View v) {
        IS.setImageResource(R.drawable.donald);
    }
}
