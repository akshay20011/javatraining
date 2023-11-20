import java.util.Scanner;

 class Mark {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the student's marks: ");
  double marks = scanner.nextDouble();
  String grade;
     if (marks < 40) {
            grade = ("Failed");
        } else if (marks >= 40 && marks <= 60) {
            grade = ("Grade D");
    } else if (marks >= 61 && marks <= 70) {
            grade = ("Grade C");
     } else if (marks >= 71 && marks <= 80) {
            grade = ("Grade B");
        } else if (marks >= 81 && marks <= 100) {
            grade = ("Grade A");
        } else {
            grade = ("Invalid marks entered");
        }
     System.out.println("The student's grade is: " + grade);
    
}
}
