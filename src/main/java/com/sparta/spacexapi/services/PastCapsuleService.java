package com.sparta.spacexapi.services;

import com.sparta.spacexapi.httpcaller.HTTPManager;
import com.sparta.spacexapi.pastcapsules.SpacexPastCapsuleDeserialiser;

public class PastCapsuleService {

    private SpacexPastCapsuleDeserialiser deserialiser;

    public PastCapsuleService()
    {
        HTTPManager pastCapsuleCall = new HTTPManager();
        pastCapsuleCall.makePastCapsuleCall();
        deserialiser = new SpacexPastCapsuleDeserialiser(pastCapsuleCall.getResponseBody());
    }

    public SpacexPastCapsuleDeserialiser getDeserialiser() {
        return deserialiser;
    }

}



