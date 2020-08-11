package my.com.anak2u.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView nameTextView, emailTextView, phoneTextView, cellTextView, messageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        cellTextView = findViewById(R.id.cellTextView);
        messageTextView = findViewById(R.id.messageTextView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        String cell = intent.getStringExtra("cell");
        String message = intent.getStringExtra("message");

        nameTextView.setText(name);
        emailTextView.setText(email);
        phoneTextView.setText(phone);
        cellTextView.setText(cell);
        messageTextView.setText(message);

    }
}
