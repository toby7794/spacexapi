package com.sparta.spacexapi;

import com.sparta.spacexapi.service.SingleCapsuleService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingleCapsuleTester {

    private static SingleCapsuleService single;


    @BeforeClass
    public static void createSingleCapsuleService(){
    single = new SingleCapsuleService("C101");
    }

    @Test
    public void isCapsuleSerial() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getCapsule_serial(), "C101");
    }

    @Test
    public void isCapsuleId() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getCapsule_id(), "dragon1");
    }

    @Test
    public void isStatus() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getStatus(), "retired");
    }

    @Test
    public void isOriginalLaunch() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getOriginal_launch(), "2010-12-08T15:43:00.000Z");
    }

    @Test
    public void isOriginalLaunchUnix() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getOriginal_launch_unix(), 1291822980);
    }

    @Test
    public void isMissionsName() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getMissions().get(0).get("name"), "COTS 1");
    }

    @Test
    public void isMissionsFlight() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getMissions().get(0).get("flight"), 7);
    }

    @Test
    public void isLandings() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getLandings(), 0);
    }

    @Test
    public void isType() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getType(), "Dragon 1.0");
    }

    @Test
    public void isDetails() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getDetails(), "Reentered after three weeks in orbit");
    }

    @Test
    public void isReuseCount() {
        Assert.assertEquals(single.getDeserialiser().getSpacexCapsuleDTO().getReuse_count(), 0);
    }
}
