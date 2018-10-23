package Chapter5;

public class OperatorIncrement {
    public static void main(String[] args) {
        OperatorIncrement operator = new OperatorIncrement();
        operator.increment();
        System.out.println("-------------");
        operator.increment2();
    }
    public void increment(){
        //내용생략
    }
    public void increment2(){
        int intValue=1;
        System.out.println(intValue);
        intValue = intValue+1;
        System.out.println(intValue);
        intValue = intValue+1;
        System.out.println(intValue);
    }
}
