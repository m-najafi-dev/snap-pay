package com.snappay.useraccess.user.dto;

import com.snappay.useraccess.protocol.ProtocolRequest;
import com.snappay.useraccess.role.dto.RoleRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO implements ProtocolRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private int active;
    private Set<RoleRequestDTO> roles;
}
