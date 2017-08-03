public class Main {

    // Compress a string
    public static void main(String[] args){
        String s = "abcccddddcee";

        System.out.println("Original string : "+s);

        System.out.println("Compressed string : "+compressString(s));
    }

    public static String compressString(String s){
        String compressedString = "";
        boolean compressed = false;
        int count = 0;
        for (int j=0;j<s.length(); j++){
            count = 1;

            while (j+1<s.length() && s.charAt(j)==s.charAt(j+1)){
                compressed = true;
                count++;
                j++;
            }

            compressedString+=s.charAt(j);
            compressedString+=count;
        }

        if (compressed)
        return compressedString;
        else return s;
    }
}
