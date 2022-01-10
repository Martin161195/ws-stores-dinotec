package pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserEnterpriseProfileRequesDTO {

    private long userId;
    private String busineessName;
    private String ruc;
    private String urlPicture;
    private String phoneNumber;
    private String urlWeb;
    private long sectorId;


}
