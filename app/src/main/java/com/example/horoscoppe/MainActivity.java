package com.example.horoscoppe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker datePicker = findViewById(R.id.datePicker);
        Button submitButton = findViewById(R.id.buttonSubmit);

        submitButton.setOnClickListener(v -> {
            int day = datePicker.getDayOfMonth();
            int month = datePicker.getMonth() + 1;
            int year = datePicker.getYear();

            String birthdate = year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day);

            Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
            intent.putExtra("birthdate", birthdate);
            startActivity(intent);
        });
    }
}
