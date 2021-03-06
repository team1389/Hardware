package com.team1389.hardware;

import example.Example;
import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;

public class HardwareModule extends IterativeModule {

    public static Logger logger;

    @Override
    public String getModuleName() {
        return "Hardware";
    }

    @Override
    public String getModuleVersion() {
        return "0.0.1";
    }

    @Override
    public void robotInit() {
        logger = new Logger("Hardware", Logger.ATTR_DEFAULT);
        
        System.out.println("robot initialized");
        
        Example.example();
    }
    
    @Override
    public void teleopInit() {
    	System.out.println("dfasdafsd");
    }
}
