package com.sparta.spacexapi;

import com.sparta.spacexapi.service.PastCapsuleService;
import com.sparta.spacexapi.service.UpcomingCapsuleService;


public class App 
{
    public static void main( String[] args )
    {
        UpcomingCapsuleService upcoming = new UpcomingCapsuleService();
        System.out.println(upcoming.getDeserialiser().getSpacexUpcomingCapsuleDTO()[3].getCapsule_serial());

    }
}
