package com.example.firstform;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etFullName = findViewById(R.id.etFullName);
        EditText etCountry = findViewById(R.id.etCountry);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPhone = findViewById(R.id.etPhone);
        EditText etPassword = findViewById(R.id.etPassword);
        RadioGroup rgGender = findViewById(R.id.rgGender);
        CheckBox cbTerms = findViewById(R.id.cbTerms);
        Button btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(v -> {
            String username = etUsername.getText().toString();
            String fullName = etFullName.getText().toString();
            String country = etCountry.getText().toString();
            String email = etEmail.getText().toString();
            String phone = etPhone.getText().toString();
            String password = etPassword.getText().toString();

            String gender = "Not selected";
            int selectedId = rgGender.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton selected = findViewById(selectedId);
                gender = selected.getText().toString();
            }

            String terms = cbTerms.isChecked() ? "Yes" : "No";

            String message = "Username: " + username + "\n"
                    + "Full name: " + fullName + "\n"
                    + "Country: " + country + "\n"
                    + "Email: " + email + "\n"
                    + "Phone: " + phone + "\n"
                    + "Password: " + password + "\n"
                    + "Gender: " + gender + "\n"
                    + "Terms Accepted: " + terms;

            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Registration Details")
                    .setMessage(message)
                    .setPositiveButton("OK", null)
                    .show();
        });
    }
}