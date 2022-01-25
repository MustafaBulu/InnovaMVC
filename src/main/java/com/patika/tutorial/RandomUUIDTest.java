package com.patika.tutorial;

import java.util.UUID;

public class RandomUUIDTest {


    public static void main(String[] args) {
        //32 karakterli şirleme lazım
        UUID uuid= UUID.randomUUID();
        System.out.println(uuid);
    }
}
