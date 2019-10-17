package com.example.toolmybar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1 - Configuring Toolbar
        this.configureToolbar();
        this.configureImageView();
    }


//-------------------------------------_____________________________________________________________

    private ImageView imageViewOC;


    private void configureImageView(){
        // Serialise ImageView
        this.imageViewOC =(ImageView) findViewById(R.id.imageView) ;
        // Set OnClick Listener on it
        this.imageViewOC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDetailActivity();
            }
        });
    }
    private void launchDetailActivity(){
        Intent myIntent = new Intent( MainActivity.this,DetailActivity.class) ;
        this.startActivity(myIntent);
    }

//-------------------------------------_____________________________________________________________


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //3 - Handle actions on menu items
        switch (item.getItemId()) {
            case R.id.menu_activity_main_params:
                Toast.makeText(this, "Il n'y a rien à paramétrer ici, passez votre chemin...", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_activity_main_search:
                Toast.makeText(this, "Recherche indisponible, demandez plutôt l'avis de Google, c'est mieux et plus rapide.", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //2 - Inflate the menu and add it to the Toolbar
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }



    private void configureToolbar(){

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar
        setSupportActionBar(toolbar);
    }
}


//-------------------------------------_____________________________________________________________