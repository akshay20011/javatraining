import java.util.Scanner;
class CalculatorEg { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        int result = 0;
        System.out.printf("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.printf("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.printf("Enter the second number: ");
        int num2 = scanner.nextInt();

        switch (operator) {
            case '+':
            result= num1+num2;
                break;
            case '-':
            result= num1-num2;
                break;
            case '*':
            result= num1*num2;
                break;
            case '/':
            result= num1 / num2;

                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.printf("%s is the value:%n", result);
        scanner.close();
        ;
    }

    

}