package bg.hack2_ruse.forexpredictor.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bg.hack2_ruse.forexpredictor.R;
import bg.hack2_ruse.forexpredictor.models.Candle;
import bg.hack2_ruse.forexpredictor.models.Instrument;
import bg.hack2_ruse.forexpredictor.views.ForexViewholder;

public class RecyclerForexAdapter extends ArrayAdapter<Candle> {

    private Context context;
    private List<Candle> quotes;
    private Typeface typeface;

    public RecyclerForexAdapter(Context context, List<Candle> quotesArrayList) {
        super(context, R.layout.forcast_element_layout);
        this.context = context;
        quotes = quotesArrayList;
        ///    typeface = Typeface.createFromAsset(context.getAssets(), "fonts/QuicksandRegular.otf");
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        RecyclerForexViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.forcast_element_layout, null, true);
            holder = new RecyclerForexViewHolder(convertView);
            //   holder.instrument.setTypeface(typeface);
            holder.arrowImage=(ImageView) convertView.findViewById(R.id.arrowPredicted);

            holder.dateView = (TextView) convertView.findViewById(R.id.datePredicted);
            //   holder.price.setTypeface(typeface);
            holder.priceView = (TextView) convertView.findViewById(R.id.pricePredicted);
            convertView.setTag(holder);
        } else {
            holder = (RecyclerForexViewHolder) convertView.getTag();
        }

        Candle instrument = quotes.get(position);
        Drawable draw =  context.getResources().getDrawable(R.drawable.green_arrow);
        holder.arrowImage.setImageDrawable(draw);
        holder.dateView.setText(instrument.getTime().toString().substring(0,10) + "");
        holder.priceView.setText(instrument.getCloseAsk() + "");

        return convertView;
    }

    @Override
    public int getCount() {
        return quotes.size();
    }


    static class RecyclerForexViewHolder extends RecyclerView.ViewHolder  {
        private ImageView arrowImage;
        private TextView dateView;
        private TextView priceView;


        public RecyclerForexViewHolder(View itemView) {
            super(itemView);
        }
    }
}
