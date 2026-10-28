package gz0;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.c0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b%\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b.\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b4\u0010\u001eR#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b&\u0010<¨\u0006="}, m65681d2 = {"Lgz0/c0;", "", "", "bedtime", "consistency", "disturbances", AttachmentExtensionsKt.EXTRA_DURATION, "efficiency", "hoursOfSleep", "latency", "nap", "performance", "restorativeSleep", UserState.States.SLEEP, "sleepCycle", "sleepDebt", "sleepNeed", "stress", "sun", "timeInBed", "waketime", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIIIIIIIIIIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "getPerformance", "j", "getRestorativeSleep", "k", "l", "m", "n", "o", "getStress", "p", "q", "getTimeInBed", "r", "s", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16293c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int bedtime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int consistency;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int disturbances;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int efficiency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int hoursOfSleep;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int latency;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int nap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int performance;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int restorativeSleep;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int sleep;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int sleepCycle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int sleepDebt;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int sleepNeed;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int stress;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int sun;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int timeInBed;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int waketime;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16293c0(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, int i36, int i37, int i38, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.bedtime = i13;
        this.consistency = i14;
        this.disturbances = i15;
        this.duration = i16;
        this.efficiency = i17;
        this.hoursOfSleep = i18;
        this.latency = i19;
        this.nap = i24;
        this.performance = i25;
        this.restorativeSleep = i26;
        this.sleep = i27;
        this.sleepCycle = i28;
        this.sleepDebt = i29;
        this.sleepNeed = i34;
        this.stress = i35;
        this.sun = i36;
        this.timeInBed = i37;
        this.waketime = i38;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBedtime() {
        return this.bedtime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getConsistency() {
        return this.consistency;
    }

    /* JADX INFO: renamed from: c */
    public final List<C22396h<Integer>> m46156c() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDisturbances() {
        return this.disturbances;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16293c0)) {
            return false;
        }
        C16293c0 c16293c0 = (C16293c0) other;
        return this.bedtime == c16293c0.bedtime && this.consistency == c16293c0.consistency && this.disturbances == c16293c0.disturbances && this.duration == c16293c0.duration && this.efficiency == c16293c0.efficiency && this.hoursOfSleep == c16293c0.hoursOfSleep && this.latency == c16293c0.latency && this.nap == c16293c0.nap && this.performance == c16293c0.performance && this.restorativeSleep == c16293c0.restorativeSleep && this.sleep == c16293c0.sleep && this.sleepCycle == c16293c0.sleepCycle && this.sleepDebt == c16293c0.sleepDebt && this.sleepNeed == c16293c0.sleepNeed && this.stress == c16293c0.stress && this.sun == c16293c0.sun && this.timeInBed == c16293c0.timeInBed && this.waketime == c16293c0.waketime && AbstractC22676k.m65745e(this.descriptions, c16293c0.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getEfficiency() {
        return this.efficiency;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getHoursOfSleep() {
        return this.hoursOfSleep;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getLatency() {
        return this.latency;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.waketime, AbstractC11266d.m30448b(this.timeInBed, AbstractC11266d.m30448b(this.sun, AbstractC11266d.m30448b(this.stress, AbstractC11266d.m30448b(this.sleepNeed, AbstractC11266d.m30448b(this.sleepDebt, AbstractC11266d.m30448b(this.sleepCycle, AbstractC11266d.m30448b(this.sleep, AbstractC11266d.m30448b(this.restorativeSleep, AbstractC11266d.m30448b(this.performance, AbstractC11266d.m30448b(this.nap, AbstractC11266d.m30448b(this.latency, AbstractC11266d.m30448b(this.hoursOfSleep, AbstractC11266d.m30448b(this.efficiency, AbstractC11266d.m30448b(this.duration, AbstractC11266d.m30448b(this.disturbances, AbstractC11266d.m30448b(this.consistency, Integer.hashCode(this.bedtime) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getNap() {
        return this.nap;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSleep() {
        return this.sleep;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSleepCycle() {
        return this.sleepCycle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getSleepDebt() {
        return this.sleepDebt;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getSleepNeed() {
        return this.sleepNeed;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSun() {
        return this.sun;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getWaketime() {
        return this.waketime;
    }

    public String toString() {
        int i13 = this.bedtime;
        int i14 = this.consistency;
        int i15 = this.disturbances;
        int i16 = this.duration;
        int i17 = this.efficiency;
        int i18 = this.hoursOfSleep;
        int i19 = this.latency;
        int i24 = this.nap;
        int i25 = this.performance;
        int i26 = this.restorativeSleep;
        int i27 = this.sleep;
        int i28 = this.sleepCycle;
        int i29 = this.sleepDebt;
        int i34 = this.sleepNeed;
        int i35 = this.stress;
        int i36 = this.sun;
        int i37 = this.timeInBed;
        int i38 = this.waketime;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "SleepIcons(bedtime=", ", consistency=", ", disturbances=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", duration=", i16, ", efficiency=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", hoursOfSleep=", i18, ", latency=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", nap=", i24, ", performance=");
        AbstractC30802r.m94773v(sbM30465s, i25, ", restorativeSleep=", i26, ", sleep=");
        AbstractC30802r.m94773v(sbM30465s, i27, ", sleepCycle=", i28, ", sleepDebt=");
        AbstractC30802r.m94773v(sbM30465s, i29, ", sleepNeed=", i34, ", stress=");
        AbstractC30802r.m94773v(sbM30465s, i35, ", sun=", i36, ", timeInBed=");
        AbstractC30802r.m94773v(sbM30465s, i37, ", waketime=", i38, ", descriptions=");
        return AbstractC3855a.m11829m(sbM30465s, list, ")");
    }
}
