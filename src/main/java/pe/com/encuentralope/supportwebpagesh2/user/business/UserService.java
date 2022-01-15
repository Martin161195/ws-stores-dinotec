package pe.com.encuentralope.supportwebpagesh2.user.business;

import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.CreateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.UpdateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.CreateUserResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.ListAllUsersResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.UpdateUserResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.UserResponseDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserService {

    public Mono<List<UserResponseDTO>> getAllUsers();

    public Mono<UserResponseDTO> getUserById(Long userId);

    public Mono<CreateUserResponseDTO> saveUser(CreateUserRequestDTO createUserRequestDTO);

    public Mono<UserResponseDTO> updateUser(long userId, UpdateUserRequestDTO updateUserRequestDTO);
}
