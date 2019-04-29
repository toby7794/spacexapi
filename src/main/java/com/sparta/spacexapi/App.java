package com.sparta.spacexapi;


public class App 
{
    public static void main( String[] args )
    {
        SpacexService service = new SpacexService();
        System.out.println(service.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(1).getLinks().get("reddit"));

    }
}
