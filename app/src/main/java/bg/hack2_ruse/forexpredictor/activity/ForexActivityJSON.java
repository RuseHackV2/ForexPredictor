
package bg.hack2_ruse.forexpredictor.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import bg.hack2_ruse.forexpredictor.R;
import bg.hack2_ruse.forexpredictor.adapter.RecyclerForexAdapter;
import bg.hack2_ruse.forexpredictor.models.Instrument;
import bg.hack2_ruse.forexpredictor.models.InstrumentHolder;


public class ForexActivityJSON extends AppCompatActivity {

    private ListView listView;
    Instrument instrument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forcast_layout);
        Intent intent = getIntent();
        int position = intent.getExtras().getInt("position");
        InstrumentHolder holder = InstrumentHolder.getInstance();
        instrument = holder.getInstruments().get(position);
        listView = (ListView) findViewById(R.id.itemHistoryList);

    }

    protected void onResume()
    {
        listView.setAdapter(new RecyclerForexAdapter(getApplicationContext(),instrument.getCandles()));
        listView.invalidate();
        super.onResume();

    }



}
