package p605x6;

import p537ux.C35331f0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: x6.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C38015t {

    /* JADX INFO: renamed from: a */
    public final long f162838a;

    /* JADX INFO: renamed from: b */
    public final long f162839b;

    /* JADX INFO: renamed from: c */
    public final long f162840c;

    /* JADX INFO: renamed from: d */
    public final C35331f0 f162841d;

    public C38015t() {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long duration = DurationKt.toDuration(45, durationUnit);
        long duration2 = DurationKt.toDuration(5, durationUnit);
        long duration3 = DurationKt.toDuration(5, durationUnit);
        this.f162838a = duration;
        this.f162839b = duration2;
        this.f162840c = duration3;
        this.f162841d = C38014s.f162837a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38015t)) {
            return false;
        }
        C38015t c38015t = (C38015t) obj;
        return Duration.m134267equalsimpl0(this.f162838a, c38015t.f162838a) && Duration.m134267equalsimpl0(this.f162839b, c38015t.f162839b) && Duration.m134267equalsimpl0(this.f162840c, c38015t.f162840c) && AbstractC22676k.m65745e(this.f162841d, c38015t.f162841d);
    }

    public final int hashCode() {
        return this.f162841d.hashCode() + ((Duration.m134283hashCodeimpl(this.f162840c) + ((Duration.m134283hashCodeimpl(this.f162839b) + (Duration.m134283hashCodeimpl(this.f162838a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) Duration.m134302toStringimpl(this.f162838a)) + ", additionalTime=" + ((Object) Duration.m134302toStringimpl(this.f162839b)) + ", idleTimeout=" + ((Object) Duration.m134302toStringimpl(this.f162840c)) + ", timeSource=" + this.f162841d + ')';
    }
}
