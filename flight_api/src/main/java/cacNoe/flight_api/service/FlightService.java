package cacNoe.flight_api.service;

import cacNoe.flight_api.model.Flight;
import cacNoe.flight_api.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository repository;

   /* private List<Flight> flightList = new ArrayList<>();

    Flight flight1 = new Flight(1L, "Mar del Plata", "Buenos Aires", "25-10-2024", "25-10-2024", 170000.0, "mensual");
    Flight flight2 = new Flight(2L, "Rosario", "Buenos Aires", "03-11-2024", "03-11-2024", 190000.0, "semanal");
    Flight flight3 = new Flight(3L, "Neuquen", "Buenos Aires", "20-12-2024", "20-12-2024", 140000.0, "semanal");

    public void addFlight() {
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
    }

    public List<Flight> returnAllFlights() {
        addFlight();
        return flightList;
    }

    public Flight returnOneFlight() {
        return new Flight(1L, "Mar del Plata", "Buenos Aires", "25-10-2024", "25-10-2024", 130000.0, "semanal");

    }

    public void createFlight() {
        addFlight();
        flightList.add(new Flight(4L, "Mendoza", "Rosario", "4-4-2024", "4-4-2024", 150000.0, "semanal"));
    }


    public Flight findFlightById(Long id) {
        addFlight();
        for (int i = 0; i < flightList.size(); i++) {
            if (flightList.get(i).getId() == id) {
                return flightList.get(i);
            }
        }
        return null;
    }

    public void deleteFlightbyId(Long id) {
        Flight flightToBeErased = findFlightById(id);
        flightList.remove(flightToBeErased);

    }

    public void updateFlightById(Long id){
        Flight flightToBeUpdated = findFlightById(id);
        flightToBeUpdated.setPrecioEnPesos(100000.0);
        flightToBeUpdated.setFrecuencia("diaria");
    }*/

    public List<Flight> listarVuelos(){return repository.findAll();}
}
