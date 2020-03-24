package com.atiyeh.universitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt0 = findViewById(R.id.bt0);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        getString(R.string.welcome),
                        Toast.LENGTH_LONG).show();
            }
        });

        //ThreadSubclass();
    }

    public void showWelcome(View view) {
        Toast.makeText(MainActivity.this,
                getString(R.string.welcome),
                Toast.LENGTH_LONG).show();
        Button bt0 = findViewById(R.id.bt0);
        bt0.setVisibility(View.VISIBLE);
    }

    /*void ThreadSubclass(){
        Log.i("Universityapp", "ThreadSubclass, Main Thread ]]>>" +
                " pid: "+ android.os.Process.myPid()+
                " tid: "+ android.os.Process.myTid()+
                " id: " + Thread.currentThread().getId());

        MyThread myThread = new MyThread();
        myThread.start();


        Log.i("Universityapp", "ThreadSubclass, Main Thread ]]>>" +
                " pid: "+ android.os.Process.myPid()+
                " tid: "+ android.os.Process.myTid()+
                " id: " + Thread.currentThread().getId());
    }*/
}
