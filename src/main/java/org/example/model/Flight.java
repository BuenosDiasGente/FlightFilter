package org.example.model;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Bean that represents a flight.
 */
public class Flight {
    private final List<Segment> segments;

    public Flight(final List<Segment> segs) {

        this.segments = segs;
    }

    public List<Segment> getSegments() {

        return this.segments;
    }

    @Override
    public String toString() {
        return segments.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getSegments(), flight.getSegments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSegments());
    }
}
