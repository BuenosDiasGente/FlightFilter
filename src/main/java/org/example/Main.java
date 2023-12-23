package org.example;

import org.example.model.Flight;
import org.example.model.FlightBuilder;
import org.example.service.impl.ArrivalFlightFilterServiceImpl;
import org.example.service.impl.DepartureFlightFilterServiceImpl;
import org.example.service.impl.IntervalFlightFilterServiceImpl;

import java.util.List;

import static org.example.constant.InfoConstant.*;

public class Main {
    public static void main(String[] args) {

        List<Flight> flightList = FlightBuilder.createFlights();
        printFlight(flightList, ALL_FLIGHTS);

        List<Flight> filterDeparture = new DepartureFlightFilterServiceImpl().filter(flightList);
        printFlight(filterDeparture, FLIGHT_IS_FILTER_DEPARTURE);

        List<Flight> filterArrival = new ArrivalFlightFilterServiceImpl().filter(flightList);
        printFlight(filterArrival, FLIGHT_IS_FILTER_ARRIVAL);

        List<Flight> filterInterval = new IntervalFlightFilterServiceImpl().filter(flightList);
        printFlight(filterInterval, FLIGHT_IS_FILTER_INTERVAL);

    }

    private static void printFlight(List<Flight> flights, String note) {
        System.out.println(note);
        for (Flight flight : flights) {
            System.out.println(flight);
        }
        System.out.println("-------------------------------------------------");
    }
}

