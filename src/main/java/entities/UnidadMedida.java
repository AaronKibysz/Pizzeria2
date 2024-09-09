package entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Builder

public class UnidadMedida {

    private Long id;
    private String denominacion;
}
