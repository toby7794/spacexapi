package com.sparta.spacexapi;

import com.sparta.spacexapi.service.SingleCapsuleService;
import com.sparta.spacexapi.service.SpacexCompanyInfoService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpacexCompanyInfoTester {

    private static SpacexCompanyInfoService information;


    @BeforeClass
    public static void createSpacexCompanyInfoService(){
        information = new SpacexCompanyInfoService();
    }

    @Test
    public void isName(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getName(), "SpaceX");
    }

    @Test
    public void isFounder(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getFounder(), "Elon Musk");
    }

    @Test
    public void isFounded(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getFounded(), 2002);
    }

    @Test
    public void isEmployees(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getEmployees(), 7000);
    }

    @Test
    public void isVehicles(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getVehicles(), 3);
    }

    @Test
    public void isLaunchSite(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getLaunch_sites(), 3);
    }

    @Test
    public void isTestSites(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getTest_sites(), 1);
    }

    @Test
    public void isCEO(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getCeo(), "Elon Musk");
    }

    @Test
    public void isCTO(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getCto(), "Elon Musk");
    }

    @Test
    public void isCOO(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getCoo(), "Gwynne Shotwell");
    }

    @Test
    public void isCTOPropulsion(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getCto_propulsion(), "Tom Mueller");
    }

    @Test
    public void isHeadquartersAddress(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getHeadquarters().get("address"), "Rocket Road");
    }

    @Test
    public void isHeadquartersCity(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getHeadquarters().get("city"), "Hawthorne");
    }

    @Test
    public void isHeadquartersState(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getHeadquarters().get("state"), "California");
    }

    @Test
    public void isLinksWebsite(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getLinks().get("website"), "https://www.spacex.com/");
    }

    @Test
    public void isLinksFlickr(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getLinks().get("flickr"), "https://www.flickr.com/photos/spacex/");
    }

    @Test
    public void isLinksTwitter(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getLinks().get("twitter"), "https://twitter.com/SpaceX");
    }

    @Test
    public void isLinksElonTwitter(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getLinks().get("elon_twitter"), "https://twitter.com/elonmusk");
    }

    @Test
    public void isSummary(){
        Assert.assertEquals(information.getDeserialiser().getSpacexInfoDTO().getSummary(), "SpaceX designs, manufactures and launches advanced rockets and spacecraft. The company was founded in 2002 to revolutionize space technology, with the ultimate goal of enabling people to live on other planets.");
    }
}
