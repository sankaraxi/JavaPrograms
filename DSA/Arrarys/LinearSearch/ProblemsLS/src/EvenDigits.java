//leet code question
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,77,0,0,99};
        System.out.println(findNumbers(arr));
        System.out.println(digits2(0));
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for(int num : arr){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits%2 == 0){
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;

        if (num <0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }

        while (num > 0){
            count++;
            num = num/10; // num/=10
        }
        return count;
    }

    static int digits2(int num) { //optimized way to find the number of digits
        if (num <0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        return (int)(Math.log10(num))+1;
    }
}