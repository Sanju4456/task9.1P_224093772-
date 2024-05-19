package web.service;

public class MathQuestionService {

    /**
     * Calculate Q1 result.
     * @param number1
     * @param number2
     * @return
     */
    public static double q1Addition(String number1, String number2) {
        try {
            double num1 = Double.valueOf(number1);
            double num2 = Double.valueOf(number2);
            return num1 + num2;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input for addition. Both inputs must be valid numbers.");
        }
    }

    /**
     * Calculate Q2 result.
     * @param number1
     * @param number2
     * @return
     */
    public static double q2Subtraction(String number1, String number2) {
        try {
            double num1 = Double.valueOf(number1);
            double num2 = Double.valueOf(number2);
            return num1 - num2;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input for subtraction. Both inputs must be valid numbers.");
        }
    }
}
