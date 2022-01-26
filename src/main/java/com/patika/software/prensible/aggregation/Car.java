package com.patika.software.prensible.aggregation;
// The engine is not dependent to the car. But car is dependent to the car.

import lombok.*;
import lombok.extern.log4j.Log4j2;


@Log4j2

public class Car {
    @Getter @Setter
    private Engine engine;


    public double getTotalPrice(){
        Engine engine=new Engine();
        double total=engine.getEnginePrice()+2000;
        return total;

    }
}
