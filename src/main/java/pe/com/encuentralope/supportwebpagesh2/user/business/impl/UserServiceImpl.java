package pe.com.encuentralope.supportwebpagesh2.user.business.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.encuentralope.supportwebpagesh2.user.assembler.UserAssembler;
import pe.com.encuentralope.supportwebpagesh2.user.business.UserService;
import pe.com.encuentralope.supportwebpagesh2.user.model.domain.User;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.CreateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.UpdateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.CreateUserResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.UserResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.repository.UserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Flux<UserResponseDTO> getAllUsers() {
        Flux<User> user =  userRepository.findAll();
        return user.map(UserAssembler::mapUserToDTO);

    }

    @Override
    public Mono<UserResponseDTO> getUserById(Long userId) {
        Mono<User> user = userRepository.findById(userId);
        return user.map(UserAssembler::mapUserToDTO);
    }

    @Override
    public Mono<CreateUserResponseDTO> saveUser(CreateUserRequestDTO createUserRequestDTO) {
        User userToSave = UserAssembler.mapDTOToUser(createUserRequestDTO);
        Mono<User> user = userRepository.save(userToSave);
        return user.map(UserAssembler::mapCreateUserToDTO);
    }

    @Override
    public Mono<UserResponseDTO> updateUser(long userId, UpdateUserRequestDTO updateUserRequestDTO) {
        Mono<User> user = findUserById(userId);
        return user
                .map(u-> UserAssembler.mapDTOToUser(u.getUserId(), updateUserRequestDTO))
                .flatMap(userRepository::save)
                .map(UserAssembler::mapUserToDTO);


    }

    private Mono<User> findUserById(long userId){
        return userRepository.findById(userId)
                .switchIfEmpty(Mono.error(new RuntimeException("no se encontró usuario para este Id: "+userId)));

    }
}
