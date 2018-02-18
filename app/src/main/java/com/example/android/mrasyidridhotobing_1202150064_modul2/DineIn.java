package com.example.android.mrasyidridhotobing_1202150064_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {
    Spinner table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        setTitle("Dine In");
        table = findViewById(R.id.table);
    }

    public void liatmenu(View view) {
        Toast.makeText(DineIn.this, table.getSelectedItem().toString() + " dipilih", Toast.LENGTH_SHORT).show();
        //Intent intent = new Intent(DineIn.this, ListMenu.class);
        //startActivity(intent);
    }
}
