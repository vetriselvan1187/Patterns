package com.patterns.Template;

/**
 * Created by Vetriselvan on 30-07-2017.
 */
abstract class Worker {

    public enum WORKER_TYPE {
        FIRE_FIGHTER(1, "FireFighter", "He is the one to look for during emergency cases"),
        POST_MAN(2, "PostMan", "He is the one delivers post"),
        MANAGER(3, "Manager", "He is the one Manages the team"),
        DEVELOPER(4, "Developer", "He is the one develop Software");

        private int id;
        private String workerType;
        private String workerDescription;

        WORKER_TYPE(int id, String workerType,  String workerDescription) {
            this.id = id;
            this.workerType = workerType;
            this.workerDescription = workerDescription;
        }

        public String getWorkerType() {
            return this.workerType;
        }
    }

    private String worker;
    private boolean isDailyRoutineCompleted;

    public Worker(String worker) {
        this.worker = worker;
    }

    public void dailyRoutine(){
        wakeUp();
        eatBreakFast();
        goToWork();
        work();
        returnToHome();
        relax();
        sleep();
        isDailyRoutineCompleted = true;
    }

    void wakeUp() {
        System.out.println(this.worker+" is waking up");
    }

    void eatBreakFast() {
        System.out.println(this.worker+" is eating breakFast");
    }

    void goToWork() {
        System.out.println(this.worker+" is going to Work");
    }

    abstract void work();

    void returnToHome() {
        System.out.println(this.worker+" is returning to Home");
    }

    void relax() {
        System.out.println(this.worker+" is relaxing");
    }

    void sleep() {
        System.out.println(this.worker+" is sleeping");
    }

    public boolean checkDailyRoutineCompleted() {
        return isDailyRoutineCompleted;
    }
}


class FireFighter extends Worker {

    public FireFighter() {
        super(WORKER_TYPE.FIRE_FIGHTER.getWorkerType());
    }

    @Override
    void work() {
        System.out.println(WORKER_TYPE.FIRE_FIGHTER.getWorkerType()+" is working right now");
    }
}

class PostMan extends Worker {

    public PostMan() {
        super(WORKER_TYPE.FIRE_FIGHTER.getWorkerType());
    }

    @Override
    void work() {
        System.out.println(WORKER_TYPE.POST_MAN.getWorkerType()+" is working hard right now");
    }
}

class Manager extends Worker {

    public Manager() {
        super(WORKER_TYPE.MANAGER.getWorkerType());
    }

    @Override
    void work() {
        System.out.println(WORKER_TYPE.MANAGER.getWorkerType()+" is working right now");
    }
}

class Developer extends Worker {

    public Developer() {
        super(WORKER_TYPE.DEVELOPER.getWorkerType()+" is working right now");
    }

    @Override
    void work() {
        System.out.println(WORKER_TYPE.DEVELOPER.getWorkerType()+" is working righ now");
    }
}