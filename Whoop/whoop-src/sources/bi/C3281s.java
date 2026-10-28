package bi;

import c13.AbstractC3855a;
import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bi.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C3281s {

    /* JADX INFO: renamed from: a */
    public final int f12810a;

    /* JADX INFO: renamed from: b */
    public final long f12811b;

    /* JADX INFO: renamed from: c */
    public final long f12812c;

    /* JADX INFO: renamed from: d */
    public final C3279q f12813d;

    /* JADX INFO: renamed from: e */
    public final C3282t f12814e;

    /* JADX INFO: renamed from: f */
    public final Object f12815f;

    public C3281s(int i13, long j7, long j13, C3279q c3279q, C3282t c3282t, Object obj) {
        this.f12810a = i13;
        this.f12811b = j7;
        this.f12812c = j13;
        this.f12813d = c3279q;
        this.f12814e = c3282t;
        this.f12815f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3281s)) {
            return false;
        }
        C3281s c3281s = (C3281s) obj;
        return this.f12810a == c3281s.f12810a && this.f12811b == c3281s.f12811b && this.f12812c == c3281s.f12812c && AbstractC22676k.m65745e(this.f12813d, c3281s.f12813d) && AbstractC22676k.m65745e(this.f12814e, c3281s.f12814e) && AbstractC22676k.m65745e(this.f12815f, c3281s.f12815f);
    }

    public final int hashCode() {
        int iM11821e = AbstractC3855a.m11821e(this.f12813d.f12805a, AbstractC11266d.m30451e(AbstractC11266d.m30451e(this.f12810a * 31, this.f12811b, 31), this.f12812c, 31), 31);
        C3282t c3282t = this.f12814e;
        int iHashCode = (iM11821e + (c3282t == null ? 0 : c3282t.f12816w.hashCode())) * 31;
        Object obj = this.f12815f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("NetworkResponse(code=");
        sb4.append(this.f12810a);
        sb4.append(", requestMillis=");
        sb4.append(this.f12811b);
        sb4.append(", responseMillis=");
        sb4.append(this.f12812c);
        sb4.append(", headers=");
        sb4.append(this.f12813d);
        sb4.append(", body=");
        sb4.append(this.f12814e);
        sb4.append(", delegate=");
        return AbstractC11478a.m30860l(sb4, this.f12815f, ')');
    }
}
