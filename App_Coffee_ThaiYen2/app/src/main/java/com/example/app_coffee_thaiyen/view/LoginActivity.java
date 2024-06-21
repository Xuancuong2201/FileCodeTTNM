package com.example.app_coffee_thaiyen.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_coffee_thaiyen.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Edt_Account,Edt_Password;
    Button Btn_SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        InitViews();
        Btn_SignIn.setOnClickListener(this);
    }

    private void InitViews() {
        Edt_Account = findViewById(R.id.Edt_Account);
        Edt_Password = findViewById(R.id.Edt_Password);
        Btn_SignIn = findViewById(R.id.Btn_Signin);
    }

    @Override
    public void onClick(View view) {
        if(view == Btn_SignIn){
            SignIn();
        }
    }

    private void SignIn() {
        String Account, Password;
        Account = Edt_Account.getText().toString();
        Password = Edt_Password.getText().toString();
        if (Account.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Tài khoản không được để trống", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (Password.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Mật khẩu không được để trống", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(Account.equals("adminthaiyen") && Password.equals("admin123")){
            Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(getApplicationContext(), "Tài khoản hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
        }
    }
}