package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.t */
/* JADX INFO: loaded from: classes.dex */
public final class C27449t extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110638c;

    /* JADX INFO: renamed from: d */
    public final float f110639d;

    public C27449t(float f13, float f14) {
        super(3);
        this.f110638c = f13;
        this.f110639d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27449t)) {
            return false;
        }
        C27449t c27449t = (C27449t) obj;
        return Float.compare(this.f110638c, c27449t.f110638c) == 0 && Float.compare(this.f110639d, c27449t.f110639d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110639d) + (Float.hashCode(this.f110638c) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RelativeLineTo(dx=");
        sb4.append(this.f110638c);
        sb4.append(", dy=");
        return AbstractC30802r.m94763l(sb4, this.f110639d, ')');
    }
}
