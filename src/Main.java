public class Main {
    public static void main(String[] args) {
        PatientList list = new PatientList();
        Patient patient = new Patient(1234, "Tugba alk", 1, 20);
        list.addPatient(patient);
        list.print();
    }
}