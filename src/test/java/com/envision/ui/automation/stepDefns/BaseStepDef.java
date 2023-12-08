package com.envision.ui.automation.stepDefns;

import com.envision.ui.automation.configuration.BrowserFactory;

public class BaseStepDef {

    public final BrowserFactory browserFactory;

    public BaseStepDef(BrowserFactory browserFactoryObject){
        this.browserFactory = browserFactoryObject;

    }

}
