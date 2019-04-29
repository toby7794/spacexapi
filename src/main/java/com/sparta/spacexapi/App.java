package com.sparta.spacexapi;


public class App 
{
    public static void main( String[] args )
    {
//        SpacexCompanyInfoService upcoming = new SpacexCompanyInfoService();
//        System.out.println(upcoming.getDeserialiser().getSpacexInfoDTO().getEmployees());

        SpacexService service = new SpacexService();
        System.out.println(service.selectOrbittingSunTeslaService().getDeserialiser().getOrbittingTeslaDTO().getSpeed_mph());

    }
}
