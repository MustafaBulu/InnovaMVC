package com.patika.designpattern.creation.abstractfactory;

public class MsiAbstractFactory implements  IBilgisayarFabrikasi {
    @Override
    public IBilgisayar getBilgisayar(String computerName) {
        return new Msi("msi");
    }
}
