package p355o2;

import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: o2.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C27436h extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110581c;

    /* JADX INFO: renamed from: d */
    public final float f110582d;

    /* JADX INFO: renamed from: e */
    public final float f110583e;

    /* JADX INFO: renamed from: f */
    public final boolean f110584f;

    /* JADX INFO: renamed from: g */
    public final boolean f110585g;

    /* JADX INFO: renamed from: h */
    public final float f110586h;

    /* JADX INFO: renamed from: i */
    public final float f110587i;

    public C27436h(float f13, float f14, float f15, boolean z4, boolean z13, float f16, float f17) {
        super(3);
        this.f110581c = f13;
        this.f110582d = f14;
        this.f110583e = f15;
        this.f110584f = z4;
        this.f110585g = z13;
        this.f110586h = f16;
        this.f110587i = f17;
    }

    /* JADX INFO: renamed from: a */
    public final float m82862a() {
        return this.f110586h;
    }

    /* JADX INFO: renamed from: b */
    public final float m82863b() {
        return this.f110587i;
    }

    /* JADX INFO: renamed from: c */
    public final float m82864c() {
        return this.f110581c;
    }

    /* JADX INFO: renamed from: d */
    public final float m82865d() {
        return this.f110583e;
    }

    /* JADX INFO: renamed from: e */
    public final float m82866e() {
        return this.f110582d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27436h)) {
            return false;
        }
        C27436h c27436h = (C27436h) obj;
        return Float.compare(this.f110581c, c27436h.f110581c) == 0 && Float.compare(this.f110582d, c27436h.f110582d) == 0 && Float.compare(this.f110583e, c27436h.f110583e) == 0 && this.f110584f == c27436h.f110584f && this.f110585g == c27436h.f110585g && Float.compare(this.f110586h, c27436h.f110586h) == 0 && Float.compare(this.f110587i, c27436h.f110587i) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m82867f() {
        return this.f110584f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m82868g() {
        return this.f110585g;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110587i) + AbstractC11266d.m30447a(this.f110586h, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.f110583e, AbstractC11266d.m30447a(this.f110582d, Float.hashCode(this.f110581c) * 31, 31), 31), 31, this.f110584f), 31, this.f110585g), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb4.append(this.f110581c);
        sb4.append(", verticalEllipseRadius=");
        sb4.append(this.f110582d);
        sb4.append(", theta=");
        sb4.append(this.f110583e);
        sb4.append(", isMoreThanHalf=");
        sb4.append(this.f110584f);
        sb4.append(", isPositiveArc=");
        sb4.append(this.f110585g);
        sb4.append(", arcStartX=");
        sb4.append(this.f110586h);
        sb4.append(", arcStartY=");
        return AbstractC30802r.m94763l(sb4, this.f110587i, ')');
    }
}
