package Q3.a2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        
          
            Random num =new  Random();
        LinkedList<Integer> obj=new LinkedList<>();
        for(int i=1;i<=30;i++){
            int Rnum=0+(int)(Math.random()*100);
            obj.add(Rnum);
        }
        Collections.sort(obj,new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                return t.compareTo(t1);
            } 
        });
        int  sum=0;
        System.out.println("Element in linked List :");
        for(int i=0 ;i<obj.size();i++){
            sum=sum+obj.get(i);
            System.out.println(obj.get(i));
        }
        
      double avg=sum/(obj.size());
      
    System.out.print("Sum Of Number "+sum);
    System.out.print("Avg Of Number "+avg);
    }
    

}
    

 
