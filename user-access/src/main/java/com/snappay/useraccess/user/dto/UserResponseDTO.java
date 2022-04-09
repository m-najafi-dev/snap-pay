package com.snappay.useraccess.user.dto;

import com.snappay.useraccess.protocol.ProtocolResponse;
import com.snappay.useraccess.role.dto.RoleResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO implements ProtocolResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private int active;
    private Set<RoleResponseDTO> roles;
}
