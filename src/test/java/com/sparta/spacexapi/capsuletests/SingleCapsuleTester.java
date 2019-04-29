package com.sparta.spacexapi.capsuletests;

import com.sparta.spacexapi.SpacexService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingleCapsuleTester {

    private static SpacexService singleCapsule;

    @BeforeClass
    public static void createService(){
        singleCapsule = new SpacexService();
    }

    @Test
    public void isCapsuleSerial() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getCapsule_serial(), "C101");
    }

    @Test
    public void isCapsuleId() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getCapsule_id(), "dragon1");
    }

    @Test
    public void isStatus() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getStatus(), "retired");
    }

    @Test
    public void isOriginalLaunch() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getOriginal_launch(), "2010-12-08T15:43:00.000Z");
    }

    @Test
    public void isOriginalLaunchUnix() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getOriginal_launch_unix(), 1291822980);
    }

    @Test
    public void isMissionsName() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getMissions().get(0).get("name"), "COTS 1");
    }

    @Test
    public void isMissionsFlight() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getMissions().get(0).get("flight"), 7);
    }

    @Test
    public void isLandings() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getLandings(), 0);
    }

    @Test
    public void isType() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getType(), "Dragon 1.0");
    }

    @Test
    public void isDetails() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getDetails(), "Reentered after three weeks in orbit");
    }

    @Test
    public void isReuseCount() {
        Assert.assertEquals(singleCapsule.selectSingleCapsuleService("C101").getDeserialiser().getSpacexCapsuleDTO().getReuse_count(), 0);
    }
}
