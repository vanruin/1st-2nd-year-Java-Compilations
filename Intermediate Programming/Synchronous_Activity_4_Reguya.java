import java.util.*;
class Synchronous_Activity_4_Reguya {
    public static void main(String[] args) {
   Scanner fetch = new Scanner(System.in);
      PhoneDirectory();

public class PhoneDirectory {
    private final int MAX_ENTRIES = 30;
    private int entries = 0;
    private String[] names = new String[MAX_ENTRIES];
    private String[] numbers = new String[MAX_ENTRIES];

    public void addEntry(String name, String number) {
        if (entries >= MAX_ENTRIES) {
            System.out.println("Directory is full, cannot add more entries");
            return;
        }
        names[entries] = name;
        numbers[entries] = number;
        entries++;
    }

    public void searchAndAdd() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter name (or 'quit' to exit): ");
            String name = scanner.nextLine();
            if (name.equals("quit")) {
                break;
            }
            int index = -1;
            for (int i = 0; i < entries; i++) {
                if (names[i].equals(name)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.print("Enter phone number: ");
                String number = scanner.nextLine();
                addEntry(name, number);
            } else {
                System.out.println("Phone number: " + numbers[index]);
            }
        }
        scanner.close();
    }
}

}
}
