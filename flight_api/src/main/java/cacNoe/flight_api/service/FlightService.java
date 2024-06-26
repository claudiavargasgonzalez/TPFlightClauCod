package cacNoe.flight_api.service;

import cacNoe.flight_api.configuration.FlightConfiguration;
import cacNoe.flight_api.models.Company;
import cacNoe.flight_api.models.Dolar;
import cacNoe.flight_api.models.Flight;
import cacNoe.flight_api.models.FlightDto;
import cacNoe.flight_api.repository.CompanyRepository;
import cacNoe.flight_api.repository.FlightRepository;
import cacNoe.flight_api.utils.FlightUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class FlightService {

    @Autowired
    FlightRepository repository;
    @Autowired
    FlightConfiguration flightConfiguration;
    @Autowired
    FlightUtils flightUtils;

    @Autowired
    CompanyRepository companyRepository;



    public void createFlight(Flight flight,Long companyId) {
        Company company = companyRepository.findById(companyId)
                .orElseThrow(() -> new IllegalArgumentException("Company not found"));

        flight.setCompany(company);
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

    public List<FlightDto> returnAllFlights(){
        double dollarPrice = getDollar();
        List <Flight> flights= repository.findAll();
        return flightUtils.flightMapper(flights,dollarPrice);

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
                flightListInOffer.add(flight);
            }
        }
        return flightListInOffer;
    }


    private double getDollar() {
        Dolar dolar = flightConfiguration.fetchDolar();
        return dolar.getPromedio();
    }
}
