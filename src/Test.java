import java.util.*;

class Test
{

    public static void main (String args[])
    {
       /* Map<String, Integer> mp = new HashMap<>();
        mp.put("A", 1);
        mp.put("B", 2);
        mp.put("C", 3);
        mp.put("D", 4);
        mp.forEach((k, v)-> System.out.println(mp.get(k)));*/

        Set<Integer> tset = new TreeSet<>();
        tset.add(5);
        tset.add(4);
        tset.add(1);
        tset.add(2);
        tset.add(5);
        tset.forEach(System.out::println);
    }
}  