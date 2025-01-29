// Declare and initialize 8 variables of type String, char, short, int, long, float, double, and boolean.


public class MixMatch
{
    public static void main(String[] args)
    {
        String  word = "Pokemon";
        char    lttr = 'Q';
        short   num1 = 22222;
        int     num2 = 222222222;
        long    num3 = 2222222222222222222L;
        float   dec1 = 5.55555555f;
        double  dec2 = 5.5555555555555555d;
        boolean    real = true; 

        System.out.println(word + " <- String, stores an 'array' of characters to form words or sentences.");
        System.out.println(lttr + " <- Character, stores a single character value which includes numbers and letters");
        System.out.println(num1 + " <- Short Integer, stores whole numbers from -32,768 to 32,767");
        System.out.println(num2 + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647");
        System.out.println(num3 + " <- Long Integer, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println(dec1 + " <- Float, stores decimal numbers with up to 6-7 digits after the decimal point");
        System.out.println(dec2 + " <- Double, stores decimal numbers with up to 15 digits after the decimal point");
        System.out.println(real + " <- Boolean, stores true or false values.");
    }
}