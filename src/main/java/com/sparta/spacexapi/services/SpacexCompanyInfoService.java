package com.sparta.spacexapi.services;

import com.sparta.spacexapi.httpcaller.HTTPManager;
import com.sparta.spacexapi.spacexcompanyinfo.SpacexCompanyInfoDeserialiser;

public class SpacexCompanyInfoService {

    private SpacexCompanyInfoDeserialiser deserialiser;

    public SpacexCompanyInfoService()
    {
        HTTPManager infoCall = new HTTPManager();
        infoCall.makeSpacexCompanyInfoCall();
        deserialiser = new SpacexCompanyInfoDeserialiser(infoCall.getResponseBody());
    }

    public SpacexCompanyInfoDeserialiser getDeserialiser() {
        return deserialiser;
    }
}
