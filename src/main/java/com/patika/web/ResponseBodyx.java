package com.patika.web;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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






}
