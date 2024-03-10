package cacNoe.flight_api.controller;


import cacNoe.flight_api.model.Flight;
import cacNoe.flight_api.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping()
    public List<Flight> hello(){return flightService.listarVuelos();}

   /* @GetMapping("/unVuelo")
    public Flight getFlight(){
        return flightService.returnOneFlight();
    }
    @GetMapping("/todos")
    public List<Flight> getAllFlights(){
        return flightService.returnAllFlights();
    }

    @PostMapping("/agregar")
    public void createFlight(){
        flightService.createFlight();
    }

    @GetMapping("/id")
    public Flight findFlightById(){
        Long id = 1L;
        Flight flightFound = flightService.findFlightById(id);
        return flightFound;
    }

    @DeleteMapping("/borrar")
    public void deleteFlight(){
        Long id = 1L;
        flightService.deleteFlightbyId(id);
    }

    @PutMapping("/actualizar")
    public void updateFlight(){
        Long id = 2L;
        flightService.updateFlightById(id);
    }*/

}
