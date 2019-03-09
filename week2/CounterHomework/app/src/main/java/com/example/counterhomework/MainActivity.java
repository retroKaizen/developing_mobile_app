package com.example.counterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView txtView;


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putBoolean("reply_visible", true);
        outState.putString("reply_text",
                txtView.getText().toString());
        outState.putInt("Count", mCount);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        mCount = savedInstanceState.getInt("Count");
        showCount();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = (TextView) findViewById(R.id.textView);
    }

    public void countUp(View view) {
        mCount++;
        showCount();
    }

    private void showCount() {
        if (txtView != null)
            txtView.setText(Integer.toString(mCount));

    }

}
