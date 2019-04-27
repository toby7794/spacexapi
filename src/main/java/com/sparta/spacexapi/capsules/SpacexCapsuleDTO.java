package com.sparta.spacexapi.capsules;

import java.util.HashMap;

public class SpacexCapsuleDTO {

private String capsule_serial;
private String capsule_id;
private String status;
private String original_launch;
private String original_launch_unix;
private HashMap<String, String> missions;
private String landings;
private String type;
private String details;
private String reuse_count;

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

    public String getOriginal_launch_unix() {
        return original_launch_unix;
    }

    public HashMap<String, String> getMissions() {
        return missions;
    }

    public String getLandings() {
        return landings;
    }

    public String getType() {
        return type;
    }

    public String getDetails() {
        return details;
    }

    public String getReuse_count() {
        return reuse_count;
    }
}
