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

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        int[] listArrayNumber = new int[100000];
        for (int i = 0; i < 100000 ; i++) {
            listArrayNumber[i] = (int) Math.floor(Math.random()*10000);
        }
        int temp = 0;
        for (int i = 0; i < listArrayNumber.length - 1 ; i++) {
            for (int j = 0; j < listArrayNumber.length - 1 - i; j++) {
                if (listArrayNumber[j] > listArrayNumber[j+1]) {
                    temp += listArrayNumber[j];
                    listArrayNumber[j] = listArrayNumber[j+1];
                    listArrayNumber[j+1] = temp;
                }
            }
        }

        stopWatch.stop();

        System.out.println("Start Time: \n" + stopWatch.startTime + " milisecond");
        System.out.println("End Time: \n" + stopWatch.endTime + " milisecond");
        System.out.println("Time is to operate: \n" + stopWatch.getElapsedTime() + " milisecond");
    }
}
