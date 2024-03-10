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

    @GetMapping("")
    public List<Flight> getAllFlights(){
        return flightService.returnAllFlights();
    }

    @PostMapping("/agregar")
    public void createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);
    }

   @GetMapping("/{Id}")
    public Flight findFlightById(@PathVariable Long Id){
        return flightService.findFlightById(Id);
    }

   @DeleteMapping("/borrar/{id}")
    public void deleteFlight(@PathVariable Long id){
        flightService.deleteFlightbyId(id);
    }
    @PutMapping("/actualizar")
    public Flight updateFlight(@RequestBody Flight flight){
        return flightService.updateFlight(flight);
    }

}
