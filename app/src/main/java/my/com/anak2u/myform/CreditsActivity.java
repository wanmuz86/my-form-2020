package my.com.anak2u.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CreditsActivity extends AppCompatActivity {

    ListView listView;
    //Equivalent to create data source (step 1)
    String[] infos = {"Muzaffar","Amin","John","Jeniffer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(CreditsActivity.this,
                android.R.layout.simple_list_item_1, infos);
        listView.setAdapter(adapter);
    }
}
