package bg.hack2_ruse.forexpredictor.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import bg.hack2_ruse.forexpredictor.R;

/**
 * Created by student on 15-11-7.
 */
public class ForexViewholder extends RecyclerView.ViewHolder {


    public ImageView imageView;
    public TextView instrument;
    public TextView price;
    public TextView date;

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public TextView getInstrument() {
        return instrument;
    }

    public void setInstrument(TextView instrument) {
        this.instrument = instrument;
    }

    public TextView getPrice() {
        return price;
    }

    public void setPrice(TextView price) {
        this.price = price;
    }

    public TextView getDate() {
        return date;
    }

    public void setDate(TextView date) {
        this.date = date;
    }

    public ForexViewholder(View itemView) {
        super(itemView);

        this.imageView = (ImageView) itemView.findViewById(R.id.main_imageview);
        this.instrument = (TextView) itemView.findViewById(R.id.instrument);
        this.price = (TextView) itemView.findViewById(R.id.price);
        this.date = (TextView) itemView.findViewById(R.id.date);
    }


}
