package Chapter5;

public class OperatorCasting {
    public static void main(String[] args) {
        OperatorCasting operator = new OperatorCasting();
        operator.casting();
        operator.casting2();
    }
    public void casting(){
        byte byteValue=127; //byteValue에 byte의 최대값인 127을 할당했다.
        short shortValue=byteValue; //byte값을 shortValue라는 변수에 할당했다. 이와 같이 범위가 작은 타입에서 범위가 큰 타입으로 변환할 때에는 별도로 명시하지 않아도
        //형변환이 이루어진다. 즉, bisil(비실)FD순서로는 형 변환을 할 때 아무런 문제없이 가능하다.

        shortValue++;//shortValue에 1을 더하고 결과를 출력했다. 이렇게 되면, byte의 최대값은 넘어가지만, short의 최대값은 넘어가지 않는다. 문제는 그 다음줄이다.
        System.out.println(shortValue);//byteValue 변수에 byte의 최대값보다 1이 많은 shortValue를 할당했다. 게다가 shortValue앞에는
        //(byte)라고 씌여있다. 이와 같이 범위가 큰 타입에서 범위가 작은 타입으로 변환할 때는 소괄호 안에 범위가 작은 타입을 명시해주어야만 한다. 그렇지 않으면 컴파일이 안된다.
        byteValue=(byte)shortValue;
        System.out.println(byteValue);
    }
    public void casting2(){
        short shortValue=256;
        byte byteValue=(byte)shortValue;
        System.out.println(byteValue);
        shortValue=255;
        byteValue=(byte)shortValue;
        System.out.println(byteValue);
    }
}
