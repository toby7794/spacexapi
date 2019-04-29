package com.sparta.spacexapi.capsuletests;

import com.sparta.spacexapi.SpacexService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class UpcomingCapsuleTester {

    private static SpacexService upcomingCapsule;

    @BeforeClass
    public static void createService(){
        upcomingCapsule = new SpacexService();
    }

    @Test
    public void isLength(){
        Assert.assertEquals(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getSpacexUpcomingCapsuleDTO().length, 4);
    }

    @Test
    public void isCapsuleSerial() {
        Assert.assertEquals(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getCapsule_serial(), "C204");
    }

    @Test
    public void isCapsuleId() {
        Assert.assertEquals(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getCapsule_id(), "dragon2");
    }

    @Test
    public void isStatus() {
        Assert.assertEquals(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getStatus(), "active");
    }

    @Test
    public void isOriginalLaunch() {
        Assert.assertNull(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getOriginal_launch());
    }

    @Test
    public void isOriginalLaunchUnix() {
        Assert.assertEquals(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getOriginal_launch_unix(),0);
    }

    @Test
    public void isMissions() {
        Assert.assertEquals((upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getMissions()), new ArrayList<>());
    }

    @Test
    public void isLandings() {
        Assert.assertEquals(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getLandings(), 0);
    }

    @Test
    public void isType() {
        Assert.assertEquals(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getType(), "Dragon 2.0");
    }

    @Test
    public void isDetails() {
        Assert.assertEquals(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getDetails(), "Currently in construction for use in DM-2");
    }

    @Test
    public void isReuseCount() {
        Assert.assertEquals(upcomingCapsule.selectUpcomingCapsulesService().getDeserialiser().getUpcomingCapsuleDTO().get("C204").getReuse_count(), 0);
    }
}
