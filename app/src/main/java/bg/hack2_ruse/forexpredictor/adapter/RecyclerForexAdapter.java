package bg.hack2_ruse.forexpredictor.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import bg.hack2_ruse.forexpredictor.R;

public class RecyclerForexAdapter extends RecyclerView.Adapter<RecyclerForexAdapter.ForexViewHolder>{



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
    public class ForexViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;

        public ForexViewHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.instrument);
            this.imageView = (ImageView) itemView.findViewById(R.id.main_imageview);
            this.textView = (TextView) itemView.findViewById(R.id.price);
            this.textView = (TextView) itemView.findViewById(R.id.date);

        }
    }
}
