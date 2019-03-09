package com.example.hellotoastnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    public static final String EXTRA_MESSAGE =
            "com.example.android.hellotoastnew.extra.MESSAGE";
    public static final String EXTRA_MESSAGE1 =
            "com.example.android.hellotoastnew.extra.MESSAGE1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }


    public void showToast(View view) {
        /*Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();*/

        Intent intent = new Intent(this,Main2Activity.class);
        String message = mShowCount.getText().toString();
        String message2 = "Hello!";
        intent.putExtra(EXTRA_MESSAGE,message);
        intent.putExtra(EXTRA_MESSAGE1,message2);
        startActivity(intent);



    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
