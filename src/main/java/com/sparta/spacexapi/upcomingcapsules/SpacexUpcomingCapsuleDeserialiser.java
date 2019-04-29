package com.sparta.spacexapi.upcomingcapsules;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.spacexapi.pastcapsules.SpacexPastCapsuleDTO;

import java.util.HashMap;
import java.util.Map;

public class SpacexUpcomingCapsuleDeserialiser {

    private SpacexUpcomingCapsuleDTO[] spacexUpcomingCapsuleDTO;
    private Map<String, SpacexUpcomingCapsuleDTO> upcomingCapsuleDTO;

    public SpacexUpcomingCapsuleDTO[] getSpacexUpcomingCapsuleDTO() {
        return spacexUpcomingCapsuleDTO;
    }

    public Map<String, SpacexUpcomingCapsuleDTO> getUpcomingCapsuleDTO() {
        return upcomingCapsuleDTO;
    }

    public SpacexUpcomingCapsuleDeserialiser(String JSONString){
        ObjectMapper pastCapsuleObject = new ObjectMapper();

        try{
            spacexUpcomingCapsuleDTO = pastCapsuleObject.readValue(JSONString, SpacexUpcomingCapsuleDTO[].class);
            upcomingCapsuleDTO = new HashMap<>();
            for (SpacexUpcomingCapsuleDTO capsuleDTO : spacexUpcomingCapsuleDTO){
                upcomingCapsuleDTO.put(capsuleDTO.getCapsule_serial(), capsuleDTO);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
