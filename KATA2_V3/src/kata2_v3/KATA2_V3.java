package kata2_v3;

import java.util.Iterator;
import java.util.Map;

public class KATA2_V3 {

    public static void main(String[] args) {
        
        int [] data = {1, 2, 9, 8, 6, 3, 7, 1, 8, 1, 2, 7, 8, 6, 7};
        
        Histogram meta_histogram = new Histogram(data);
        
        Map<Integer, Integer> histogram =  meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        } 
    }
    
}
