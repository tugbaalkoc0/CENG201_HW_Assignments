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
        System.out.println("Patient added");
    }
    void removePatient(int id){
        if(head == null){
            System.out.println("The list is empty");
        }else if(head.ID == id){
            head = head.next;
            System.out.println("The first patient is deleted");
        }else {
            Patient temp = head ;
            Patient temp2 = head;
            while(temp != null){
                temp2 = temp;
                temp = temp.next;
            }
            //if()






        }



    }
    void print(){

        if (head == null){
            System.out.println("The list is empty");
        }else{
            Patient temp = head;
            while(temp != null){
                System.out.print(temp.name);
                temp = temp.next;
            }
        }

    }


}
