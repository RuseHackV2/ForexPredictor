package bg.hack2_ruse.forexpredictor.models;

import java.util.Date;
import java.util.List;

/**
 * Created by student on 15-11-7.
 */
public class Instrument {

    private  String instrument;

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public List<Candle> getCandles() {
        return candles;
    }

    public void setCandles(List<Candle> candles) {
        this.candles = candles;
    }

    private  String granularity;

    private List<Candle> candles;

    public double getClose() {

        return candles.get(candles.size()-1).getCloseBid();
    }

    public String getDate() {
       return candles.get(candles.size()-1).getTime();
    }
}
