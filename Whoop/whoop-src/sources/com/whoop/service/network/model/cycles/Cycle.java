package com.whoop.service.network.model.cycles;

import com.google.gson.annotations.SerializedName;
import com.whoop.p069ui.AbstractC10538f;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p000.AbstractC11266d;
import p048ce.AbstractC4482w;

/* JADX INFO: loaded from: classes10.dex */
public class Cycle {
    public static final DateTime EPOCH = new DateTime(2014, 1, 1, 0, 0);
    private transient List<LocalDate> daysList;

    @SerializedName("days")
    private String[] daysStringArray;
    private Period during;

    /* JADX INFO: renamed from: id */
    private long f29456id;
    private String lastUpdatedAt;
    private transient DateTime lastUpdatedAtDateTime;
    private String predictedEnd;
    private transient DateTime predictedEndDateTime;
    private Recovery recovery;
    private Sleep sleep;
    private Strain strain;

    public Cycle(long j7, String[] strArr, Period period, String str, String str2, Strain strain, Sleep sleep, Recovery recovery) {
        this.f29456id = j7;
        this.daysStringArray = strArr;
        this.during = period;
        this.predictedEnd = str;
        this.lastUpdatedAt = str2;
        this.strain = strain;
        this.sleep = sleep;
        this.recovery = recovery;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cycle) {
            return this.f29456id == ((Cycle) obj).f29456id;
        }
        return super.equals(obj);
    }

    public List<LocalDate> getDays() {
        if (this.daysList == null) {
            this.daysList = new ArrayList(this.daysStringArray.length);
            for (String str : this.daysStringArray) {
                this.daysList.add(AbstractC10538f.m27188m(str));
            }
        }
        return this.daysList;
    }

    public Period getDuring() {
        return this.during;
    }

    public LocalDate getFirstDate() {
        List<LocalDate> days = getDays();
        if (AbstractC4482w.m13986W(days)) {
            return null;
        }
        return days.get(0);
    }

    public long getId() {
        return this.f29456id;
    }

    public LocalDate getLastDate() {
        List<LocalDate> days = getDays();
        if (AbstractC4482w.m13986W(days)) {
            return null;
        }
        return (LocalDate) AbstractC11266d.m30455i(1, days);
    }

    public DateTime getLastUpdatedAt() {
        if (this.lastUpdatedAtDateTime == null) {
            this.lastUpdatedAtDateTime = DateTime.parse(this.lastUpdatedAt);
        }
        return this.lastUpdatedAtDateTime;
    }

    public DateTime getPredictedEnd() {
        if (this.predictedEndDateTime == null) {
            this.predictedEndDateTime = DateTime.parse(this.predictedEnd);
        }
        return this.predictedEndDateTime;
    }

    public Recovery getRecovery() {
        return this.recovery;
    }

    public SleepActivity getSignificantSleep() {
        Sleep sleep = this.sleep;
        if (sleep != null) {
            return sleep.getSignificantSleep();
        }
        return null;
    }

    public Sleep getSleep() {
        return this.sleep;
    }

    public Strain getStrain() {
        return this.strain;
    }

    public int hashCode() {
        return Long.hashCode(this.f29456id);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("Cycle(");
        sb4.append(getFirstDate());
        sb4.append(this.daysStringArray.length > 1 ? AbstractC18489d0.m53371l(new StringBuilder("{"), this.daysStringArray.length, "}") : "");
        sb4.append(") lastUpdatedAtDateTime=");
        sb4.append(getLastUpdatedAt());
        sb4.append(this.recovery == null ? " no recovery" : " has recovery");
        return sb4.toString();
    }
}
