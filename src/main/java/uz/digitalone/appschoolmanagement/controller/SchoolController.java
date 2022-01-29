package uz.digitalone.appschoolmanagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.digitalone.appschoolmanagement.dto.SchoolDto;
import uz.digitalone.appschoolmanagement.entity.School;
import uz.digitalone.appschoolmanagement.service.SchoolService;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/27/2022
 * Time: 8:04 PM
 */
@RestController
public class SchoolController {
    private SchoolService schoolService;
    public SchoolController(SchoolService service){
        this.schoolService = service;
    }
    @PostMapping("/api/add-school")
    public School addSchool(@RequestBody SchoolDto schoolDto){
        return schoolService.save(schoolDto);
    }
}
