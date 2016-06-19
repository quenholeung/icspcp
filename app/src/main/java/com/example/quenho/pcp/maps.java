package com.example.quenho.pcp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class maps extends AppCompatActivity {

    public Button mirage;

    public void initmirage(){
        mirage = (Button)findViewById(R.id.mirage);

        mirage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent gomirage = new Intent(maps.this,mirage.class);
            }

        });


    }

    public Button inferno;

    public void initinferno(){
        inferno = (Button)findViewById(R.id.inferno);

        inferno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent goinferno = new Intent(maps.this, inferno.class);

            }


        });


    }

    public Button cache;

    public void initcache(){
        cache = (Button)findViewById(R.id.cache);

        cache.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)  {

                Intent gocache = new Intent(maps.this, cache.class);
            }
        });
    }

    public Button cobblestone;
     public void initcobble(){
         cobblestone = (Button)findViewById(R.id.cobblestone);

         cobblestone.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v)  {

                 Intent gocobble = new Intent(maps.this, cache.class);
             }
         });
     }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initinferno();
        initmirage();
        initcache();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
