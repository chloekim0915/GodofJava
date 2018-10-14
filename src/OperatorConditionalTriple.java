/*
삼항 연산자:변수=(boolean조건식)?true일때 값:false일때 값;
        변수에 값을 할당할때 사용
        ()안에는 boolean타입의 결과를 제공하는 조건식이 있어야함
        ?우측에는 true 일때의 값을,:우측일때는 false일때의 값을 지정
*/

public class OperatorConditionalTriple {
    public static void main(String[] args) {
        OperatorConditionalTriple operator = new OperatorConditionalTriple();
        operator.doBlindDate(30);
        operator.doBlindDate(80);
    }
    public boolean doBlindDate(int point) {
        boolean doBlindDateFlag = false;
        doBlindDateFlag = (point >= 80) ? true : false;
        System.out.println(point + ":" + doBlindDateFlag);
        return doBlindDateFlag;
    }
}
