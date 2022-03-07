package com.elliot.facade.system;

public class Facade {

    private HelpSubsystemOne helpSubsystemOne;
    private HelpSubsystemTwo helpSubsystemTwo;
    private HelpSubsystemThree helpSubsystemThree;

    public Facade(){
        helpSubsystemOne = new HelpSubsystemOne();
        helpSubsystemTwo = new HelpSubsystemTwo();
        helpSubsystemThree = new HelpSubsystemThree();
    }

    public void process() {
        helpSubsystemOne.process();
        helpSubsystemTwo.process();
        helpSubsystemThree.process();
    }
}
