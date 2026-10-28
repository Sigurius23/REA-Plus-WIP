package p322m7;

import java.time.Instant;
import p452r7.C31015h0;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C25166p0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98741a;

    /* JADX INFO: renamed from: b */
    public final C31015h0 f98742b;

    public C25166p0(Instant instant, C31015h0 c31015h0) {
        this.f98741a = instant;
        this.f98742b = c31015h0;
        AbstractC32073e.m99736b0(c31015h0, c31015h0.m95552b(), "power");
        AbstractC32073e.m99738c0(c31015h0, C25168q0.f98749g, "power");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25166p0)) {
            return false;
        }
        C25166p0 c25166p0 = (C25166p0) obj;
        return AbstractC22676k.m65745e(this.f98741a, c25166p0.f98741a) && AbstractC22676k.m65745e(this.f98742b, c25166p0.f98742b);
    }

    public final int hashCode() {
        return this.f98742b.hashCode() + (this.f98741a.hashCode() * 31);
    }
}
