public class TestHospitalSystem {
    public static void main(String[] args) {
       HospitalSystem system  =new HospitalSystem();
       system.addPatient(new Patient(100,"Tuğba Alkoç",1,20));
       system.addPatient(new Patient(101,"Sude Yıldız",3,22));
       system.addPatient(new Patient(102,"İpek Elhazar",2,21));
       system.addPatient(new Patient(103,"Ahsen Işık",6,23));
       system.addPatient(new Patient(104,"Ece Aydın",4,61));
       system.addPatient(new Patient(105,"Simay Oflu",5,8));
       system.addPatient(new Patient(106,"Göktuğ Gök",3,27));
       system.addPatient(new Patient(107,"Umay Deniz",8,15));
       system.addPatient(new Patient(108,"Aybars Haşim",9,7));
       system.addPatient(new Patient(109,"Ahmet Ay",7,33));

       system.addTreatmentRequest(100,false);
       system.addTreatmentRequest(104,true);
       system.addTreatmentRequest(108,true);
       system.addTreatmentRequest(102,false);
       system.addTreatmentRequest(106,false);
       system.addTreatmentRequest(103,false);
       system.addTreatmentRequest(107,true);
       system.addTreatmentRequest(109,false);

       system.addDischargeRecord(new DischargeRecord(105,System.currentTimeMillis()));
       system.addDischargeRecord(new DischargeRecord(101,System.currentTimeMillis()));


       system.processTreatment();
       system.processTreatment();
       system.processTreatment();
       system.processTreatment();

       system.printSystem();




    }
}
