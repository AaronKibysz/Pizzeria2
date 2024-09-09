package entities;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "detalles")
@Builder
public class Pedido {

    private Long id;
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    @Builder.Default
    private HashSet<DetallePedido> detalles = new HashSet<>();

    private Cliente cliente;
}
