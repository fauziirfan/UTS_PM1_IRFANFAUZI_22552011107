package com.example.uts_pm1_irfanfauzi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Menginisialisasi tombol login dari layout XML
        Button btnLogin = findViewById(R.id.buttonLogin);

        // Menambahkan listener untuk menangani klik tombol login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang akan dilakukan ketika tombol login diklik
                // Misalnya, pindah ke halaman dashboard (NewsPortalDashboard)
                startActivity(new Intent(LoginActivity.this, NewsPortalDashboard.class));
            }
        });

        // Menginisialisasi tombol register dari layout XML
        Button btnRegister = findViewById(R.id.btn_register);

        // Menambahkan listener untuk menangani klik tombol register
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang akan dilakukan ketika tombol register diklik
                // Misalnya, pindah ke halaman registrasi (RegisterActivity)
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}