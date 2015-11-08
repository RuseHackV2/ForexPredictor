package bg.hack2_ruse.forexpredictor.models;

import java.util.List;

/**
 * Created by student on 15-11-8.
 */
public class InstrumentHolder  {

    private static final InstrumentHolder instance = new InstrumentHolder();

    private List<Instrument> instruments;


    private  InstrumentHolder (){

    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public static InstrumentHolder getInstance(){
        return  instance;
    }
}
