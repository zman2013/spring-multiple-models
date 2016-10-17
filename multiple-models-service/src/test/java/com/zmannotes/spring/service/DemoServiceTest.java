package com.zmannotes.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/test/test.xml")
public class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void encrypt(){
        String data = "ABCD";
        String result = demoService.encrypt(data);
        assertEquals("abcd", result);
    }

}
