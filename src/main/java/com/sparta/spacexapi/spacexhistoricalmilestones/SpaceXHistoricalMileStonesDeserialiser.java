package com.sparta.spacexapi.spacexhistoricalmilestones;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.spacexapi.orbittingtesla.OrbittingTeslaDTO;
import com.sparta.spacexapi.pastcapsules.SpacexPastCapsuleDTO;

import java.util.HashMap;
import java.util.Map;

public class SpaceXHistoricalMileStonesDeserialiser {

    private SpaceXHistoricalMileStonesDTO [] spaceXHistoricalMileStonesDTO;
    private Map<Integer, SpaceXHistoricalMileStonesDTO> historicalMileStonesDTO;

    public Map<Integer, SpaceXHistoricalMileStonesDTO> getHistoricalMileStonesDTO() {
        return historicalMileStonesDTO;
    }

    public SpaceXHistoricalMileStonesDeserialiser(String JSONString){
        ObjectMapper historicalMileStoneObject = new ObjectMapper();

        try{
            spaceXHistoricalMileStonesDTO = historicalMileStoneObject.readValue(JSONString, SpaceXHistoricalMileStonesDTO [].class);
            historicalMileStonesDTO = new HashMap<>();
            for (SpaceXHistoricalMileStonesDTO historicalDTO : spaceXHistoricalMileStonesDTO) {
                historicalMileStonesDTO.put(historicalDTO.getId(), historicalDTO);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
