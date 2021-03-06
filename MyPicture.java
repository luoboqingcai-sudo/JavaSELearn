/**
 * my test,
 *
 * @student luoboqingcai-sudo
 * @date 2020-09-21 22:21
 */
public class MyPicture {

    private Circle myCircle;
    private Square mySquare;
    private Circle myCircle2;
    private Circle myCircle3;
    private Triangle myTriangle;

    /**
     * draw on canvas
     */
    public void myDraw() {

        myCircle = new Circle();
        myCircle.makeVisible();
        for(int i = 0; i < 3; i++) {
            myCircle.moveDown();
        }
        myCircle.moveVertical(20);
        myCircle.slowMoveVertical(60);
        myCircle.changeSize(50);
        myCircle.moveHorizontal(-70);
        myCircle.moveHorizontal(70); // 不见了，让它回来
        myCircle.changeColor("black");
        myCircle.changeColor("pink"); // 颜色没有改变
        // myCircle.changeColor(black); // 编译器报错

        myCircle2 = new Circle();
        myCircle2.changeColor("yellow");
        myCircle2.changeSize(100);
        myCircle2.moveHorizontal(-10);
        myCircle2.moveVertical(-50);
        myCircle2.makeVisible();

        myCircle3 = new Circle();
        myCircle3.changeColor("green");
        myCircle3.changeSize(30);
        myCircle3.moveHorizontal(200);
        myCircle3.moveVertical(-60);
        myCircle3.makeVisible();

        myTriangle = new Triangle();
        myTriangle.makeVisible();

        mySquare = new Square();
        mySquare.changeSize(100);
        mySquare.moveLeft();
        mySquare.makeVisible();
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        MyPicture picture = new MyPicture();
        picture.myDraw();
    }
}
