package com.thonysupersonic.redditclient.view.utilities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anthony on 9/11/18.
 */
public class FunctionsTest {
    @Test
    public void convertUTCTime() throws Exception {
        int uptimeMils = 1536498497 ;
        String tiempoTranscurrido = Functions.convertUTCTime(uptimeMils);
//        assertEquals("8 hours ago", tiempoTranscurrido);
        Assert.assertEquals("Hace 5 horas", tiempoTranscurrido);
    }

}