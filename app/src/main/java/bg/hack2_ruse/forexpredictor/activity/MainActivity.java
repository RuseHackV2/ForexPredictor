package bg.hack2_ruse.forexpredictor.activity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import bg.hack2_ruse.forexpredictor.R;
import bg.hack2_ruse.forexpredictor.adapter.InstrumentAdapter;
import bg.hack2_ruse.forexpredictor.data.PropertyUtul;
import bg.hack2_ruse.forexpredictor.models.Constants;
import bg.hack2_ruse.forexpredictor.models.Tools;
import bg.hack2_ruse.forexpredictor.services.AsyncResponse;
import bg.hack2_ruse.forexpredictor.services.InstrumentServiceTask;
import bg.hack2_ruse.forexpredictor.services.ToolServiceTask;

public class MainActivity extends AppCompatActivity implements AsyncResponse{

    private ListView mainLayout;

    private InstrumentServiceTask task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = (ListView) findViewById(R.id.inatrumentLinks);
        if (!isOnline()){
            Toast.makeText(getApplicationContext(), R.string.InternetError,Toast.LENGTH_LONG);
            finish();
        }

    }


    @Override
    protected void onResume() {
        PropertyUtul util = new PropertyUtul();
        Context context = getApplicationContext();
     //   List<Tools> tools =  util.getInstruments(context);
     //   if (tools.size() == 0){
            String requestURL = Constants.API + Constants.INSTRUMENTS_REQUEST;
            task = new InstrumentServiceTask(context, this);
            task.execute(requestURL);

    //    }else {
    //        feedAdapters(tools);
    //    }
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

    @Override
    public void processFinish(List<Tools> result) {
        feedAdapters(result);
    }

    public void feedAdapters(List<Tools> tools){
        ToolServiceTask task = new ToolServiceTask(getApplicationContext(),mainLayout,tools);
        task.execute();
    }
}
