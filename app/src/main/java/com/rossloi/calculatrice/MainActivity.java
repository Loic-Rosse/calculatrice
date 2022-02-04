package com.rossloi.calculatrice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Déclaration
    private TextView number;

    private double num1=0;
    private double num2=0;
    private double ans = 0;

    private boolean add;
    private boolean minus;
    private boolean product;
    private boolean divide;
    private boolean decimal;

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button addition;
    private Button soustraction;
    private Button multiplication;
    private Button division;
    private Button point;
    private Button egalite;
    private Button supprimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Implémentation des ID
        number = findViewById(R.id.showResults);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        addition = findViewById(R.id.addition);
        soustraction = findViewById(R.id.soustraction);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        point = findViewById(R.id.point);
        egalite = findViewById(R.id.egalite);
        supprimer = findViewById(R.id.supprimer);

        // Ajout de l'écoute des boutons
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        addition.setOnClickListener(this);
        soustraction.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);
        point.setOnClickListener(this);
        egalite.setOnClickListener(this);
        supprimer.setOnClickListener(this);
        egalite.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.supprimer:
                number.setText("");
                break;
            case R.id.b0:
                number.append("0");
                break;
            case R.id.b1:
                number.append("1");
                break;
            case R.id.b2:
                number.append("2");
                break;
            case R.id.b3:
                number.append("3");
                break;
            case R.id.b4:
                number.append("4");
                break;
            case R.id.b5:
                number.append("5");
                break;
            case R.id.b6:
                number.append("6");
                break;
            case R.id.b7:
                number.append("7");
                break;
            case R.id.b8:
                number.append("8");
                break;
            case R.id.b9:
                number.append("9");
                break;
            case R.id.point:
                number.append(".");
                break;
            case R.id.addition:
                number.append("+");
                break;
            case R.id.soustraction:
                number.append("-");
                break;
            case R.id.multiplication:
                number.append("*");
                break;
            case R.id.division:
                number.append("/");
                break;
            case R.id.egalite:
                onClickButtonEqual();
                break;
        }
    }
    public void onClickButtonEqual() {
        if (add == true || minus == true || product == true || divide == true) {
            if (number.getText() != null ) {
                num2 = Float.parseFloat(number.getText() + "");
                number.setText(number.getText() + " " + number.getText());

                if (add == true)
                    ans = num1 + num2;
                add = false;
                if (minus == true)
                    ans = num1 - num2;
                minus = false;
                if (product == true)
                    ans = num1 * num2;
                product = false;
                if (divide == true)
                    ans = num1 / num2;
                divide = false;

                number.setText(ans + "");
                num2 = ans;
                num1 = 0;
            }
        }
    }
}





