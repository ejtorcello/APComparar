package com.curso.android.app.practica.proyectofinalargentinaprograma40batallanesfacundo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.curso.android.app.practica.proyectofinalargentinaprograma40batallanesfacundo.R;

public class MainActivity extends AppCompatActivity {
    TextView IdTxtv_1, IdTxtv_2, resultTextView;
    Button IdBtn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IdTxtv_1 = findViewById(R.id.IdTxtv_1);
        IdTxtv_2 = findViewById(R.id.IdTxtv_2);
        IdBtn_1 = findViewById(R.id.IdBtn_1);
        resultTextView = findViewById(R.id.resultTextView);

        IdBtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = IdTxtv_1.getText().toString();
                String text2 = IdTxtv_2.getText().toString();

                if (text1.equals(text2)) {
                    resultTextView.setText("Los textos son iguales.");
                } else {
                    resultTextView.setText("Los textos son diferentes.");
                }
            }
        });
    }
}
