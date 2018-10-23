package Chapter5;

/*등가비교연산자
모든 기본자료형과 참조자료형에서 사용가능
기본자료형은 같은종류끼리 비교가능
char == interface
double == interface
boolean == boolean
*/
public class OperatorComparision {
    public static void main(String[] args) {
        OperatorComparision operator = new OperatorComparision();
        /*operator.comparision();*/
        /*operator.comparision2();*/
        operator.comparision3();
    }
    public void comparision(){
        /*int intValue1=1;
        int intValue2=2;
        int intValue3=1;
        System.out.println(intValue1==intValue2);
        System.out.println(intValue1==intValue3);

        System.out.println(intValue1==intValue2);
        System.out.println(!intValue1==!intValue3);
    */}
    public void comparision2(){
       /* char charValue='a';
        System.out.println(97==charValue);
        int intValue=1;
        double doubleValue=1.0;
        System.out.println(intValue==doubleValue);*/
    }
    public void comparision3(){
        boolean a = true;
        boolean b = false;
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}
