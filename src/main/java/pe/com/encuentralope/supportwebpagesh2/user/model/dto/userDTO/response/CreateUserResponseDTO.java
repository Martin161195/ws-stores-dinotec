package pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
public class CreateUserResponseDTO implements Serializable {

    private static final long serialVersionUID = 4151403083615946162L;
    private long userId;
    private String email;
    private boolean isSuperuser;
    private boolean isStaff;
    private boolean isActive;
    private boolean isEnterprise;
    private Timestamp dateJoined;
}
