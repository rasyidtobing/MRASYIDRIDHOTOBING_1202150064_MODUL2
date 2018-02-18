package com.example.android.mrasyidridhotobing_1202150064_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {
    RadioGroup ragr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ragr = findViewById(R.id.ragr);
    }

    public void masukmenu(View view) {
        int id = ragr.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        String pilih = rb.getText().toString();
        switch (pilih) {
            case "TAKE AWAY":
                startActivity(new Intent(MainMenu.this, TakeAway.class));
                Toast.makeText(MainMenu.this, "Take Away", Toast.LENGTH_SHORT).show();
                break;
            case "DINE IN":
                startActivity(new Intent(MainMenu.this, DineIn.class));
                Toast.makeText(MainMenu.this, "Dine In", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
