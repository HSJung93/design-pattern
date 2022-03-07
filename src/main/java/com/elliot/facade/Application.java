package com.elliot.facade;

import com.elliot.facade.system.Facade;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Facade facade = new Facade();
        facade.process();
    }
}
