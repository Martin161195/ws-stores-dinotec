package pe.com.encuentralope.supportwebpagesh2.web;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pe.com.encuentralope.supportwebpagesh2.user.business.UserEnterpriseProfileService;
import pe.com.encuentralope.supportwebpagesh2.user.business.UserService;
import pe.com.encuentralope.supportwebpagesh2.user.business.impl.UserEnterpriseProfileServiceImpl;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.CreateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.request.UpdateUserRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.CreateUserResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userDTO.response.UserResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.response.UserEnterpriseProfileResponseDTO;
import reactor.core.publisher.Mono;

import java.util.List;
@CrossOrigin(value = { "http://allowed-origin.com" },
        allowedHeaders = { "Baeldung-Allowed" },
        maxAge = 900
)
@RestController
@RequestMapping("/api/users/uep")
@AllArgsConstructor
public class UserEnterpriseProfileController {

    private final UserEnterpriseProfileService uepService;


    @GetMapping(path = "/", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Mono<List<UserEnterpriseProfileResponseDTO>> getAllUEPs(){
        return uepService.getAllUEP();
    }

    @GetMapping(path = "/{uepId}", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Mono<UserEnterpriseProfileResponseDTO> getUserById(@PathVariable("uepId") long uepId){
        return uepService.getUEPById(uepId);
    }


//    @PostMapping(path = "/", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
//    public Mono<CreateUserResponseDTO> saveUser(@RequestBody CreateUserRequestDTO createUserRequestDTO){
//        return userService.saveUser(createUserRequestDTO);
//    }
//
//    @PatchMapping(path ="/{userId}")
//    public Mono<UserResponseDTO> updateUser(@PathVariable("userId") long userId, @RequestBody UpdateUserRequestDTO updateUserRequestDTO){
//        return userService.updateUser(userId, updateUserRequestDTO);
//    }

}
