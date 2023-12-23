package serviceImpl;

import org.example.model.Flight;
import org.example.service.FlightFilterService;
import org.example.service.impl.ArrivalFlightFilterServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static serviceImpl.PepareTestObject.*;

public class ArrivalFlightFilterServiceImplTest {
    private final FlightFilterService flightFilterService =new ArrivalFlightFilterServiceImpl();
    @Test
    public void shouldFilterArrivalFlight(){
        Flight flightRightArrival = flightRight();
        Flight FlightWrongArrival=flightWrongArrival();
       
        List<Flight> expectedFlightsList=new ArrayList<>();
        expectedFlightsList.add(flightRightArrival);

        List<Flight> flightList=new ArrayList<>();
        flightList.add(flightRightArrival);
        flightList.add(FlightWrongArrival);

        List<Flight> actualFlightList = flightFilterService.filter(flightList);
        Assertions.assertEquals(expectedFlightsList,actualFlightList);

    }
}
