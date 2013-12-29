
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;


public class ZipfLaw {
   private static  Hashtable<String, Integer> h=new Hashtable<String, Integer>();
    public static void main(String args[]) throws IOException
     {  
         Scanner s=new Scanner (new BufferedReader(new FileReader(new File("large.txt"))));
         String regex = "[\\W\\d\\s]";
         String replace="";
         while(s.hasNext()){
             String str=s.next();
             str=str.toLowerCase();
             str=str.replaceAll(regex, replace);
             if(h.get(str)!=null) h.put(str,h.get(str)+1);
             else h.put(str,1);             
         }         
         Iterator<String> i= (Iterator<String>) h.keys();
         Word[] words= new Word[h.size()];
         int k=0;

         while(i.hasNext()){             
             String key=i.next();
             Integer val=h.get(key);
             if(val==null) continue;
             words[k++]=new Word(key,val);             
         }
         
        Arrays.sort(words,Word.SORT_BY_COUNT);
        StdDraw.setXscale(0,Math.log(words.length)/2.3);
        StdDraw.setYscale(0,Math.log(words[words.length-1].count)/2.3);  
        StdDraw.setPenColor(Color.red);
        StdDraw.setPenRadius(.01); 
        StdDraw.setPenColor(Color.red);
            for(k=words.length-1;k>=0;k--){
                System.out.println(words[k].str+" "+words[k].count);
                StdDraw.point(Math.log10((words.length-1)-k),Math.log10(words[k].count));
             
     }
            
            

            
            
         
         
     }    
}
