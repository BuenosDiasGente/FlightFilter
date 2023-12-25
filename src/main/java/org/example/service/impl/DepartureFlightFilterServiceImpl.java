package org.example.service.impl;

import org.example.model.Flight;
import org.example.model.Segment;
import org.example.service.FlightFilterService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DepartureFlightFilterServiceImpl implements FlightFilterService {
    /**
     * A filter that excludes departures
     * up to the current time from the test set of flights.
     *
     * @param flightList
     * @return
     */
    @Override
    public List<Flight> filter(List<Flight> flightList) {
        List<Flight> flights = new ArrayList<>();
        for (Flight flight : flightList) {
            for (Segment seg : flight.getSegments()) {
                if (LocalDateTime.now().isBefore(seg.getDepartureDate())) {
                    flights.add(flight);
                    break;
                }
            }
        }
        return flights;
    }


//        List<Flight> filteredFlights = new ArrayList<>();
//        LocalDateTime now = LocalDateTime.now();
//        flightList.stream()
//                .forEach(flight -> {
//                    flight.getSegments().stream()
//                            .forEach(segment -> {
//                                if (now.isBefore(segment.getDepartureDate())) {
//                                    filteredFlights.add(flight);
//                                }
//                            });
//                });
//        return filteredFlights;
//    }

}



