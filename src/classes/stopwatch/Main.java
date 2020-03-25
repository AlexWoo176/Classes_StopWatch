package classes.stopwatch;

public class Main {
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

        System.out.println("Start Time: \n" + stopWatch.getStartTime() + " milisecond");
        System.out.println("End Time: \n" + stopWatch.getEndTime() + " milisecond");
        System.out.println("Time is to operate: \n" + stopWatch.getElapsedTime() + " milisecond");
    }
}
