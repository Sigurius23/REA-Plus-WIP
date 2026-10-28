package p355o2;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C27444o extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110618c;

    /* JADX INFO: renamed from: d */
    public final float f110619d;

    /* JADX INFO: renamed from: e */
    public final float f110620e;

    /* JADX INFO: renamed from: f */
    public final float f110621f;

    public C27444o(float f13, float f14, float f15, float f16) {
        super(2);
        this.f110618c = f13;
        this.f110619d = f14;
        this.f110620e = f15;
        this.f110621f = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27444o)) {
            return false;
        }
        C27444o c27444o = (C27444o) obj;
        return Float.compare(this.f110618c, c27444o.f110618c) == 0 && Float.compare(this.f110619d, c27444o.f110619d) == 0 && Float.compare(this.f110620e, c27444o.f110620e) == 0 && Float.compare(this.f110621f, c27444o.f110621f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110621f) + AbstractC11266d.m30447a(this.f110620e, AbstractC11266d.m30447a(this.f110619d, Float.hashCode(this.f110618c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb4.append(this.f110618c);
        sb4.append(", y1=");
        sb4.append(this.f110619d);
        sb4.append(", x2=");
        sb4.append(this.f110620e);
        sb4.append(", y2=");
        return AbstractC30802r.m94763l(sb4, this.f110621f, ')');
    }
}
