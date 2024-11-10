import java.util.*;

public class CheckArmstrong {

    public boolean isArmstrong(int n) {
        int temp = n;
        int count = 0;
        int sum = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        n = temp;

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, count);
            n = n / 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        CheckArmstrong obj = new CheckArmstrong();

        int num = 15;

        if (obj.isArmstrong(num)) {
            System.out.println("Yes, " + num + " " + "is Armstrong number.");
        } else {
            System.out.println("No, " + num + " " + "is not an Armstrong number.");
        }
    }
}
