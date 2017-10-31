package com.abir.hohtest;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.jetradarmobile.snowfall.SnowfallView;
import com.plattysoft.leonids.ParticleSystem;

public class MainActivity extends Activity {
    ImageView sunrise,user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //bind layout
        setContentView(R.layout.activity_main);
        //bind view
        sunrise=(ImageView)findViewById(R.id.sunrise);
        user=(ImageView)findViewById(R.id.user);

        //animation sun rotation
        ObjectAnimator animRotationClockwise;
        animRotationClockwise = ObjectAnimator.ofFloat(sunrise, View.ROTATION, 0f, 360f);
        animRotationClockwise.setDuration(19000);
        animRotationClockwise.setRepeatCount(ValueAnimator.INFINITE);
        animRotationClockwise.setRepeatMode(ValueAnimator.RESTART);
        animRotationClockwise.setInterpolator(new LinearInterpolator());
        //start animation
        animRotationClockwise.start();

    }
    

}
