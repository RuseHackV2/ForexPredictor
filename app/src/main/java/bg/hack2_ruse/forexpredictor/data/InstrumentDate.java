package bg.hack2_ruse.forexpredictor.data;


import java.util.Map;

public class InstrumentDate {

    private Map<String, InstrumentTick> weakly;

    private Map<String, InstrumentTick> daily;

    private String name;

    /**
     * @param weakly
     * @param daily
     * @param name
     */
    public InstrumentDate(Map<String, InstrumentTick> weakly, Map<String, InstrumentTick> daily,
                          String name) {
        this.weakly = weakly;
        this.daily = daily;
        this.name = name;
    }


    /**
     * Getter method for weakly.
     *
     * @return the weakly
     */
    public Map<String, InstrumentTick> getWeakly() {
        return weakly;
    }


    /**
     * Setter method for weakly.
     *
     * @param weakly the weakly to set
     */
    public void setWeakly(Map<String, InstrumentTick> weakly) {
        this.weakly = weakly;
    }


    /**
     * Getter method for daily.
     *
     * @return the daily
     */
    public Map<String, InstrumentTick> getDaily() {
        return daily;
    }


    /**
     * Setter method for daily.
     *
     * @param daily the daily to set
     */
    public void setDaily(Map<String, InstrumentTick> daily) {
        this.daily = daily;
    }


    /**
     * Getter method for name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * Setter method for name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Calculates the forecast with the latest data we have for the current instrument.
     *
     * @return true for positive forecast, false for negative, and null if indeterminate.
     */
    public Boolean getForcast() {


        return false;
    }
}
