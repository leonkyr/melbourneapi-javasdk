package com.lkyrpychenko.melbourneapi.sdk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MelbourneAPITest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetString() throws Exception {
        IMelbourneAPI api = MelbourneAPI.getInstance();
        payResponse response = api.pay(new payRequest());
        Assert.assertEquals(0, response.getAuthCode());
    }
}
