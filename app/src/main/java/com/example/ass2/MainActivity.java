package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText editText;
    TextView textView, head, total,tip,Quan;
    ImageView imageView;
    Button button;
    SeekBar seekBar;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editPrice);
        textView = findViewById(R.id.textBanner);
        head = findViewById(R.id.textPO);
        total = findViewById(R.id.textTot);
        tip = findViewById(R.id.textTip);
        Quan = findViewById(R.id.textQua);
        seekBar = findViewById(R.id.seekBar);
        button = findViewById(R.id.buttonOrder);
        radioGroup = findViewById(R.id.RadioTips);

        int butterChick, KaraiChick, Hamburger, KingMeal, ChickRoll, EggRoll, Thali, MustardCurry, FishRoll, JuniorChick;

        seekBar.setMax(10);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Quantity is " + progress , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button = findViewById(R.id.buttonOrder);

        spinner = findViewById(R.id.spinner);

        imageView = findViewById(R.id.image);

        final String str[] = {"Butter Chicken", "Chicken Karai", "Chicken Roll", "Fish Roll", "Hamburger", "Junior Chicken", "Egg Roll", "King Meal", "Mustard curry", "Veg Thali"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, str);
        spinner.setAdapter(arrayAdapter);

       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if (str[0].equals(spinner.getItemAtPosition(position).toString())) {

                    editText.setText("$20");
                   imageView.setImageResource(R.drawable.butter);

               } else if (str[1].equals(spinner.getItemAtPosition(position).toString())) {

                   editText.setText("$25");
                   imageView.setImageResource(R.drawable.chickenk);

               } else if (str[2].equals(spinner.getItemAtPosition(position).toString())) {

                   editText.setText("$30");
                   imageView.setImageResource(R.drawable.chicken_r);

               } else if (str[3].equals(spinner.getItemAtPosition(position).toString())) {

                   editText.setText("$35");
                   imageView.setImageResource(R.drawable.fishr);

               } else if (str[4].equals(spinner.getItemAtPosition(position).toString())) {

                   editText.setText("$35");
                   imageView.setImageResource(R.drawable.hamburger);

               } else if (str[5].equals(spinner.getItemAtPosition(position).toString())) {

                   editText.setText("$40");
                   imageView.setImageResource(R.drawable.juniorc);

               } else if (str[6].equals(spinner.getItemAtPosition(position).toString())) {

                   editText.setText("$45");
                   imageView.setImageResource(R.drawable.eggr);

               } else if (str[7].equals(spinner.getItemAtPosition(position).toString())) {

                   editText.setText("$50");
                   imageView.setImageResource(R.drawable.kingm);

               } else if (str[8].equals(spinner.getItemAtPosition(position).toString())) {

                   editText.setText("$55");
                   imageView.setImageResource(R.drawable.mustard);

               } else if (str[9].equals(spinner.getItemAtPosition(position).toString())) {

                   editText.setText("$60");
                   imageView.setImageResource(R.drawable.vegt);
               }

           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });
    }

    public void button (View view) {





    }




}



