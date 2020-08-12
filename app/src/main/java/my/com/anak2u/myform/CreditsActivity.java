package my.com.anak2u.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CreditsActivity extends AppCompatActivity {

    ListView listView;
    //Equivalent to create data source (step 1)
    String [] infos = {"Muzaffar", "Marlon", "Yi Yang", "Nic", "Syahriah", "Firman"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(CreditsActivity.this,
                android.R.layout.simple_list_item_1, infos);

        listView.setAdapter(adapter);
        registerForContextMenu(listView);

        // For context menu, we will link it to a listView
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}
