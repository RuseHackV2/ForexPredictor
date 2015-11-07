package bg.hack2_ruse.forexpredictor.adapter;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import bg.hack2_ruse.forexpredictor.R;
import bg.hack2_ruse.forexpredictor.model.Quotes;


public class InstrumentAdapter extends RecyclerView.Adapter<RecyclerForexAdapter.ForexViewHolder>{

    private ArrayList<Quotes> quotesArrayList;
    private Typeface typeface;
    @Override
    public RecyclerForexAdapter.ForexViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerForexAdapter.ForexViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class CityViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;

        public CityViewHolder(View itemView) {
            super(itemView);

            this.imageView = (ImageView) itemView.findViewById(R.id.main_imageview);
            this.textView = (TextView) itemView.findViewById(R.id.instrument);


        }
    }
}
