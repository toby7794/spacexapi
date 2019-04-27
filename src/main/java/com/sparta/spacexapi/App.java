package com.sparta.spacexapi;

import com.sparta.spacexapi.service.SingleCapsuleService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SingleCapsuleService single = new SingleCapsuleService("C101");
        System.out.println(single.getDeserialiser().getSpacexCapsuleDTO().getCapsule_serial());

    }
}
