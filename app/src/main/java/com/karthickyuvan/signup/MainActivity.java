package com.karthickyuvan.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname, upwd;
    Button login;
    String username, password;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        uname = findViewById(R.id.eusername);
        upwd = findViewById(R.id.epwdtext);
        login = findViewById(R.id.login);
        error = findViewById(R.id.txtUname);
        error.setVisibility(View.INVISIBLE);

        // username = uname.getText().toString().equals("Admin");
        // password = upwd.getText().toString();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if (username.matches("") && password.matches(""))
                if (uname.equals("") && upwd.equals("")) {
                    Toast.makeText(MainActivity.this, "Enter User name & password", Toast.LENGTH_SHORT).show();
                } else if (uname.getText().toString().equals("Admin") && upwd.getText().toString().equals("password")) {
                    error.setVisibility(View.VISIBLE);
                    error.setText(" Welcome ");


                } else {
                    Toast.makeText(MainActivity.this, "Please Enter Valid Details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}