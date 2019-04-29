package com.sparta.spacexapi.historicalmilestonetests;

import com.sparta.spacexapi.SpacexService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HistoricalMileStoneTester {

    private static SpacexService historicalMileStone;

    @BeforeClass
    public static void createService(){
        historicalMileStone = new SpacexService();
    }

    @Test
    public void isId(){
        Assert.assertEquals(historicalMileStone.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(5).getId(),5);
    }

    @Test
    public void isTitle(){
        Assert.assertEquals(historicalMileStone.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(5).getTitle(),"Dragon Returns From Earth Orbit");
    }

    @Test
    public void isEventDateUtc(){
        Assert.assertEquals(historicalMileStone.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(5).getEvent_date_utc(),"2010-12-08T15:43:00Z");
    }

    @Test
    public void isEventDateUnix(){
        Assert.assertEquals(historicalMileStone.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(5).getEvent_date_unix(),1291822980);
    }

    @Test
    public void isFlightNumber(){
        Assert.assertEquals(historicalMileStone.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(5).getFlight_number(),7);
    }

    @Test
    public void isDetails(){
        Assert.assertEquals(historicalMileStone.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(5).getDetails(),"On December 8, 2010, Dragon became the first privately developed spacecraft in history to re-enter from low-Earth orbit.");
    }

    @Test
    public void isLinksReddit(){
        Assert.assertNull(historicalMileStone.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(5).getLinks().get("reddit"));
    }

    @Test
    public void isLinksArticle(){
        Assert.assertEquals(historicalMileStone.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(5).getLinks().get("article"),"http://www.cnn.com/2010/US/12/08/space.flight/index.html");
    }

    @Test
    public void isLinksWiki(){
        Assert.assertEquals(historicalMileStone.selectHistoricalMileStoneService().getDeserialiser().getHistoricalMileStonesDTO().get(5).getLinks().get("wikipedia"),"https://en.wikipedia.org/wiki/SpaceX_COTS_Demo_Flight_1");
    }
}
