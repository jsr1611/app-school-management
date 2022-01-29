package uz.digitalone.appschoolmanagement.service;

import org.springframework.stereotype.Service;
import uz.digitalone.appschoolmanagement.dto.RoleDto;
import uz.digitalone.appschoolmanagement.entity.Role;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/27/2022
 * Time: 8:09 PM
 */
@Service
public interface RoleService {
    Role save(RoleDto roleDto);
}
