import java.util.HashMap;

public class HospitalSystem {
    PatientList patientList;
    TreatmentQueue treatmentQueue;
    DischargeStack dischargeStack;
    HashMap<Integer, Patient> patientHashMap;
    public HospitalSystem(){
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientHashMap = new HashMap<>();
    }

    public void addPatient(Patient patient){
        patientList.addPatient(patient);
        patientHashMap.put(patient.ID, patient);
    }


}
