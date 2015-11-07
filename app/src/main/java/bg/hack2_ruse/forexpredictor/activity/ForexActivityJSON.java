
package bg.hack2_ruse.forexpredictor.activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import bg.hack2_ruse.forexpredictor.R;


public class ForexActivityJSON extends AppCompatActivity {
    private static final String API = "http://api-sandbox.oanda.com/v1/candles?instrument=EUR_USD&candleFormat=bidask";
    private static final String KEY = "b80a30a81fd175436cd4216fa745d4d2-6ad350ca16082dd656199a3553b60c31";

    private OkHttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forcast_layout);
        Log.i("tag", "onCreate");
        client = new OkHttpClient();

        new GetInstrumentData().execute(API+KEY);

    }

    private String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        String res= response.body().string();
        Log.i("Result",res);
        return res;
    }

    private class GetInstrumentData extends AsyncTask<String, Void, Void>
    {
        protected Void doInBackground(String... url) {
            try {
                String text = run(url[0]);
                Log.d("tag", text);

            }catch (IOException e)
            {
                e.printStackTrace();
            }

            return null;
        }
    }
}
