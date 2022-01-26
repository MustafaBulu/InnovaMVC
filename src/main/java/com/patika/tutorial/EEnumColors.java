package com.patika.tutorial;

import lombok.Getter;
import lombok.Setter;

//type safe
public enum EEnumColors {
    BLUE,GREEN,ORANGE
}

enum Colors2{
    BLUE(1,"blue"),GREEN(2,"green"),ORANGE(3,"orange");

    @Getter
    private final int colorid;
    @Getter
    private final String colorName;

    private Colors2(int colorid, String colorName){
        this.colorid=colorid;
        this.colorName=colorName;


    }
}


class Main{
    public static void main(String[] args) {
        EEnumColors colors=EEnumColors.BLUE;
        System.out.println(colors);

        String color2=EEnumColors.BLUE.toString();
        System.out.println(color2.toLowerCase());
        System.out.println("------------------------------");

        String  cons=Colors2.BLUE.getColorName();
        System.out.println(cons);


    }

}