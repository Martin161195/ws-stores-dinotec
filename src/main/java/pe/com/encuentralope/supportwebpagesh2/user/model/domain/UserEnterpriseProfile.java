package pe.com.encuentralope.supportwebpagesh2.user.model.domain;

import lombok.*;
import org.springframework.data.annotation.Id;


import java.io.Serializable;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEnterpriseProfile implements Serializable {
    private static final long serialVersionUID = -5667230924334804854L;

    @Id

    private long uepId;

    private String businessName;

    private String ruc;

    private String urlPicture;

    private String phoneNumber;

    private String urlWeb;

    private long sectorId;

    private long userId;


}
