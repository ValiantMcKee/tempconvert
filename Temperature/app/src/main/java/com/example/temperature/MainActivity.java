package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText fahBox;

    private EditText celBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fahBox = findViewById(R.id.fahBox);
        celBox = findViewById(R.id.celBox);
    }
    public void convert(View v){
        String input = fahBox.getText().toString();

        double fahValue = Double.parseDouble(input);

        double getValue = (fahValue - 32)* 5.0/9.0;

        celBox.setText(getValue+"");
    }
}
