package com.elliot.facade.system;

class HelpSubsystemOne {

    public HelpSubsystemOne() {
        System.out.println("Call Constructor : " + getClass().getSimpleName());
    }

    public void process(){
        System.out.println("Call Process : " + getClass().getSimpleName());

    }


}
