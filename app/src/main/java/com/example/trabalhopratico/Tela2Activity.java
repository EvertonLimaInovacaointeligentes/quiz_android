package com.example.trabalhopratico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Bundle bundle=getIntent().getExtras();
        Button btnActivite2 = (Button) findViewById(R.id.button);

        if(bundle.getString("strName")!=null) {
            TextView txtName=findViewById(R.id.textView);
            txtName.setText(bundle.getString("strName"));
            btnActivite2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent it = new Intent(Tela2Activity.this, MainActivity.class);
                    startActivity(it);
                }
            });
        }
    }
}
