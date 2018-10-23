package Chapter6;

public class ControlIf {

    public static void main(String[] args) {
        ControlIf control = new ControlIf();
        control.ifStatement();
    }

    public void ifStatement(){
        int intValue = 5;

        if(intValue > 5) System.out.println("It's bigger than 5.");
        else System.out.println("It's smaller or equal than 5.");

        if(intValue <=5)
            System.out.println("It's smaller or equal than 5.");
        else
            System.out.println("It's bigger than 5.");

       /*
        if(true);
        if(true) System.out.println("It's true");
        if(true)
            System.out.println("It's also true.");
        if(false) System.out.println("It's false"); //if 다음에 오는 소괄호 안에 삾이 true일 경우에만 처리된다.
        //따라서 위의 값을 출력되지 않는다.*/
    }
}
