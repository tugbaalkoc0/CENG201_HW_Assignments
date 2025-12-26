public class TreatmentQueue {
    TreatmentRequest front;
    TreatmentRequest rear;
    int count;

    public TreatmentQueue(){
        count = 0;
        front = null;
        rear = null;
    }
    //control the queue is empty or not
    boolean isEmpty(){
        return count == 0;
    }
    //Add a new treatment request to the queue
    void enqueue(TreatmentRequest request){
        //Add first request to queue
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
    // Remove and return the first treatment request
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
    //Return the number of request in the queue
    void size(){
        System.out.println("The size of the queue is " + count);
    }
    // Print the queue
    void printQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty There are no request");
        }
        else{
            TreatmentRequest temp = front;
            while(temp != null){
                System.out.print(temp + "\n" );
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
