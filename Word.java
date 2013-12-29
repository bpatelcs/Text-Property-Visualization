
import java.util.Comparator;

public class Word {
    Integer count;
    String str;
   public static final Comparator<Word>SORT_BY_COUNT= new SortByCount();
    public Word(String s,Integer n){
        count=n;
        str=s;
    }        
    
    
    public static class SortByCount implements Comparator<Word> {              
        public int compare(Word o1, Word o2) {
            return o1.count.compareTo(o2.count);
        }             
    }       
}
