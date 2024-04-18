package cacNoe.flight_api.configuration;

import cacNoe.flight_api.models.Dolar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FlightConfigurationTest {

    @Test
    void fetchDolarTest() {
        Dolar dummyDolar = new Dolar();

        dummyDolar.setMoneda("Dolar");
        dummyDolar.setCasa("Tarjeta");
        dummyDolar.setNombre("Tarjeta");
        dummyDolar.setCompra(1420);
        dummyDolar.setVenta(1430);

        FlightConfiguration mockedFlightConfiguration = mock(FlightConfiguration.class);
        when(mockedFlightConfiguration.fetchDolar()).thenReturn(dummyDolar);

        Dolar dolar = mockedFlightConfiguration.fetchDolar();

        assertEquals(dummyDolar.getPromedio(),dolar.getPromedio());

    }
}