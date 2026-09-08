import java.util.Scanner;

public class IT22091802Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        double m1 = scanner.nextDouble();
        System.out.print("Enter Subject Mark 2: ");
        double m2 = scanner.nextDouble();
        System.out.print("Enter Subject Mark 3: ");
        double m3 = scanner.nextDouble();
        System.out.print("Enter Subject Mark 4: ");
        double m4 = scanner.nextDouble();

        double average = (m1 + m2 + m3 + m4) / 4;
        System.out.println("Average is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
    }
}