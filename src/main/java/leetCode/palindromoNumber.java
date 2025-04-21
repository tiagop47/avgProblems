package leetCode;

public class palindromoNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int numeroReversed = 0;

        while (x > numeroReversed) {
            numeroReversed = numeroReversed * 10 + x % 10;
            x /= 10;
        }
        return x == numeroReversed || x == numeroReversed / 10;
    }
}

