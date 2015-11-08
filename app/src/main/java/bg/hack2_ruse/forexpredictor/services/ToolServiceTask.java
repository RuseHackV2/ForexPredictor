package bg.hack2_ruse.forexpredictor.services;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bg.hack2_ruse.forexpredictor.activity.MainActivity;
import bg.hack2_ruse.forexpredictor.adapter.InstrumentAdapter;
import bg.hack2_ruse.forexpredictor.models.Instrument;
import bg.hack2_ruse.forexpredictor.data.PropertyUtul;
import bg.hack2_ruse.forexpredictor.models.Constants;
import bg.hack2_ruse.forexpredictor.models.InstrumentHolder;
import bg.hack2_ruse.forexpredictor.models.Tools;

/**
 * Created by student on 15-11-7.
 */
public class ToolServiceTask extends AsyncTask<Void, Void , Void> {

    private OkHttpClient client;
    private PropertyUtul util;
    private Context context;
    private Gson gson;
    private List<Instrument> instruments;
    private ListView view;
    private List<Tools> list;

    private ProgressDialog dialog;

    public ToolServiceTask(Context activityContext,Context context, ListView view, List<Tools> list){
        client = new OkHttpClient();
        util = new PropertyUtul();
        gson = new Gson();
        instruments = new ArrayList<Instrument>();
        this.context = context;
        this.view = view;
        this.list= list;
        dialog = new ProgressDialog(activityContext);

    }


    @Override
    protected Void doInBackground(Void... params) {
          // for(Tools tools: list){
         //      getData(tools);
         //  }
        for(int i = 0; i < 10 ; i++)
        {
            Tools tools = list.get(i);
            getData(tools);
        }
       // getData(list.get(0));
        return null;
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

    private void getData(Tools tools) {
        String url = Constants.API+ "candles?instrument=" +tools.getInstrument()+"&candleFormat=bidask";
        Log.i("Instrument",tools.getInstrument());
        try {
            String text = run(url);
            Instrument ins = gson.fromJson(text,Instrument.class);
            instruments.add(ins);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onPreExecute() {
        dialog.setMessage("Loading");
        dialog.show();

        super.onPreExecute();

    }

    @Override
    protected void onPostExecute(Void aVoid) {
        InstrumentAdapter adapter = new InstrumentAdapter(context, instruments);
        InstrumentHolder holder = InstrumentHolder.getInstance();
        holder.setInstruments(instruments);
        view.setAdapter(adapter);
        view.invalidate();

        if(dialog.isShowing())
        {
            dialog.dismiss();
        }
        super.onPostExecute(aVoid);
    }

}
