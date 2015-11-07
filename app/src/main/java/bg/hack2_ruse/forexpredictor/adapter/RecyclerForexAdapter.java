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

public class RecyclerForexAdapter extends RecyclerView.Adapter<RecyclerForexAdapter.ForexViewHolder> {

    private ArrayList<Quotes> quotesArrayList;
    private Typeface typeface;

    public RecyclerForexAdapter(Context context, ArrayList<Quotes> listQuotes) {
         Context mContext = context;
         ArrayList<Quotes> mQuotes;
    }

    @Override
    public RecyclerForexAdapter.ForexViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.main_element_layout, viewGroup, false);
        return new ForexViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(RecyclerForexAdapter.ForexViewHolder holder, int position) {

        Quotes quotes = mQuotes.get(position);
        ForexViewHolder.instrument.setText(quote.getName());
        ForexViewHolder.imageView.setImageDrawable(city.getIcon());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

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
}
