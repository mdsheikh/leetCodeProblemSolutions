import java.util.Arrays;

public class avgSalaryExcluMinMax {

    public static double averageMethod_one(int[] salary) {
        double sum = 0;
        int minimum = 0;
        int maximum = 0;
        // find min and max
        // minus them from the sum
        for (int i : salary) {
            minimum = Math.min(minimum, i);
            maximum = Math.max(maximum, i);
            sum += i;

        }

        return (double) (sum - maximum - minimum) / (salary.length - 2);

    }

    public static double averageMethod_two(int[] salary) {
        double sum = 0;
        int count = 0;
        Arrays.sort(salary);
        // sort the first
        // the loop starts from index 1 and ends at index lenght -1
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
            count++;
        }
        return (double) sum / count;

    }

    public static void main(String[] args) {
        int[] salary = { 4000, 3000, 1000, 2000 };
        double result = averageMethod_two(salary);
        System.out.println(result);

    }

}