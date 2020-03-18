package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText editText;
    TextView textView, head, total;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.image);
        final String str[] = {"Butter Chicken","Chicken Karai","Chicken Roll","Fish Roll","Hamburger","Junior Chicken","Egg Roll","King Meal","Mustard curry"
                ,"Veg Thali"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,str);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (str[0].equals(spinner.getItemAtPosition(1).toString())){

                    imageView.setImageResource(R.drawable.butter);
                }
                else if (str[1].equals(spinner.getItemAtPosition(1).toString())){

                    imageView.setImageResource(R.drawable.chickenk);
                }
                else if (str[2].equals(spinner.getItemAtPosition(1).toString())){

                    imageView.setImageResource(R.drawable.chicken_r);

                }else if (str[3].equals(spinner.getItemAtPosition(1).toString())){

                    imageView.setImageResource(R.drawable.fishr);
                }


            }
        });
    }


}
