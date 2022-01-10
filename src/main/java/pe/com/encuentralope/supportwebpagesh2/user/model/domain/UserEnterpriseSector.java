package pe.com.encuentralope.supportwebpagesh2.user.model.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserEnterpriseSector implements Serializable {
    private static final long serialVersionUID = 4278642197668430959L;

    @Id
    private long uesId;
    private String uesName;
    private String uesDescription;

}
