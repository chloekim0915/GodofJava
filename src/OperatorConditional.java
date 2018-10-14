/*&& : AND결합 - 두개의 조건이 모두 true일때에만 true로 처리된다.class
|| : OR결합 - 두개 중 하나만 true이면 true로 처리돈다.*/

public class OperatorConditional {
    public static void main(String[] args) {
        OperatorConditional operator = new OperatorConditional();
        operator.condition();
    }
    public void condition(){
        boolean x = true;
        boolean y = true;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("---------------");
        x = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("---------------");
        y = false;
        System.out.println(x && y);
        System.out.println(x || y);

    }
}
