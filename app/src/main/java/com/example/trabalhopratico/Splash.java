package com.example.trabalhopratico;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

//import android.preference.PreferenceManager;

public class Splash extends AppCompatActivity {

    private static int SPLASH_SCREEN=5000;
    private static final String FIRST_USED="primeiraVez";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //para aviso
        //Log.i("ciclo de vida", "executando Oncreate()");
        //para debug
        //Log.d("ciclo de vida", "executando Oncreate");
        //para aviso
        //Log.w("ciclo de vida", "executando Oncreate");
        setContentView(R.layout.activity_splash);
        boolean primeiraVez= PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean(FIRST_USED,true);
        if(primeiraVez)
        {
            PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                    .edit().putBoolean(FIRST_USED,false)
                    .commit();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            },SPLASH_SCREEN);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            Toast.makeText(this,"Bem-Vindo ao app Projeto Aplicado!",Toast.LENGTH_SHORT).show();
        }
        else
        {
            ShowMain();
        }




        /*Button btnActivite2 = (Button) findViewById(R.id.btActivity2);

        btnActivite2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela2Activity.class);
                startActivity(it);
            }
        });*/

    }
    private void ShowMain()
    {
        Intent mainItent=new Intent(Splash.this,MainActivity.class);
        startActivity(mainItent);
        finish();
    }
}
