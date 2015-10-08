package kata2;

import java.util.HashMap;

public class Histogram {
    private final int[] array;

    public Histogram(int[] vector) {
        this.array = vector;
    }    
    
    public int[] getVector() {
        return this.array;
    }
    
    public HashMap<Integer,Integer> getHistogram() {
        HashMap<Integer,Integer> map = new HashMap();
        
         for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) 
               map.put(array[i], 0);
            map.put(array[i], map.get(array[i])+1);
        }
         
         return map;
    }

    @Override
    public String toString() {
        String result = "";
        HashMap<Integer, Integer> map = getHistogram();
        for (Integer key : map.keySet()) {
            result += key + ": " + map.get(key) +
                    ((map.get(key) != 1) ? " veces" : " vez") + "\n";
        }
        return result.substring(0, result.length()-1);
    }
}
