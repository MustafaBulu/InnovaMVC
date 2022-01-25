package com.patika.software.prensible.assosication;


import lombok.extern.log4j.Log4j2;

@Log4j2

public class AssosicationMainTest {

    public static void main(String[] args) {
        Customer customer= Customer.builder().customerName("Mustafa").customerCity("Bulu").build();

        SuperMarket superMarket=SuperMarket.builder().superMarketName("xskfsjafm").superMarketCity("Kayseri").build();
        //loose Coupling(Assosication example)
        log.info("Customer name: "+ customer.getCustomerName()+ "  " +   "Supermarket name: "+superMarket.getSuperMarketName());
    }
}
