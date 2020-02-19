package com.example.lab4milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private Button buttonStartThread;

    private volatile boolean stopThread = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStartThread = findViewById(R.id.startButton);
    }

    public void startThread(View view){
        stopThread = false;
        ExampleRunnable runnable = new ExampleRunnable(10);
        new Thread(runnable).start();
    }

    public void stopThread(View view){
        stopThread = true;
    }


    class ExampleRunnable implements Runnable {

        int seconds;

        ExampleRunnable(int seconds){
            this.seconds = seconds;
        }

        @Override
        public void run(){

        }

    }


}
