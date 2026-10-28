package com.whoop.service.network.model.cycles;

import android.content.Context;
import com.whoop.domain.model.ActivityState;
import java.util.HashMap;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Activity {
    private transient ActivityState activityState;
    protected Period during;

    /* JADX INFO: renamed from: id */
    private int f29455id;
    private transient Period offsetDuring;
    private boolean responded;
    private double score;
    private String state;
    private Integer surveyResponseId;
    private String timezoneOffset;

    public Activity() {
    }

    public boolean equals(Object obj) {
        return (obj instanceof Activity) && ((Activity) obj).getId() == this.f29455id;
    }

    public ActivityState getActivityState() {
        ActivityState activityState;
        synchronized (this) {
            try {
                if (this.activityState == null) {
                    ActivityState activityStateFromValue = ActivityState.fromValue(this.state);
                    this.activityState = activityStateFromValue;
                    if (activityStateFromValue == ActivityState.SCHEDULED && this.during.getUpper().isBeforeNow()) {
                        this.activityState = ActivityState.PENDING;
                    }
                }
                activityState = this.activityState;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return activityState;
    }

    public String getDisplayName(Context context) {
        return context.getString(getDisplayNameResource());
    }

    public abstract int getDisplayNameResource();

    public Period getDuring() {
        Period period;
        synchronized (this) {
            try {
                if (this.offsetDuring == null) {
                    DateTimeZone dateTimeZone = DateTimeZone.getDefault();
                    this.offsetDuring = new Period(this.during.getLower().withZone(dateTimeZone), this.during.getUpper().withZone(dateTimeZone));
                }
                period = this.offsetDuring;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return period;
    }

    public int getId() {
        return this.f29455id;
    }

    public abstract String getNameKey();

    public double getScore() {
        return this.score;
    }

    public String getState() {
        return this.state;
    }

    public Integer getSurveyResponseId() {
        return this.surveyResponseId;
    }

    public String getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public boolean isResponded() {
        return this.responded;
    }

    public String printDuring() {
        return "(" + this.during.getLower() + " - " + this.during.getUpper() + ")";
    }

    public HashMap<String, Object> toAnalyticsFormat(int i13, String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("startTime", this.during.getLower());
        map.put("endTime", this.during.getUpper());
        map.put("placement", Integer.valueOf(i13));
        map.put("activity", str);
        return map;
    }

    public String toString() {
        return "Activity{id=" + this.f29455id + ", state='" + this.state + "', activityState=" + this.activityState + ", score=" + this.score + ", during=" + this.during + ", offsetDuring=" + this.offsetDuring + ", timezoneOffset='" + this.timezoneOffset + "', responded=" + this.responded + ", surveyResponseId=" + this.surveyResponseId + '}';
    }

    public Activity(int i13) {
        this.f29455id = i13;
    }

    public Activity(int i13, String str, double d3, Period period, String str2, boolean z4, Integer num) {
        this.f29455id = i13;
        this.state = str;
        this.score = d3;
        this.during = period;
        this.timezoneOffset = str2;
        this.responded = z4;
        this.surveyResponseId = num;
    }

    public Activity(int i13, String str, Period period, String str2) {
        this.f29455id = i13;
        this.state = str;
        this.during = period;
        this.timezoneOffset = str2;
    }
}
