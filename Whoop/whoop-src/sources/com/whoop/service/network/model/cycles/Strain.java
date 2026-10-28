package com.whoop.service.network.model.cycles;

import com.whoop.domain.model.ActivityState;
import hc3.AbstractC17176i;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import or2.AbstractC28177l;

/* JADX INFO: loaded from: classes10.dex */
public class Strain {
    public static final double MAX_STRAIN = 21.0d;
    private transient ActivityState activityState;
    private float averageHeartRate;
    private transient int kilocalories = -1;
    private double kilojoules;
    private int maxHeartRate;
    private double rawScore;
    private double score;
    private String state;
    private Workout[] workouts;
    private transient List<Workout> workoutsList;

    public Strain(String str, float f13, int i13, double d3, double d14, double d15, Workout[] workoutArr) {
        this.state = str;
        this.averageHeartRate = f13;
        this.maxHeartRate = i13;
        this.kilojoules = d3;
        this.score = d14;
        this.rawScore = d15;
        this.workouts = workoutArr;
    }

    public ActivityState getActivityState() {
        return ActivityState.UNKNOWN;
    }

    public float getAverageHeartRate() {
        return this.averageHeartRate;
    }

    public int getKilocalories() {
        if (this.kilocalories <= 0) {
            this.kilocalories = AbstractC28177l.m85294d(this.kilojoules);
        }
        return this.kilocalories;
    }

    public double getKilojoules() {
        return this.kilojoules;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public double getRawScore() {
        return this.rawScore;
    }

    public double getScore() {
        return this.score;
    }

    public double getScorePercent() {
        return getScore() / 21.0d;
    }

    public List<Workout> getWorkouts() {
        if (this.workoutsList == null) {
            Workout[] workoutArr = this.workouts;
            if (workoutArr == null) {
                return Collections.EMPTY_LIST;
            }
            this.workoutsList = Arrays.asList(workoutArr);
        }
        return this.workoutsList;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("Strain{state='");
        sb4.append(this.state);
        sb4.append("', activityState=");
        sb4.append(this.activityState);
        sb4.append(", averageHeartRate=");
        sb4.append(this.averageHeartRate);
        sb4.append(", maxHeartRate=");
        sb4.append(this.maxHeartRate);
        sb4.append(", kilojoules=");
        sb4.append(this.kilojoules);
        sb4.append(", kilocalories=");
        sb4.append(this.kilocalories);
        sb4.append(", score=");
        sb4.append(this.score);
        sb4.append(", rawScore=");
        sb4.append(this.rawScore);
        sb4.append(", workouts=");
        sb4.append(Arrays.toString(this.workouts));
        sb4.append(", workoutsList=");
        return AbstractC17176i.m48506h(sb4, this.workoutsList, '}');
    }
}
