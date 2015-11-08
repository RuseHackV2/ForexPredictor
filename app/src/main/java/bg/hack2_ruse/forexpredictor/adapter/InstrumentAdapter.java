package bg.hack2_ruse.forexpredictor.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import bg.hack2_ruse.forexpredictor.adapter.ForexViewHolder;
import android.widget.TextView;

import java.util.ArrayList;

import bg.hack2_ruse.forexpredictor.R;
import bg.hack2_ruse.forexpredictor.model.Quotes;


public class InstrumentAdapter extends ArrayAdapter<Quotes>{

    private  Context context;
    private ArrayList<Quotes> quotes;
    private Typeface typeface;
    public InstrumentAdapter(Context context, ArrayList<Quotes> quotesArrayList) {
        super(context, R.layout.main_element_layout);
        this.context = context;
        quotes = quotesArrayList;
        typeface = Typeface.createFromAsset(context.getAssets(), "fonts/QuicksandRegular.otf");
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ForexViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.main_element_layout, null, true);
            holder = new ForexViewHolder(convertView);

            holder.instrument = (TextView) convertView.findViewById(R.id.instrumentName);
            holder.instrument.setTypeface(typeface);
            holder.imageView=(ImageView) convertView.findViewById(R.id.main_imageview);

            holder.price = (TextView) convertView.findViewById(R.id.price);
            holder.price.setTypeface(typeface);
            holder.date=(TextView)convertView.findViewById(R.id.date);
            holder.date.setTypeface(typeface);

            convertView.setTag(holder);
        } else {
            holder = (ForexViewHolder) convertView.getTag();
        }

        Quotes quote = quotes.get(position);
        holder.instrument.setText(quote.getInstrument());
        holder.imageView.setImageDrawable(quote.getMain_imageview());
        holder.price.setText(quote.getPrice());
        holder.date.setText(quote.getDate());

        return convertView;
    }
}
