package pe.com.encuentralope.supportwebpagesh2.user.model.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.OffsetDateTime;


@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("users_user")
public class User implements Serializable {
    private static final long serialVersionUID = -242006098347951907L;

    @Id
    @Column(value = "id")
    private long userId;
    @Column(value = "password")
    private String password;
    @Column(value = "last_login")
    private OffsetDateTime lastLogin;
    @Column(value = "is_superuser")
    private boolean isSuperuser;
    @Column(value = "email")
    private String email;
    @Column(value = "is_staff")
    private boolean isStaff;
    @Column(value = "is_active")
    private boolean isActive;
    @Column(value = "is_enterprise")
    private boolean isEnterprise;
    @Column(value = "date_joined")
    private OffsetDateTime dateJoined;
    @Column(value = "modified_at")
    private OffsetDateTime dateModified;

}
