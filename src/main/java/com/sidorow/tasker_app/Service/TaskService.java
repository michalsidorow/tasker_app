package com.sidorow.tasker_app.Service;

import com.sidorow.tasker_app.Repository.Model.Task;
import com.sidorow.tasker_app.Repository.Model.User;
import com.sidorow.tasker_app.Repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(Task task, User user){
        task.setUser(user);
        taskRepository.save(task);
   }

   public List<Task> findUserTask(User user){
        return taskRepository.findByUser(user);
   }
}
