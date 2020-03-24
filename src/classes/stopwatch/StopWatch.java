package classes.stopwatch;

import java.util.Date;

public class StopWatch {
    public long startTime;
    public long endTime;

    public StopWatch() {
        Date date = new Date();
        startTime = date.getTime();
        endTime = date.getTime();
    }

    public long start() {
        Date date = new Date();
        return startTime = date.getTime();
    }

    public long stop() {
        Date date = new Date();
        return endTime = date.getTime();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
