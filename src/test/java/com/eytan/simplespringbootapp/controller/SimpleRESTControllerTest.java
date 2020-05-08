package com.eytan.simplespringbootapp.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SimpleRESTControllerTest {

    private SimpleRESTController simpleRESTController;

    @Before
    public void beforeAll() {
        simpleRESTController = new SimpleRESTController();
    }

    @Test
    public void testIndex() {
        org.junit.Assert.assertEquals(simpleRESTController.index(), "Hello World");
    }

}
