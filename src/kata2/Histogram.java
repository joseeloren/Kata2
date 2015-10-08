package kata2;

import java.util.HashMap;
import java.util.Set;

public class Histogram <T>{
    private final HashMap<T,Integer> map;

    public Histogram(HashMap<T, Integer> map) {
        this.map = map;
    }

    public Integer get(Object key) {
        return map.get(key);
    }

    public Set<T> keySet() {
        return map.keySet();
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
