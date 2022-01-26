package com.patika.software;

import lombok.extern.log4j.Log4j2;

import java.util.Locale;

@Log4j2
public class MonadTutorials {
    //1.method
    public static String getValue(String data){
        return data;
    }


    //2.method
    public static String getResult(String data){
        return data.toUpperCase();
    }
    // if the output of a method is the input of another method, it's named monad.
    public static void main(String[] args) {
        String monad= getResult(getValue("Ankara"));
        log.info(monad);

    }


}
