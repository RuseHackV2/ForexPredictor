
package bg.hack2_ruse.forexpredictor.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

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
    private TextView instrumentTag;
    private Instrument instrument;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forcast_layout);
        intent = getIntent();
        int position = intent.getExtras().getInt("position");
        InstrumentHolder holder = InstrumentHolder.getInstance();
        instrument = holder.getInstruments().get(position);
        listView = (ListView) findViewById(R.id.itemHistoryList);
        instrumentTag = (TextView) findViewById(R.id.instrument);
        String name = intent.getStringExtra("name");
        for (Instrument inst : InstrumentHolder.getInstance().getInstruments()){
            if (name.equals(inst.getInstrument())){
                instrument = inst;
                break;
            }
        }

    }

    protected void onResume()
    {
        listView.setAdapter(new RecyclerForexAdapter(getApplicationContext(),instrument.getCandles()));
        listView.invalidate();
        instrumentTag.setText(intent.getStringExtra("name"));
        super.onResume();

    }



}
