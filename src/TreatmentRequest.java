public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean priority;
    TreatmentRequest next;

    public TreatmentRequest(int patientId, long arrivalTime){
        this.patientId = patientId;
        this.arrivalTime = arrivalTime;
        this.next = null;
    }
    public TreatmentRequest(int patientId, long arrivalTime,boolean priority) {
        this.patientId = patientId;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
        this.next = null;
    }
    public String toString() {
        return "Patient ID : " + patientId + " Arrival time :" + arrivalTime;
    }
}

