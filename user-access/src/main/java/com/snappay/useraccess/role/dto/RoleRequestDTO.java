package com.snappay.useraccess.role.dto;

import com.snappay.useraccess.protocol.ProtocolRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleRequestDTO implements ProtocolRequest {
    private String role;
}

