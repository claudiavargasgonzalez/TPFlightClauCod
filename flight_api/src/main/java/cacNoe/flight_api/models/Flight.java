package cacNoe.flight_api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Flight {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String origin;
   private String destiny;
   private String dateTimeDeparture;
   private String dateTimeArrival;
   private double price;
   private String frequency;
   @ManyToOne
   @JoinColumn(name="company_id")
   private Company company;


   public Flight(String origin, String destiny, String dateTimeDeparture, String dateTimeArrival, double price, String frequency) {
      this.origin = origin;
      this.destiny = destiny;
      this.dateTimeDeparture = dateTimeDeparture;
      this.dateTimeArrival = dateTimeArrival;
      this.price = price;
      this.frequency = frequency;
   }
}
