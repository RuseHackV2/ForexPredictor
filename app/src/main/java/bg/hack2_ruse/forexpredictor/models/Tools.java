package bg.hack2_ruse.forexpredictor.models;

import java.io.Serializable;

/**
 * Created by student on 15-11-7.
 */
public class Tools implements Serializable {

    private String instrument;

    private String displayName;

    private double pip;

    private long maxTradeUnits;

    public Tools(){

    }

    public Tools(String instrument, String displayName, double pip, long maxTradeUnits) {
        this.instrument = instrument;
        this.displayName = displayName;
        this.pip = pip;
        this.maxTradeUnits = maxTradeUnits;
    }

    public String getInstrument() {

        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public double getPip() {
        return pip;
    }

    public void setPip(double pip) {
        this.pip = pip;
    }

    public long getMaxTradeUnits() {
        return maxTradeUnits;
    }

    public void setMaxTradeUnits(long maxTradeUnits) {
        this.maxTradeUnits = maxTradeUnits;
    }
}
