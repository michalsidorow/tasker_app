package com.sidorow.tasker_app.Controller;


import com.sidorow.tasker_app.Repository.Model.Address;
import com.sidorow.tasker_app.Service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }


    @GetMapping
    public String getAllUsers(Model model){
        model.addAttribute("addressses",addressService.getAllAddresses());
        return "address";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id, Model model){
        model.addAttribute("address",addressService.getAddressById(id));
        return "address";
    }

    @PostMapping
    public String saveUser(Model model, @RequestBody Address address){
        addressService.saveAddressToDB(address);
        return "address";
    }

    @DeleteMapping("/id")
    public String deleteUserById(@RequestParam Long id){
        addressService.deleteAddressById(id);
        return "address";
    }
}
