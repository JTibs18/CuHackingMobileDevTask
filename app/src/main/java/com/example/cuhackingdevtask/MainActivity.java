package com.example.cuhackingdevtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button incrementButton;
    TextView displayText;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementButton = (Button) findViewById(R.id.button);
        displayText = (TextView) findViewById(R.id.textView);
        displayText.setText(String.valueOf(counter));

        //test
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                displayText.setText(String.valueOf(counter));
            }
        });
    }
}
