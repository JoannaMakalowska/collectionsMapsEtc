import java.util.ArrayList;
import java.util.Collection;

public class Collections
{
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList();

        a.add(new String("lala"));
        a.add(new String("lala2"));
        a.add(new String("lala3"));
        a.add(new String("lala4"));
        a.add(new String("lala5"));
        a.add(6);

        for (Object stringus : a)
            System.out.println(stringus);

        Zwykla<String> nazwaZmiennej = new Zwykla<>();
        nazwaZmiennej.nadajWartosc(("cosik"));
        System.out.println(nazwaZmiennej.zwroc());
    }
}
class Zwykla <COKOLWIEK>
{
    public void nadajWartosc (COKOLWIEK wartosc)
    {
        this.nazwaZmiennejTypuCokolowiek = wartosc;
    }
    public COKOLWIEK zwroc ()
    {
        return this.nazwaZmiennejTypuCokolowiek;
    }
    COKOLWIEK nazwaZmiennejTypuCokolowiek;
}