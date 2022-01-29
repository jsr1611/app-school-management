package uz.digitalone.appschoolmanagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.digitalone.appschoolmanagement.dto.AddressDto;
import uz.digitalone.appschoolmanagement.entity.Address;
import uz.digitalone.appschoolmanagement.repository.AddressRepository;
import uz.digitalone.appschoolmanagement.service.AddressService;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/27/2022
 * Time: 8:04 PM
 */
@RestController
public class AddressController {
    private AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService=addressService;
    }

    @PostMapping("/api/add-address")
    public Address addAddress(@RequestBody AddressDto address){
        Address savedAddress = addressService.save(address.getName());
        return savedAddress;
    }
}
