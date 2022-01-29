package uz.digitalone.appschoolmanagement.service;

import org.springframework.stereotype.Service;
import uz.digitalone.appschoolmanagement.dto.SchoolDto;
import uz.digitalone.appschoolmanagement.entity.School;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/27/2022
 * Time: 8:09 PM
 */
@Service
public interface SchoolService {
    School save(SchoolDto schoolDto);
}
