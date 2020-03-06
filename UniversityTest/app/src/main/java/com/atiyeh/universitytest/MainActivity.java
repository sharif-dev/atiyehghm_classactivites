package com.atiyeh.universitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ThreadSubclass();
    }

    void ThreadSubclass(){
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
    }
}
