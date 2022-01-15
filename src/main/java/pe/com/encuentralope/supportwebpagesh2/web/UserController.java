package pe.com.encuentralope.supportwebpagesh2.web;


import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pe.com.encuentralope.supportwebpagesh2.user.business.UserService;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.CreateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.UpdateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.CreateUserResponseDTO;

import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.UserResponseDTO;

import reactor.core.publisher.Mono;
import java.util.List;



@RestController
@RequestMapping("/api/users/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping(path = "/", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Mono<List<UserResponseDTO>> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Mono<UserResponseDTO> getUserById(@PathVariable("userId") long userId){
        return userService.getUserById(userId);
    }


    @PostMapping(path = "/", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Mono<CreateUserResponseDTO> saveUser(@RequestBody CreateUserRequestDTO createUserRequestDTO){
        return userService.saveUser(createUserRequestDTO);
    }

    @PatchMapping(path ="/{userId}")
    public Mono<UserResponseDTO> updateUser(@PathVariable("userId") long userId, @RequestBody UpdateUserRequestDTO updateUserRequestDTO){
        return userService.updateUser(userId, updateUserRequestDTO);
    }

}
