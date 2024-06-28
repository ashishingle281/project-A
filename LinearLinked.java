package Linked;

public class LinearLinked {
    Node root;
    void create_list()
    {
        root = null;
    }
    void insert_left(int e)
    {
        Node n = new Node(e);
        if (root ==null)
        root = n;
        else
        {
            n.next = root;
            root = n;
        }
        System.out.println(e+ "inserted");
    }

    void delete_left()
    {
        if(root==null)//not there then n is root
            System.out.println("Empty list");
        else
        {
            Node t=root;//1
            root=root.next;//2
            System.out.println(t.data+" deleted");
        }
    }

    void insert_right(int e)
    {
        Node n = new Node(e);
        if (root ==null)
        root = n;
        else
        {
           Node t = root;
           while(t.next!=null)
                t=t.next;
           t.next=n;
        }
        System.out.println(e+ "inserted");
    }

    void delete_right()
    {
        if(root==null)//not there then n is root
            System.out.println("Empty list");
        else
        {
            Node t=root;//1
            Node t2 =t;
            while(t.next!=null)
            {
                t2 = t;
                t=t.next;
            }
            if (t==root) {
                root = null;
            }
            else
                t2.next=null;
            root=root.next;//2
            System.out.println(t.data+" deleted");
        }
    }

    void print_list()
    {
        if (root==null)
        System.out.println("Empty list");
        else
        {
            Node t=root;
            while(t!=null)
            {
                System.out.println("|"+t.data+"|->");
                t=t.next;
            }
        }
    }

    void search_list(int key)
    {
        if (root==null)
        System.out.println("Empty list");
        else
        {
            Node t=root;
            while(t!=null)
            {
                if (t.data == key) 
                    break;
                t= t.next;
            }
            if(t==null)
            System.out.println(key+" Not Found");
        else
            System.out.println(key+" Found");
        }
    }

    void delete(int key)
    {
        if (root==null)
        System.out.println("Empty list");
        else
        {
            Node t=root;
            Node t2=t;
            while(t!=null)
            {
                if (t.data == key) 
                    break;
                    t2=t;
                t= t.next;
            }
            if(t==null)
            System.out.println(key+" Not Found");
        else
            System.out.println(key+" Found");
            if (t == root)
            root = root.next;
            else if (t.next == null)
            t2.next = null;
            else
             t2.next = t.next;
             System.out.println(t.data +"deleted");
        }
    }

    void insert_at(int index,int e)
    {
        Node n = new Node(e);
        if (index == 0)
        {
            if (root == null)
            root = n;
            else
            {
                n.next = root;
                root = n;
            }
        }
       
        else
        {
           Node t = root;
           Node t2 = t;
           while(index > 0 && t  != null){
            t2 = t;
            t = t.next;
            index--;
           }
            if ( t == null)
            {
                System.out.println("Index not found");
            }
            else
            {
                t2.next = n;
                n.next = t;
                System.out.println(e + "inserted");
            }   
        }
      
    }
    

    


}
