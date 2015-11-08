package bg.hack2_ruse.forexpredictor.services;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bg.hack2_ruse.forexpredictor.data.PropertyUtul;
import bg.hack2_ruse.forexpredictor.models.Constants;
import bg.hack2_ruse.forexpredictor.models.Tools;

/**
 * Created by student on 15-11-7.
 */
public class InstrumentServiceTask extends AsyncTask<String, Void, List<Tools>> {



    private OkHttpClient client;
    private Context context;
    private PropertyUtul util;
    private AsyncResponse responce;

   public InstrumentServiceTask(Context context, AsyncResponse responce){
       client = new OkHttpClient();
       util = new PropertyUtul();
       this.context = context;
       this.responce = responce;
   }

    @Override
    protected void onPostExecute(List<Tools> result) {
    responce.processFinish(result);
    }

    protected List<Tools> doInBackground(String... url) {
        try {
            String text = run(url[0]);
            JSONObject instrumentData = new JSONObject(text);
            JSONArray instrumetAskArr  = instrumentData.getJSONArray("instruments");
            Gson gson = new Gson();
            List<Tools> result = new ArrayList<>();
            for(int i = 0 ; i < instrumetAskArr.length(); i++)
            {
              Tools tools =  gson.fromJson(instrumetAskArr.get(i).toString(), Tools.class);
                result.add(tools);
            }
            Log.d("tag", result.size() + " ");

            util.saveObjects(result, context);
            return  result;
        }catch (IOException e)
        {
            e.printStackTrace();
        }catch(JSONException ex)
        {
            ex.printStackTrace();
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
