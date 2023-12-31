import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

import static java.util.Objects.hash;

public class lb3 {
    private int size;
    private LinkedList<Map.Entry<String, Integer>>[] table;
    private double V;
   /* public void put(String key, Integer value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<Map.Entry<String, Integer>>();
        }
        for (Map.Entry<String, Integer> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Map.Entry<String, Integer>(key, value));
        size++;
    }*/
}
