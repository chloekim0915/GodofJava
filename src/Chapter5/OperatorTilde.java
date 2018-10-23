package Chapter5;

/*~ : 틸드연산자
비트값 0을 1로, 1을 0으로 바꾸는데 사용한다.
* 알아둘것 - 자바의 기본적인 연산순서는 수학과 같다. 아래의 순서 참고
1.단항연산자 ++,--,+,-,!,~
2.산술연산자 *,/,%
3.산술연산자 +,-
하지만 언제나 괄호의 연산순위가 최우선되는 것을 기억하자*/
public class OperatorTilde {
    public static void main(String[] args) {
        OperatorTilde operator = new OperatorTilde();
        byte b = 127;
        operator.printTildeResult(b);
        b =1;
        operator.printTildeResult(b);
    }
    public void printTildeResult(byte b){
        System.out.println("Original value="+b);
        System.out.println("Tilde value="+~b);

    }
}
