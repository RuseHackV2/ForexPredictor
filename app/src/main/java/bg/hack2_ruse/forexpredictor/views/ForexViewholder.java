package bg.hack2_ruse.forexpredictor.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import bg.hack2_ruse.forexpredictor.R;
import bg.hack2_ruse.forexpredictor.models.ContextHolder;
import bg.hack2_ruse.forexpredictor.models.Instrument;
import bg.hack2_ruse.forexpredictor.services.SingleViewService;

/**
 * Created by student on 15-11-7.
 */
public class ForexViewholder extends RecyclerView.ViewHolder {


    public ImageView imageView;
    public TextView instrument;
    public TextView price;
    public TextView date;
    public Context context;

    private SingleViewService service;

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

    public ForexViewholder(View itemView, Context context) {
        super(itemView);

        this.imageView = (ImageView) itemView.findViewById(R.id.main_imageview);
        this.instrument = (TextView) itemView.findViewById(R.id.instrument);
        this.price = (TextView) itemView.findViewById(R.id.price);
        this.date = (TextView) itemView.findViewById(R.id.date);
    }

    public void startTimer(Instrument instrument) {
        service = new SingleViewService(ForexViewholder.this, instrument);
        final Handler handler = new Handler();
        Timer timer = new Timer();
        TimerTask doAsynchronousTask = new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        try {
                            service.execute();
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                        }
                    }
                });
            }
        };
        timer.schedule(doAsynchronousTask, 0, 5000);
    }


    public void switchImage() {
        Drawable draw;
        if (imageView != null) {
            if (imageView.getDrawable().getConstantState() == ContextHolder.getInstance().getContext().getResources().getDrawable(R.drawable.green_arrow).getConstantState()) {
                Drawable drawable = ContextHolder.getInstance().getContext().getResources().getDrawable(R.drawable.red_arrow);
                imageView.setImageDrawable(drawable);
            } else {
                Drawable drawable = ContextHolder.getInstance().getContext().getResources().getDrawable(R.drawable.green_arrow);
                imageView.setImageDrawable(drawable);

            }
            imageView.invalidate();
        }

    }
}
