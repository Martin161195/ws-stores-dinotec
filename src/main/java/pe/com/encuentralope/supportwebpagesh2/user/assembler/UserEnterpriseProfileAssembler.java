package pe.com.encuentralope.supportwebpagesh2.user.assembler;

import pe.com.encuentralope.supportwebpagesh2.user.model.domain.User;
import pe.com.encuentralope.supportwebpagesh2.user.model.domain.UserEnterpriseProfile;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.CreateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.UpdateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.CreateUserResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.UserResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.response.UserEnterpriseProfileResponseDTO;

import java.time.Instant;
import java.time.OffsetDateTime;

public class UserEnterpriseProfileAssembler {

    public static UserEnterpriseProfileResponseDTO mapUEPModelToDTO(UserEnterpriseProfile uep){
        return UserEnterpriseProfileResponseDTO.builder()
                .uepid(uep.getUepId())
                .busineessName(uep.getBusinessName())
                .urlPicture(uep.getUrlPicture())
                .urlWeb(uep.getUrlWeb())
                .userId(uep.getUserId())
                .build();
    }

    public static CreateUserResponseDTO mapCreateUserToDTO(User user){
        return CreateUserResponseDTO.builder()
                .userId(user.getUserId())
                .email(user.getEmail())
                .isSuperuser(user.isSuperuser())
                .isStaff(user.isStaff())
                .isEnterprise(user.isEnterprise())
                .dateJoined(user.getDateJoined())
                .build();
    }


    public static User mapDTOToUser(CreateUserRequestDTO createUserRequestDTO){
        return User.builder()
                .password(createUserRequestDTO.getPassword())
                .lastLogin(OffsetDateTime.from(Instant.now()))
                .isSuperuser(createUserRequestDTO.isSuperuser())
                .isStaff(createUserRequestDTO.isStaff())
                .isEnterprise(createUserRequestDTO.isEnterprise())
                .dateJoined(OffsetDateTime.from(Instant.now()))
                .dateModified(OffsetDateTime.from(Instant.now()))
                .build();
    }

    public static User mapDTOToUser(long userId, UpdateUserRequestDTO updateUserRequestDTO){
        return User.builder()
                .userId(userId)
                .password(updateUserRequestDTO.getPassword())
                .lastLogin(updateUserRequestDTO.getLastLogin())
                .isSuperuser(updateUserRequestDTO.isSuperuser())
                .isStaff(updateUserRequestDTO.isStaff())
                .isEnterprise(updateUserRequestDTO.isEnterprise())
                .dateModified(OffsetDateTime.from(Instant.now()))
                .build();
    }


}
