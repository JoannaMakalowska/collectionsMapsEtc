package wildCards;

import java.util.ArrayList;
import java.util.List;

class SuperClass
{
    public static void tester (List<? extends Object> lista)
    {   // ? - wildcard - znak wieloznacznosci
        // ? extends JakasKlasa - znak wieloznacznosci jest ograniczony klasa JakasKlasa bounded wildcard
    }
}
class SubClass extends SuperClass
{

}

public class Main {

    public static void main(String[] args) {

       List<String> listOfString = new ArrayList<String>();

      // List<SuperClass> listOfClass = new ArrayList<SuperClass>();
       List<SubClass> listOfClass = new ArrayList<SubClass>();
      // listOfClass.add(new SuperClass());
       listOfClass.add(new SubClass());

       SuperClass.tester(listOfClass);


    }
}
