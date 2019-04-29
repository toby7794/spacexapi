package com.sparta.spacexapi.services;

import com.sparta.spacexapi.httpcaller.HTTPManager;
import com.sparta.spacexapi.orbittingtesla.OrbittingTeslaDeserialiser;

public class OrbittingSunTeslaService {

    private OrbittingTeslaDeserialiser deserialiser;

    public OrbittingSunTeslaService()
    {
        HTTPManager teslaSunOrbitCall = new HTTPManager();
        teslaSunOrbitCall.makeSpacexRoadsterCall();
        deserialiser = new OrbittingTeslaDeserialiser(teslaSunOrbitCall.getResponseBody());
    }

    public OrbittingTeslaDeserialiser getDeserialiser() {
        return deserialiser;
    }


}
