package cacNoe.flight_api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDto{
        private Long id;
        private String origin;
        private String destiny;
        private String dateTimeDeparture;
        private String dateTimeArrival;
        private double convertedPrice;
        private String frequency;


}

