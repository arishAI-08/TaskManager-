package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private CardView cardTaskList, cardAddTask, cardReminders, cardCategories, cardProgress, cardProfile;

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

        cardTaskList = findViewById(R.id.cardTaskList);
        cardAddTask = findViewById(R.id.cardAddTask);
        cardReminders = findViewById(R.id.cardReminders);
        cardCategories = findViewById(R.id.cardCategories);
        cardProgress = findViewById(R.id.cardProgress);
        cardProfile = findViewById(R.id.cardProfile);

        cardTaskList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TaskListActivity.class);
                startActivity(intent);
            }
        });

        cardAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddTaskActivity.class);
                startActivity(intent);
            }
        });

        cardReminders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Reminders: Notifications active for upcoming tasks", Toast.LENGTH_SHORT).show();
            }
        });

        cardCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Categories: Work, Study, Personal", Toast.LENGTH_SHORT).show();
            }
        });

        cardProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProgressActivity.class);
                startActivity(intent);
            }
        });

        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
