package com.patika.tutorial;


import lombok.*;

@Data //getter + setter + hashcode + toString
@NoArgsConstructor // Parametresiz constructor
@AllArgsConstructor // Parametreli constructor
@Builder
public class LombokTutorials {

    private String adi;

    private String soyadi;

    private String numarasi;

    @Override
    public String toString() {
        return "LombokTutorials{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", numarasi='" + numarasi + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LombokTutorials lombokTutorials=LombokTutorials.builder().adi("Mustafa").soyadi("Bulu").numarasi("15124123").build();
        System.out.println(lombokTutorials);

    }
}
