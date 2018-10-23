package Chapter6;

public class ControlDoWhile {
    public static void main(String[] args) {
        ControlDoWhile control = new ControlDoWhile();
        control.dowWhile();
    }
    public void dowWhile(){
        ControlOfFlow control = new ControlOfFlow();
        int loop=0;
        do{
            loop++;
            control.switchCalander(loop);
        }while (loop <12);
    }
}
