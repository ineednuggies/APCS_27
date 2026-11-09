import java.util.*;

public class StepTracker{
    private int tsteps = 0;
    private int minSteps;
    private int activeDays = 0;
    private int daystracked = 0;
    
    public StepTracker(int minS){
        minSteps = minS;
  
    }

    public void addDailySteps(int steps){
    tsteps = tsteps + steps;
    daysTracked++;


    if(steps >= minSteps){
        activeDays++;
    }
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps() {
        if (daysTracked == 0) {
            return 0.0;
        }

        return (double)(tsteps / daystracked);
    }
}