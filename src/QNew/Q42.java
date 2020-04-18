/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QNew;

import java.awt.Label;
import java.awt.TextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author lenovo
 */
public class Q42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
   
    
     
        File text = new File("D:\\sameer.txt");
        Scanner scnr = new Scanner(text);
        Map<String,Integer> frequansy=new HashMap<>();
        Map<Character,Integer> frequansy1=new HashMap<>();
        char[] letter={};
         System.out.println();
         
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            if(!line.trim().equals("")){
              String[]word=line.split(" ");
              
              for(String words : word){
                  if(word==null||line.trim().equals(""))
                      continue;
                  String proc=words.toLowerCase();
                      letter=proc.toCharArray();
                  if(frequansy.containsKey(proc)){
                      frequansy.put(proc, frequansy.get(proc)+1);
                  }else{
                      frequansy.put(proc, 1);
                  }
                 for(char c: letter){
            if(frequansy1.containsKey(c)){
                      frequansy1.put(c, frequansy1.get(c)+1);
                  }else{
                      frequansy1.put(c, 1);
                  } 
        }
              }
            }
            System.out.println( line);
        } 
        
        System.out.println();
        System.out.println(frequansy);
        System.out.println(frequansy1);
        
      
        
    }
    
}