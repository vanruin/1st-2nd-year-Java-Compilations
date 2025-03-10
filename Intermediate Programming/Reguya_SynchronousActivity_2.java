import java.util.Scanner;

public class Reguya_SynchronousActivity_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size for first array: ");
        int size1 = scan.nextInt();
        int[] list1 = new int[size1];

        System.out.print("Enter size for second array: ");
        int size2 = scan.nextInt();
        int[] list2 = new int[size2];

        System.out.print("Enter values for first array: ");
        for (int i = 0; i < size1; i++) {
            list1[i] = scan.nextInt();
        }

        System.out.print("Enter values for second array: ");
        for (int i = 0; i < size2; i++) {
            list2[i] = scan.nextInt();
        }

        boolean zeroSum = false;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (list1[i] + list2[j] == 0) {
                    zeroSum = true;
                    break;
                }
            }
        }

        System.out.println(zeroSum);

        scan.close();
    }
}
      
    
    

