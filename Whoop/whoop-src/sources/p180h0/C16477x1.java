package p180h0;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p181h2.C16617b;

/* JADX INFO: renamed from: h0.x1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16477x1 {

    /* JADX INFO: renamed from: a */
    public final long f63318a;

    /* JADX INFO: renamed from: b */
    public final long f63319b;

    /* JADX INFO: renamed from: c */
    public final boolean f63320c;

    public C16477x1(long j7, boolean z4, long j13) {
        this.f63318a = j7;
        this.f63319b = j13;
        this.f63320c = z4;
    }

    /* JADX INFO: renamed from: a */
    public final C16477x1 m46651a(C16477x1 c16477x1) {
        return new C16477x1(C16617b.m47192h(this.f63318a, c16477x1.f63318a), this.f63320c, Math.max(this.f63319b, c16477x1.f63319b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16477x1)) {
            return false;
        }
        C16477x1 c16477x1 = (C16477x1) obj;
        return C16617b.m47187c(this.f63318a, c16477x1.f63318a) && this.f63319b == c16477x1.f63319b && this.f63320c == c16477x1.f63320c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63320c) + AbstractC11266d.m30451e(Long.hashCode(this.f63318a) * 31, this.f63319b, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MouseWheelScrollDelta(value=");
        sb4.append((Object) C16617b.m47194j(this.f63318a));
        sb4.append(", timeMillis=");
        sb4.append(this.f63319b);
        sb4.append(", shouldApplyImmediately=");
        return AbstractC2875y.m8305r(sb4, this.f63320c, ')');
    }
}
