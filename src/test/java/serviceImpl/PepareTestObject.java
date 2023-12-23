package serviceImpl;

import org.example.model.Flight;
import org.example.model.Segment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PepareTestObject {
    public static Segment SegmentObjectOne() {
        LocalDateTime dep = LocalDateTime.of(2023, 12, 01, 12, 00);
        LocalDateTime arr = LocalDateTime.of(2023, 12, 01, 14, 30);
        Segment segment = new Segment(dep, arr);
        return segment;
    }

    public static Segment SegmentObjectTwo() {
        LocalDateTime dep = LocalDateTime.of(2023, 12, 01, 15, 30);
        LocalDateTime arr = LocalDateTime.of(2023, 12, 01, 17, 30);
        Segment segment = new Segment(dep, arr);
        return segment;
    }

    public static Segment SegmentObjectFor() {
        LocalDateTime dep = LocalDateTime.of(2023, 12, 01, 20, 30);
        LocalDateTime arr = LocalDateTime.of(2023, 12, 01, 22, 30);
        Segment segment = new Segment(dep, arr);
        return segment;
    }

    public static Segment SegmentObjectFive() {
        LocalDateTime dep = LocalDateTime.of(2023, 12, 02, 20, 30);
        LocalDateTime arr = LocalDateTime.of(2023, 12, 02, 21, 30);
        Segment segment = new Segment(dep, arr);
        return segment;
    }

    public static Segment SegmentObjectSix() {
        LocalDateTime dep = LocalDateTime.of(2024, 12, 01, 12, 00);
        LocalDateTime arr = LocalDateTime.of(2024, 12, 01, 14, 30);
        Segment segment = new Segment(dep, arr);
        return segment;
    }

    public static List<Segment> segmentRightListOne() {
        List<Segment> segmentList = new ArrayList<>();
        segmentList.add(SegmentObjectOne());
        segmentList.add(SegmentObjectTwo());
        return segmentList;
    }

    public static List<Segment> segmentWrongIntervalList() {
        List<Segment> segmentList = new ArrayList<>();
        segmentList.add(SegmentObjectFor());
        segmentList.add(SegmentObjectFive());
        return segmentList;
    }

    public static List<Segment> segmentWrongArrivalTimeList() {
        List<Segment> segmentList = new ArrayList<>();
        segmentList.add(SegmentObjectFor());
        segmentList.add(SegmentObjectTwo());
        return segmentList;
    }

    public static List<Segment> segmentWrongDeparttureTimeList() {
        List<Segment> segmentList = new ArrayList<>();
        segmentList.add(SegmentObjectOne());
        segmentList.add(SegmentObjectTwo());
        segmentList.add(SegmentObjectFor());
        segmentList.add(SegmentObjectSix());
        return segmentList;
    }

    public static Flight flightRight() {
        Flight flight = new Flight(segmentRightListOne());
        return flight;
    }

    public static Flight flightWrongInterval() {
        Flight flight = new Flight(segmentWrongIntervalList());
        return flight;
    }

    public static Flight flightWrongArrival() {
        Flight flight = new Flight(segmentWrongArrivalTimeList());
        return flight;
    }

    public static Flight flightWrongDeparture() {
        Flight flight = new Flight(segmentWrongDeparttureTimeList());
        return flight;
    }
}

