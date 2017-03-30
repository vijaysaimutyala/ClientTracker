package com.studioemvs.clienttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClientServer extends AppCompatActivity implements View.OnClickListener{

    Button client,receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_server);

        client = (Button)findViewById(R.id.client);
        receiver = (Button)findViewById(R.id.receiver);
        client.setOnClickListener(this);
        receiver.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.client:
                Intent clientIntent = new Intent(this,MainActivity.class);
                startActivity(clientIntent);
                break;
            case R.id.receiver:
                Intent receiverIntent = new Intent(this,Receiver.class);
                startActivity(receiverIntent);
                break;
        }
    }
}
