package hashcode;

public class Main {

    public static void main(String[] args)
    {
        Element a = new Element(5);
        Element b = new Element(5);
        Element c = null;
        System.out.println(a.equals(b));

        System.out.println("hello".hashCode());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}
class Element
{
    public Element (int wartosc)
    {
        this.wartosc = wartosc;
    }
    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.wartosc == ((Element)obj).wartosc;
    }
    public int hashCode()
    {
        int hash = 7;
        hash = 89 * hash + this.wartosc;
        return hash;
    }
    int wartosc;
}

