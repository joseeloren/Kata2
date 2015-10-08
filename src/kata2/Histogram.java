package kata2;

import java.util.HashMap;
import java.util.Set;

public class Histogram <T>{
    private final HashMap<T,Integer> map  = new HashMap<>();

    public Histogram() {
    }
    
    public void incrementKeyValue(T object) {
         map.put(object, map.containsKey(object) ? map.get(object)+1 : 1);
    } 
    
    
    @Override
    public String toString() {
        String result = "";
        for (T key : map.keySet()) {
            result += key + ": " + map.get(key) +
                    ((map.get(key) != 1) ? " veces" : " vez") + "\n";
        }
        return result.substring(0, result.length()-1);
    }
}
