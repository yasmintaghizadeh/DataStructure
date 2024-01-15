package linkedList;

public class LinkedList {
    Node1 head;
     public LinkedList insert(LinkedList list, int data){
         Node1 node=new Node1(data);
         if (list.head == null) {
             list.head = node;
         }

         else {
             Node1 last = list.head;
             while (last.next != null) {
                 last = last.next;
             }

             last.next = node;
         }

         return list;
     }

     public void sortedLinkedList(Node1 data){
         Node1 currentNode;
         if (head==null&& head.data>= data.data){
             data.next=head;
             head=data;
         }
         else {
             currentNode=head;
             while (currentNode.next!=null&&currentNode.next.data<currentNode.data){
                 currentNode=currentNode.next;
             }
             data.next=currentNode.next;
             currentNode.next=data;

         }
     }
     public int get(int index){
         Node1 node=head;
         while(node!=null){
             int i=0;
             if(i==index)
                 return node.data;
             i++;
             node=node.next;
         }
         return -1;
     }
    // Method to delete a node in the LinkedList by KEY
    public static LinkedList deleteByKey(LinkedList list, int key)
    {
        // Store head node
        Node1 currNode = list.head, prev = null;

        //
        // CASE 1:
        // If head node itself holds the key to be deleted

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(key + " found and deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the key is somewhere other than at head
        //

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null && currNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;

            // Display the message
            System.out.println(key + " found and deleted");
        }

        //
        // CASE 3: The key is not present
        //

        // If key was not present in linked list
        // currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        // return the List
        return list;
    }
    void printList()
    {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
