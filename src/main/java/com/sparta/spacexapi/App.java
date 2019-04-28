package com.sparta.spacexapi;

import com.sparta.spacexapi.service.PastCapsuleService;
import com.sparta.spacexapi.service.SpacexCompanyInfoService;
import com.sparta.spacexapi.service.UpcomingCapsuleService;


public class App 
{
    public static void main( String[] args )
    {
        SpacexCompanyInfoService upcoming = new SpacexCompanyInfoService();
        System.out.println(upcoming.getDeserialiser().getSpacexInfoDTO().getEmployees());

    }
}
