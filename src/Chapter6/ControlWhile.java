package Chapter6;

public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile control = new ControlWhile();
        control.whileLoop1();
        control.whileLoop2();
        control.whileContinueInfinit();
    }
    public void whileLoop1(){
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop <12){
            loop++;
            control.switchCalander(loop);
        }
    }
    public void whileLoop2(){
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop <12){
            loop++;
            control.switchCalander(loop);
            if(loop==6)
                continue;
            control.switchCalander(loop);
        }
    }
    public void whileContinueInfinit(){
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop <12){
            if(loop==6) continue;
                loop++;
            control.switchCalander(loop);
        }
    }

}
