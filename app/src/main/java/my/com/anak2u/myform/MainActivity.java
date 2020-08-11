package my.com.anak2u.myform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, emailEditText, cellEditText, phoneEditText, messageEditText;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        cellEditText = findViewById(R.id.cellEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        messageEditText = findViewById(R.id.messageEditText);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                MainActivity.this,
                R.array.departments, android.R.layout.simple_dropdown_item_1line);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.about_us:
                // Create a new page, which is called WebActivity
                // When about us is pressed, it will show the new page
                // The new page will only have a WebView inside a LinearLayout
                //After lunch we will continue to show a real web page
                // Notes: I will do the new page during afternoon session
                 Intent intent = new Intent(MainActivity.this, WebActivity.class);
                 startActivity(intent);

                break;
            case R.id.call_us:
                Intent callIntent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:01234567890"));
                startActivity(callIntent);

                break;
            case R.id.email_us:
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"wanmuz86@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "1st day feedback");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Here is my feedback ..");
                emailIntent.setType("text/html");
                startActivity(emailIntent);
                break;
            case R.id.exit:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
