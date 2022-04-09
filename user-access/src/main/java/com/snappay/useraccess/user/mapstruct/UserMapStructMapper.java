package com.snappay.useraccess.user.mapstruct;

import com.snappay.useraccess.role.dto.RoleResponseDTO;
import com.snappay.useraccess.role.model.Role;
import com.snappay.useraccess.user.dto.UserRequestDTO;
import com.snappay.useraccess.user.dto.UserResponseDTO;
import com.snappay.useraccess.user.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapStructMapper {
    UserResponseDTO userToUserResponse(User user);

    User userRequestToUser(UserRequestDTO userRequestDTO);

    RoleResponseDTO roleToRoleResponse(Role role);

    Role roleResponseToRole(RoleResponseDTO roleResponseDTO);
}
