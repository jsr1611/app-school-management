package uz.digitalone.appschoolmanagement.service.impl;

import org.springframework.stereotype.Service;
import uz.digitalone.appschoolmanagement.dto.RoleDto;
import uz.digitalone.appschoolmanagement.entity.Role;
import uz.digitalone.appschoolmanagement.repository.RoleRepository;
import uz.digitalone.appschoolmanagement.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;
    public RoleServiceImpl(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    @Override
    public Role save(RoleDto roleDto) {
        Role newRole = new Role();
        newRole.setName(roleDto.getName());
        newRole.setDescription(roleDto.getDescription());
        return roleRepository.save(newRole);
    }
}
