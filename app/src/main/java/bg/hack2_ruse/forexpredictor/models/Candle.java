package bg.hack2_ruse.forexpredictor.models;

import java.util.Date;

/**
 * Created by student on 15-11-7.
 */
public class Candle {

    private String time;
    private double openBid;
    private double openAsk;
    private double highBid;
    private double highAsk;
    private double lowBid;
    private double lowAsk;
    private double closeBid;
    private double closeAsk;
    private double volume;
    private boolean complete;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getOpenBid() {
        return openBid;
    }

    public void setOpenBid(double openBid) {
        this.openBid = openBid;
    }

    public double getOpenAsk() {
        return openAsk;
    }

    public void setOpenAsk(double openAsk) {
        this.openAsk = openAsk;
    }

    public double getHighBid() {
        return highBid;
    }

    public void setHighBid(double highBid) {
        this.highBid = highBid;
    }

    public double getHighAsk() {
        return highAsk;
    }

    public void setHighAsk(double highAsk) {
        this.highAsk = highAsk;
    }

    public double getLowBid() {
        return lowBid;
    }

    public void setLowBid(double lowBid) {
        this.lowBid = lowBid;
    }

    public double getLowAsk() {
        return lowAsk;
    }

    public void setLowAsk(double lowAsk) {
        this.lowAsk = lowAsk;
    }

    public double getCloseBid() {
        return closeBid;
    }

    public void setCloseBid(double closeBid) {
        this.closeBid = closeBid;
    }

    public double getCloseAsk() {
        return closeAsk;
    }

    public void setCloseAsk(double closeAsk) {
        this.closeAsk = closeAsk;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
