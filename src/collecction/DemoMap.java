package collecction;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String,String> list = new HashMap<>();
        list.put("SV1","Nguyen Van A");
        list.put("SV2","Nguyen Van B");
        for (Map.Entry<String,String> entry : list.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Nguyen Van A");
        map.put(2,"Nguyen Van C");
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
