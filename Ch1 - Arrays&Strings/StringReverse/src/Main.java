public class Main {

    // Reverse a string
    public static void main(String[] args){
        String test = "acdef";
        char [] result;

        System.out.println("Reversed string : " );
        result = reverseString(test);

        for (int i = 0; i<result.length; i++)
            System.out.println(""+result[i]);

    }

    public static char[] reverseString(String test){
        char[] array;
        array = test.toCharArray();
        for (int i=0; i<array.length/2; i++){
            swap(i, array.length-1-i, array);
        }

        return array;
    }

    public static void swap(int i, int j, char[] array){
        char tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
