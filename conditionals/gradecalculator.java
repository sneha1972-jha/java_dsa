import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the marks: ");
            int marks = sc.nextInt();

            if (marks >= 90) {
                System.out.println("A");
            } else if (marks >= 70) {
                System.out.println("B");
            } else if (marks >= 50) {
                System.out.println("C");
            } else if (marks >= 35) {
                System.out.println("D");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
