package com.patterns.Template;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.CoreMatchers;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Vetriselvan on 30-07-2017.
 */
public class WorkerTemplateTest {

    @Test
    public void testWorker() {
        List<Worker> workerList = new ArrayList<Worker>();
        workerList.add(new PostMan());
        workerList.add(new Manager());
        workerList.add(new Developer());
        workerList.add(new FireFighter());

        for(Worker worker : workerList) {
            worker.dailyRoutine();
        }
        for(Worker worker : workerList) {
            assert(true == worker.checkDailyRoutineCompleted());
        }
    }

    @Test
    public void testWorkerDailRoutineNotCompleted() {
        List<Worker> workerList = new ArrayList<Worker>();
        workerList.add(new Manager());
        workerList.add(new Developer());
        workerList.add(new FireFighter());
        workerList.add(new PostMan());

        for(Worker worker : workerList) {
            assert(false == worker.checkDailyRoutineCompleted());
        }
    }
}
