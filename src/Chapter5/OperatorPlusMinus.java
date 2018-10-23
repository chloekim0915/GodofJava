package Chapter5;

public class OperatorPlusMinus {
    /*연산자 :  Operator
    * 기본연산자(boolean제외), String형 타입에서 사용가능
    *
    * '=' : 대입연산자(assignment operator)
    * '+' : 더하기연산자(additive operator)
    * '-' : 빼기연산자(substraction operator)
    * '*' : 곱하기 연산자(multiplication operator)
    * '/' : 나누기 연산자(division operator)
    * '%' : 나머지 연산자(remainder operator)*/
    public static void main(String args[]){
        OperatorPlusMinus sample = new OperatorPlusMinus();
        sample.additive();
    }
    public void additive(){
        int intValue1=5;
        int intValue2=10;
        int result = intValue1 + intValue2;
        System.out.println(result);
        result = intValue2 - intValue1;
        System.out.println(result);
    }
}
