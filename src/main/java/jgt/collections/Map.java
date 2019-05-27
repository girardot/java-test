package jgt.collections;

import java.util.HashMap;
import java.util.Hashtable;

public class Map {

    public static void main(String[] args) {

        System.out.println("HASHTABLE");

        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("toto", "toto1");
        try {
            hashtable.put("titi", null);
        } catch (NullPointerException npe) {
            System.out.println(" !!! cannot hashtable.put(\"titi\", null);");
        }
        try {
            hashtable.put(null, "titi");
        } catch (NullPointerException npe) {
            System.out.println(" !!! cannot hashtable.put(null, \"titi\");");
        }

        System.out.println(hashtable);

        System.out.println("HASHMAP");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("toto", "toto1");
        hashMap.put("titi", null);
        hashMap.put(null, "titi");
        System.out.println(hashMap);
    }
}
