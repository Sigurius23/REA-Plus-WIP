package p318m3;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: m3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C24976f {

    /* JADX INFO: renamed from: a */
    public final int f97748a;

    /* JADX INFO: renamed from: b */
    public final int f97749b;

    /* JADX INFO: renamed from: c */
    public final boolean f97750c;

    public C24976f(int i13, int i14, boolean z4) {
        this.f97748a = i13;
        this.f97749b = i14;
        this.f97750c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24976f)) {
            return false;
        }
        C24976f c24976f = (C24976f) obj;
        return this.f97748a == c24976f.f97748a && this.f97749b == c24976f.f97749b && this.f97750c == c24976f.f97750c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97750c) + AbstractC11266d.m30448b(this.f97749b, Integer.hashCode(this.f97748a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BidiRun(start=");
        sb4.append(this.f97748a);
        sb4.append(", end=");
        sb4.append(this.f97749b);
        sb4.append(", isRtl=");
        return AbstractC2875y.m8305r(sb4, this.f97750c, ')');
    }
}
