public class PatientList {
    Patient head = null ;
    Patient tail = null ;

    void addPatient(Patient patient){
        if(head == null){
            head = patient;
            tail = patient;
        }else{
            tail.next = patient;
            patient.next = null;
            tail = patient;
        }
        //System.out.println("Patient added");
    }
    void removePatient(int id) {
        //if list is empty
        if (head == null) {
            System.out.println("The list is empty");
        } // if id is first patient's id
        else if (head.ID == id) {
            head = head.next;
            System.out.println("The first patient " + id + " is deleted");
        } else {
            Patient temp = head;
            Patient temp2 = head;
            while(temp != null && temp.ID != id){
                temp2 = temp ;
                temp = temp.next;
            }
            temp2.next = temp.next;

        }
        System.out.println("The patient " + id + " is deleted");
    }
    void findPatient(int id){
        Patient temp = head;
        while(temp != null) {
            if (temp.ID == id) {
                System.out.println("Name " + temp.name +
                        " Severity " + temp.severity +
                        " Age " + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("The patient not found");
    }
    void printList(){

        if (head == null){
            System.out.println("The list is empty");
        }else{
            Patient temp = head;
            int i = 0;
            while(temp != null){
                System.out.println((i+1) +"-" + temp.name);
                temp = temp.next;
                i++;
            }
            System.out.println();
        }

    }


}
