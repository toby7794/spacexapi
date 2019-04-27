package com.sparta.spacexapi.singlecapsule;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SpacexCapsuleDeserialiser {

    private SpacexCapsuleDTO spacexCapsuleDTO;

    public SpacexCapsuleDTO getSpacexCapsuleDTO() {
        return spacexCapsuleDTO;
    }

    public void setSpacexCapsuleDTO(SpacexCapsuleDTO spacexCapsuleDTO) {
        this.spacexCapsuleDTO = spacexCapsuleDTO;
    }

    public SpacexCapsuleDeserialiser(String JSONString){
        ObjectMapper ratesObject = new ObjectMapper();

        try{
            spacexCapsuleDTO = ratesObject.readValue(JSONString, SpacexCapsuleDTO.class);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
