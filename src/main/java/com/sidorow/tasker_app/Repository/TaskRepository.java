package com.sidorow.tasker_app.Repository;

import com.sidorow.tasker_app.Repository.Model.Task;
import com.sidorow.tasker_app.Repository.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findByUser(User user);
}
