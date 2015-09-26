package com.simpleapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView output_text;
    private EditText input_text;
    private Button count_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output_text = (TextView)findViewById(R.id.output_text);
        input_text = (EditText)findViewById(R.id.input_text);
        count_btn = (Button)findViewById(R.id.count_btn);
        count_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int input_len = input_text.getText().toString().length();
                String out_str = String.format("Input is %d chars long.", input_len);
                output_text.setText(out_str);
            }
        });
    }
}
