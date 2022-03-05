package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk button
    Button btnlogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama,password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnlogin dengan componen button pada Layout
        btnlogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //Membuat fungsi onclick pada button btnlogin
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //Membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                if (nama.equals("admin@mail.com") && password.equals("123")) {
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                } else if (nama.equals("admin@mail.com") && password.equals(password)) {
                    Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                } else if (nama.equals(nama) && password.equals("123")){
                    Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
};