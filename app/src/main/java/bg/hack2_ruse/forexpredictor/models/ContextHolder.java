package bg.hack2_ruse.forexpredictor.models;

import android.content.Context;

import java.util.List;

/**
 * Created by student on 15-11-8.
 */
public class ContextHolder {


    private static final ContextHolder instance = new ContextHolder();

    private Context context;


    private  ContextHolder (){

    }

    public void setContext(Context context){
        this.context = context;
    }

    public Context getContext(){
        return context;
    }

    public static ContextHolder getInstance(){
        return instance;
    }
}
