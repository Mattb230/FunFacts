package com.exmaple.funfacts;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    //declare view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        //Assign views from layout file to the member variables
        mFactTextView = (TextView)findViewById(R.id.factTextView);
        mShowFactButton = (Button)findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.mainActivityRelativeLayout);
        final Random rand = new Random();


        //On Click Listener for showFactButton
        mShowFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFactTextView.setText(mFactBook.getFact());
                int r = rand.nextInt(255);
                int g = rand.nextInt(255);
                int b = rand.nextInt(255);

                int randomColor = Color.rgb(r, g, b);

                mRelativeLayout.setBackgroundColor(randomColor);
                mShowFactButton.setTextColor(randomColor);
            }
        });//end listener


        //Toast.makeText(FunFactsActivity.this, "Cowboys Rule", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "We are logging from the onCreate Method");
    }
}
