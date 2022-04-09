package com.snappay.useraccess.role.dto;

import com.snappay.useraccess.protocol.ProtocolResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleResponseDTO implements ProtocolResponse {
    private Long id;
    private String role;
}
