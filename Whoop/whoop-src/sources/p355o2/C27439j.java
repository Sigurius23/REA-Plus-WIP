package p355o2;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C27439j extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110603c;

    /* JADX INFO: renamed from: d */
    public final float f110604d;

    /* JADX INFO: renamed from: e */
    public final float f110605e;

    /* JADX INFO: renamed from: f */
    public final float f110606f;

    /* JADX INFO: renamed from: g */
    public final float f110607g;

    /* JADX INFO: renamed from: h */
    public final float f110608h;

    public C27439j(float f13, float f14, float f15, float f16, float f17, float f18) {
        super(2);
        this.f110603c = f13;
        this.f110604d = f14;
        this.f110605e = f15;
        this.f110606f = f16;
        this.f110607g = f17;
        this.f110608h = f18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27439j)) {
            return false;
        }
        C27439j c27439j = (C27439j) obj;
        return Float.compare(this.f110603c, c27439j.f110603c) == 0 && Float.compare(this.f110604d, c27439j.f110604d) == 0 && Float.compare(this.f110605e, c27439j.f110605e) == 0 && Float.compare(this.f110606f, c27439j.f110606f) == 0 && Float.compare(this.f110607g, c27439j.f110607g) == 0 && Float.compare(this.f110608h, c27439j.f110608h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110608h) + AbstractC11266d.m30447a(this.f110607g, AbstractC11266d.m30447a(this.f110606f, AbstractC11266d.m30447a(this.f110605e, AbstractC11266d.m30447a(this.f110604d, Float.hashCode(this.f110603c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CurveTo(x1=");
        sb4.append(this.f110603c);
        sb4.append(", y1=");
        sb4.append(this.f110604d);
        sb4.append(", x2=");
        sb4.append(this.f110605e);
        sb4.append(", y2=");
        sb4.append(this.f110606f);
        sb4.append(", x3=");
        sb4.append(this.f110607g);
        sb4.append(", y3=");
        return AbstractC30802r.m94763l(sb4, this.f110608h, ')');
    }
}
