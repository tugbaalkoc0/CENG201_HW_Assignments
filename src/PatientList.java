public class PatientList {
    Patient head = null ;
    Patient tail = null ;

  // Add a new patient to the list
    void addPatient(Patient patient){
        //Adding first patient
        if(head == null){
            head = patient;
            tail = patient;//
        }
        //Adding to end
        else{
            tail.next = patient;
            patient.next = null;
            tail = patient;
        }
        //System.out.println("Patient added");
    }
    //remove a patient by their ID
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
        System.out.println("The patient " + id + " is deleted \n");
    }
    //Search for a patient by ID and return the object
    void findPatient(int id){
        Patient temp = head;
        while(temp != null) {
            if (temp.ID == id) {
             System.out.println("Name :" + temp.name + "\n" +
                        "Severity : " + temp.severity + "\n "+
                        "Age : " + temp.age + "\n");
             return;

            }
            temp = temp.next;
        }
        System.out.println("The patient not found");
    }
    //Print the list
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
    // sort the patient list by severity
    void severitySort(){
        if(head == null){
            return ;
        }
        boolean swapped;

        do {
            swapped = false;
            Patient current = head;

            //swap all information
            while (current.next != null) {
                if (current.severity > current.next.severity) {
                    int tempID = current.ID;
                    String tempName = current.name;
                    int tempSeverity = current.severity;
                    int tempAge = current.age;

                    current.ID =current.next.ID;
                    current.name = current.next.name;
                    current.severity = current.next.severity;
                    current.age = current.next.age;

                    current.next.ID = tempID;
                    current.next.name = tempName;
                    current.next.severity = tempSeverity;
                    current.next.age = tempAge;

                    swapped = true;
                }
                current = current.next;
            }
        }while (swapped);
    }
}
