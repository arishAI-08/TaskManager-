package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class AddTaskActivity extends AppCompatActivity {

    private TextInputEditText etTaskTitle, etTaskDesc;
    private RadioGroup rgCategory;
    private Button btnSaveTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        etTaskTitle = findViewById(R.id.etTaskTitle);
        etTaskDesc = findViewById(R.id.etTaskDesc);
        rgCategory = findViewById(R.id.rgCategory);
        btnSaveTask = findViewById(R.id.btnSaveTask);

        btnSaveTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = etTaskTitle.getText() != null ? etTaskTitle.getText().toString().trim() : "";
                String desc = etTaskDesc.getText() != null ? etTaskDesc.getText().toString().trim() : "";

                if (title.isEmpty()) {
                    Toast.makeText(AddTaskActivity.this, "Please enter task title", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(AddTaskActivity.this, "Task Saved Successfully!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}
