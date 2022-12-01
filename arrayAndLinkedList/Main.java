package arrayAndLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList listaTablicowa = new ArrayList(6);
        listaTablicowa.add(new Object());
        listaTablicowa.add(new Object());
        listaTablicowa.add(new Object());
        listaTablicowa.add(new Object());
        listaTablicowa.add(new Object());
        listaTablicowa.add(new Object());

        ListaPolaczona listaPolaczona = new ListaPolaczona();

        listaPolaczona.wartosc = 10;
        listaPolaczona.nastepna = new ListaPolaczona();
        listaPolaczona.nastepna.wartosc = 20;

        listaPolaczona.nastepna.nastepna = new ListaPolaczona();
        listaPolaczona.nastepna.nastepna.wartosc = 30;

        System.out.println(listaPolaczona.wartosc);
        System.out.println(listaPolaczona.nastepna.wartosc);
        System.out.println(listaPolaczona.nastepna.nastepna.wartosc);
        System.out.println("===============");
        System.out.println();

        LinkedList<String> listaPowiazana = new LinkedList<String>();
        listaPowiazana.add("lalal1");
        listaPowiazana.add("lalal2");
        listaPowiazana.add("lalal3");
        listaPowiazana.add("lalal4");
        listaPowiazana.add("lalal5");

       /* for (int i = 0; i < listaPowiazana.size(); i++) {
            System.out.println(listaPowiazana.get(i));
        }*/
        Main.wypiszElementyListy(listaPowiazana);

        Iterator<String> iter = listaPowiazana.iterator();
        iter.next();
        Main.wypiszElementyListy(listaPowiazana);

    }
    public static void wypiszElementyListy (LinkedList<?> lista)
    {
        Iterator iteratorListy = lista.iterator();
        while (iteratorListy.hasNext())
            System.out.println(iteratorListy.next());
    }

}
class ListaPolaczona  {

    int wartosc;
    ListaPolaczona nastepna;
    ListaPolaczona poprzedni;

}
