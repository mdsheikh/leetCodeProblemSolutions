public class addDigits {
    public static int add_digits(int num) {
        int result = 0;
        if (num == 0) {
            result = 0;
        } else if (num < 10) {
            result = num;
        } else if (num % 9 == 0) {
            result = 9;
        } else {
            result = num % 9;
        }
        return result;

    }

    public static void main(String[] args) {
        int n = 38;
        int result = add_digits(n);
        System.out.println(result);
    }
    // 38 = 3 + 8 = 11 => 1 + 1 = 2
    // 18 = 1 + 8 => 9 = 9

}