package uz.digitalone.appschoolmanagement.service.impl;

import org.springframework.stereotype.Service;
import uz.digitalone.appschoolmanagement.entity.Address;
import uz.digitalone.appschoolmanagement.repository.AddressRepository;
import uz.digitalone.appschoolmanagement.service.AddressService;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    @Override
    public Address save(String addressName) {
        Address newAddress = new Address();
        newAddress.setName(addressName);
        return addressRepository.save(newAddress);
    }

    @Override
    public Address findById(Long addressId) {
        Optional<Address> optionalAddress =addressRepository.findById(addressId);
        Address address = null;
        if(optionalAddress.isPresent()){
            address = optionalAddress.get();
        }
        return address;
    }
}
