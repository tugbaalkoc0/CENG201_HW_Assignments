public class DischargeStack {
    Node top;
    int count;

    public DischargeStack() {
        count = 0;
        top = null;

    }

    void push(DischargeRecord record) {
        Node temp = new Node(record);

        if (count == 0) {
            top = temp;
        } else {
            temp.next = top;
            top = temp;
        }
        count++;
    }

    void pop() {
        if (count == 0) {//if stack is empty
            System.out.println("The stack is empty");
        }else{
            System.out.println(top.data.patientId  + " deleted");
            top = top.next;
            count -- ;
        }
    }
    void peek(){
        if(count == 0){
            System.out.println("The stack is empty");
        }else{
            System.out.println(top.data);
        }
    }

    void printStack(){
        if(count == 0){
            System.out.println("The stack is empty");
        }else{
            Node temp = top;
            while(temp!= null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }
}
