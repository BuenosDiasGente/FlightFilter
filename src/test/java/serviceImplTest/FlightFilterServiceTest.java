package serviceImplTest;

import org.example.model.Flight;
import org.example.service.FlightFilterService;
import org.example.service.impl.ArrivalFlightFilterServiceImpl;
import org.example.service.impl.DepartureFlightFilterServiceImpl;
import org.example.service.impl.IntervalFlightFilterServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static serviceImplTest.PepareTestObject.*;


public class FlightFilterServiceTest {
    private LocalDateTime dateTime = LocalDateTime.now();
    @Test
    void shouldFilterDepartureFlight() {
        FlightFilterService flightFilterService = new DepartureFlightFilterServiceImpl();
        List<Flight> expected = createExpectedFlightList();
        List<Flight> actual = flightFilterService.filter(createActualFlightListForFilterDepartureTest(dateTime));
        Assertions.assertEquals(actual.toString(), expected.toString());
    }

    @Test
    void shouldFilterArrivalFlight() {
        FlightFilterService flightFilterService = new ArrivalFlightFilterServiceImpl();
        List<Flight> expected = createExpectedFlightList();
        List<Flight> actual = flightFilterService.filter(createActualFlightListForFilterArrivalTest(dateTime));
        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void shouldIntervalFilterFlight() {
        FlightFilterService flightFilterService = new IntervalFlightFilterServiceImpl();
        List<Flight> expected = createExpectedFlightList();
        List<Flight> actual = flightFilterService.filter(createActualFlightListForFilterIntervalTest(dateTime));
        Assertions.assertEquals(expected.toString(), actual.toString());
    }
}

