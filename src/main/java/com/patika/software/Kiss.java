package com.patika.software;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

@Log4j2

//Keep It Simple Stupid: Keep everything simple as possible
public class Kiss {
    private static String path="E:\\patika.txt";

    //File Writer
    public void utilWriter(){
        //try with resources

        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(path,true))){
            String value= JOptionPane.showInputDialog("please enter something");
        bufferedWriter.write(value);
        bufferedWriter.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //File Reader

    public void utilReader(){

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(path))){
            String numberRow="", sumRow="";
            while ((numberRow = bufferedReader.readLine()) !=null){
                sumRow+=numberRow;

            }
            log.info(sumRow);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Kiss kiss= new Kiss();
        //kiss.utilWriter();
        kiss.utilReader();

    }



}
