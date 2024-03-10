package cacNoe.flight_api.service;

import cacNoe.flight_api.model.Flight;
import cacNoe.flight_api.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    private FlightRepository repository;


    public void createFlight(Flight flight) {
        repository.save(flight);
    }


    public Flight findFlightById(Long id) {
       return repository.findById(id).orElse(null);
    }

    public void deleteFlightbyId(Long id) {
        repository.deleteById(id);
    }

   public Flight updateFlight(Flight flight){
        repository.save(flight);
        return repository.findById(flight.getId()).orElse(null);
    }

    public List<Flight> returnAllFlights(){
        return repository.findAll();
    }
}
