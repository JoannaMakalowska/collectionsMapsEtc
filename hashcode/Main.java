package hashcode;

public class Main {

    public static void main(String[] args)
    {
        Element1 a = new Element1(5);
        Element1 b = new Element1(5);
        Element1 c = null;
        System.out.println(a.equals(b));

        System.out.println("hello".hashCode());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}
class Element1
{

    public Element1(int wartosc)
    {

        this.wartosc = wartosc;
    }
    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.wartosc == ((Element1)obj).wartosc;
    }
    public int hashCode()
    {
        int hash = 7;
        hash = 14 * hash + this.wartosc;
        return hash;
    }
    int wartosc;
}

