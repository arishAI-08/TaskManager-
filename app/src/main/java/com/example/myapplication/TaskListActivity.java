package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class TaskListActivity extends AppCompatActivity {

    private RecyclerView recyclerViewTasks;
    private FloatingActionButton fabAddTask;
    private TaskAdapter taskAdapter;
    private List<TaskModel> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        recyclerViewTasks = findViewById(R.id.recyclerViewTasks);
        fabAddTask = findViewById(R.id.fabAddTask);

        taskList = new ArrayList<>();
        taskList.add(new TaskModel("Mobile App Design", "Complete TaskTrack UI layouts and activities", "Study", true));
        taskList.add(new TaskModel("Database Setup", "Configure SQLite / Room for offline task storage", "Work", false));
        taskList.add(new TaskModel("Review Project Feasibility", "Prepare documentation for SZABIST-ISB MAD presentation", "Study", true));
        taskList.add(new TaskModel("Grocery Shopping", "Milk, Bread, Fruits and Vegetables", "Personal", false));

        recyclerViewTasks.setLayoutManager(new LinearLayoutManager(this));
        taskAdapter = new TaskAdapter(taskList);
        recyclerViewTasks.setAdapter(taskAdapter);

        fabAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaskListActivity.this, AddTaskActivity.class);
                startActivity(intent);
            }
        });
    }
}
