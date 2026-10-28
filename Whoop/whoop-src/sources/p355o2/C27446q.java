package p355o2;

import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: o2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C27446q extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110624c;

    /* JADX INFO: renamed from: d */
    public final float f110625d;

    /* JADX INFO: renamed from: e */
    public final float f110626e;

    /* JADX INFO: renamed from: f */
    public final boolean f110627f;

    /* JADX INFO: renamed from: g */
    public final boolean f110628g;

    /* JADX INFO: renamed from: h */
    public final float f110629h;

    /* JADX INFO: renamed from: i */
    public final float f110630i;

    public C27446q(float f13, float f14, float f15, boolean z4, boolean z13, float f16, float f17) {
        super(3);
        this.f110624c = f13;
        this.f110625d = f14;
        this.f110626e = f15;
        this.f110627f = z4;
        this.f110628g = z13;
        this.f110629h = f16;
        this.f110630i = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27446q)) {
            return false;
        }
        C27446q c27446q = (C27446q) obj;
        return Float.compare(this.f110624c, c27446q.f110624c) == 0 && Float.compare(this.f110625d, c27446q.f110625d) == 0 && Float.compare(this.f110626e, c27446q.f110626e) == 0 && this.f110627f == c27446q.f110627f && this.f110628g == c27446q.f110628g && Float.compare(this.f110629h, c27446q.f110629h) == 0 && Float.compare(this.f110630i, c27446q.f110630i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110630i) + AbstractC11266d.m30447a(this.f110629h, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.f110626e, AbstractC11266d.m30447a(this.f110625d, Float.hashCode(this.f110624c) * 31, 31), 31), 31, this.f110627f), 31, this.f110628g), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb4.append(this.f110624c);
        sb4.append(", verticalEllipseRadius=");
        sb4.append(this.f110625d);
        sb4.append(", theta=");
        sb4.append(this.f110626e);
        sb4.append(", isMoreThanHalf=");
        sb4.append(this.f110627f);
        sb4.append(", isPositiveArc=");
        sb4.append(this.f110628g);
        sb4.append(", arcStartDx=");
        sb4.append(this.f110629h);
        sb4.append(", arcStartDy=");
        return AbstractC30802r.m94763l(sb4, this.f110630i, ')');
    }
}
