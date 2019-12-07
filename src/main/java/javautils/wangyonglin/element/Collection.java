package javautils.wangyonglin.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionUtil {
    public String key;
    public String value;
    private static List<Map<String,String>> tokens = new ArrayList<Map<String, String>>();

    public CollectionUtil(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public static void add(String key,String secret){
        Map map = new HashMap();
        map.put("key",key);
        map.put("value",secret);
        tokens.add(map);
    }
    public static CollectionUtil get(String key){
        for(int i=0;i<tokens.size();i++){
            if(tokens.get(i).get("key") == key) {
                return new CollectionUtil(tokens.get(i).get("key"),tokens.get(i).get("value"));
            }
        }
        return null;
    }

}
