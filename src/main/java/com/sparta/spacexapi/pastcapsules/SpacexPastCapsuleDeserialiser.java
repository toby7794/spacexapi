package com.sparta.spacexapi.pastcapsules;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.spacexapi.pastcapsules.SpacexPastCapsuleDTO;

import java.util.HashMap;
import java.util.Map;

public class SpacexPastCapsuleDeserialiser {

    private SpacexPastCapsuleDTO [] spacexPastCapsuleDTO;
    private Map<String, SpacexPastCapsuleDTO> pastCapsuleDTO;

    public SpacexPastCapsuleDTO [] getSpacexPastCapsuleDTO() {
        return spacexPastCapsuleDTO;
    }

    public Map<String, SpacexPastCapsuleDTO> getPastCapsuleDTO() {
        return pastCapsuleDTO;
    }

    public SpacexPastCapsuleDeserialiser(String JSONString){
        ObjectMapper pastCapsuleObject = new ObjectMapper();

        try{
            spacexPastCapsuleDTO = pastCapsuleObject.readValue(JSONString, SpacexPastCapsuleDTO[].class);
            pastCapsuleDTO = new HashMap<>();
            for (SpacexPastCapsuleDTO capsuleDTO : spacexPastCapsuleDTO){
                pastCapsuleDTO.put(capsuleDTO.getCapsule_serial(), capsuleDTO);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

