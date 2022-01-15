package pe.com.encuentralope.supportwebpagesh2.user.business.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.encuentralope.supportwebpagesh2.user.assembler.UserEnterpriseProfileAssembler;
import pe.com.encuentralope.supportwebpagesh2.user.business.UserEnterpriseProfileService;
import pe.com.encuentralope.supportwebpagesh2.user.model.domain.UserEnterpriseProfile;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.request.CreateUserEnterpriseProfileRequesDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.request.UpdateUserEnterpriseProfileRequestDTO;
import pe.com.encuentralope.supportwebpagesh2.user.model.dto.userEnterpriseProfileDTO.response.UserEnterpriseProfileResponseDTO;
import pe.com.encuentralope.supportwebpagesh2.user.repository.UserEnterpriseProfileRepository;
import pe.com.encuentralope.supportwebpagesh2.user.repository.UserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@Service
@AllArgsConstructor
public class UserEnterpriseProfileServiceImpl implements UserEnterpriseProfileService {
    private final UserEnterpriseProfileRepository uepRepository;

    @Override
    public Mono<List<UserEnterpriseProfileResponseDTO>> getAllUEP() {
        Flux<UserEnterpriseProfile> uepFlux = uepRepository.findAll();

        return uepFlux.map(UserEnterpriseProfileAssembler::mapUEPModelToDTO)
                .collectList();
    }

    @Override
    public Mono<UserEnterpriseProfileResponseDTO> getUEPById(Long uepid) {
        Mono<UserEnterpriseProfile> uepMono = uepRepository.findById(uepid);
        return uepMono.map(UserEnterpriseProfileAssembler::mapUEPModelToDTO);
    }

    @Override
    public Mono<UserEnterpriseProfileResponseDTO> saveUEP(CreateUserEnterpriseProfileRequesDTO createUserEnterpriseProfileRequesDTO) {
        return null;
    }

    @Override
    public Mono<UserEnterpriseProfileResponseDTO> updateUEP(long uepid, UpdateUserEnterpriseProfileRequestDTO updateUserEnterpriseProfileRequestDTO) {
        return null;
    }
}
