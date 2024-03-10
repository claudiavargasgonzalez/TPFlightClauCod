package cacNoe.flight_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Flight {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String origen;
   private String destino;
   private String fechaHoraSalida;
   private String fechaHoraLlegada;
   private double precioEnPesos;
   private String frecuencia;


}
