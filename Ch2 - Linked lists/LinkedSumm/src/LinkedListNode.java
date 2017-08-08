public class ListNode {
    LinkedListNode node=null;

    void append(int data){
       if  (node ==null)
           node = new LinkedListNode(data);
       else {
          node.append(data);
       }
    }
}
