package edu.cs4730.wearapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    private TextView mTextView;
    Random myRandom = new Random();
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //the system decides which layout to use, round or notround
        //setup the watch views and set the listener for the button.
        mTextView = (TextView) findViewById(R.id.text);
        mTextView.setText("   " + myRandom.nextInt(10) + " ");
        //get the imagebutton (checkmark) and set up the listener for a random number.
        ib = (ImageButton) findViewById(R.id.myButton);
        ib.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mTextView.setText("   " + myRandom.nextInt(10) + " ");

            }


        });
    }
}
