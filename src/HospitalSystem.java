public class HospitalSystem {
    PatientList patientList;
    TreatmentQueue treatmentQueue;
    DischargeStack dischargeStack;
    public HospitalSystem(){
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
    }
}
