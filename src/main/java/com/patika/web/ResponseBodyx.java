package com.patika.web;

import com.patika.model.Student;
import com.patika.model.WriterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class ResponseBodyx {

    //http://localhost:3333/birinci
    @GetMapping("/birinci")
    @ResponseBody // bunu yazmazsak return kısmındaki sayfayı döndürmeye çalışır
    public String birinciMethod(){
        return "Yükleniyor...";
    }

    //http://localhost:3333/ikinci
    @GetMapping("/ikinci")
    public String ikinciMethod(){
        return "index";
    }

    //http://localhost:3333/ucuncu
    @GetMapping("/ucuncu")
    public String ucuncuMethod(){
        return "other/deneme";
    }


    //http://localhost:3333/dorduncu
    @GetMapping("/dorduncu")
    public String dorduncuMethod(Model model){
        model.addAttribute("param_key","Bu data Spring model ile geldi");
        return "param";
        //buradaki param_key param.jsp nin içinde ${param_key}
        //bir sayfaya data göndermek istiyorsak model bileşenini kullanırız.
    }



    ////////////////Path Variable/////////////////////////



    //http://localhost:3333/besinci/44
    @GetMapping("/besinci/{param1}")
    public String besinciMethod(Model model, @PathVariable(name = "param1") int sayi){
        model.addAttribute("param_key","merhaba"+sayi);   //namedeki bileşen ile yukarıdaki aynı olmak zorunda
        return "pathvariable";
        //besinci method //http://localhost:3333/besinci bunun için çalışmıyor 6. da bunun için önlem alacağız.
    }


    //http://localhost:3333/altinci/44
    //http://localhost:3333/altinci
    @GetMapping({"/altinci/{param1}", "/altinci"})
    // /altinci da ekliyoruz ve required kısmını false yapıyoruz required default olarak truedur.
    public String altinciMethod(Model model, @PathVariable(name = "param1",required = false) Integer sayi){
        // tip olarak wrapper kullanmamız lazım int yerine Integer yazdık o yüzden
        model.addAttribute("param_key","data: "+sayi);
        return "pathvariable";

    }

    //6. methodda //http://localhost:3333/altinci linkine gidince null yazıyor bunu çözmek için 7. methodu yazıyoruz.

    //http://localhost:3333/yedinci/44
    //http://localhost:3333/yedinci
    @GetMapping({"/yedinci/{param1}", "/yedinci"})
    // /altinci da ekliyoruz ve required kısmını false yapıyoruz required default olarak truedur.
    public String yedinciMethod(Model model, @PathVariable(name = "param1",required = false) Integer sayi){
        // tip olarak wrapper kullanmamız lazım int yerine Integer yazdık o yüzden
        if(sayi!=null){
            model.addAttribute("param_key","data: "+sayi);
        }else{
            model.addAttribute("param_key","data: ");
        }

        return "pathvariable";

    }



    ////////////////////////////RequestParam/////////////////////////



    //http://localhost:3333/sekinci?query=44
    @GetMapping("/sekinci")
    public String sekinciMethod(Model model, @RequestParam(name = "query") Integer sayi) {
        model.addAttribute("param_key", "Data ID: " + sayi);
        return "pathvariable";
    }



    //http://localhost:3333/dokuncu
    //http://localhost:3333/dokuncu?query=44
    //default value ile http://localhost:3333/dokuncu kinkindeki dönen değeri default=0 olarak ayarladık.
    @GetMapping("/dokuncu")
    public String dokuzuncuMethod(Model model, @RequestParam(name = "query", required = false, defaultValue = "0") Long sayi) {
        model.addAttribute("param_key", "Data ID: " + sayi);
        return "pathvariable";
    }


    //http://localhost:3333/onuncu
    //http://localhost:3333/onuncu?adi=Mustafa&soyadi=Bulu
    @GetMapping("/onuncu")
    public String onuncuMethod(
            Model model,
            @RequestParam(name = "adi", required = false, defaultValue = "adınızı girmediniz") String adi,
            @RequestParam(name = "soyadi", required = false, defaultValue = "soyadınızı girmediniz") String soyadi
    ) {

        model.addAttribute("param_key", "Data ID: " + adi + " " + soyadi);
        return "pathvariable";
    }



    //http://localhost:3333/onbirinci
    // modelde oluşturduğumuz student class ı ile birleştirdik. Obeje ile çalışmaya başladık.
    @GetMapping("/onbirinci")
    public String onbirinciMethod(Model model) {
        Student student = Student.builder().studentname("adını girmediniz...").studentsurname("soyadınız girmediniz...")  .build();
        model.addAttribute("param_key", "Data ID: " + student);
        return "pathvariable";
    }




    /////////////////////////////////////// FORM //////////////////////////////////////////////////////////////////////////


    // http://localhost:3333/onikinci
    @GetMapping("/onikinci")
    public String getWriter(Model model) {
        //Database select
        WriterDto writerDto = WriterDto.builder().writerName("adınızı girmediniz").writerSurname("Soyadınızı girmediniz").writerAddress("address girmediniz").writerTelephoneNumber(11122233).build();
        model.addAttribute("form_key", writerDto);
        return "form";
    }







}
