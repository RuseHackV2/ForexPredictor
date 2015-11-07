package bg.hack2_ruse.forexpredictor.services;

import java.util.List;

import bg.hack2_ruse.forexpredictor.models.Tools;

/**
 * Created by student on 15-11-7.
 */
public interface AsyncResponse {

    void processFinish(List<Tools> result);
}
