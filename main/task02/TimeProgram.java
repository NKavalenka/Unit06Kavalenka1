package by.epam.unit06.main.task02;

public class TimeProgram {
    public static void main(String[] args){
        Time time = new Time();
        time.setHh(8);
        time.setMin(10);
        time.setSec(15);
        System.out.println("Current time is " + time.getHh() + "hh " + time.getMin() + "min " + time.getSec() + "sec");

        System.out.println();

        time.increaseTime(2, 59, 7 );
        System.out.println("New increased time is " + time.getHh() + "hh " + time.getMin() + "min " + time.getSec() + "sec");

        System.out.println();

        time.decreaseTime(3, 4, 6 );
        System.out.println("New decreased time is " + time.getHh() + "hh " + time.getMin() + "min " + time.getSec() + "sec");



    }
}
