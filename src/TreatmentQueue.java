public class TreatmentQueue {
    TreatmentRequest front;
    TreatmentRequest rear;
    int count;

    public TreatmentQueue(){
        count = 0;
        front = null;
        rear = null;
    }
    boolean isEmpty(){
        return count == 0;
    }
    void enqueue(TreatmentRequest request){
        if(isEmpty()){
            front = request;
            rear = request ;
            count ++;
        }
        else{
            rear.next = request ;
            rear = rear.next;
            count++;
        }
    }
    void dequeue(){
        // There are no request
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        else{
            System.out.println(front.patientId + " was treated");
            front = front.next;
            count --;
        }

    }
    void size(){
        System.out.println("The size of the queue is " + count);
    }
    void printQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty There are no reguest");
        }
        else{
            TreatmentRequest temp = front;
            while(temp != null){
                System.out.print(temp + " -" );
                temp = temp.next;
            }

        }
    }
}
