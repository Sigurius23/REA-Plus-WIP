package kp0;

import org.joda.time.LocalTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kp0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lkp0/c;", "Lkp0/a;", "Lorg/joda/time/LocalTime;", "latestWakeTime", "Lkp0/o;", "sleepPercent", "<init>", "(Lorg/joda/time/LocalTime;Lkp0/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalTime;", "b", "()Lorg/joda/time/LocalTime;", "Lkp0/o;", "d", "()Lkp0/o;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22736c extends AbstractC22734a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LocalTime latestWakeTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22748o sleepPercent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22736c(LocalTime latestWakeTime, AbstractC22748o sleepPercent) {
        super(null);
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(sleepPercent, "sleepPercent");
        this.latestWakeTime = latestWakeTime;
        this.sleepPercent = sleepPercent;
    }

    @Override // kp0.AbstractC22734a
    /* JADX INFO: renamed from: b, reason: from getter */
    public LocalTime getLatestWakeTime() {
        return this.latestWakeTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC22748o getSleepPercent() {
        return this.sleepPercent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22736c)) {
            return false;
        }
        C22736c c22736c = (C22736c) other;
        return AbstractC22676k.m65745e(this.latestWakeTime, c22736c.latestWakeTime) && AbstractC22676k.m65745e(this.sleepPercent, c22736c.sleepPercent);
    }

    public int hashCode() {
        return this.sleepPercent.hashCode() + (this.latestWakeTime.hashCode() * 31);
    }

    public String toString() {
        return "ExactTime(latestWakeTime=" + getLatestWakeTime() + ", sleepPercent=" + this.sleepPercent + ")";
    }
}
