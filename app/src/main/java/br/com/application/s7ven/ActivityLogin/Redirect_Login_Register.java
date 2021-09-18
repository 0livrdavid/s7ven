package br.com.application.s7ven.ActivityLogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.application.s7ven.MainActivity;
import br.com.application.s7ven.R;

public class Redirect_Login_Register extends AppCompatActivity {

    private Button btn_redict_login;
    private Button btn_redict_regist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirect_login_register);

        btn_redict_login = findViewById(R.id.btn_redict_login);
        btn_redict_regist = findViewById(R.id.btn_redict_regist);

        btn_redict_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Redirect_Login_Register.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

        btn_redict_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Redirect_Login_Register.this, Register.class);
                startActivity(intent);
                finish();
            }
        });
    }
}