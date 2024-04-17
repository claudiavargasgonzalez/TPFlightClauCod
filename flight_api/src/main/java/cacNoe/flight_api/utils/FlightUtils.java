package cacNoe.flight_api.utils;

import cacNoe.flight_api.models.Flight;
import cacNoe.flight_api.models.FlightDto;
import org.springframework.stereotype.Component;

@Component
public class FlightUtils {
    public FlightDto flightMapper(Flight flight, double price){
        return new FlightDto(flight.getId(),flight.getOrigin(),flight.getDestiny(),
                flight.getDateTimeDeparture(),flight.getDateTimeArrival(),
                flight.getPrice() * price,flight.getFrequency());
    }
}
