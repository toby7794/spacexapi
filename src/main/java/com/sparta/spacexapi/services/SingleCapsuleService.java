package com.sparta.spacexapi.services;

import com.sparta.spacexapi.singlecapsule.SpacexCapsuleDeserialiser;
import com.sparta.spacexapi.httpcaller.HTTPManager;

public class SingleCapsuleService {

    private SpacexCapsuleDeserialiser deserialiser;

    public SingleCapsuleService(String capsuleCode)
    {
        HTTPManager singleCapsuleCall = new HTTPManager();
        singleCapsuleCall.makeSingleCapsuleCall(capsuleCode);
        deserialiser = new SpacexCapsuleDeserialiser(singleCapsuleCall.getResponseBody());
    }

    public SpacexCapsuleDeserialiser getDeserialiser() {
        return deserialiser;
    }
}

