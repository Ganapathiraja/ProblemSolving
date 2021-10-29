

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }                                                            

}

class List{

    Node head = null;






   public Node addData(Node node)
   {

        if (head == null || head.next == null)
        {
            head = node;
        }else {

            do{

                if (node.next == null){
                    head.next = node;
                }

            }   while (node.next != null);



        }

        return node;

    }

}



public class LinkedListMain {

    public static void main(String[] args) {


        List nodeList = new List();
        Node tempNode = new Node(10);
        nodeList.addData(tempNode);
        tempNode.next = new Node(20);
        nodeList.addData(tempNode);


    /*    List list = new List();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);*/

        // iterate over List
        Node node = nodeList.head;
        while (node != null)
        {
            System.out.println(node.data);
            node = node.next;

        }

    }



}
