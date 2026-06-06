import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();

        mp.put(2,3);
        mp.put(4,2);
        mp.put(null,null);

        int n = mp.size();
//        mp.forEach((Integer val,Integer val2) ->
//                System.out.println(val));
//           for(Map.Entry<Integer,Integer>entry:mp.entrySet())
//           {
//               System.out.println(entry.getKey());
//               System.out.println(entry.getValue());
//               System.out.println(entry.getClass());
//           }
        Map<Integer,String>linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(2,"JJ");
        linkedHashMap.put(5,"JJ");
        linkedHashMap.put(3,"JJ");
        linkedHashMap.put(4,"JJ");
        linkedHashMap.put(null,"JJ");
        linkedHashMap.put(null,null);

        linkedHashMap.computeIfAbsent(2, k -> "uikj");
        linkedHashMap.computeIfPresent(2, (k, v) -> "new");

//        linkedHashMap.forEach((Integer key, String val) ->
//                System.out.println(key + " " + val)
//        );

        Map<Integer,Integer>hashtable = new Hashtable<>();
        hashtable.put(2,3);
        hashtable.put(5,3);

//        hashtable.forEach((Integer key, Integer val) ->
//                System.out.println(key + " " + val)
//        );

        Map<Integer,String>treemap = new TreeMap<>((Integer val1,Integer val2) -> val2-val1);
        treemap.put(2,"SA");
        treemap.put(1,"SA");
        treemap.put(3,"SA");

//        treemap.forEach((Integer key, String val) ->
//                System.out.println(key + " " + val)
//        );
//        SortedMap<Integer,Integer>sortedMap = new TreeMap<>();
//        Iterator<Integer>iterator = treemap.keySet().iterator();
//
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//
//        }

//        Set<Integer>st  = new HashSet<>();
//        st.add(2);
//        st.add(3);
//        st.add(3);
//        st.remove(3);
//        st.removeIf( x -> x%2==0);
//        st.add(null);
//        st.forEach((Integer val) -> System.out.println(val));
//        ConcurrentHashMap connmap = new ConcurrentHashMap();
//        Set<Integer>threadsafe = connmap.newKeySet();


        Queue<Integer>q1 = new LinkedList<>();



    }

   
}