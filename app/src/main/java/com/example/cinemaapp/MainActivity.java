package com.example.cinemaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonDungannon;
    private Button buttonOmagh;
    private Button buttonEnniskillen;
    private Button buttonGallery;
    private Button buttonLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureButton(buttonDungannon, R.id.button_dungannon, ListingsDungannonActivity.class);
        configureButton(buttonOmagh, R.id.button_omagh, ListingsOmaghActivity.class);
        configureButton(buttonEnniskillen, R.id.button_enniskillen, ListingsEnniskillenActivity.class);
        configureButton(buttonGallery, R.id.button_gallery, GalleryActivity.class);
        configureButton(buttonLocation, R.id.button_location, HqMapsActivity.class);
    }

    //CINEMA LISTINGS BUTTON
    private void configureButton(Button button, int viewId, final Class activity) {
        button = (Button) findViewById(viewId);
        button.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        openActivity(activity);
                    }
                }
        );
    }

    private void openActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}


    //LOCATION BUTTON

    //private void configureButtonmap(Button buttonmap , int viewId) {
        //buttonmap = (Button) findViewById(viewId);
        //buttonmap.setOnClickListener(
                //new View.OnClickListener() {

                //    @Override
              //      public void onClick(View v) {
            //            openLocationActivity();
          //          }
        //        }
      //  );
    //}

    //private void openLocationActivity() {
      //  Intent intent = new Intent(this, openLocationActivity.class);
    //    startActivity(intent);
  //  }
//}






