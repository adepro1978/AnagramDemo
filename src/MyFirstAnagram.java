import java.util.Scanner;

public class MyFirstAnagram {

    public static boolean compareString(String str1, String str2) {

        //convert str1 to charArray.
        char[] arToStr1 = str1.toLowerCase().toCharArray();

        //convert str2 to StringBuilder.
        str2.toLowerCase();
        StringBuilder sb = new StringBuilder(str2);

        //looping through the charArray.
        for (char c : arToStr1) {
            int pos = sb.indexOf(java.lang.String.valueOf(c));


            if (pos != -1) {
                sb.deleteCharAt(pos);

                return true;

            } else {
                return false;
            }
        }
        return sb.toString().isEmpty();

    }
    //this is the main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CHECK IF TWO WORD ARE ANAGRAM");
        System.out.println(" ");

        //prompting the user.
        System.out.println("enter first word:");
        String firstWord = input.nextLine();

        System.out.println("enter second word:");
        String secondWord = input.nextLine();

        System.out.println(compareString(firstWord, secondWord));

    }
}


