package by.epam.unit06.main.task01;

public class Counter {
    private int minRange;
    private int maxRange;
    private int counter;

    public int getMinRange() {
        return minRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Counter() {
        minRange = 0;
        maxRange = 100;
        counter = 20;
    }

    public Counter(int minRange, int maxRange, int counter) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.counter = counter;
    }

    public int increase() {
        if (minRange > maxRange) {
            System.out.println("Incorrect Counter Range. MinCounter should be less than MaxCounter");
        } else if (counter < minRange || counter > maxRange) {
            System.out.println("Can't increase. Value is out of Counter range");
        } else {
            counter = counter + 1;
        }
        return counter;
    }

    public int decrease() {
        if (minRange > maxRange) {
            System.out.println("Incorrect Counter Range. MinCounter should be less than MaxCounter");
        } else if (counter < minRange || counter > maxRange) {
            System.out.println("Can't increase. Value is out of Counter range");
        } else {
            counter = counter - 1;
        }
        return counter;
    }
}
