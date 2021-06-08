package Fundamental;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class knowledge {

    public void math(){
        // math
        Math.max(13,10);
        Math.min(14,10);

        Math.round(4.46); // 4
        Math.round(4.5); // 5

        Math.pow(3,4); // 3^4

        Math.sqrt(4);
    }

    public void collection(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        map.get("A");
        map.remove("B");

        // 获取key
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();

        }
        // entryset
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, Integer> entry = entries.next();
            String key = entry.getKey();
            int value = entry.getValue();
        }
        StringBuffer sb = new StringBuffer();
        sb.append("1234");





    }

    public static void main(String[] args) {
        String s= "1234";
        System.out.println(s.substring(0,1));
    }
}
