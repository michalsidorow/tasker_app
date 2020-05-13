package com.sidorow.tasker_app.Controller;

import com.sidorow.tasker_app.Service.AddressService;
import com.sidorow.tasker_app.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class WelcomeController {

    private final UserService userService;
    private final AddressService addressService;

    public WelcomeController(UserService userService, AddressService addressService) {
        this.userService = userService;
        this.addressService = addressService;
    }

    @GetMapping
    public String welcome(Model model){
        model.addAttribute("message","Welcome in Sptring Boot");
        model.addAttribute("users",userService.getAllUsers());
        model.addAttribute("addressses",addressService.getAllAddresses());
        return "welcome";
    }
}
