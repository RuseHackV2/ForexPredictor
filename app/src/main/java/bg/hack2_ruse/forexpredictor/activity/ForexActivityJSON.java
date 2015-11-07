
package bg.hack2_ruse.forexpredictor.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import bg.hack2_ruse.forexpredictor.R;


public class ForexActivityJSON extends AppCompatActivity {
    private static final String API = "http://api-sandbox.oanda.com/v1/";
    private static final String KEY = "b80a30a81fd175436cd4216fa745d4d2-6ad350ca16082dd656199a3553b60c31";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forcast_layout);
    }
}
