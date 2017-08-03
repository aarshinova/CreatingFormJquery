package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    // Checks if string is a permutation of another string
    public static void main(String[] args) {

	String s1="acccbdda";

    String s2="acccbddae";

    System.out.println("Check permutation result : " +	checkPermutation(s1, s2));
}

public static boolean checkPermutation(String s1, String s2)
{
    if(s1.length()!=s2.length())
        return false;
    Map<Character, Integer> map = new HashMap<>();

    for (int i=0;i<s1.length();i++) {
        char c = s1.charAt(i);

        if (map.containsKey(c)) {
            int val = map.get(c);
            map.put(c, ++val);
        } else
            map.put(c, 1);
    }

    for (int j=0; j<s2.length(); j++){
        char k = s2.charAt(j);
        if (map.containsKey(k)){
            int val = map.get(k);
            if (--val<0)
                return false;
            else
                map.put(k,val);
        }
        else{
            return false;
        }
    }

    return true;
}
}


