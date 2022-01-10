package pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ListAllUsersResponseDTO {

    private List<UserResponseDTO> data;
}
