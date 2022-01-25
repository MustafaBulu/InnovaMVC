package com.patika.tutorial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
//import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Data //getter + setter + hashcode + toString
@AllArgsConstructor // Parametreli constructor
@Builder
@Log4j2

public class Log4j2Tutorials {

        private String adi;
        private String soyadi;
        private String numarasi;

    public Log4j2Tutorials() {
        this.adi="Please enter your name";
        this.soyadi="Please enter your surname";
        this.numarasi="Please enter your number";

    }

    public static void main(String[] args) {

        Log4j2Tutorials tutorials=new Log4j2Tutorials();
        System.out.println(tutorials);

        if (tutorials.getAdi().equals("Please enter your name")){

            log.error("Name is required");

        }else{
            log.info("Information entered ");

        }






    }
}
