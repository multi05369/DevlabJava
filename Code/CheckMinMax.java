import java.util.Scanner;
public class CheckMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        if (numA > numB) {
            System.out.println("A");
        }
        else if (numA < numB) {
            System.out.println("B");
        }
        else {
            System.out.println("AB");
        }
    }
}
