package pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.OffsetDateTime;

@Getter
@Setter
@Builder
public class UpdateUserRequestDTO {

    private String email;
    private OffsetDateTime lastLogin;
    private String password;
    private boolean isSuperuser;
    private boolean isStaff;
    private boolean isEnterprise;
}
