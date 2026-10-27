package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private final List<TaskModel> taskList;

    public TaskAdapter(List<TaskModel> taskList) {
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        TaskModel task = taskList.get(position);
        holder.tvTaskTitle.setText(task.getTitle());
        holder.tvTaskDesc.setText(task.getDescription());
        holder.tvTaskCategory.setText(task.getCategory());
        holder.cbTaskCompleted.setChecked(task.isCompleted());

        holder.cbTaskCompleted.setOnCheckedChangeListener((buttonView, isChecked) -> task.setCompleted(isChecked));

        holder.btnEditTask.setOnClickListener(v -> Toast.makeText(v.getContext(), "Edit Task: " + task.getTitle(), Toast.LENGTH_SHORT).show());

        holder.btnDeleteTask.setOnClickListener(v -> {
            int pos = holder.getAbsoluteAdapterPosition();
            if (pos != RecyclerView.NO_POSITION) {
                taskList.remove(pos);
                notifyItemRemoved(pos);
                Toast.makeText(v.getContext(), "Task Deleted", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        TextView tvTaskTitle, tvTaskDesc, tvTaskCategory;
        CheckBox cbTaskCompleted;
        Button btnEditTask, btnDeleteTask;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTaskTitle = itemView.findViewById(R.id.tvTaskTitle);
            tvTaskDesc = itemView.findViewById(R.id.tvTaskDesc);
            tvTaskCategory = itemView.findViewById(R.id.tvTaskCategory);
            cbTaskCompleted = itemView.findViewById(R.id.cbTaskCompleted);
            btnEditTask = itemView.findViewById(R.id.btnEditTask);
            btnDeleteTask = itemView.findViewById(R.id.btnDeleteTask);
        }
    }
}
