package com.snappay.useraccess.role.mapstruct.impl;

import com.snappay.useraccess.role.dto.RoleResponseDTO;
import com.snappay.useraccess.role.mapstruct.RoleMapStruct;
import com.snappay.useraccess.role.model.Role;

import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2021-03-11T19:21:44+0100",
        comments = "version: 1.4.2.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class RoleMapStructImpl implements RoleMapStruct {
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

}
