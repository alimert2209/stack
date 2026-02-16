public class Stack {
    Node top;

    public void push(int data){
        Node newNode = new Node(data);
        if (top == null)
            top = newNode;

        newNode.next = top;
        top = newNode;
    }

    public void pop(){
        if (top == null) {
            System.out.println("Empty Stack!");
            return;
        }

        System.out.println(top.data + " will be deleted.");
        top = top.next;
    }

    public int peek(){
        if (top == null) {
            System.out.println("Empty Stack!");
            return -1;
        }

        System.out.print("Top element: ");
        return top.data;
    }
}
