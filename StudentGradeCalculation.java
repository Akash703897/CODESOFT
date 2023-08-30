import java.util.Scanner;

public class StudenGradeCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        String[] subjects = new String[numSubjects];
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            scanner.nextLine();  // Consume the newline character
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();

            System.out.print("Enter marks obtained in " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        }else if (averagePercentage >= 40) {
            grade = "D";
        } else if (averagePercentage >= 35) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }

        System.out.println("\nSubject-wise Marks:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + marks[i] + " marks");
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}