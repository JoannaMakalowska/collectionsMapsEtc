package hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class hashSet extends Element1 {

    public hashSet(int wartosc) {
        super(wartosc);
    }

    public static void main(String[] args) {
        long mili = 0;
        long totalMili = 0;

        Set<String> set = new HashSet<String>(512);
        set = new TreeSet<String>();
        try {
            Scanner reader = new Scanner(new BufferedReader(new FileReader("informatic.txt")));

            while (reader.hasNext()) {
                mili = System.currentTimeMillis();
                set.add(reader.next());
                totalMili += (System.currentTimeMillis() - mili);
            }

            reader.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        Iterator<String> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        System.out.println("Czas wykonania: "+totalMili+" ms");
        System.out.println("Wielkosc zbioru: "+set.size());
    }
}
