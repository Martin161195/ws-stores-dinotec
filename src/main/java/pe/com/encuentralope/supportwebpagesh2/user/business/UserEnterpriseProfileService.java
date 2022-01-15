package pe.com.encuentralope.supportwebpagesh2.user.business;

import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.request.CreateUserEnterpriseProfileRequesDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.request.UpdateUserEnterpriseProfileRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.response.UserEnterpriseProfileResponseDTO;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserEnterpriseProfileService {

    public Mono<List<UserEnterpriseProfileResponseDTO>> getAllUEP();

    public Mono<UserEnterpriseProfileResponseDTO> getUEPById(Long uepid);

    public Mono<UserEnterpriseProfileResponseDTO> saveUEP(CreateUserEnterpriseProfileRequesDTO createUserEnterpriseProfileRequesDTO);

    public Mono<UserEnterpriseProfileResponseDTO> updateUEP(long uepid, UpdateUserEnterpriseProfileRequestDTO updateUserEnterpriseProfileRequestDTO);
}
