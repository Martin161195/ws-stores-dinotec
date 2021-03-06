package pe.com.encuentralope.supportwebpagesh2.user.assembler;

import pe.com.encuentralope.supportwebpagesh2.user.model.domain.User;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.CreateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.UpdateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.CreateUserResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.UserResponseDTO;

import java.time.Instant;
import java.time.OffsetDateTime;

public class UserAssembler {


    public static UserResponseDTO mapUserToDTO(User user){
        return UserResponseDTO.builder()
                .userId(user.getUserId())
                .email(user.getEmail())
                .lastLogin(user.getLastLogin())
                .isSuperuser(user.isSuperuser())
                .isStaff(user.isStaff())
                .isEnterprise(user.isEnterprise())
                .dateJoined(user.getDateJoined())
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
