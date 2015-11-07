package bg.hack2_ruse.forexpredictor.model;


import android.graphics.drawable.Drawable;

public class Quotes {
    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Drawable getMain_imageview() {
        return main_imageview;
    }

    public void setMain_imageview(Drawable main_imageview) {
        this.main_imageview = main_imageview;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String instrument;
    private Drawable main_imageview;
    private String price;

    private String date;

}
