public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    TreatmentRequest next;

    public TreatmentRequest(int patientId, long arrivalTime) {
        this.patientId = patientId;
        this.arrivalTime = arrivalTime;

    }

    public String toString() {
        return "Patient ID : " + patientId + " Arrival time :" + arrivalTime;
    }
}

