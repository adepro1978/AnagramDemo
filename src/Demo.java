import java.util.Arrays;
import static java.lang.System.*;

public class Demo {
    public static void main(String[] a) {
        String s1 = "shake";
        String s2 = "hakes";
        out.println(s1);
        out.println(s2);
        out.println(s1.contains("hakes"));

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        System.out.println("Character Array...");

            for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
            StringBuilder sb = new StringBuilder();
            sb.append(s2);

            //Arrays.sort(arr1);
            //Arrays.sort( arr2 );
            out.println(arr1);
           // out.println(sb);

            s1 = new String(arr1).trim();
           // s2 = new String(sb).trim();

            System.out.println(s1);
            System.out.println(s2);

            System.out.println(s1.contains(s2));
        }
    }

