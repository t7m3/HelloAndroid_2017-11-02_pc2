package com.example.user200.helloandroid_2017_11_02_pc2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view){
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("ボタンがタップされました");
    }

}
