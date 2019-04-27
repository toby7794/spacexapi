package com.sparta.spacexapi;

import com.sparta.spacexapi.service.PastCapsuleService;
import com.sparta.spacexapi.service.SingleCapsuleService;


public class App 
{
    public static void main( String[] args )
    {
        PastCapsuleService single = new PastCapsuleService();
        System.out.println(single.getDeserialiser().getSpacexPastCapsuleDTO()[0].getCapsule_id());

    }
}
