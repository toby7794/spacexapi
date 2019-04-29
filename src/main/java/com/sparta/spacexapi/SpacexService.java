package com.sparta.spacexapi;

import com.sparta.spacexapi.services.*;

public class SpacexService {

    PastCapsuleService pastCapsules;
    SingleCapsuleService singleCapsule;
    SpacexCompanyInfoService information;
    UpcomingCapsuleService upcomingCapsule;
    OrbittingSunTeslaService teslaRoadster;


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

}
