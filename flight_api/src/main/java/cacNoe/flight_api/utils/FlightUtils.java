package cacNoe.flight_api.utils;

import cacNoe.flight_api.models.Flight;
import cacNoe.flight_api.models.FlightDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlightUtils {
    public List<FlightDto> flightMapper(List<Flight> flights, double dollarPrice){
        List <FlightDto> flightDtos = new ArrayList<>();
        for(Flight flight : flights){
            flightDtos.add(new FlightDto(flight.getId(),flight.getOrigin(),flight.getDestiny(),flight.getDateTimeDeparture(),
                    flight.getDateTimeArrival(),flight.getPrice() * dollarPrice,flight.getFrequency(), flight.getCompany()));
        }
        return flightDtos;
    }
}
