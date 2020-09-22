import java.util.Scanner;

public class reverser {

    public static void main(String [] args) {
        String name;
        String reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Syötä nimi kääntäjälle.");
        name = in.nextLine();
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        String reverselow = reverse.toLowerCase();

        System.out.println("Haluatko tietää onko nimesi palindromi?");
        System.out.println("Kirjoita kyllä jos haluat, ei jos et halua.");

        switch (in.nextLine()) {
            case "kyllä":
                String name1 = name.replaceAll(" ", "");
                String name2 = name1.replaceAll("-","");

                String palindrome = reverse.replaceAll(" ", "");
                String palindrome1 = palindrome.replaceAll("-","");

                if (palindrome1.equals(name2)) {
                    System.out.println("Syötetty nimi on palindromi.");
                } else {
                    System.out.println("Syötetty nimi ei ole palindromi.");
                }
                System.exit(0);
            default:
                System.exit(0);
        }
    }
}
