package com.abir.hohtest;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.plattysoft.leonids.ParticleSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        animRotationClockwise.setDuration(20000);
        animRotationClockwise.setRepeatCount(ValueAnimator.INFINITE);
        animRotationClockwise.setRepeatMode(ValueAnimator.RESTART);
        animRotationClockwise.setInterpolator(new LinearInterpolator());
        //start animation
        animRotationClockwise.start();

        //animation coins snowing
        //set different rubin icons to animation
        //change start point for each icon
        new ParticleSystem(this, 20, R.drawable.img_rubin_one, 10000, R.id.container)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 180, 0)
                .setAcceleration(0.00010f, 90)
                .emit(500,0,8,100000000);

        new ParticleSystem(this, 20, R.drawable.img_rubin_two, 10000, R.id.container_two)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 180, 0)
                .setAcceleration(0.00010f, 90)
                .emit(700,0,8,100000000);

        new ParticleSystem(this, 20, R.drawable.img_rubin_three, 10000, R.id.container_three)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 180, 0)
                .setAcceleration(0.00010f, 90)
                .emit(900,0,8,100000000);

        new ParticleSystem(this, 80, R.drawable.img_rubin_four, 10000, R.id.container_four)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 180, 0)
                .setAcceleration(0.00010f, 90)
                .emit(1100,0,8,100000000);

        new ParticleSystem(this, 20, R.drawable.img_rubin_five, 10000, R.id.container_five)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 180, 0)
                .setAcceleration(0.00010f, 90)
                .emit(200,0,8,100000000);

        new ParticleSystem(this, 20, R.drawable.img_rubin_six, 10000, R.id.container_six)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 180, 0)
                .setAcceleration(0.00010f, 90)
                .emit(1300,0,8,100000000);

    }
    

}
