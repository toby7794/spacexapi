package com.sparta.spacexapi;

import com.sparta.spacexapi.services.*;

public class SpacexService {

    private PastCapsuleService pastCapsules;
    private SingleCapsuleService singleCapsule;
    private SpacexCompanyInfoService information;
    private UpcomingCapsuleService upcomingCapsule;
    private OrbittingSunTeslaService teslaRoadster;
    private HistoricalMileStoneService historicalMileStone;


    public PastCapsuleService selectPastCapsulesService(){
        pastCapsules = new PastCapsuleService();
        return pastCapsules;
    }

    public SingleCapsuleService selectSingleCapsuleService(String capsuleCode){
        singleCapsule = new SingleCapsuleService(capsuleCode);
        return singleCapsule;
    }

    public SpacexCompanyInfoService selectSpacexCompanyInfoService(){
        information = new SpacexCompanyInfoService();
        return information;
    }

    public UpcomingCapsuleService selectUpcomingCapsulesService(){
        upcomingCapsule = new UpcomingCapsuleService();
        return upcomingCapsule;
    }

    public OrbittingSunTeslaService selectOrbittingSunTeslaService(){
        teslaRoadster = new OrbittingSunTeslaService();
        return teslaRoadster;
    }

    public HistoricalMileStoneService selectHistoricalMileStoneService(){
        historicalMileStone = new HistoricalMileStoneService();
        return historicalMileStone;
    }

}
