package cacNoe.flight_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
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


   public Flight(String origin, String destiny, String dateTimeDeparture, String dateTimeArrival, double price, String frequency) {
      this.origin = origin;
      this.destiny = destiny;
      this.dateTimeDeparture = dateTimeDeparture;
      this.dateTimeArrival = dateTimeArrival;
      this.price = price;
      this.frequency = frequency;
   }
}
