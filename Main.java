
import java.util.Scanner;

public class Main {
 static Scanner s = new Scanner(System.in);
public static void main(String args[]) {
System.out.println("Enter the currency need to convert (Rupee, USDollar, JapaneseYen, Britishpound, AustralianDollar)");
 String c = s.nextLine();
        switch (c) {
            case "Rupee":
                int i = cost(c);
                String k = currency(c, i);
                if (k.equalsIgnoreCase("USDollar"))
                    System.out.println(i + " " + c + " is equals to " + i * 0.012 + " " + k);
                else if (k.equalsIgnoreCase("JapaneseYen"))
                    System.out.println(i + " " + c + " is equals to " + i * 1.81 + " " + k);
                else if (k.equalsIgnoreCase("Britishpound"))
                    System.out.println(i + " " + c + " is equals to " + i * 0.0093 + " " + k);
                else if (k.equalsIgnoreCase("AustralianDollar"))
                    System.out.println(i + " " + c + " is equals to " + i * 0.018 + " " + k);
                else
                    System.out.println("Invalid");
                break;
            case "USDollar":
                int j = cost(c);
                String o = currency(c, j);
                if (o.equalsIgnoreCase("Rupee"))
                    System.out.println(j + " " + c + " is equals to " + j * 86.43 + " " + o);
                else if (o.equalsIgnoreCase("JapaneseYen"))
                    System.out.println(j + " " + c + " is equals to " + j * 156.34 + " " + o);
                else if (o.equalsIgnoreCase("Britishpound"))
                    System.out.println(j + " " + c + " is equals to " + j * 0.81 + " " + o);
                else if (o.equalsIgnoreCase("AustralianDollar"))
                    System.out.println(j + " " + c + " is equals to " + j * 1.60 + " " + o);
                else
                    System.out.println("Invalid");
                break;
            case "JapaneseYen":
                int p = cost(c);
                String l = currency(c, p);
                if (l.equalsIgnoreCase("Rupee"))
                    System.out.println(p + " " + c + " is equals to " + p * 0.55 + " " + l);
                else if (l.equalsIgnoreCase("USDollar"))
                    System.out.println(p + " " + c + " is equals to " + p * 0.0064 + " " + l);
                else if (l.equalsIgnoreCase("Britishpound"))
                    System.out.println(p + " " + c + " is equals to " + p * 0.0052 + " " + l);
                else if (l.equalsIgnoreCase("AustralianDollar"))
                    System.out.println(p + " " + c + " is equals to " + p * 0.010 + " " + l);
                else
                    System.out.println("Invalid");
                break;
            case "Britishpound":
                int po = cost(c);
                String lo = currency(c, po);
                if (lo.equalsIgnoreCase("Rupee"))
                    System.out.println(po + " " + c + " is equals to " + po * 106.51 + " " + lo);
                else if (lo.equalsIgnoreCase("USDollar"))
                    System.out.println(po + " " + c + " is equals to " + po * 1.23 + " " + lo);
                else if (lo.equalsIgnoreCase("JapaneseYen"))
                    System.out.println(po + " " + c + " is equals to " + po * 192.70 + " " + lo);
                else if (lo.equalsIgnoreCase("AustralianDollar"))
                    System.out.println(po + " " + c + " is equals to " + po * 1.97 + " " + lo);
                else
                    System.out.println("Invalid");
                break;
            case "AustralianDollar":
                int pol = cost(c);
                String lol = currency(c, pol);
                if (lol.equalsIgnoreCase("Rupee"))
                    System.out.println(pol + " " + c + " is equals to " + pol * 54.16 + " " + lol);
                else if (lol.equalsIgnoreCase("USDollar"))
                    System.out.println(pol + " " + c + " is equals to " + pol * 0.63 + " " + lol);
                else if (lol.equalsIgnoreCase("JapaneseYen"))
                    System.out.println(pol + " " + c + " is equals to " + pol * 97.99 + " " + lol);
                else if (lol.equalsIgnoreCase("Britishpound"))
                    System.out.println(pol + " " + c + " is equals to " + pol * 0.51 + " " + lol);
                else
                    System.out.println("Invalid");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static int cost(String c) {
        System.out.println("Enter cost in " + c);
        int y = s.nextInt();
         s.nextLine();
        return y;
    }

    public static String currency(String c, int i) {
        System.out.println("Enter to which currency (Rupee, USDollar, JapaneseYen, Britishpound, AustralianDollar) "
                + "the " + i + " " + c + " should convert ");
        return s.nextLine();
    }
}
