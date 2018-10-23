package Chapter5;

/*
단항연산자 : 피연산자가 하나만 있는것
+ : 단항 플러스 연산자. Unary plus operator
- : 단항 마이너스 연산자. Unary minus operator
+와-는 앞에 아무런 변수가 숫자가 없으면 더하기가 아니라 단항연산자로 분류된다.
'+'는 변수*(1)을 의미
'-'는 변수*(-)을 의미
*/
    public class OperatorUnary {
    public static void main(String[] args) {
        OperatorUnary operator = new OperatorUnary();
        operator.unary();
    }
    public void unary(){
        int intValue =-10;
        int result =+ intValue;
        System.out.println(result);
        result=-intValue;
        System.out.println(result);
    }
}
