
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;


public class HeapsLaw {
 private static  Hashtable<String, Integer> h=new Hashtable<String, Integer>();
    public static void main(String args[]) throws IOException
     {    
         Scanner s=new Scanner (new BufferedReader(new FileReader(new File("large.txt"))));
         String regex = "[\\W\\d\\s]";
         String replace="";
        
        StdDraw.setXscale(0,1000);
        StdDraw.setYscale(0,1000);  
        StdDraw.setPenRadius(.01);
        StdDraw.setPenColor(StdDraw.BLUE);
        int v=0;
        int n=0;
         while(s.hasNext()){             
             String str=s.next();             
             str=str.toLowerCase();
             str=str.replaceAll(regex, replace);                         
             if(h.get(str)!=null) h.put(str,h.get(str)+1);                                       
             else {
                 h.put(str,1);
                 v++; 
             }             
             n++;             
              StdDraw.point(n/1000,v/100);             
         }                                                                                                               
     }            
}
