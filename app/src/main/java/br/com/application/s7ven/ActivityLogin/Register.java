package br.com.application.s7ven.ActivityLogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;

import br.com.application.s7ven.R;

public class Register extends AppCompatActivity {

    private FirebaseAuth mAuth;

    private EditText edt_email_register;
    private EditText edt_senha_register;
    private EditText edt_confirmar_senha_register;
    private Button btn_login_register;
    private Button btn_registrar_register;
    private ProgressBar loginProgressBar_register;
    private CheckBox ckb_mostrar_senha_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        edt_email_register = findViewById(R.id.edt_email_register);
        edt_senha_register = findViewById(R.id.edt_senha_register);
        edt_confirmar_senha_register = findViewById(R.id.edt_confirmar_senha_register);
        btn_login_register = findViewById(R.id.btn_login_register);
        btn_registrar_register = findViewById(R.id.btn_registrar_register);
        loginProgressBar_register = findViewById(R.id.loginProgressBar_register);
        ckb_mostrar_senha_register = findViewById(R.id.ckb_mostrar_senha_register);

        ckb_mostrar_senha_register.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    edt_senha_register.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    edt_confirmar_senha_register.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    edt_senha_register.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    edt_confirmar_senha_register.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Register.this, Redirect_Login_Register.class);
        startActivity(intent);
        finish();
    }
}