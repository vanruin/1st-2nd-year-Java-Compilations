import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a limit: ");
        int limit = in.nextInt();


        do {
            System.out.println("Enter a character: ");
            String Character = in.nextLine();

            int G = 0;
            int B = 0;

            int x = Character.length();
            for (int i = 0; i < x; i++) {
                if (Character.charAt(i) == 'g' || Character.charAt(i) == 'G') {
                    G++;
                } else if (Character.charAt(i) == 'B' || Character.charAt(i) == 'b') {
                    B++;
                }


                if (G > B) {
                    System.out.println(Character + " Is a GOOD");
                    break;
                } else if (G < B) {
                    System.out.println(Character + " Is a Baddy");
                    break;
                } else if (G == B) {
                    System.out.println(Character + " Is Neutral");
                    break;

                }


            }
        } while (true);
    }
}

