package com.sparta.spacexapi.pastcapsules;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SpacexPastCapsuleDeserialiser {

    private SpacexPastCapsuleDTO [] spacexPastCapsuleDTO;

    public SpacexPastCapsuleDTO [] getSpacexPastCapsuleDTO() {
        return spacexPastCapsuleDTO;
    }

    public SpacexPastCapsuleDeserialiser(String JSONString){
        ObjectMapper pastCapsuleObject = new ObjectMapper();

        try{
            spacexPastCapsuleDTO = pastCapsuleObject.readValue(JSONString, SpacexPastCapsuleDTO[].class);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

