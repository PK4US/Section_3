package com.Lesson_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        Intent intent = getIntent();
        String number1 = intent.getStringExtra("NUMBER_1");
        String number2 = intent.getStringExtra("NUMBER_2");
        double result = Double.parseDouble(number1) + Double.parseDouble(number2);
        TextView summa = findViewById(R.id.summa);
        summa.setText(number1 + " + " + number2 + " = " + result);
    }

    public void clickButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
