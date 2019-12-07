package javautils.wangyonglin.element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {
    public String key;
    public String value;
    private static List<Map<String,String>> tokens = new ArrayList<Map<String, String>>();

    public Collection(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public static void put(String key,String secret){
        Map map = new HashMap();
        map.put("key",key);
        map.put("value",secret);
        tokens.add(map);
    }
    public static Collection get(String key){
        for(int i=0;i<tokens.size();i++){
            if(tokens.get(i).get("key") == key) {
                return new Collection(tokens.get(i).get("key"),tokens.get(i).get("value"));
            }
        }
        return new Collection("","");
    }

}
