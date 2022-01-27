package com.patika.tutorial;

public class StringBuilderTuto {

    public static void main(String[] args) {
        //1.YOL
        String adi="Mustafa";
        String soyadi="Bulu";
        System.out.println(adi+" "+soyadi);

        //2.YOL
        String result="Mustafa".concat(" Bulu");
        System.out.println(result);

        //3.YOL //Servis,Database, karşı taraftan ne geleceğini bilmiyorsam
        // Asenkron
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("").append("Mustafa").append(" Bulu").append("");
        String result2=stringBuilder.toString();
        System.out.println(result2);


        //4.YOL güvenli
        // Senkron
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("").append("Mustafa").append(" Bulu").append("");
        String result3=stringBuilder.toString();
        System.out.println(result3);
    }
}
