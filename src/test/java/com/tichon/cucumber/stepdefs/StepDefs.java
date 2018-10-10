package com.tichon.cucumber.stepdefs;

import com.tichon.TichonApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TichonApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
