package hashcode;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps
{

    public static void main(String[] args)
    {
        TreeMap<Integer, Employer> map = new TreeMap();  // mapa posortowana
    //    LinkedHashMap<Integer, Employer> map = new LinkedHashMap<>();
        // mapa w kolejnosci jak bylo dodawane

        Employer [] employers =
                {
                        new Employer("Laura"),
                        new Employer("Audre"),
                        new Employer("Kevin"),
                        new Employer("Jibus"),
                        new Employer("Maria"),
                };
        for (Employer employer : employers)
            map.put(employer.getID(), employer);
        System.out.println(map);

        map.remove(4);
        System.out.println(map);

        map.put(2, new Employer("Asia"));
        System.out.println(map);

        for (Map.Entry<Integer, Employer> entry : map.entrySet())
        {
            System.out.println("Employer's ID is : "+entry.getKey());
            System.out.println("Employer's name is : "+entry.getValue().getName());
        }

        Map<Integer, Employer> subMap = map.subMap(0, 11);

        if (subMap.isEmpty())
            System.out.println("EMPTY");
        else
            for (Map.Entry<Integer, Employer> entry: subMap.entrySet())
            {
                System.out.println("Employer's ID is : "+entry.getKey());
                System.out.println("Employer's name is : "+entry.getValue().getName());
            }
    }
}

class Employer
{
    public Employer()
    {
        i++;
        ID = i;
    }
    public Employer (String name)
    {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String toString()
    {
        return name;
    }

    public int getID() {
        return ID;
    }


    String name;
    private int ID;
    public static int i = 0;
}