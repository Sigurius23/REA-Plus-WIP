package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C27442m extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110612c;

    /* JADX INFO: renamed from: d */
    public final float f110613d;

    public C27442m(float f13, float f14) {
        super(3);
        this.f110612c = f13;
        this.f110613d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27442m)) {
            return false;
        }
        C27442m c27442m = (C27442m) obj;
        return Float.compare(this.f110612c, c27442m.f110612c) == 0 && Float.compare(this.f110613d, c27442m.f110613d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110613d) + (Float.hashCode(this.f110612c) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MoveTo(x=");
        sb4.append(this.f110612c);
        sb4.append(", y=");
        return AbstractC30802r.m94763l(sb4, this.f110613d, ')');
    }
}
