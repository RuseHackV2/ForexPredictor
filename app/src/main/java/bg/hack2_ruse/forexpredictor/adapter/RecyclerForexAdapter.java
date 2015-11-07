package bg.hack2_ruse.forexpredictor.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import bg.hack2_ruse.forexpredictor.R;
import bg.hack2_ruse.forexpredictor.model.Quotes;

public class RecyclerForexAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {




    private ArrayList<Quotes> quotesArrayList;
    private Typeface typeface;
    private  Context mContext;

    public RecyclerForexAdapter(Context context, ArrayList<Quotes> listQuotes) {
         mContext = context;
         ArrayList<Quotes> mQuotes;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.main_element_layout, null, false);
        return new ForexViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ForexViewHolder view = (ForexViewHolder) holder;
        Quotes quotes = quotesArrayList.get(position);
        view.instrument.setText(quotes.getInstrument());
        view.imageView.setImageDrawable(quotes.getMain_imageview());
        view.price.setText(quotes.getPrice());
        view.date.setText(quotes.getDate());
    }


    @Override
    public int getItemCount() {
        return quotesArrayList.size();
    }


}
