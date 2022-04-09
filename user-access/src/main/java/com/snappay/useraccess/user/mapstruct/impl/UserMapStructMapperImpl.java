package com.snappay.useraccess.user.mapstruct.impl;

import com.snappay.useraccess.role.dto.RoleResponseDTO;
import com.snappay.useraccess.role.model.Role;
import com.snappay.useraccess.user.dto.UserRequestDTO;
import com.snappay.useraccess.user.dto.UserResponseDTO;
import com.snappay.useraccess.user.model.User;
import com.snappay.useraccess.user.mapstruct.UserMapStructMapper;

import javax.annotation.Generated;
import java.util.HashSet;
import java.util.Set;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2021-03-11T19:21:44+0100",
        comments = "version: 1.4.2.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class UserMapStructMapperImpl implements UserMapStructMapper {

    @Override
    public UserResponseDTO userToUserResponse(User user) {
        if (user == null)
            return null;
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(user.getId());
        userResponseDTO.setFirstName(user.getFirstName());
        userResponseDTO.setLastName(user.getLastName());
        userResponseDTO.setUserName(user.getUserName());
        userResponseDTO.setPassword(user.getPassword());
        userResponseDTO.setEmail(user.getEmail());
        userResponseDTO.setActive(user.getActive());
        userResponseDTO.setRoles(setRoleToSetRoleResponse(user.getRoles()));
        return userResponseDTO;
    }

    @Override
    public User userRequestToUser(UserRequestDTO userRequestDTO) {
        return null;
    }

    @Override
    public RoleResponseDTO roleToRoleResponse(Role role) {
        if (role == null)
            return null;
        RoleResponseDTO roleResponseDTO = new RoleResponseDTO();

        roleResponseDTO.setId(role.getId());
        roleResponseDTO.setRole(role.getRole());
        return roleResponseDTO;
    }

    @Override
    public Role roleResponseToRole(RoleResponseDTO roleResponseDTO) {
        return null;
    }

    protected Set<RoleResponseDTO> setRoleToSetRoleResponse(Set<Role> roles) {
        if (roles == null) {
            return null;
        }

        Set<RoleResponseDTO> setRoleResponseDTO = new HashSet<RoleResponseDTO>();
        for (Role role : roles) {
            setRoleResponseDTO.add(roleToRoleResponse(role));
        }

        return setRoleResponseDTO;
    }
}
