package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText editText = findViewById(R.id.editPrice);
    TextView textView, head, total;
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonOrder);

        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.image);
        final String str[] = {"Butter Chicken", "Chicken Karai", "Chicken Roll", "Fish Roll", "Hamburger", "Junior Chicken", "Egg Roll", "King Meal", "Mustard curry", "Veg Thali"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, str);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (str[0].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.butter);

                } else if (str[1].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.chickenk);
                } else if (str[2].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.chicken_r);

                } else if (str[3].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.fishr);
                } else if (str[4].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.hamburger);
                } else if (str[5].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.juniorc);
                } else if (str[6].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.eggr);
                } else if (str[7].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.kingm);
                } else if (str[8].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.mustard);
                } else if (str[9].equals(spinner.getItemAtPosition(1).toString())) {

                    imageView.setImageResource(R.drawable.vegt);
                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}



