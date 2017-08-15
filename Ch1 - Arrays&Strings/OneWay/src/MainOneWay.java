import java.util.HashMap;

public class MainOneWay {

    // Check if there is only one difference in two strings
    public static void main(String[] args){
        String s = "pale";
        String c = "bakk";
        System.out.println("Hi");

        if (s.length()>c.length())
        System.out.println("The result is " + oneWay(s,c));
        else
            System.out.println("The result is " + oneWay(c,s));

        Ò
    }

    public static boolean oneWay(String c, String s) {

        // check if all the letters of c is in s
        boolean notFound = false;
        for ( int j=0; j<c.length(); j++){
            char cr = c.charAt(j);
            if (s.indexOf(cr)<0){
                if (notFound)
                         return false;
                     else
                         notFound = true;
                    }
            else {
                int k=j;
                while (k<s.length()) {
                    if (s.charAt(k)!=cr)
                        k++;
                    else
                        break;
                }

                if ((k-j)>1) return false;
            }

        }

        // if length is different more one return false
        if (s.length()-c.length()>1) return false;


        return true;

    }
}
