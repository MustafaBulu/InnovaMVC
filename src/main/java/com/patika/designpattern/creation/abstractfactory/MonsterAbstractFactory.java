package com.patika.designpattern.creation.abstractfactory;

public class MonsterAbstractFactory implements  IBilgisayarFabrikasi {
    @Override
    public IBilgisayar getBilgisayar(String computerName) {

        return new Monster("monster");
    }
}
