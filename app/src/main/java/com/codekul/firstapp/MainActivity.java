package com.codekul.firstapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity /*implements  View.OnClickListener*/{

    public static final String TAG ="MAinActivity";
    private EditText edtUserName, edtPassword;
    private TextView textStatus;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUserName = (EditText) findViewById(R.id.edtUserName);

        edtPassword = (EditText) findViewById(R.id.edtPassword);

        textStatus = (TextView) findViewById(R.id.textStatus);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new Click());

        /*btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });

        btnLogin.setOnClickListener(this);;*/
    }

    /*@Override
    public void onClick(View v) {

    }*/

    private class Click implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            String userName = edtUserName.getText().toString();

            String password = edtPassword.getText().toString();

            if(userName.equals("android") && password.equals("android")){

                textStatus.setText("Login Successful");
                Log.i(TAG,"Login Success");
            }
            else{

                textStatus.setText("Login Failure");
                Log.i(TAG, "Login Failure");
            }
        }
    }
}
