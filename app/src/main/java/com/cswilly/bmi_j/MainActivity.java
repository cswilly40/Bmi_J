package com.cswilly.bmi_j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        result = findViewById(R.id.result);
    }

    public void bmi(View view) {
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        Log.d("MainActivity", "BMI: " + bmi);
        Toast.makeText(this, "Your BMI is " + bmi, Toast.LENGTH_LONG).show();
        result.setText("Your BMI is " + bmi);
    }
}