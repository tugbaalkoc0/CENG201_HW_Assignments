public class PatientList {
    Patient head = null;
    Patient tail = null;


    void addPatient(Patient patient){
        if(head == null){
            head = patient;
            tail = patient;
        }else{
            tail.next = patient;
            patient.next = null;
            tail = patient;
        }
        System.out.println("Patient added");
    }
    void print(){

    }


}
