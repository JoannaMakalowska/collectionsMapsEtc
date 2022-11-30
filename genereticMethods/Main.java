package genereticMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Edytor {
    public static void wypisz(List<? extends Figura> lista) {

        for (Figura figura : lista)
            System.out.println(figura.pobierzNazwe());

            lista.add(null);
            System.out.println("===============");


        for (Figura figura : lista) {
            if (figura == null) {
                System.out.println("null");
                break;
            }
            System.out.println(figura.pobierzNazwe());
        }
    }
    public static <T extends Figura> void wypisz2(List<T> lista) {

        for (T figura : lista)
            System.out.println(figura.pobierzNazwe());

        lista.add((T) new Kolo());
        lista.add((T) new Kolo());
        lista.add((T) new Kolo());
        lista.add((T) new Kolo());
        lista.add(null);
        System.out.println("===============");

        for (T figura : lista) {
            if (figura == null) {
                System.out.println("null");
                break;
            }
            System.out.println(figura.pobierzNazwe());
        }
    }
        public static <Type> void przepiszTabliceDoKolekcji(Type[] tab, Collection<Type> c) {
            for (Type o : tab)
                c.add(o);
        }
    }

    class Figura  {
        public String pobierzNazwe() {
            return nazwa;
        }
        String nazwa = "";
    }
    class Kwadrat extends Figura {
        public Kwadrat() {
            super.nazwa = "Kwadrat";
        }
    }

    class Kolo extends Figura {
        public Kolo() {
            super.nazwa = "Kolo";
        }
    }

    public class Main {

        public static void main(String[] args) {


            Figura figura1 = new Kolo();
            Figura figura2 = new Kwadrat();
            Figura[] figury = new Figura[50];

            List<Figura> listaFigur = new ArrayList<Figura>();

            listaFigur.add(figura1);
            listaFigur.add(figura2);

            Edytor.wypisz2(listaFigur);

            Edytor.wypisz(listaFigur);

            Float[] fl = new Float[50];
            Integer[] in = new Integer[50];
            Number[] nu = new Number[50];
            Collection<Object> cn = new ArrayList<>();
            Edytor.przepiszTabliceDoKolekcji(fl, cn);
            Edytor.przepiszTabliceDoKolekcji(in, cn);
            Edytor.przepiszTabliceDoKolekcji(nu, cn);

        }
    }
