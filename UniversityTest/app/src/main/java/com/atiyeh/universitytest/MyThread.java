package com.atiyeh.universitytest;

import android.util.Log;

public class MyThread extends Thread {

    public void run(){
        Log.i("Universityapp", "ThreadSubclass, Main Thread ]]>>" +
                " pid: "+ android.os.Process.myPid()+
                " tid: "+ android.os.Process.myTid()+
                " id: " + Thread.currentThread().getId());
    }
}
