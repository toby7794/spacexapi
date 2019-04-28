package com.sparta.spacexapi.spacexcompanyinfo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SpacexCompanyInfoDeserialiser {

    private SpacexCompanyInfoDTO spacexInfoDTO;

    public SpacexCompanyInfoDTO getSpacexInfoDTO() {
        return spacexInfoDTO;
    }

    public SpacexCompanyInfoDeserialiser(String JSONString){
        ObjectMapper spacexInfoObject = new ObjectMapper();

        try{
            spacexInfoDTO = spacexInfoObject.readValue(JSONString, SpacexCompanyInfoDTO.class);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
