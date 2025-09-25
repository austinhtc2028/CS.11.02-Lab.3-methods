/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    // 2. add
    public static int add(int num1, int num2, int num3, int num4) {
        return add(add(num1, num2), add(num3, num4));
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好" + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String name) {
        return name + name + name;
    }

    // 6. half
    public static double half(int num) {
        return num * 0.5;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num) {
        double rounded = (num + 0.5);
        return (int) rounded;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num) {
        double rounded = (num - 0.5);
        return (int) rounded;
    }

}
