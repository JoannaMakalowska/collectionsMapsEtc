package stack;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Stack<String> stos = new Stack<>();

        stos.push("lala");
        stos.push("lala1");
        stos.push("lala2");
        stos.push("lala3");

        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());

        String name = stos.peek();

        if (name.equals("lala1"))
            stos.pop();
        else
            System.out.println("Nie ma takiego na samej gorze.");

        Vector<String> wektor = new Vector<String>();
        wektor.add("lala");

        wektor.get(0);

        HashMap a;
        Hashtable b;
    }
}
