package by.epam.unit06.main.task01;

public class CounterProgram {
    public static void main(String[] args){
        Counter counter1 = new Counter();
        counter1.setMinRange(10);
        counter1.setMaxRange(20);
        counter1.setCounter(15);
        System.out.println("Counter1: minRange is "+counter1.getMinRange());
        System.out.println("Counter1: maxRange is "+counter1.getMaxRange());
        System.out.println("Counter1: initial counter is = "+counter1.getCounter());

        counter1.decrease();
        System.out.println("Counter1: counter after decreasing is "+counter1.getCounter());

        counter1.increase();
        System.out.println("Counter1: counter after increasing is "+counter1.getCounter());

        System.out.println();

        Counter counter2 = new Counter(0, 20, 5);
        System.out.println("Counter2: minRange is "+counter2.getMinRange());
        System.out.println("Counter2: maxRange is "+counter2.getMaxRange());
        System.out.println("Counter2: initial counter is = "+counter2.getCounter());

        counter2.decrease();
        System.out.println("Counter2: counter after decreasing is "+counter2.getCounter());

        counter2.increase();
        System.out.println("Counter2: counter after increasing is "+counter2.getCounter());

        System.out.println();

        Counter counter3 = new Counter();
        System.out.println("Counter3: minRange is "+counter3.getMinRange());
        System.out.println("Counter3: maxRange is "+counter3.getMaxRange());
        System.out.println("Counter3: initial counter is = "+counter3.getCounter());

        counter3.decrease();
        System.out.println("Counter2: counter after decreasing is "+counter3.getCounter());

        counter3.increase();
        System.out.println("Counter2: counter after increasing is "+counter3.getCounter());
    }
}
