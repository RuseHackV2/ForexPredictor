package bg.hack2_ruse.forexpredictor.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import bg.hack2_ruse.forexpredictor.R;

//recyclercityadapter
public class ForexViewHolder extends RecyclerView.ViewHolder {


    public ImageView imageView;
    public TextView instrument;
    public TextView price;
    public TextView date;

    public ForexViewHolder(View itemView) {
        super(itemView);

        this.imageView = (ImageView) itemView.findViewById(R.id.main_imageview);
        this.instrument = (TextView) itemView.findViewById(R.id.instrument);
        this.price = (TextView) itemView.findViewById(R.id.price);
        this.date = (TextView) itemView.findViewById(R.id.date);
    }


}