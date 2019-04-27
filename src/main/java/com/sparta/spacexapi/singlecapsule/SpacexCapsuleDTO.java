package com.sparta.spacexapi.singlecapsule;

import java.util.ArrayList;
import java.util.Map;

public class SpacexCapsuleDTO {

private String capsule_serial;
private String capsule_id;
private String status;
private String original_launch;
private long original_launch_unix;
private ArrayList<Map<String, Object>> missions;
private int landings;
private String type;
private String details;
private int reuse_count;

    public String getCapsule_serial() {
        return capsule_serial;
    }

    public String getCapsule_id() {
        return capsule_id;
    }

    public String getStatus() {
        return status;
    }

    public String getOriginal_launch() {
        return original_launch;
    }

    public long getOriginal_launch_unix() {
        return original_launch_unix;
    }

    public ArrayList<Map<String, Object>> getMissions() {
        return missions;
    }

    public int getLandings() {
        return landings;
    }

    public String getType() {
        return type;
    }

    public String getDetails() {
        return details;
    }

    public int getReuse_count() {
        return reuse_count;
    }

}
