package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Exception exception = new Exception();
        exception.verOne(10,2);
        exception.verOne(10,0);

        Exception exception1 = new Exception();
        int[] num = {1,2,3,4,5};
        exception1.verTwo(num,2);
        exception1.verTwo(num,10);
        exception1.verTwo(null,10);

        Exception exception2 = new Exception();
        int[] num1 = {1,2,3,4,5};
        exception2.verThree(num1,2);
        exception2.verThree(num1,10);
        exception2.verThree(null,10);

        Exception exception3 =  new Exception();
        exception2.verFour();
    }
}
