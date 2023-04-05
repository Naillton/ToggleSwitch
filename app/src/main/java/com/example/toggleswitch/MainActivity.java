package com.example.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tButton;
    private TextView text, text2;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tButton = findViewById(R.id.toggleButton);
        choice = findViewById(R.id.switch1);
        text2 = findViewById(R.id.textView2);
        text = findViewById(R.id.textView);
        listenerSwitch();
    }

    // usando o metodo setOnChecked podemos instanciar um CompoundButton
    // usado para olhar para o switch.
    public void listenerSwitch() {
        choice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            String isOn = "";
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                System.out.println(b);
                if (b) {
                    isOn = "Senha Salva";
                } else {
                    isOn = "Nao Salvo";
                }
                text.setText(isOn);
            }
        });
    }
    // metodo usado para mudar o switch assim que flor clicado
    // lembrar de comentar a funcao acima e adcionar o swited no onclick do switch
    /* public void swited(View view) {
        String check = "";
        if (choice.isChecked()) {
            check = "Salvado";
        } else {
            check = "Nao salvo";
        }
        text.setText(check);
    } */
    public void clickToggle(View view) {
        String isOn = tButton.getText().toString();
        String btn = "";
        if (isOn.equals("Ligado")) {
            btn = "Ligado";
        } else {
            btn = "Desligado";
        }
        text2.setText(btn);
    }
}