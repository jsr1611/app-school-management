package uz.digitalone.appschoolmanagement.service.impl;

import org.springframework.stereotype.Service;
import uz.digitalone.appschoolmanagement.dto.SchoolDto;
import uz.digitalone.appschoolmanagement.entity.Address;
import uz.digitalone.appschoolmanagement.entity.School;
import uz.digitalone.appschoolmanagement.repository.SchoolRepository;
import uz.digitalone.appschoolmanagement.service.AddressService;
import uz.digitalone.appschoolmanagement.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {
    private SchoolRepository schoolRepository;
    private AddressService addressService;

    public SchoolServiceImpl(SchoolRepository schoolRepository, AddressService addressService){
        this.schoolRepository = schoolRepository;
        this.addressService = addressService;
    }

    @Override
    public School save(SchoolDto schoolDto) {
        System.out.println("dto: " + schoolDto);
        School newSchool = new School();
        newSchool.setName(schoolDto.getName());
        Address address = addressService.findById(schoolDto.getAddressId());
        newSchool.setAddress(address);
        return schoolRepository.save(newSchool);
    }
}
