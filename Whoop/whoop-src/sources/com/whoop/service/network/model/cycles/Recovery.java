package com.whoop.service.network.model.cycles;

import com.whoop.domain.model.ActivityState;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
public class Recovery {
    public static final int SCORE_NONE = -1;
    private transient ActivityState activityState;
    private String blackoutUntil;
    private transient DateTime blackoutUntilDate;
    private boolean calibrating;
    private Double heartRateVariabilityRmssd;

    /* JADX INFO: renamed from: id */
    private int f29457id;
    private Integer recoveryResponseId;
    private boolean responded;
    private Integer restingHeartRate;
    private int score;
    private String state;
    private String timestamp;
    private transient DateTime timestampDate;

    public Recovery(int i13, String str, int i14, boolean z4, String str2, String str3, Integer num, Double d3, boolean z13, Integer num2) {
        this.f29457id = i13;
        this.state = str;
        this.score = i14;
        this.calibrating = z4;
        this.timestamp = str2;
        this.blackoutUntil = str3;
        this.restingHeartRate = num;
        this.heartRateVariabilityRmssd = d3;
        this.responded = z13;
        this.recoveryResponseId = num2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Recovery) && ((Recovery) obj).getId() == this.f29457id;
    }

    public ActivityState getActivityState() {
        if (this.activityState == null) {
            this.activityState = ActivityState.fromValue(this.state);
        }
        return this.activityState;
    }

    public DateTime getBlackoutUntilDate() {
        String str;
        if (this.blackoutUntilDate == null && (str = this.blackoutUntil) != null && !str.isEmpty()) {
            this.blackoutUntilDate = DateTime.parse(this.blackoutUntil);
        }
        return this.blackoutUntilDate;
    }

    public Double getHeartRateVariabilityRmssd() {
        return this.heartRateVariabilityRmssd;
    }

    public int getId() {
        return this.f29457id;
    }

    public Integer getRecoveryResponseId() {
        return this.recoveryResponseId;
    }

    public Integer getRestingHeartRate() {
        return this.restingHeartRate;
    }

    public int getScore() {
        return this.score;
    }

    public DateTime getTimestamp() {
        if (this.timestampDate == null) {
            this.timestampDate = DateTime.parse(this.timestamp);
        }
        return this.timestampDate;
    }

    public boolean hasScore() {
        return this.score != -1;
    }

    public int hashCode() {
        return this.f29457id;
    }

    public boolean isCalibrating() {
        return this.calibrating;
    }

    public boolean isCurrentlyBlackedOut() {
        DateTime blackoutUntilDate = getBlackoutUntilDate();
        return blackoutUntilDate != null && blackoutUntilDate.isAfter(System.currentTimeMillis());
    }

    public boolean isIncomplete() {
        return getActivityState() == ActivityState.INCOMPLETE;
    }

    public boolean isPending() {
        return getActivityState() == ActivityState.PENDING;
    }

    public boolean isResponded() {
        return this.responded;
    }

    public String toString() {
        return "Recovery{id=" + this.f29457id + ", state='" + this.state + "', score=" + this.score + ", activityState=" + this.activityState + ", calibrating=" + this.calibrating + ", timestamp='" + this.timestamp + "', timestampDate=" + this.timestampDate + ", blackoutUntil='" + this.blackoutUntil + "', blackoutUntilDate=" + this.blackoutUntilDate + ", restingHeartRate=" + this.restingHeartRate + ", heartRateVariabilityRmssd=" + this.heartRateVariabilityRmssd + ", responded=" + this.responded + ", recoveryResponseId=" + this.recoveryResponseId + '}';
    }
}
