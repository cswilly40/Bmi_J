package com.cswilly.bmi_j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cswilly.bmi_j.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //    private EditText edWeight;
//    private EditText edHeight;
//    private TextView result;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        findViews();
    }

    /*private void findViews() {
        edWeight = findViewById(R.id.weight);
        edHeight = findViewById(R.id.height);
        result = findViewById(R.id.result);
    }*/

    public void bmi(View view) {
        float weight = Float.parseFloat(binding.weight.getText().toString());
        float height = Float.parseFloat(binding.height.getText().toString());
        float bmi = weight / (height * height);
        Log.d("MainActivity", "BMI: " + bmi);
        Toast.makeText(this, "Your BMI is " + bmi, Toast.LENGTH_LONG).show();
        binding.result.setText("Your BMI is " + bmi);
    }
}