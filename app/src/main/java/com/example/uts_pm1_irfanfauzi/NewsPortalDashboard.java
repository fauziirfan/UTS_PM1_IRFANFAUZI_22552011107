package com.example.uts_pm1_irfanfauzi;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class NewsPortalDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_portal_dashboard);

        // Dummy data for ListView
        String[] news = {"News 1", "News 2", "News 3", "News 4", "News 5"};

        // Setting up ListView
        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, news);
        listView.setAdapter(adapter);
    }
}
