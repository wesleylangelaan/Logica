package com.example.logica;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout a1, a2, a3, a4;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);

        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });
    }

    private void check() {
        String sA1 = a1.getEditText().getText().toString();
        String sA2 = a2.getEditText().getText().toString();
        String sA3 = a3.getEditText().getText().toString();
        String sA4 = a4.getEditText().getText().toString();

        if( sA1.equals("T") && sA2.equals("F") && sA3.equals("F") && sA4.equals("F")) {
            correct();
        }
        else {
            notCorrect();
        }
    }

    private void correct() {
        Toast.makeText(this, "Great Success!", Toast.LENGTH_SHORT).show();
    }

    private void notCorrect() {
        Toast.makeText(this, "You're doing it wrong!" , Toast.LENGTH_SHORT).show();
    }
}
