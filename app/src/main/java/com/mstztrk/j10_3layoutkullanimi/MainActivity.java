package com.mstztrk.j10_3layoutkullanimi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String icerik = "123";
        if (icerik.matches("^(?=.*\\d).{4,8}$")) {
            Toast.makeText(this, "Şifre uygundur girebilirsin", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Şifre uygun değil", Toast.LENGTH_SHORT).show();
            
        }
    }
}
