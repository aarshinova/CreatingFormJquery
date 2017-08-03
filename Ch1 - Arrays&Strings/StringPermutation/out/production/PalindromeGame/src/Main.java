import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        System.out.println("Palindrome game");

        String phrase = "aann";
        phrase.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<phrase.length(); i++){
            char c = phrase.charAt(i);
            if (map.containsKey(c)){
                Integer val = map.get(c);
                map.put(c,++val);
            }
            else {
                map.put(c, 1);
            }
        }

        char addChar=' ';

        List<String> palList = new ArrayList<>();

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue()%2 != 0 ){
                char tempChar = entry.getKey();
                if (tempChar!=addChar && addChar!=' ' && tempChar!=' '){
                    System.out.println("It is not a palindrome"); /* more than one character */
                    return;
                }
                else if (tempChar!=' '){
                    addChar = entry.getKey();
                   // map.remove(entry.getKey());
                }
            }
        }


        System.out.println("It is a palindrome"); /* more than one character */
        return;

       /* List<Character> allChar = new ArrayList<>(map.keySet());
        List<String> allPalindroms = new ArrayList<>();

        for (int i=0; i<allChar.size(); i++)
        {
            char temp = allChar.get(i);
            int j=i;
            if (i+1 < allChar.size()){
                allChar.set(i, allChar.get(i+1));
                allChar.set(i+1,temp);
            }
        }*/
    }

}
