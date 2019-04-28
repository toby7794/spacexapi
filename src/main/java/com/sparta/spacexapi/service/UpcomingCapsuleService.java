package com.sparta.spacexapi.service;

import com.sparta.spacexapi.httpcaller.HTTPManager;
import com.sparta.spacexapi.upcomingcapsules.SpacexUpcomingCapsuleDeserialiser;

public class UpcomingCapsuleService {

    private SpacexUpcomingCapsuleDeserialiser deserialiser;

    public UpcomingCapsuleService()
    {
        HTTPManager upcomingCapsuleCall = new HTTPManager();
        upcomingCapsuleCall.makeUpcomingCapsuleCall();
        deserialiser = new SpacexUpcomingCapsuleDeserialiser(upcomingCapsuleCall.getResponseBody());
    }

    public SpacexUpcomingCapsuleDeserialiser getDeserialiser() {
        return deserialiser;
    }

}
