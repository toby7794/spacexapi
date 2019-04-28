package com.sparta.spacexapi.upcomingcapsules;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.spacexapi.pastcapsules.SpacexPastCapsuleDTO;

public class SpacexUpcomingCapsuleDeserialiser {

    private SpacexUpcomingCapsuleDTO[] spacexUpcomingCapsuleDTO;

    public SpacexUpcomingCapsuleDTO[] getSpacexUpcomingCapsuleDTO() {
        return spacexUpcomingCapsuleDTO;
    }

    public SpacexUpcomingCapsuleDeserialiser(String JSONString){
        ObjectMapper pastCapsuleObject = new ObjectMapper();

        try{
            spacexUpcomingCapsuleDTO = pastCapsuleObject.readValue(JSONString, SpacexUpcomingCapsuleDTO[].class);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
