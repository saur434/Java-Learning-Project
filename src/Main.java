import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
//        Map<Integer,Integer> mp = new HashMap<>();
//
//        mp.put(2,3);
//        mp.put(4,2);
//        mp.put(null,null);
//
//        int n = mp.size();
//        mp.forEach((Integer val,Integer val2) ->
//                System.out.println(val));
//           for(Map.Entry<Integer,Integer>entry:mp.entrySet())
//           {
//               System.out.println(entry.getKey());
//               System.out.println(entry.getValue());
//               System.out.println(entry.getClass());
//           }
//        Map<Integer,String>linkedHashMap = new LinkedHashMap<>();
//            linkedHashMap.put(2,"JJ");
//        linkedHashMap.put(5,"JJ");
//        linkedHashMap.put(3,"JJ");
//        linkedHashMap.put(4,"JJ");
//        linkedHashMap.put(null,"JJ");
//        linkedHashMap.put(null,null);
//
//        linkedHashMap.computeIfAbsent(2, k -> "uikj");
//        linkedHashMap.computeIfPresent(2, (k, v) -> "new");

//        linkedHashMap.forEach((Integer key, String val) ->
//                System.out.println(key + " " + val)
//        );

//        Map<Integer,Integer>hashtable = new Hashtable<>();
//        hashtable.put(2,3);
//        hashtable.put(5,3);

//        hashtable.forEach((Integer key, Integer val) ->
//                System.out.println(key + " " + val)
//        );

//        Map<Integer,String>treemap = new TreeMap<>((Integer val1,Integer val2) -> val2-val1);
//        treemap.put(2,"SA");
//        treemap.put(1,"SA");
//        treemap.put(3,"SA");

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


//        Queue<Integer>q1 = new LinkedList<>();

//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = new String("hello");
//        String s4 = "xhello";
//        String s5 = s4.substring(1);

//        if(s1==s2)
//        {
//            System.out.println("This is pointing to the same memory location");
//        }
//        if(s1.equals(s2))
//        {
//            System.out.println("Pointing to the same content");
//        }
//        if(s1==s3)
//        {
//            System.out.println("This is the case in which references are different");
//        }
//        if(s1==s5)
//        {
//            System.out.println("This is pointing to the same memory location");
//        }
//        else{
//            System.out.println("Pointing to the same content");
//        }


//        Static_Class_Example obj =  new Static_Class_Example();
//        obj.m1();
//        Static_Class_Example.m2();
//        obj.m3(23,5,32,323,234,2323,423,5,2,3,25,2,3,532,2235); // This is the variable argument example

//        Child_Class childClass = new Child_Class();
//        childClass.m1();
//
//        Child_Class c1 = new Child_Class();
//        c1 = null;
//        System.gc();
//        System.out.println("GC REQUESTED");

        // If I want to implement the method in the abstract class then , basically I have to create the subclass that extends
        // it, and then I have to implement the method as I can't create the object of it but with the help of the anonymous class we
        // can do it without even creating the subclass as compiler automatically creates the subclass at backend and name is decided by compiler itself.

//        Abstract_Class abstractClass = new Abstract_Class() {
//            @Override
//            public void applybreak() {
//                System.out.println("This is the apply break method");
//            }
//        };
//        abstractClass.applybreak();
        // Generic class Calling method
//        Generic_Class<Integer> genericClass = new Generic_Class<>();
//        genericClass.setValue(2);
//        System.out.println(genericClass.getData());
//
//       for(Enumeration enumeration:Enumeration.values())
//       {
//           System.out.println(enumeration.ordinal());
//           System.out.println(enumeration.name());
//       }
//
//       Enumeration enumvar = Enumeration.valueOf("Monday");
//       System.out.println(enumvar);
       // To invoke the EnumCustom Values
//        for(EnumCustomValues enumeration:EnumCustomValues.values())
//        {
//            System.out.println(enumeration.i);
//            System.out.println(enumeration.s);
//        }


        EnumMethodOverride enumMethodOverride  = EnumMethodOverride.Monday;

        enumMethodOverride.dummymethod();
    // Enum Abstract method call
        EnumAbstractMethod enumAbstractMethod = EnumAbstractMethod.MONDAY;
        enumAbstractMethod.message();
        enumAbstractMethod.Enumimplementinterface();
        //Enum we used because of readablitly purpose only
    }


}