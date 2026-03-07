// Basic Recursion 
// Question - 4) Calculate the n number of fibonacchi series using recursion 

public class fibonachiSeriesRecursion {

    static int fibonacchi(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        return fibonacchi(num - 1) + fibonacchi(num - 2);
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println("The " + number + " number of fibonachhi series is :::" + fibonacchi(number));
    }
}

/*
1) This recursive call is not linear it will create tree 

2) Recursion Tree for fibonacchi(4)

                    fib(4)
                 /          \
            fib(3)          fib(2)
           /      \        /      \
       fib(2)   fib(1)  fib(1)   fib(0)
       /    \
   fib(1)  fib(0)


3) Base cases:
    fib(1) = 1
    fib(0) = 0


4) Stack Unwinding (values returning upward):

fib(1) = 1
fib(0) = 0
fib(2) = fib(1) + fib(0) = 1 + 0 = 1

fib(3) = fib(2) + fib(1)
       = 1 + 1
       = 2

fib(4) = fib(3) + fib(2)
       = 2 + 1
       = 3

5 ) Final Result:
    fib(4) = 3

Key Idea:
1. Recursion creates a TREE structure.
2. Calls go downward until base cases (0 or 1).
3. During stack unwinding, results are combined (added).
4. Each node returns its computed Fibonacci value to its parent.
*/
