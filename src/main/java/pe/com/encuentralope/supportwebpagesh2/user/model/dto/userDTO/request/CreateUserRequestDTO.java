package pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestDTO {

    private String email;
    private String password;
    private boolean isSuperuser;
    private boolean isStaff;
    private boolean isEnterprise;
}
