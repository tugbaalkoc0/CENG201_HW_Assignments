public class TestClassPatient {
    public static void main(String[] args) {
        PatientList list = new PatientList();
        Patient p1 = new Patient(1284," Tuğba Alk " , 3 ,20);
        Patient p2 = new Patient(1285 ," Sude Yıl ",1,22);
        Patient p3 = new Patient(1286 ," İpek El " , 2,21);
        Patient p4 = new Patient(1287 ," Ahsen Kış" ,4 , 23);
        Patient p5 = new Patient(1288," Mehmet Gök " ,6,26);

        list.addPatient(p1);
        list.addPatient(p2);
        list.addPatient(p3);
        list.addPatient(p4);
        list.addPatient(p5);

        list.printList();

        list.removePatient(1287);

        list.findPatient(1288);

        list.printList();
        list.severitySort();
        list.printList();
    }
}
