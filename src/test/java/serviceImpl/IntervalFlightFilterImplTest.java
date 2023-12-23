package serviceImpl;

import org.example.model.Flight;
import org.example.service.FlightFilterService;
import org.example.service.impl.IntervalFlightFilterServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static serviceImpl.PepareTestObject.*;

public class IntervalFlightFilterImplTest {
    private final FlightFilterService flightFilterService = new IntervalFlightFilterServiceImpl();

    @Test
    public void shouldIntervalFilterFlight() {
        Flight flightRightInterval = flightRight();
        Flight flightWrongInterval = flightWrongInterval();

        List<Flight> expectedFlightsList = new ArrayList<>();
        expectedFlightsList.add(flightRightInterval);

        List<Flight> flightList = new ArrayList<>();
        flightList.add(flightRightInterval);
        flightList.add(flightWrongInterval);

        List<Flight> actualFlightList = flightFilterService.filter(flightList);
        Assertions.assertIterableEquals(expectedFlightsList, actualFlightList);
    }

}

