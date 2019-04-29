package com.sparta.spacexapi.services;

import com.sparta.spacexapi.httpcaller.HTTPManager;
import com.sparta.spacexapi.orbittingtesla.OrbittingTeslaDeserialiser;
import com.sparta.spacexapi.spacexhistoricalmilestones.SpaceXHistoricalMileStonesDeserialiser;

public class HistoricalMileStoneService {

    private SpaceXHistoricalMileStonesDeserialiser deserialiser;

    public HistoricalMileStoneService()
    {
        HTTPManager historicalMileStoneCall = new HTTPManager();
        historicalMileStoneCall.makeHistoricalMileStonesCall();
        deserialiser = new SpaceXHistoricalMileStonesDeserialiser(historicalMileStoneCall.getResponseBody());
    }

    public SpaceXHistoricalMileStonesDeserialiser getDeserialiser() {
        return deserialiser;
    }

}
