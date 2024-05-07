package com.example.uts_pm1_irfanfauzi;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";
    private EditText editTextName, editTextEmail, editTextPassword;
    private Button buttonRegister;
    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize Views
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);

        // Set onClickListener for buttonRegister
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simulate register process
                Log.d(TAG, "Register button clicked");
                Toast.makeText(RegisterActivity.this, "Register button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
