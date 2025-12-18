public class TestClassDischargeStack {
    public static void main(String[] args) {
        DischargeStack stacks = new DischargeStack();
        DischargeRecord r1 = new DischargeRecord(1289, System.currentTimeMillis());
        DischargeRecord r2 = new DischargeRecord(1288, System.currentTimeMillis());
        DischargeRecord r3 = new DischargeRecord(1287, System.currentTimeMillis());
        DischargeRecord r4 = new DischargeRecord(1286, System.currentTimeMillis());
        DischargeRecord r5 = new DischargeRecord(1285, System.currentTimeMillis());

        stacks.push(r1);
        stacks.push(r2);
        stacks.push(r3);
        stacks.push(r4);
        stacks.push(r5);

        stacks.printStack();
        stacks.peek();

        stacks.pop();
        stacks.pop();

        stacks.printStack();

        stacks.peek();




    }

}