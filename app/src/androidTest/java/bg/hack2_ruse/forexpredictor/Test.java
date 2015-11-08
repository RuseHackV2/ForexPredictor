package bg.hack2_ruse.forexpredictor;

import android.test.ActivityTestCase;

import junit.framework.Assert;

import bg.hack2_ruse.forexpredictor.calculater.Predictor;
import dalvik.annotation.TestTargetClass;

/**
 * Created by Admin on 7.11.2015 г..
 */

public class Test {
    Predictor predictor = new Predictor();

    public void test(){
        Assert.assertEquals(true,predictor.calculateResultFromLAstWeek(2.25,1.58));
        Assert.assertEquals(false,predictor.calculateResultFromLAstWeek(2.25,3.58));
    }


    public void test1(){
        Assert.assertEquals(2, predictor.calculateResultFromLAstWeek(4,2));
    }


    public  void test2(){
     //   Assert.assertEquals(false, predictor.validateBar(12,15.0));
    }
}
