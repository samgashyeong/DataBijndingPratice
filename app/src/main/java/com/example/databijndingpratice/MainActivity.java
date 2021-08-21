package com.example.databijndingpratice;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{


    EditText firstEdit;
    EditText secondEdit;
    TextView sumText;
    Button addBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEdit = findViewById(R.id.firstNumEdit);
        secondEdit = findViewById(R.id.secondNumEdit);
        sumText = findViewById(R.id.sumText);
        addBtn = findViewById(R.id.addBtn);

        addBtn.setOnClickListener(v->{
            int num1 = Integer.parseInt(firstEdit.getText().toString());
            int num2 = Integer.parseInt(secondEdit.getText().toString());
            sumText.setText(new StringBuilder().append(num1 + num2).append("").toString());
        });
    }


}