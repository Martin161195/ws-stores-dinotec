package pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.OffsetDateTime;

@Getter
@Setter
@Builder
public class UserResponseDTO {

    private long userId;
    private String email;
    private OffsetDateTime lastLogin;
    private boolean isSuperuser;
    private boolean isStaff;
    private boolean isActive;
    private boolean isEnterprise;
    private OffsetDateTime dateJoined;
}
