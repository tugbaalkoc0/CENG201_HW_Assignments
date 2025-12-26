public class PriorityTreatmentQueue {
    TreatmentQueue priorityQueue;
    TreatmentQueue normalQueue;


    public PriorityTreatmentQueue() {
        priorityQueue = new TreatmentQueue();
        normalQueue = new TreatmentQueue();
    }
    //adding treatment request to queue
    void enqueue(TreatmentRequest request){
        if(request.priority){
            priorityQueue.enqueue(request);
        }else{
            normalQueue.enqueue(request);
        }
    }
    // Treat the patient
    TreatmentRequest dequeue(){
        if(!priorityQueue.isEmpty()){
           TreatmentRequest rqst = priorityQueue.front;
           priorityQueue.dequeue();
           return rqst;
        }
        else if(!normalQueue.isEmpty()){
            TreatmentRequest rqst = normalQueue.front;
            normalQueue.dequeue();
            return rqst;
        }else{
            System.out.println("Queue is empty");
            return null;
        }
    }
    void printQueue(){
        System.out.println("Priority Patients: ");
        priorityQueue.printQueue();
        System.out.println("Normal Patients: ");
        normalQueue.printQueue();
    }
}
