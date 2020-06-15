package com.example.hellotoast;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button button_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button_reset = (Button) findViewById(R.id.button_reset);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;

        if (mCount == 1) button_reset.setBackgroundColor(Color.parseColor("#FF0000"));
        if (mShowCount != null) mShowCount.setText(String.format(Locale.getDefault(), "%d", mCount));
    }

    public void resetCount(View view) {

        if (mCount != 0){
            button_reset.setBackgroundColor(Color.GRAY);
            mShowCount.setText(String.format(Locale.getDefault(), "%d", 0));
            mCount = 0;
        }
    }
}