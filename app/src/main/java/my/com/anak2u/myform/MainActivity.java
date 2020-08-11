package my.com.anak2u.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, emailEditText, cellEditText, phoneEditText, messageEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        cellEditText = findViewById(R.id.cellEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        messageEditText = findViewById(R.id.messageEditText);
    }

    public void buttonPressed(View view) {

        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String cell = cellEditText.getText().toString();
        String phone = phoneEditText.getText().toString();
        String message = messageEditText.getText().toString();
        String messageToShow = "Hello "+name+" your mail is "+email+" " +
                "cell is "+cell+" phone " +
                "is "+phone+" message is "+message;

        // How long is LENGTH_LONG, How long is LENGTH_SHORT?
        Toast.makeText(MainActivity.this, messageToShow, Toast.LENGTH_LONG).show();
    }

    public void openNewPagePressed(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        // Passing data
        intent.putExtra("name", nameEditText.getText().toString());
        intent.putExtra("email", emailEditText.getText().toString());
        intent.putExtra("cell", cellEditText.getText().toString());
        intent.putExtra("phone",phoneEditText.getText().toString());
        intent.putExtra("message",messageEditText.getText().toString());
        startActivity(intent);
    }
}
