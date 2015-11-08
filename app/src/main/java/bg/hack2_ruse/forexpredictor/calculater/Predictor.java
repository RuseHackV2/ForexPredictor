package bg.hack2_ruse.forexpredictor.calculater;

import android.provider.ContactsContract;

import java.util.Date;
import java.util.Map;

/**
 * Created by Admin on 7.11.2015 г..
 */
public class Predictor {

    //Last week
    private double lst;

    //open last week
    private double olst;

    //Closed last week
    private double clst;

    /**
     * Calculates last weaks resutls
     *
     * @param tool the tool we want to analyze
     * @return false if last weak was negative , true otherwise.
     */
 public boolean getLastWeakData(Map<Date, String> tool){

     return false;
 }

    /**
     * Gives the direction of the bar.
     *
     *
     * @return true if the signal is red , true if green
     */
    public boolean calculateResultFromLAstWeek(double olst, double clst){
        return olst > clst ? true : false;
    }


    /**
     * Calculates absolute difference betwean open and close positions.
     *
     *
     * @param olst start point
     * @param clst close point
     * @return the RLST value for future calculations.
      */
    public double calculateDiference(double olst, double clst){
        return  Math.abs(olst -clst);
    }


    public void validateBar(double cpr){
        boolean lst = getLastWeakData(null);
        double rlst = calculateDiference(olst,clst);
    if (rlst > (0.003 * cpr)){

    }
    }
}

