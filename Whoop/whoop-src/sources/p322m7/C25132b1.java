package p322m7;

import java.time.Instant;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C25132b1 {

    /* JADX INFO: renamed from: a */
    public final Instant f98517a;

    /* JADX INFO: renamed from: b */
    public final double f98518b;

    public C25132b1(double d3, Instant instant) {
        this.f98517a = instant;
        this.f98518b = d3;
        AbstractC32073e.m99732Z(d3, "rate");
        AbstractC32073e.m99738c0(Double.valueOf(d3), Double.valueOf(10000.0d), "rate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25132b1)) {
            return false;
        }
        C25132b1 c25132b1 = (C25132b1) obj;
        return AbstractC22676k.m65745e(this.f98517a, c25132b1.f98517a) && this.f98518b == c25132b1.f98518b;
    }

    public final int hashCode() {
        return Double.hashCode(this.f98518b) + (this.f98517a.hashCode() * 31);
    }
}
