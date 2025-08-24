package com.todo.todoapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Fetch all tasks from the database
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Save a new task to the database
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    // Delete a task by its ID
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    // Update an existing task
    public Task updateTask(Long id, Task updatedTask) {
        Task existingTask = taskRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Task not found"));

        existingTask.setTitle(updatedTask.getTitle()); // update title
        existingTask.setCompleted(updatedTask.isCompleted()); // update completed status

        return taskRepository.save(existingTask);
    }
}