package com.sparta.spacexapi;

import com.sparta.spacexapi.service.UpcomingCapsuleService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class UpcomingCapsuleTester {

    private static UpcomingCapsuleService upcomingSingle;

    @BeforeClass
    public static void createUpcomingCapsuleService(){
        upcomingSingle = new UpcomingCapsuleService();
    }

    @Test
    public void isLength(){
        Assert.assertEquals(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO().length, 4);
    }

    @Test
    public void isCapsuleSerial() {
        Assert.assertEquals(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getCapsule_serial(), "C204");
    }

    @Test
    public void isCapsuleId() {
        Assert.assertEquals(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getCapsule_id(), "dragon2");
    }

    @Test
    public void isStatus() {
        Assert.assertEquals(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getStatus(), "active");
    }

    @Test
    public void isOriginalLaunch() {
        Assert.assertNull(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getOriginal_launch());
    }

    @Test
    public void isOriginalLaunchUnix() {
        Assert.assertEquals(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getOriginal_launch_unix(),0);
    }

    @Test
    public void isMissions() {
        Assert.assertEquals((upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getMissions()), new ArrayList<>());
    }

    @Test
    public void isLandings() {
        Assert.assertEquals(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getLandings(), 0);
    }

    @Test
    public void isType() {
        Assert.assertEquals(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getType(), "Dragon 2.0");
    }

    @Test
    public void isDetails() {
        Assert.assertEquals(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getDetails(), "Currently in construction for use in DM-2");
    }

    @Test
    public void isReuseCount() {
        Assert.assertEquals(upcomingSingle.getDeserialiser().getSpacexUpcomingCapsuleDTO()[2].getReuse_count(), 0);
    }
}
