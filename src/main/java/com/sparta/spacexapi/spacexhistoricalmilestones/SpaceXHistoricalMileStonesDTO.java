package com.sparta.spacexapi.spacexhistoricalmilestones;

import java.util.Map;

public class SpaceXHistoricalMileStonesDTO {

    private int id;
    private String title;
    private String event_date_utc;
    private long event_date_unix;
    private int flight_number;
    private String details;
    private Map<String,String> links;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getEvent_date_utc() {
        return event_date_utc;
    }

    public long getEvent_date_unix() {
        return event_date_unix;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public String getDetails() {
        return details;
    }

    public Map<String, String> getLinks() {
        return links;
    }
}
