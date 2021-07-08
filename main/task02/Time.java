package by.epam.unit06.main.task02;

public class Time {
    private int hh;
    private int min;
    private int sec;

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        if (hh < 0 || hh > 24) {
            this.hh = 0;
        } else {
            this.hh = hh;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min < 0 || min > 60) {
            this.min = 0;
        } else {
            this.min = min;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec < 0 || sec > 60) {
            this.sec = 0;
        } else {
            this.sec = sec;
        }
    }

    public void increaseTime(int hh, int min, int sec) {
        int currentTime;
        int addTime;
        int newTime;
        int newHh;
        int newMin;
        int newSec;

        currentTime = this.hh * 3600 + this.min * 60 + this.sec;
        addTime = hh * 3600 + min * 60 + sec;
        newTime = currentTime + addTime;
        newHh = newTime / 3600;
        newMin = ((newTime - newHh * 3600) / 60);
        newSec = (newTime - newHh * 3600 - newMin * 60);

        this.setHh(newHh);
        this.setMin(newMin);
        this.setSec(newSec);
    }

    public void decreaseTime(int hh, int min, int sec) {
        int currentTime;
        int decreaseTime;
        int newTime;
        int newHh;
        int newMin;
        int newSec;

        currentTime = this.hh * 3600 + this.min * 60 + this.sec;
        decreaseTime = hh * 3600 + min * 60 + sec;

        if (currentTime >= decreaseTime) {
            newTime = currentTime - decreaseTime;
        } else {
            newTime = 24 * 3600 + currentTime - decreaseTime;
        }

        newHh = newTime / 3600;
        newMin = ((newTime - newHh * 3600) / 60);
        newSec = (newTime - newHh * 3600 - newMin * 60);

        this.setHh(newHh);
        this.setMin(newMin);
        this.setSec(newSec);
    }

}
