
/*
대입연산자(Compound Assginment Operator) : 기존 값에 값을 연산함
*/

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        CompoundAssignmentOperator Example = new CompoundAssignmentOperator();
        Example.Compound();
    }
    public void Compound(){
        int intValue1 = 10;
        intValue1+=5;
        System.out.println("intValue1 = " +intValue1);
        int intValue2=intValue1-=5;
        System.out.println("intValue2 = "+intValue2);
        int intValue3 = intValue2*=5;
        System.out.println("intValue3 = "+intValue3);
        int intValue4 = intValue3/=5;
        System.out.println("intValue4 = "+intValue4);
        int intValue5 = intValue4%=intValue4;
        System.out.println("intValue5 = "+intValue5);


    }

}
