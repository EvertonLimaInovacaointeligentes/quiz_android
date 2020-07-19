package com.example.trabalhopratico;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BateryLowBroadcast extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Atenção! Bateria Fraca.",Toast.LENGTH_SHORT).show();
    }
}
