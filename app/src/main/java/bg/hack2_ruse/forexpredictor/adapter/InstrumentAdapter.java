package bg.hack2_ruse.forexpredictor.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bg.hack2_ruse.forexpredictor.R;
import bg.hack2_ruse.forexpredictor.models.Instrument;
import bg.hack2_ruse.forexpredictor.views.ForexViewholder;

/**
 * Created by Petq on 7.11.2015 г..
 */
public class InstrumentAdapter extends ArrayAdapter<Instrument> {

    private  Context context;
    private List<Instrument> quotes;
    private Typeface typeface;

    public InstrumentAdapter(Context context, List<Instrument> quotesArrayList) {
        super(context, R.layout.main_element_layout);
        this.context = context;
        quotes = quotesArrayList;
    ///    typeface = Typeface.createFromAsset(context.getAssets(), "fonts/QuicksandRegular.otf");
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ForexViewholder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.main_element_layout, null, true);
            holder = new ForexViewholder(convertView);

            holder.instrument = (TextView) convertView.findViewById(R.id.instrument);
         //   holder.instrument.setTypeface(typeface);
            holder.imageView=(ImageView) convertView.findViewById(R.id.main_imageview);

            holder.price = (TextView) convertView.findViewById(R.id.price);
         //   holder.price.setTypeface(typeface);
            holder.date=(TextView)convertView.findViewById(R.id.date);
            holder.date.setTypeface(typeface);

            convertView.setTag(holder);
        } else {
            holder = (ForexViewholder) convertView.getTag();
        }

        Instrument instrument = quotes.get(position);
        holder.instrument.setText(instrument.getInstrument());
        Drawable draw =  context.getResources().getDrawable(R.drawable.green_arrow);
        holder.imageView.setImageDrawable(draw);
        holder.price.setText(instrument.getClose() + "");
        holder.date.setText(instrument.getDate().toString());

        return convertView;
    }

    @Override
    public int getCount() {
        return quotes.size();
    }

}