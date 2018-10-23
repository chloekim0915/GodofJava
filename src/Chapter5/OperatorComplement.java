package Chapter5;

/*
!은 boolean타입에서만 사용이 가능하다.
이 연산자를 boolean값 앞에 붙여주면, 그 결과가 반대가 된다.*/
public class OperatorComplement {
    public static void main(String[] args) {
        OperatorComplement operator = new OperatorComplement();
        operator.complement();
    }
    public void complement(){
        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);
    }
}
