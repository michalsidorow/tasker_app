package com.sidorow.tasker_app.Service;


import com.sidorow.tasker_app.Repository.Model.Role;
import com.sidorow.tasker_app.Repository.Model.User;
import com.sidorow.tasker_app.Repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user){
        user.setPassword(encodePassword(user.getPassword()));
        Role userRole = new Role("USER");
        List<Role> roles = new ArrayList<>();
        roles.add(userRole);
        user.setRoles(roles);
        userRepository.save(user);
    }

    public void createAdmin(User user){
        user.setPassword(encodePassword(user.getPassword()));
        Role userRole = new Role("ADMIN");
        List<Role> roles = new ArrayList<>();
        roles.add(userRole);
        user.setRoles(roles);
        userRepository.save(user);
    }

    public User getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }


    private String encodePassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    public boolean isUserPresent(String email) {
        if(userRepository.findById(email).isPresent()){
            return true;
        }
        return false;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> getUsersByFirstName(String firstName) {
        return userRepository.findByFirstNameLike("%"+firstName+"%");
    }

    public Object getUserById(Long id) {
        return null;
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(String.valueOf(id));
    }
}
