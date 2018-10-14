/*대소비교연산자
boolean이나 참조자료형에서는 사용할 수 없다.
<=, >=의 위치를 바꾸어 => =<와 같이 적으면 컴파일이 되지 않는다
정리
==, != : 모든 기본자료형과 참조자료형 -> 즉 모든 타입에서 사용가능
>, <, >=, <= : boolean을 제외한 기본자료형*/
public class OperatorRelational {
    public static void main(String[] args) {
        OperatorRelational operator = new OperatorRelational();
        operator.relational();
    }
    public void relational(){
        int intValue1=1;
        int intValue2=2;
        System.out.println(intValue1>intValue2);
        System.out.println(intValue1<intValue2);
        System.out.println(intValue1>=intValue2);
        System.out.println(intValue1<=intValue2);

    }
}
