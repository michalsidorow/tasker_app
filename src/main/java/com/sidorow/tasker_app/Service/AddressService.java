package com.sidorow.tasker_app.Service;


import com.sidorow.tasker_app.Repository.AddressRepository;
import com.sidorow.tasker_app.Repository.Model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses(){
        return addressRepository.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepository.findById(id).get();
    }

    public Address saveAddressToDB(Address user){
        return addressRepository.save(user);
    }

    public void deleteAddressById(Long id){
        addressRepository.deleteById(id);
    }
}
