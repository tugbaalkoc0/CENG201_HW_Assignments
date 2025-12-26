public class DischargeRecord {
    int patientId ;
    long dischargeTime ;

    public DischargeRecord(int patientId , long dischargeTime){
        this.patientId = patientId;
        this.dischargeTime = dischargeTime;
    }
    //for print the discharged patient information
    public String toString() {
        return "Patient ID : " + patientId + " Discharge time  :" + dischargeTime;
    }
}
