package p322m7;

import java.time.Instant;
import m83.AbstractC25247g0;
import p452r7.C31033q0;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C25186z0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98827a;

    /* JADX INFO: renamed from: b */
    public final C31033q0 f98828b;

    public C25186z0(Instant instant, C31033q0 c31033q0) {
        this.f98827a = instant;
        this.f98828b = c31033q0;
        AbstractC32073e.m99736b0(c31033q0, (C31033q0) AbstractC25247g0.m73986U(c31033q0.f128019x, C31033q0.f128017z), "speed");
        AbstractC32073e.m99738c0(c31033q0, C25129a1.f98498g, "speed");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25186z0)) {
            return false;
        }
        C25186z0 c25186z0 = (C25186z0) obj;
        return AbstractC22676k.m65745e(this.f98827a, c25186z0.f98827a) && AbstractC22676k.m65745e(this.f98828b, c25186z0.f98828b);
    }

    public final int hashCode() {
        return this.f98828b.hashCode() + (this.f98827a.hashCode() * 31);
    }
}
