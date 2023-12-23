package serviceImpl;

import org.example.model.Flight;
import org.example.service.FlightFilterService;
import org.example.service.impl.DepartureFlightFilterServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static serviceImpl.PepareTestObject.*;

public class DepartureFlightFilterServiceImplTest {
    private final FlightFilterService flightFilterService = new DepartureFlightFilterServiceImpl();

    @Test
    public void shouldFilterDepartureFlight() {
        Flight flightRightArrival = flightRight();
        Flight flightLongInterval = flightWrongInterval();
        Flight flightRightDeparture = flightWrongDeparture();

        List<Flight> expectedFlightsList = new ArrayList<>();
        expectedFlightsList.add(flightRightDeparture);

        List<Flight> flightList = new ArrayList<>();
        flightList.add(flightRightArrival);
        flightList.add(flightLongInterval);
        flightList.add(flightRightDeparture);

        List<Flight> actualFlightList = flightFilterService.filter(flightList);
        Assertions.assertEquals(expectedFlightsList, actualFlightList);
    }
}
