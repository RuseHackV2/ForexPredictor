package bg.hack2_ruse.forexpredictor.services;

import android.content.Context;
import android.os.AsyncTask;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import bg.hack2_ruse.forexpredictor.models.Instrument;
import bg.hack2_ruse.forexpredictor.data.PropertyUtul;
import bg.hack2_ruse.forexpredictor.models.Constants;

/**
 * Created by student on 15-11-7.
 */
public class ToolServiceTask extends AsyncTask<String, Void , Instrument> {

    private OkHttpClient client;
    private  PropertyUtul util;
    private Context context;


    public ToolServiceTask(Context context){
        client = new OkHttpClient();
        util = new PropertyUtul();
        this.context = context;
    }


    protected Instrument doInBackground(String... url) {
        try {

            String text = run(url[0]);
            Gson gson = new Gson();
            Instrument instrument = gson.fromJson(text, Instrument.class);
            return  instrument;
        }catch (IOException e)
        {
            e.printStackTrace();
        }

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

}
