package logical_programs;

public class StopWatchElapsedTime {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        double time;
        startTime = System.currentTimeMillis();
        for (long i = 0; i<= 100000; i++)
            continue;;
            endTime = System.currentTimeMillis();
            time = (endTime - startTime)/1000.0;
        System.out.println("Elapsed time in Seconds :"+time);
    }

}

