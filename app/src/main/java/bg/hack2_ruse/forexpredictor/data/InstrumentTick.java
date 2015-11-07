package bg.hack2_ruse.forexpredictor.data;


import java.util.Date;


public class InstrumentTick {

    private Date date;

    private Double open;

    private Double low;

    private Double close;

    private Double high;

    private String instrumentName;


    /**
     * Empy constructor
     */
    public InstrumentTick() {

    }


    /**
     * @param date
     * @param open
     * @param low
     * @param close
     * @param high
     * @param instrumentName
     */
    public InstrumentTick(Date date, Double open, Double low, Double close, Double high,
                          String instrumentName) {
        this.date = date;
        this.open = open;
        this.low = low;
        this.close = close;
        this.high = high;
        this.instrumentName = instrumentName;
    }


    /**
     * Getter method for date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter method for date.
     *
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Getter method for open.
     *
     * @return the open
     */
    public Double getOpen() {
        return open;
    }

    /**
     * Setter method for open.
     *
     * @param open the open to set
     */
    public void setOpen(Double open) {
        this.open = open;
    }

    /**
     * Getter method for low.
     *
     * @return the low
     */
    public Double getLow() {
        return low;
    }

    /**
     * Setter method for low.
     *
     * @param low the low to set
     */
    public void setLow(Double low) {
        this.low = low;
    }

    /**
     * Getter method for close.
     *
     * @return the close
     */
    public Double getClose() {
        return close;
    }

    /**
     * Setter method for close.
     *
     * @param close the close to set
     */
    public void setClose(Double close) {
        this.close = close;
    }

    /**
     * Getter method for high.
     *
     * @return the high
     */
    public Double getHigh() {
        return high;
    }

    /**
     * Setter method for high.
     *
     * @param high the high to set
     */
    public void setHigh(Double high) {
        this.high = high;
    }

    /**
     * Getter method for instrumentName.
     *
     * @return the instrumentName
     */
    public String getInstrumentName() {
        return instrumentName;
    }

    /**
     * Setter method for instrumentName.
     *
     * @param instrumentName the instrumentName to set
     */
    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

}
