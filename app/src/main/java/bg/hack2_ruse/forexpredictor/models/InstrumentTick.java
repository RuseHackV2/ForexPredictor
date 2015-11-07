package bg.hack2_ruse.forexpredictor.models;

/**
 * Created by student on 15-11-7.
 */
public class InstrumentTick {

    private String instrumentName;
    private double openAsk;
    private double highAsk;
    private double lowAsk;
    private double closeAsk;

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public double getOpenAsk() {
        return openAsk;
    }

    public void setOpenAsk(double openAsk) {
        this.openAsk = openAsk;
    }

    public double getHighAsk() {
        return highAsk;
    }

    public void setHighAsk(double highAsk) {
        this.highAsk = highAsk;
    }

    public double getLowAsk() {
        return lowAsk;
    }

    public void setLowAsk(double lowAsk) {
        this.lowAsk = lowAsk;
    }

    public double getCloseAsk() {
        return closeAsk;
    }

    public void setCloseAsk(double closeAsk) {
        this.closeAsk = closeAsk;
    }
}
