public class Patient  {
    Patient next;
    Patient data;
    int ID;
    String name;
    int severity;
    int age;

    public Patient(int ID , String name ,int severity, int age){
        this.ID = ID ;
        this.name = name ;
        this.severity = severity ;
        this.age = age ;
    }

}
