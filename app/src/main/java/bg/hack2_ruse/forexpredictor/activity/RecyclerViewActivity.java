package bg.hack2_ruse.forexpredictor.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import bg.hack2_ruse.forexpredictor.R;
import bg.hack2_ruse.forexpredictor.adapter.RecyclerForexAdapter;

public class RecyclerViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

    }

}
