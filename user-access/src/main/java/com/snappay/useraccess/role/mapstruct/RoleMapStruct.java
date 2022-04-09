package com.snappay.useraccess.role.mapstruct;

import com.snappay.useraccess.role.dto.RoleResponseDTO;
import com.snappay.useraccess.role.model.Role;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapStruct {
    RoleResponseDTO roleToRoleResponse(Role role);

    Role roleResponseToRole(RoleResponseDTO roleResponseDTO);
}
