package com.sparta.spacexapi.spacexcompanyinfo;

import java.util.Map;

public class SpacexCompanyInfoDTO {

    private String name;
    private String founder;
    private int founded;
    private int employees;
    private int vehicles;
    private int launch_sites;
    private int test_sites;
    private String ceo;
    private String cto;
    private String coo;
    private String cto_propulsion;
    private long valuation;
    private Map<String, Object> headquarters;
    private Map<String, String> links;
    private String summary;

    public String getName() {
        return name;
    }

    public String getFounder() {
        return founder;
    }

    public int getFounded() {
        return founded;
    }

    public int getEmployees() {
        return employees;
    }

    public int getVehicles() {
        return vehicles;
    }

    public int getLaunch_sites() {
        return launch_sites;
    }

    public int getTest_sites() {
        return test_sites;
    }

    public String getCeo() {
        return ceo;
    }

    public String getCto() {
        return cto;
    }

    public String getCoo() {
        return coo;
    }

    public String getCto_propulsion() {
        return cto_propulsion;
    }

    public long getValuation() {
        return valuation;
    }

    public Map<String, Object> getHeadquarters() {
        return headquarters;
    }

    public Map<String, String> getLinks() {
        return links;
    }

    public String getSummary() {
        return summary;
    }
}
