package gas.zadachi;

public class Test2 {
        public static void main(String[] args) {
            String s = "ABBA 2356 AB";
            String s1 = s.toUpperCase().replace("A-Za-z", "");
            System.out.println(s1);
        }
        public static boolean isPalindrome(String s1) {
        /*
        isPalindrome("ABBA BGGB") > true
        isPalindrome("ABBA 2356 AB") > true
        */
            String s = s1.toUpperCase().replace("A-Za-z", "");
            return true;
        }
    }