public class DischargeStack {
    Node top;
    int count;

    public DischargeStack() {
        count = 0;
        top = null;

    }
    //Add a discharge record
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
    // Remove and return the top record
    void pop() {
        if (count == 0) {//if stack is empty
            System.out.println("The stack is empty");
        }else{
            System.out.println(top.data.patientId  + " deleted");
            top = top.next;
            count -- ;
        }
    }
    //View the most recent discharge without removing it
    void peek(){
        if(count == 0){
            System.out.println("The stack is empty");
        }else{
            System.out.println(top.data);
        }
    }
    //Print all discharge records
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
