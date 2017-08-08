public class LinkedListNode {
    Node node=null;

    void append(int data){
       if  (node ==null)
           node = new Node(data);
       else {
          node.append(data);
       }
    }
}
