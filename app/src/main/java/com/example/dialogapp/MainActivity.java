package com.example.dialogapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Random;

/**
 * @author liem
 * @date 20/11/2019
 *
 * this activity includes five buttons, by tapping each button a different Alert Dialog will pop.
 */

public class MainActivity extends AppCompatActivity {

    LinearLayout ll;
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.ll);
    }


    /**
     * when tapping the first button it will show a dialog that includes a message.
     */
    public void a(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("1st option");
        adb.setMessage("This is the first button message");

        AlertDialog ad = adb.create();
        ad.show();
    }


    /**
     * when tapping the second button it will show a dialog that includes a message and an icon.
     */
    public void ai(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("2nd option");
        adb.setIcon(R.drawable.stopsign);
        adb.setMessage("This is the second button message");

        AlertDialog ad = adb.create();
        ad.show();
    }


    /**
     * when tapping the third button it will show a dialog that includes a message, an icon and a button.
     * when tapping the button it will exit the dialog.
     */
    public void aib(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setIcon(R.drawable.stopsign);
        adb.setTitle("3rd option");
        adb.setMessage("This is the third button message");
        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }


    /**
     * when tapping the fourth button it will show a dialog that includes:
     * a message saying "background color changing",
     * a button that will change the color of the background to a random color
     * and a button that will exit the dialog.
     */
    public void backtwo(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("4th option");
        adb.setMessage("tap 'color' to change the color");
        adb.setPositiveButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(new Random().nextInt());
            }
        });
        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();

    }


    /**
     * when tapping the fifth button it will show a dialog that includes:
     * a message saying "background color changing",
     * a button that will change the color of the background to a random color
     * a button that will change the background back to white'
     * and a button that will exit the dialog.
     */
    public void backthree(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("5th option");
        adb.setMessage("'color' to change color, 'white' to turn white");
        adb.setPositiveButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(new Random().nextInt());
            }
        });

        adb.setNeutralButton("white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(Color.WHITE);
            }
        });

        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }


    /**
     * inflating the menu.
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    /**
     * when tapping the "credits" button this will go to the credits activity
     */
    public boolean onOptionsItemSelected (MenuItem item){
        int id=item.getItemId();
        if (id == R.id.crd) {
            Intent si=new Intent(this,creds.class);
            startActivity(si);
        }

        return true;
    }
}