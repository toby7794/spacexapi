package com.sparta.spacexapi;

import com.sparta.spacexapi.service.PastCapsuleService;


public class App 
{
    public static void main( String[] args )
    {
        PastCapsuleService single = new PastCapsuleService();
        System.out.println(single.getDeserialiser().getSpacexPastCapsuleDTO()[5].getCapsule_serial());

    }
}
