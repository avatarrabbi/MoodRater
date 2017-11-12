package com.example.fake_zerin.moodrater;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private float x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        final TextView textView = (TextView) findViewById(R.id.spinner);
        Button upButton = (Button) findViewById(R.id.plus);
        Button downButton = (Button) findViewById(R.id.minus);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = textView.getText().toString();

                if(val.equals("1")){
                    Toast.makeText(getApplicationContext(), "You are feeling "+val + " Level of happines", Toast.LENGTH_LONG).show();
                    int rand = new Random().nextInt()%2;
                    Intent intent = null;
                    if(rand == 0){
                        intent = new Intent(MainActivity.this, feeling1a.class);

                    }else {
                        intent = new Intent(MainActivity.this, feeling1b.class);
                    }
                    startActivity(intent);
                }else if(val.equals("2")){
                    Toast.makeText(getApplicationContext(), "You are feeling "+val + " Level of happines", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, feeling2a.class);
                    startActivity(intent);
                }else if(val.equals("3")){
                    Toast.makeText(getApplicationContext(), "You are feeling "+val + " Level of happines", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, feeling3a.class);
                    startActivity(intent);
                }
                else if(val.equals("4")){
                    Toast.makeText(getApplicationContext(), "You are feeling "+val + " Level of happines", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, feeling4a.class);
                    startActivity(intent);
                }
                else if(val.equals("5")){
                    Toast.makeText(getApplicationContext(), "You are feeling "+val + " Level of happines", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, feeling5a.class);
                    startActivity(intent);}
            }
        });
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textView.getText().toString();
                int num = Integer.parseInt(text);
                if(num <5) {
                    num = num + 1;
                }
                textView.setText(String.valueOf(num));

            }
        });

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textView.getText().toString();
                int num = Integer.parseInt(text);
                if(num > 1) {
                    num = num - 1;
                }
                textView.setText(String.valueOf(num));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
