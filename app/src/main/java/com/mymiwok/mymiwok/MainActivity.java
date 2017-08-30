package com.mymiwok.mymiwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.category_numbers);
        NewIntent(numbers);

        TextView colors = (TextView) findViewById(R.id.category_colors);
        NewIntent(colors);

        TextView family = (TextView) findViewById(R.id.category_family);
        NewIntent(family);

        TextView pharses = (TextView) findViewById(R.id.category_phrases);
        NewIntent(pharses);


    }

    void NewIntent(View view){
        // Set a click listener on that View
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(myIntent);
            }
        });
    }
}
