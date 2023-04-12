package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    HashMap<String, String> hmap = new HashMap<>();
    public void addHashmapValue() {
        hmap.put("IE", "Internet Explorer");
        hmap.put("CB", "Chrome Browser");
        hmap.put("FF", "Mozilla Firefox");
        hmap.put("SB", "Safari Browser");

//        System.out.println("Browser name of CB: " + hmap.get("CB"));

        for (Map.Entry me : hmap.entrySet()) {
            System.out.println("Key = " + me.getKey()+ ", Value =" + me.getValue());
        }
        System.out.println("Size of the map: " + hmap.size());
        System.out.println();

        System.out.println("Content of the map: " + hmap);

        if (hmap.containsKey("FF")) {
            String val = hmap.get("FF");
            System.out.println("Value for FF: "+ val);
        }
    }


}
