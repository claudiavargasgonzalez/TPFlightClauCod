package cacNoe.flight_api.controller;


import cacNoe.flight_api.models.Dolar;
import cacNoe.flight_api.models.Flight;
import cacNoe.flight_api.models.FlightDto;
import cacNoe.flight_api.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vuelos")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping("")
    public List<FlightDto> getAllFlights(){
        return flightService.returnAllFlights();
    }

    @PostMapping("/add")
    public void createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);
    }

   @GetMapping("/{id}")
    public Optional<Flight> findFlightById(@PathVariable Long id){
        return flightService.findFlightById(id);
    }

   @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable Long id){
        flightService.deleteFlightbyId(id);
    }
    @PutMapping("/update")
    public Optional<Flight> updateFlight(@RequestBody Flight flight){
        return flightService.updateFlight(flight);
    }

    @GetMapping("/origin")
    public List<Flight> getFlightsByLocations(@RequestParam String origin){
        return flightService.getByOrigin(origin);
    }

    @GetMapping("/locations")
    public List<Flight> getFlightsByLocations(@RequestParam String origin,@RequestParam String destiny){
        return flightService.getByOriginAndDestiny(origin, destiny);
    }

    @GetMapping("/offer")
    public List<Flight> getOffer(@RequestParam double price){
        return flightService.getOffers(price);
    }


    //me trae el promedio del dolar a traves de la api
    /*@GetMapping("/dolarPromedio")
    public double getDolar(){
        return flightService.getDollar();
    }*/



}
