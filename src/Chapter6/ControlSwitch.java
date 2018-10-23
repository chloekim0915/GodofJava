package Chapter6;

public class ControlSwitch {
    public static void main(String[] args) {
        ControlSwitch control = new ControlSwitch();
        control.switchStatement(1);
        control.switchStatement(2);
        control.switchStatement(3);
        control.switchStatement(4);
        control.switchStatement(6);
        control.switchStatement2(1);
    }
    public void switchStatement(int numberOfWhee1){
        switch (numberOfWhee1){
            case 1:
                System.out.println(numberOfWhee1+":It is one foot bicycle.");
                break;
            case 2:
                System.out.println(numberOfWhee1+":It is a moror cycle or  bicycle.");
                break;
            case 3:
                System.out.println(numberOfWhee1+":It is a trhee wheel car. ");
                break;
                case 4:
                System.out.println(numberOfWhee1+":It is a car");
                break;
                default:
                System.out.println(numberOfWhee1+":It is an expensive car.");
                break;
        }
    }
    public void switchStatement2(int numberOfWhee1){
        switch (numberOfWhee1){
            case 1:
                System.out.println(numberOfWhee1+":It is one foot bicycle.");
               // break;
            case 2:
                System.out.println(numberOfWhee1+":It is a motor cycle or  bicycle.");
                //break;
            case 3:
                System.out.println(numberOfWhee1+":It is a trhee wheel car. ");
                break;
            case 4:
                System.out.println(numberOfWhee1+":It is a car");
                break;
            default:
                System.out.println(numberOfWhee1+":It is an expensive car.");
                break;
        }
    }
}