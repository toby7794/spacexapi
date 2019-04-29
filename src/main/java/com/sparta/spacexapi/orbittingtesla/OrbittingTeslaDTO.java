package com.sparta.spacexapi.orbittingtesla;

import java.util.ArrayList;

public class OrbittingTeslaDTO {

    private String name;
    private String launch_date_utc;
    private long launch_date_unix;
    private int launch_mass_kg;
    private int launch_mass_lbs;
    private int norad_id;
    private double epoch_jd;
    private String orbit_type;
    private double apoapsis_au;
    private double periapsis_au;
    private double semi_major_axis_au;
    private double eccentricity;
    private double inclination;
    private double longitude;
    private double periapsis_arg;
    private double period_days;
    private double speed_kph;
    private double speed_mph;
    private double earth_distance_km;
    private double earth_distance_mi;
    private double mars_distance_km;
    private double mars_distance_mi;
    private ArrayList<String> flickr_images;
    private String wikipedia;
    private String details;

    public String getName() {
        return name;
    }

    public String getLaunch_date_utc() {
        return launch_date_utc;
    }

    public long getLaunch_date_unix() {
        return launch_date_unix;
    }

    public int getLaunch_mass_kg() {
        return launch_mass_kg;
    }

    public int getLaunch_mass_lbs() {
        return launch_mass_lbs;
    }

    public int getNorad_id() {
        return norad_id;
    }

    public double getEpoch_jd() {
        return epoch_jd;
    }

    public String getOrbit_type() {
        return orbit_type;
    }

    public double getApoapsis_au() {
        return apoapsis_au;
    }

    public double getSemi_major_axis_au() {
        return semi_major_axis_au;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public double getInclination() {
        return inclination;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getPeriapsis_arg() {
        return periapsis_arg;
    }

    public double getPeriod_days() {
        return period_days;
    }

    public double getSpeed_kph() {
        return speed_kph;
    }

    public double getSpeed_mph() {
        return speed_mph;
    }

    public double getEarth_distance_km() {
        return earth_distance_km;
    }

    public double getEarth_distance_mi() {
        return earth_distance_mi;
    }

    public double getMars_distance_km() {
        return mars_distance_km;
    }

    public double getMars_distance_mi() {
        return mars_distance_mi;
    }

    public ArrayList<String> getFlickr_images() {
        return flickr_images;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public String getDetails() {
        return details;
    }

    public double getPeriapsis_au() {
        return periapsis_au;
    }
}
