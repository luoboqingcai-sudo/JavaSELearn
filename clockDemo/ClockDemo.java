public class ClockDemo {
    public static void main(String[] args) {
        ClockDisplay myClock = new ClockDisplay();
        
        myClock.setTime(22,39);
        System.out.println(myClock.showTime());

        myClock.increaseTime(200);
        System.out.println(myClock.showTime());
    }
}