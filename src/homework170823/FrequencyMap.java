package homework170823;

import java.util.*;

public class FrequencyMap {

    public static void main(String[] args) {

        java.util.List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("three");

        Map<String, Integer> map = wordCount(list);
        map.forEach((key, value) -> System.out.println(key + " " + value));

        Map<String, Integer> map2 = wordCountPutIfAbsent(list);
        System.out.println();
        map2.forEach((key, value) -> System.out.println(key + " " + value));

        Map<String, Integer> map3 = wordCountMerge(list);
        System.out.println();
        map3.forEach((key, value) -> System.out.println(key + " " + value));

    }

    public static Map <String, Integer> wordCount(List<String> list) {
        Map<String, Integer> map = new HashMap();
        for (String s : list) {
            if (!map.containsKey(s)) map.put(s, 1);
            else map.put(s, map.get(s) + 1);
        }
        return map;
    }

    public static Map <String, Integer> wordCountPutIfAbsent(List<String> list) {
        Map<String, Integer> map = new HashMap();
        list.forEach(s -> {
            Optional<Integer> number = Optional.ofNullable(map.putIfAbsent(s, 1));
            if (number.isPresent()) map.put(s, number.get() + 1);
        });
        return map;
    }

    public static Map <String, Integer> wordCountMerge(List<String> list) {
        Map<String, Integer> map = new HashMap();
        list.forEach(s -> map.merge(s, 1, (v1, v2) -> v1 + v2));
        return map;
    }

}
