package com.roopal.leftshift.chatting_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener
{


    ImageView imageView;
    Button button;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo);
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.login_btn);
        button.setOnClickListener(this);


    }


    @Override
    public void onClick(View v)
    {
        if (username.getText().toString().equals("u") && password.getText().toString().equals("p"))
        {
            Toast.makeText(getApplicationContext(), "Login successful....", Toast.LENGTH_LONG).show();
            Intent intent =new Intent(this,Chat.class);
            startActivity(intent);
            finish();
        } else
        {
            Toast.makeText(getApplicationContext(), "invalid username and password", Toast.LENGTH_LONG).show();
        }

    }
}
