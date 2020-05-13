package com.sidorow.tasker_app.Controller;

import com.sidorow.tasker_app.Repository.Model.User;
import com.sidorow.tasker_app.Service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.getAllUsers());
        return "users";
    }

    @GetMapping("/{id}")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getUserById(@PathVariable Long id, Model model){
        model.addAttribute("user",userService.getUserById(id));
        return "users";
    }

    @PostMapping
    public String saveUser(Model model, @RequestBody User user){
        userService.createUser(user);
        return "users";
    }

    @DeleteMapping("/id")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String deleteUserById(@RequestParam Long id){
        userService.deleteUserById(id);
        return "users";
    }
}
