package com.example.dialogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * this activity is the credits activity
 */
public class creds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creds);
    }


    /**
     * inflating the menu
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * when tapping on "buttons" this will go to the main activity
     */

    public boolean onOptionsItemSelected (MenuItem item){
        int id=item.getItemId();
        if (id == R.id.btn) {
        finish();}
        return true;
    }
}

