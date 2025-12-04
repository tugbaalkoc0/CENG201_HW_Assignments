public class Main {
    public static void main(String[] args) {
        PatientList list = new PatientList();
        Patient p1 = new Patient(1, "Tugba alk", 1, 20);
        Patient p2 = new Patient(2 ,"Sude Yıl" , 2 , 22);
        Patient p3 = new Patient(3,"Göktuğ Gök",3,26);
        Patient p4 = new Patient(4 ,"Emin Alk" , 1,25);
        Patient p5 = new Patient(5,"Ağsude Dur",5,22);
        list.addPatient(p1);
        list.addPatient(p2);
        list.addPatient(p3);
        list.addPatient(p4);
        list.addPatient(p5);

        list.printList();
        list.removePatient(2);
        list.printList();
        list.removePatient(5);
        list.printList();
        list.findPatient(1);
        list.findPatient(2);
    }
}