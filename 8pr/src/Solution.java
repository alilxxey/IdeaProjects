public class Solution {
    public static void printRange(int A, int B) {
        if (A == B) {
            System.out.println(A);
        } else if (A < B) {
            System.out.println(A);
            printRange(A + 1, B);
        } else {
            System.out.println(A);
            printRange(A - 1, B);
        }
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 1;
        printRange(A, B);
    }
}

