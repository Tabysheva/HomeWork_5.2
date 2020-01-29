package com.example.homework_5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
@Override
protected void onCreate( Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
button = findViewById(R.id.OPENcalculator);
}


    public void calculatorBtnFragment(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, new CalculatorFragment());
        transaction.commit();

    }

    public void history_framgent(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, new HistoryFragment());
        transaction.commit();
    }
}
