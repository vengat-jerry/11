import java.util.*;

public class myprgm
{
    class node
    {
        int data;
        node next;

        public node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public node head = null;
    public node tail =null; 

    public void addNode(int data)
    {
        node new_node = new node(data);

        if(head == null)
        {
            head = new_node;
            tail = new_node;
        }
        else{
            tail.next = new_node;
        }

    }

    public void sortList()
    {
        node current = head, index= null;

        int temp;

        if(head == null)
        {
             return;
        }
        else
        {
            while(current != null)
            {
                index = current.next;

                while(index != null)
                {
                    if(current.data > index.data)
                    temp = current.data;
                    current.data = index.data;
                    index.data =temp;

                }
                index = index.next;

            }
            current = current.next;
        }
    }
}

public void display()
{
    node current = head;

    if(head == null)
    {
        System.out.println("List is Empty");
        return;

    }
    while(current != null){
        System.out.println(current.data+"\t");
        current=current.next;
    }
    System.out.println("\t");
}
    public static void main(String[] args)
    {
        LinkedList<Integer> llist = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("N:");
        int num = input.nextInt();
       
        while(num>0)
        {
            llist.add(input.nextInt());
            num--;
        }
        input.close();
        System.out.println(llist);

        llist.sortList();

        llist.display();
    }
}