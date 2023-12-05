public class Interger {
    public static void main(String[] args) {
        int intNum1 = 10, intNum2 = 20, intNum3 = 30;
        System.out.println("Average of integers: " + calculateAverage(intNum1, intNum2, intNum3));
        float floatNum1 = 10.5f, floatNum2 = 20.5f, floatNum3 = 30.5f;
        System.out.println("Average of floats: " + calculateAverage(floatNum1, floatNum2, floatNum3));
    }
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}


