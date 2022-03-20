package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    ImageView im;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) this.findViewById(R.id.button2);
        btn2=(Button) this.findViewById(R.id.button4);
        btn3=(Button) this.findViewById(R.id.button5);
        btn4=(Button) this.findViewById(R.id.button3);
        btn5=(Button) this.findViewById(R.id.button6);
        btn6=(Button) this.findViewById(R.id.button7);
        btn7=(Button) this.findViewById(R.id.button8);
        btn8=(Button) this.findViewById(R.id.button9);




    }

    public void demo1(View view) {
        im=(ImageView) this.findViewById(R.id.imageView);
        @SuppressLint("ResourceType") Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.anim);
        im.startAnimation(anim);

    }

    public void demo2(View view) {
        im=(ImageView) this.findViewById(R.id.imageView);
        @SuppressLint("ResourceType") Animation blink= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.blink);
        im.startAnimation(blink);
    }

    public void demo3(View view) {
        im=(ImageView) this.findViewById(R.id.imageView);
        @SuppressLint("ResourceType") Animation fade= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.fade);
        im.startAnimation(fade);
    }

    public void demo4(View view) {
        im=(ImageView) this.findViewById(R.id.imageView);
        @SuppressLint("ResourceType") Animation bounce= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.bounce);
        im.startAnimation(bounce);
    }

    public void demo5(View view) {
        im=(ImageView) this.findViewById(R.id.imageView);
        @SuppressLint("ResourceType") Animation move= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.move);
        im.startAnimation(move);
    }

    public void demo6(View view) {
        im=(ImageView) this.findViewById(R.id.imageView);
        @SuppressLint("ResourceType") Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.rotate);
        im.startAnimation(rotate);
    }

    public void demo7(View view) {
        im=(ImageView) this.findViewById(R.id.imageView);
        @SuppressLint("ResourceType") Animation slide= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.slide);
        im.startAnimation(slide);
    }

    public void demo8(View view) {
        im=(ImageView) this.findViewById(R.id.imageView);
        @SuppressLint("ResourceType") Animation interpolator= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.interpolator);
        im.startAnimation(interpolator);
    }
}