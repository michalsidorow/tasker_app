package com.sidorow.tasker_app.Repository;

import com.sidorow.tasker_app.Repository.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,String> {
    List<User> findByFirstNameLike(String firstName);

    User findByEmail(String email);
}
