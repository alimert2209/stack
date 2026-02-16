public class Stack {
    Node top;

    public void push(int data){
        Node newNode = new Node(data);
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

    public void peek(){
        if (top == null) {
            System.out.println("Empty Stack!");
            return;
        }

        System.out.println("Top element: " + top.data);
    }
}
