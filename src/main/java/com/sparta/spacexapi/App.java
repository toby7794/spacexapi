package com.sparta.spacexapi;

import com.sparta.spacexapi.capsules.SpacexCapsuleDeserialiser;
import com.sparta.spacexapi.httpcaller.HTTPManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HTTPManager capsuleLatestCall = new HTTPManager();
        String values = capsuleLatestCall.getResponseBody();
        SpacexCapsuleDeserialiser parser = new SpacexCapsuleDeserialiser(values);
        System.out.println(parser.getSpacexCapsuleDTO().getDetails());



    }
}
