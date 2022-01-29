package uz.digitalone.appschoolmanagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.digitalone.appschoolmanagement.dto.RoleDto;
import uz.digitalone.appschoolmanagement.entity.Role;
import uz.digitalone.appschoolmanagement.service.RoleService;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/27/2022
 * Time: 8:04 PM
 */
@RestController
public class RoleController {
    private RoleService roleService;
    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }

    @PostMapping("/api/add-role")
    public Role addRole(@RequestBody RoleDto roleDto){
        return roleService.save(roleDto);
    }
}
