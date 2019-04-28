package com.sparta.spacexapi.service;

import com.sparta.spacexapi.httpcaller.HTTPManager;
import com.sparta.spacexapi.pastcapsules.SpacexPastCapsuleDeserialiser;
import com.sparta.spacexapi.singlecapsule.SpacexCapsuleDeserialiser;

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



