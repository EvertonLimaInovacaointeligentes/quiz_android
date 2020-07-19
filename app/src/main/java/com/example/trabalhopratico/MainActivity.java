package com.example.trabalhopratico;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import model.PersonalModel;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private PersonalModel persons = new PersonalModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //para aviso
        Log.i("ciclo de vida", "executando Oncreate()");
        //para debug
        //Log.d("ciclo de vida", "executando Oncreate");
        //para aviso
        //Log.w("ciclo de vida", "executando Oncreate");
        setContentView(R.layout.activity_main);

       /* TextView txtName = findViewById(R.id.txtNome);
        txtName.setText(persons.personPrincipal);
        Button btnActivite2 = (Button) findViewById(R.id.btActivity2);

        btnActivite2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela2Activity.class);
                it.putExtra("strName", persons.personPrincipal);
                startActivity(it);
            }
        });*/

        TextView txtName = findViewById(R.id.txtNome);
        txtName.setText(persons.personPrincipal);
        Button openView = (Button) findViewById(R.id.btActivity2);
        openView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela2Activity.class);
                it.putExtra("strName", persons.personPrincipal);
                startActivity(it);
            }
        });

    }
    private void onClickBtnEnviar(View view)
    {

    }

    @Override
    protected void onStart() {
        Log.i("ciclo de vida", "executando OnStart()");
        super.onStart();
    }



    @Override
    protected void onRestart() {
        Log.i("ciclo de vida", "executando OnRestart()");
        super.onRestart();
    }
    @Override
    protected void onResume() {
        Log.i("ciclo de vida", "executando OnResume()");
        super.onResume();




    }

    @Override
    protected void onPause() {
        Log.i("ciclo de vida", "executando OnPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("ciclo de vida", "executando OnStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("ciclo de vida", "executando onDestroy()");
        super.onDestroy();
    }
}
