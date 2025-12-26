import java.util.HashMap;

public class HospitalSystem {
    PatientList patientList;
    PriorityTreatmentQueue treatmentQueue;
    DischargeStack dischargeStack;
    HashMap<Integer, Patient> patientHashMap;
    public HospitalSystem(){
        patientList = new PatientList();
        treatmentQueue = new PriorityTreatmentQueue();
        dischargeStack = new DischargeStack();
        patientHashMap = new HashMap<>();
    }
    //admitted patients
    void addPatient(Patient patient){
        patientList.addPatient(patient);
        patientHashMap.put(patient.ID, patient);
    }
    // change queue for treatment by priority
    void addTreatmentRequest(int patientId,boolean priority){
        if(!patientHashMap.containsKey(patientId)){
            System.out.println("Patient not found");
            return;
        }
        TreatmentRequest request = new TreatmentRequest(patientId,System.currentTimeMillis(),priority);
        treatmentQueue.enqueue(request);
    }
    // Treated patient and discharge them
    void processTreatment(){
        TreatmentRequest request = treatmentQueue.dequeue();
        if(request != null){
            DischargeRecord record = new DischargeRecord(request.patientId,System.currentTimeMillis());
            dischargeStack.push(record);
        }
    }
    // record the discharges
    void addDischargeRecord(DischargeRecord record){
        dischargeStack.push(record);
    }
    void printSystem(){
        System.out.println("PATIENTS:");
        patientList.printList();

        System.out.println("-----------");

        System.out.println("TREATMENT QUEUE");
        treatmentQueue.printQueue();

        System.out.println("-----------");

        System.out.println("DISCHARGE STACK");
        dischargeStack.printStack();
    }
}
