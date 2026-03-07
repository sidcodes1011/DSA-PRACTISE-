// Basic Recursion 
// Question - 3) Calculate sum of n number using recursion 

public class sumOfNno {

    static int CalculateSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + CalculateSum(num - 1);
    }

    public static void main(String[] args) {

        int number = 10;
        System.out.println("Sum is ::: " + CalculateSum(number));
    }
}
