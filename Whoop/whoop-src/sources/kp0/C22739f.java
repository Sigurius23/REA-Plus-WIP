package kp0;

import org.joda.time.LocalTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kp0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lkp0/f;", "Lkp0/a;", "Lorg/joda/time/LocalTime;", "latestWakeTime", "<init>", "(Lorg/joda/time/LocalTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalTime;", "b", "()Lorg/joda/time/LocalTime;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22739f extends AbstractC22734a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LocalTime latestWakeTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22739f(LocalTime latestWakeTime) {
        super(null);
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        this.latestWakeTime = latestWakeTime;
    }

    @Override // kp0.AbstractC22734a
    /* JADX INFO: renamed from: b, reason: from getter */
    public LocalTime getLatestWakeTime() {
        return this.latestWakeTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C22739f) && AbstractC22676k.m65745e(this.latestWakeTime, ((C22739f) other).latestWakeTime);
    }

    public int hashCode() {
        return this.latestWakeTime.hashCode();
    }

    public String toString() {
        return "InTheGreen(latestWakeTime=" + getLatestWakeTime() + ")";
    }
}
