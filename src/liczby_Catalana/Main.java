package liczby_Catalana;

class liczbyCatalana{
    //Rekurencyjne znajdowanie liczb Catalana.
    int catalan(int n)
    {
        int wynik = 0;

        if (n <= 1)
        {
            return 1;
        }

        for (int i = 0; i < n; i++)
        {
            wynik += catalan(i) * catalan(n - i - 1);
        }

        return wynik;
    }
}
public class Main {
    public static void main(String[] args)
    {
        liczbyCatalana lc = new liczbyCatalana();

        System.out.println("Liczby Catalana: ");
        System.out.println("");

        for (int i = 0; i < 10; i++)
        {
            System.out.println("C(" + i + ") = " + lc.catalan(i));
        }
    }
}
