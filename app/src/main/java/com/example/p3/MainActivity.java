package com.example.p3;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
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
    }

    public void btnSaveClick(View view){
        TextView txtMsg = findViewById(R.id.txtMsg);
        txtMsg.setText("Saved");
    }

    public void btnClearClick(View view){
        EditText edtName = findViewById(R.id.edtName);
        edtName.setText("");
        EditText edtEmail = findViewById(R.id.edtEmail);
        edtEmail.setText("");
        EditText edtPhone = findViewById(R.id.edtPhone);
        edtPhone.setText("");
        TextView txtMsg = findViewById(R.id.txtMsg);
        txtMsg.setText("");
    }
}