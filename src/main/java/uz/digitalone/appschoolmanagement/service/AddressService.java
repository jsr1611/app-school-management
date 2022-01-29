package uz.digitalone.appschoolmanagement.service;

import org.springframework.stereotype.Service;
import uz.digitalone.appschoolmanagement.entity.Address;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/27/2022
 * Time: 8:09 PM
 */
@Service
public interface AddressService {
    Address save(String address);

    Address findById(Long addressId);
}
