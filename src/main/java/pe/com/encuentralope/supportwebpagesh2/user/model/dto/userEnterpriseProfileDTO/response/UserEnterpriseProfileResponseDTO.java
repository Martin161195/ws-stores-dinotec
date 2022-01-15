package pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.response;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserEnterpriseProfileResponseDTO {

    private long uepid;
    private String busineessName;
    private String urlPicture;
    private String urlWeb;
    private long userId;
}
