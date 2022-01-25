package com.patika.software.prensible.assosication;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@Log4j2
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SuperMarket {
    private String superMarketName;
    private String superMarketCity;

}
