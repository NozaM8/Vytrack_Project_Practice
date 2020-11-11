package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("::: Starting Automation :::");
    }

    @After
    public void tearDown(){
        System.out.println("::: End of Test Execution :::");
    }


}
