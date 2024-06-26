import java.lang.annotation.Target;
import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Hello Java!";
        char target = 'J';
        char target1 = 'O';
        System.out.println(Arrays.toString(str.toCharArray())); // converts string into array and displays it
        System.out.println(searchStr(str,target));
        System.out.println(searchStr1(str,target1));
    }
    // to find a character whether it is present in the given string or not

    static boolean searchStr(String str, char target){
        if (str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {// for each character of the string
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean searchStr1(String str, char target){
        if (str.isEmpty()){
            return false;
        }
        for (char ch : str.toCharArray()) { //for each loop that converts each character of the string to an array
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
