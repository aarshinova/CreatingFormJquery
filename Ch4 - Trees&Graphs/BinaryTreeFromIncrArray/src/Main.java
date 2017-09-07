public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int lastEl = array.length - 1;
        Node binaryTree = createBinTree(0, lastEl, array);
    }

    public static Node createBinTree(int first, int last, int[] array){

        Node top = null;

        if (first<=last) {
            int middleIndex = (first+last)/2;
            top = new Node((array[first]+array[last])/2);

            Node left = createBinTree(first,middleIndex-1, array);
            Node right = createBinTree(middleIndex + 1, last, array);

            Node[] children = {left,right};
            top.setChildren(children);
        }

        return top;

    }
}
