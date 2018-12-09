package www.yht.day1;
class ListNode{
    private int element;
    private ListNode next;

    public ListNode(int element) {
        this.element = element;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
class LinkList{


    public void createNode(int data){
        ListNode newNode = new ListNode(data);
        newNode.setNext(null);
        newNode.setElement(data);
    }
    public void InsertNode(int pos , int data){
        
    }
}

public class SimpleList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);

        node1.setNext(node2);
        node2.setNext(node3);
        getData(node1);
    }
    public static void getData(ListNode node){
       if(node != null){
            System.out.print(node.getElement() + " ");
            getData(node.getNext());
        }
    }

}
