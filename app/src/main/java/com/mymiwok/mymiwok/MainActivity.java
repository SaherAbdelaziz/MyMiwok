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
        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(myIntent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.category_colors);
        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(myIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.category_family);
        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(myIntent);
            }
        });

        TextView pharses = (TextView) findViewById(R.id.category_phrases);
        // Set a click listener on that View
        pharses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(myIntent);
            }
        });


    }

}
