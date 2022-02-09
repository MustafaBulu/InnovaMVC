package com.patika.designpattern.creation.abstractfactory;

public class FactoryMainTest {

    public static void main(String[] args) {

        //abstract factory factorydeki open closed yapısına uyacak şekilde yeniden yapılandırılmıştır.
        MsiAbstractFactory msiAbstractFactory=new MsiAbstractFactory();
        IBilgisayar iBilgisayar1=msiAbstractFactory.getBilgisayar("msi");
        System.out.println(iBilgisayar1);


    }
}
