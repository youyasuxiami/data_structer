package com.xiami;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Description：
 *
 * @version v1.0.0
 * @author：zj
 * @date：2021­04­15 15:59
 */
public class Test01 {

    public static void main(String[] args) {
        Map<Long,Object> map1=new HashMap<>();
        map1.put(1l,"王永聪");
        map1.put(2l,"冯富来");

        Set<Map.Entry<Long, Object>> entries = map1.entrySet();
        //entries.stream().forEach(entry->{
        //    System.out.printf("%d:%s\n",entry.getKey(),entry.getValue());
        //});

        Map<Integer, Object> collect = entries.stream().collect(Collectors.toMap((map4 -> Integer.valueOf(map4.getKey()+"")), map5 -> map5.getValue()));
        collect.forEach((k,v)->{
            System.out.println(k+"--------"+v);
        });

        //Map<Integer,Object> map2=new HashMap<>();
        //
        //Iterator<Map.Entry<Long, Object>> iterator = map1.entrySet().iterator();
        //while (iterator.hasNext()){
        //    Map.Entry<Long, Object> next = iterator.next();
        //    Long key = next.getKey();
        //    Object value = next.getValue();
        //    map2.put(Integer.valueOf(key+""),value);
        //}
        //map2.forEach((k,v)->{
        //    System.out.println(k+"--------"+v);
        //});
    }
}
