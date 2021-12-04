public class Factorial {

    public int factorialIntMethod(int n) {
        if (n == 1) return 1;
        return n * factorialIntMethod(n - 1);

    }

    public long factorialLongMethod(long n) {
        if (n == 1) return 1;
        return n * factorialLongMethod(n - 1);
    }

    public long factorialLongMethodLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}

