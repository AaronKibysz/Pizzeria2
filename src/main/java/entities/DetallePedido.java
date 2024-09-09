package entities;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "articulo")
@Builder
public class DetallePedido {

    private Long id;
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;


}
