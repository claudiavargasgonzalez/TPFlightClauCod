package cacNoe.flight_api.service;

import cacNoe.flight_api.models.Flight;
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


    public Optional<Flight> findFlightById(Long id) {
       return repository.findById(id);
    }

    public void deleteFlightbyId(Long id) {
        repository.deleteById(id);
    }

   public Optional<Flight> updateFlight(Flight flight){
        repository.save(flight);
        return repository.findById(flight.getId());
    }

    public List<Flight> returnAllFlights(){
        return repository.findAll();
    }

    public List<Flight> getByOrigin(String origin){
        return repository.findByOrigin(origin);
    }

    public List<Flight> getByOriginAndDestiny(String origin, String destiny){
        return repository.findByOriginAndDestiny(origin,destiny);
    }

    public List<Flight> getOffers(double price) {
        List <Flight> flightListInOffer= new ArrayList<>();
        List <Flight> flightList= repository.findAll();
        for(Flight flight : flightList){
            if (flight.getPrice() < price){
                flightListInOffer.add(flight);git
            }
        }
        return flightListInOffer;
    }
}
