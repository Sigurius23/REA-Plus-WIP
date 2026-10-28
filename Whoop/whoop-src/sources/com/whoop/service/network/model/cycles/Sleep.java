package com.whoop.service.network.model.cycles;

import com.whoop.data.local.room.entity.SleepNeedBreakdown;
import com.whoop.domain.model.ActivityState;
import hc3.AbstractC17176i;
import java.util.Arrays;
import java.util.List;
import or2.C28221z1;
import p048ce.AbstractC4482w;

/* JADX INFO: loaded from: classes10.dex */
public class Sleep {
    private transient ActivityState activityState;

    /* JADX INFO: renamed from: id */
    private final int f29458id;
    private final SleepActivity[] naps;
    private transient List<SleepActivity> napsList;
    private final SleepNeedBreakdown needBreakdown;
    private transient C28221z1 quality;
    private final Long qualityDuration;
    private final int score;
    private final SleepActivity[] sleeps;
    private transient List<SleepActivity> sleepsList;
    private final String state;

    public Sleep(int i13, String str, int i14, Long l7, SleepNeedBreakdown sleepNeedBreakdown, SleepActivity[] sleepActivityArr, SleepActivity[] sleepActivityArr2) {
        this.f29458id = i13;
        this.state = str;
        this.score = i14;
        this.qualityDuration = l7;
        this.needBreakdown = sleepNeedBreakdown;
        this.naps = sleepActivityArr;
        this.sleeps = sleepActivityArr2;
    }

    public ActivityState getActivityState() {
        if (this.activityState == null) {
            this.activityState = ActivityState.fromValue(this.state);
        }
        return this.activityState;
    }

    public int getId() {
        return this.f29458id;
    }

    public List<SleepActivity> getNaps() {
        if (this.napsList == null) {
            this.napsList = Arrays.asList(this.naps);
        }
        return this.napsList;
    }

    public SleepNeedBreakdown getNeedBreakdown() {
        return this.needBreakdown;
    }

    public C28221z1 getQualityDuration() {
        Long l7;
        if (this.quality == null && (l7 = this.qualityDuration) != null) {
            this.quality = new C28221z1(l7.longValue());
        }
        return this.quality;
    }

    public int getScore() {
        return this.score;
    }

    public SleepActivity getSignificantSleep() {
        if (AbstractC4482w.m13986W(getSleeps())) {
            return null;
        }
        return getSleeps().get(0);
    }

    public SleepActivity getSleepActivity(int i13) {
        for (SleepActivity sleepActivity : getSleeps()) {
            if (sleepActivity.getId() == i13) {
                return sleepActivity;
            }
        }
        for (SleepActivity sleepActivity2 : getNaps()) {
            if (sleepActivity2.getId() == i13) {
                return sleepActivity2;
            }
        }
        return null;
    }

    public List<SleepActivity> getSleeps() {
        if (this.sleepsList == null) {
            this.sleepsList = Arrays.asList(this.sleeps);
        }
        return this.sleepsList;
    }

    public String getState() {
        return this.state;
    }

    public boolean isEmpty() {
        return this.f29458id == 0 && AbstractC4482w.m13986W(this.sleepsList) && this.qualityDuration.longValue() == 0 && this.score == 0;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("Sleep{id=");
        sb4.append(this.f29458id);
        sb4.append(", state='");
        sb4.append(this.state);
        sb4.append("', activityState=");
        sb4.append(this.activityState);
        sb4.append(", score=");
        sb4.append(this.score);
        sb4.append(", qualityDuration=");
        sb4.append(this.qualityDuration);
        sb4.append(", quality=");
        sb4.append(this.quality);
        sb4.append(", needBreakdown=");
        sb4.append(this.needBreakdown);
        sb4.append(", naps=");
        sb4.append(Arrays.toString(this.naps));
        sb4.append(", napsList=");
        sb4.append(this.napsList);
        sb4.append(", sleeps=");
        sb4.append(Arrays.toString(this.sleeps));
        sb4.append(", sleepsList=");
        return AbstractC17176i.m48506h(sb4, this.sleepsList, '}');
    }
}
