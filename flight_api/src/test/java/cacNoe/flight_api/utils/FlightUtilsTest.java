package cacNoe.flight_api.utils;

import cacNoe.flight_api.models.Flight;
import cacNoe.flight_api.models.FlightDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FlightUtilsTest {
    @Autowired
    FlightUtils flightUtils;

    /*@BeforeEach
    public void setUp(){
        List<Flight> flightList;
        List<FlightDto> flightDtoList;
    }*/

    @Test
    void flightMapperTest() {
        List<Flight> flightList= new ArrayList<>();
        Flight flight = new Flight();
        List<FlightDto> flightDtoList=new ArrayList<>();
        double dollarPrice=1015;

        flight.setId(1L);
        flight.setOrigin("Eze");
        flight.setDestiny("Cpc");
        flight.setDateTimeDeparture("12-03-2024 12:00");
        flight.setDateTimeArrival("12-03-2024 14:00");
        flight.setPrice(100.0);
        flight.setFrequency("daily");

        flightList.add(flight);
        flightDtoList = flightUtils.flightMapper(flightList,dollarPrice);

        FlightDto flightDto=flightDtoList.get(0);
        assertEquals(1,flightDto.getId());
        assertEquals(flight.getPrice()*dollarPrice,flightDto.getConvertedPrice());
        assertEquals("Cpc",flight.getDestiny());
        assertEquals("daily",flight.getFrequency());

    }

}