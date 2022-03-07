package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    String nama, password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnlogin dengan componen button pada Layout
        btnlogin = findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword = findViewById(R.id.edPassword);

        //Membuat fungsi onclick pada button btnlogin
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //Mengeset email yang benar
                String email = "admin@mail.com";

                //Mengeset password yang benar
                String pwd = "123";
                //mengecek apakah isi dari email dan password sudah sama dengan email dan password yang sudah di set
                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password wajib diisi!!!", Toast.LENGTH_LONG);
                    t.show();
                } else {
                    if (nama.equals(email) && password.equals(pwd)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses",
                                Toast.LENGTH_LONG);
                        //menampilkan toast
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());
                        b.putString("b", password.trim());
                        Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                        //memasukkan bundle kedalam intent untuk dikiirmkan ke ActivityHasil
                        i.putExtras(b);

                        //berpindah ke ActivityHasil
                        startActivity(i);
                    } else {
                        //membuat variabel toast dan membuat toast dan menampilkan pesan "Login gagal"
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login gagal", Toast.LENGTH_LONG);
                        //menampilkan toast
                        t.show();
                    }
                }
            }
        });
    }
}