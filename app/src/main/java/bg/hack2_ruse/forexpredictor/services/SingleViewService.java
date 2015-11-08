package bg.hack2_ruse.forexpredictor.services;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import bg.hack2_ruse.forexpredictor.models.Constants;
import bg.hack2_ruse.forexpredictor.models.Instrument;
import bg.hack2_ruse.forexpredictor.models.Tools;
import bg.hack2_ruse.forexpredictor.views.ForexViewholder;

/**
 * Created by student on 15-11-8.
 */
public class SingleViewService extends AsyncTask<Void, Void,Void> {

    private  ForexViewholder viewholder;
    private OkHttpClient client;
    private Instrument instrument;
    private Gson gson;

    public SingleViewService(ForexViewholder viewholder , Instrument instrument) {
        this.viewholder= viewholder;
        client = new OkHttpClient();
        this.instrument = instrument;
        gson = new Gson();
    }



    @Override
    protected Void doInBackground(Void... params) {


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        viewholder.switchImage();

        super.onPostExecute(aVoid);
    }

    private void getData(Instrument instrument) {
        String url = Constants.API+ "candles?instrument=" + instrument.getInstrument()+"&candleFormat=bidask";
        Log.i("Instrument", instrument.getInstrument());
        try {
            String text = run(url);
            Instrument ins = gson.fromJson(text,Instrument.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .header("Bearer", Constants.KEY)
                .build();

        Response response = client.newCall(request).execute();
        String res= response.body().string();
        return res;
    }

}
