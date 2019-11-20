package com.example.dialogapp;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * @author liem
 * @date 20/11/2019
 *
 * this activity includes five buttons, by tapping each button a different Alert Dialog will pop.
 */

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     *
     * @param view
     */
    public void a(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setMessage("This is the first button message");

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void ai(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setMessage("This is the second button message");
        adb.setIcon(R.drawable.ic_launcher_foreground);

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void aib(View view) {
    }

    public void backtwo(View view) {
    }

    public void backthree(View view) {
    }
}
