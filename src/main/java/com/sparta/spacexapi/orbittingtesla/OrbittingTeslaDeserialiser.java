package com.sparta.spacexapi.orbittingtesla;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.spacexapi.singlecapsule.SpacexCapsuleDTO;

public class OrbittingTeslaDeserialiser {

    private OrbittingTeslaDTO orbittingTeslaDTO;

    public OrbittingTeslaDTO getOrbittingTeslaDTO() {
        return orbittingTeslaDTO;
    }

    public OrbittingTeslaDeserialiser(String JSONString){
        ObjectMapper teslaObject = new ObjectMapper();

        try{
            orbittingTeslaDTO = teslaObject.readValue(JSONString, OrbittingTeslaDTO.class);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
