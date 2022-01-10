package pe.com.encuentralope.supportwebpagesh2.user.model.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.sql.Timestamp;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -242006098347951907L;

    @Id
    private long userId;

    private String password;

    private Timestamp lastLogin;

    private boolean isSuperuser;

    private String email;

    private boolean isStaff;

    private boolean isActive;

    private boolean isEnterprise;

    private Timestamp dateJoined;

    private Timestamp dateModified;

}
