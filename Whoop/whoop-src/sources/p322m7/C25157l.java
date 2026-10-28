package p322m7;

import java.time.Instant;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C25157l {

    /* JADX INFO: renamed from: a */
    public final Instant f98649a;

    /* JADX INFO: renamed from: b */
    public final double f98650b;

    public C25157l(double d3, Instant instant) {
        this.f98649a = instant;
        this.f98650b = d3;
        AbstractC32073e.m99732Z(d3, "revolutionsPerMinute");
        Double dValueOf = Double.valueOf(d3);
        int i13 = C25159m.f98652g;
        AbstractC32073e.m99738c0(dValueOf, Double.valueOf(10000.0d), "revolutionsPerMinute");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25157l)) {
            return false;
        }
        C25157l c25157l = (C25157l) obj;
        return AbstractC22676k.m65745e(this.f98649a, c25157l.f98649a) && this.f98650b == c25157l.f98650b;
    }

    public final int hashCode() {
        return Double.hashCode(this.f98650b) + (this.f98649a.hashCode() * 31);
    }
}
