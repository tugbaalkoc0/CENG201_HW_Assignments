public class TestClassTreatmentQueue {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue();
        TreatmentRequest r1 = new TreatmentRequest(1287,System.currentTimeMillis());
        TreatmentRequest r2 = new TreatmentRequest(1288,System.currentTimeMillis());
        TreatmentRequest r3 = new TreatmentRequest(1285,System.currentTimeMillis());
        TreatmentRequest r4 = new TreatmentRequest(1284,System.currentTimeMillis());
        TreatmentRequest r5 = new TreatmentRequest(1286,System.currentTimeMillis());
        TreatmentRequest r6= new TreatmentRequest(1289,System.currentTimeMillis());
        TreatmentRequest r7 = new TreatmentRequest(1290,System.currentTimeMillis());
        TreatmentRequest r8 = new TreatmentRequest(1291,System.currentTimeMillis());

        queue.enqueue(r1);
        queue.enqueue(r2);
        queue.enqueue(r3);
        queue.enqueue(r4);
        queue.enqueue(r5);
        queue.enqueue(r6);
        queue.enqueue(r7);
        queue.enqueue(r8);

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();
    }
}
