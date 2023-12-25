package org.example.service.impl;

import org.example.model.Flight;
import org.example.service.FlightFilterService;

import java.util.List;
import java.util.stream.Collectors;

public class IntervalFlightFilterServiceImpl implements FlightFilterService {
    /**
     * A filter that Excludes flights from the test set where the total time
     * spent on the ground exceeds two hours (time on the ground is the interval
     * between the arrival of one segment and the departure of the next one).
     *
     * @param flightList
     * @return
     */
    @Override
    public List<Flight> filter(List<Flight> flightList) {
        return flightList.parallelStream()
                .filter(flight -> flight.IntervalTime() < 2)
                .collect(Collectors.toList());
    }

}
