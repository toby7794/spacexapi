package com.sparta.spacexapi;

import com.sparta.spacexapi.service.PastCapsuleService;
import com.sparta.spacexapi.service.SingleCapsuleService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PastCapsuleTester {

    private static PastCapsuleService pastSingle;

    @BeforeClass
    public static void createSingleCapsuleService(){
        pastSingle = new PastCapsuleService();
    }

    @Test
    public void isLength(){
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO().length, 14);
    }

    @Test
    public void isCapsuleSerial() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getCapsule_serial(), "C106");
    }

    @Test
    public void isCapsuleId() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getCapsule_id(), "dragon1");
    }

    @Test
    public void isStatus() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getStatus(), "active");
    }

    @Test
    public void isOriginalLaunch() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getOriginal_launch(), "2014-09-21T05:52:00.000Z");
    }

    @Test
    public void isOriginalLaunchUnix() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getOriginal_launch_unix(), 1411278720);
    }

    @Test
    public void isFirstMissionsName() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getMissions().get(0).get("name"), "CRS-4");
    }

    @Test
    public void isFirstMissionsFlight() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getMissions().get(0).get("flight"), 18);
    }

    @Test
    public void isSecondMissionsName() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getMissions().get(1).get("name"), "CRS-11");
    }

    @Test
    public void isSecondMissionsFlight() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getMissions().get(1).get("flight"), 41);
    }

    @Test
    public void isLandings() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getLandings(), 2);
    }

    @Test
    public void isType() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getType(), "Dragon 1.1");
    }

    @Test
    public void isDetails() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getDetails(), "First Dragon capsule to be reused");
    }

    @Test
    public void isReuseCount() {
        Assert.assertEquals(pastSingle.getDeserialiser().getSpacexPastCapsuleDTO()[5].getReuse_count(), 1);
    }
}
