package pe.com.encuentralope.supportwebpagesh2.user.model.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


import java.io.Serializable;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("users_enterpriseprofile")
public class UserEnterpriseProfile implements Serializable {
    private static final long serialVersionUID = -5667230924334804854L;

    @Id
    @Column(value = "id")
    private long uepId;
    @Column(value = "business_name")
    private String businessName;
    @Column(value = "ruc")
    private String ruc;
    @Column(value = "photo")
    private String urlPicture;
    @Column(value = "phone_number")
    private String phoneNumber;
    @Column(value = "website")
    private String urlWeb;
    @Column(value = "sector_id")
    private long sectorId;
    @Column(value = "user_id")
    private long userId;


}
