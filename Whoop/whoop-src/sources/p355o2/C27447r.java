package p355o2;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C27447r extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110631c;

    /* JADX INFO: renamed from: d */
    public final float f110632d;

    /* JADX INFO: renamed from: e */
    public final float f110633e;

    /* JADX INFO: renamed from: f */
    public final float f110634f;

    /* JADX INFO: renamed from: g */
    public final float f110635g;

    /* JADX INFO: renamed from: h */
    public final float f110636h;

    public C27447r(float f13, float f14, float f15, float f16, float f17, float f18) {
        super(2);
        this.f110631c = f13;
        this.f110632d = f14;
        this.f110633e = f15;
        this.f110634f = f16;
        this.f110635g = f17;
        this.f110636h = f18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27447r)) {
            return false;
        }
        C27447r c27447r = (C27447r) obj;
        return Float.compare(this.f110631c, c27447r.f110631c) == 0 && Float.compare(this.f110632d, c27447r.f110632d) == 0 && Float.compare(this.f110633e, c27447r.f110633e) == 0 && Float.compare(this.f110634f, c27447r.f110634f) == 0 && Float.compare(this.f110635g, c27447r.f110635g) == 0 && Float.compare(this.f110636h, c27447r.f110636h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110636h) + AbstractC11266d.m30447a(this.f110635g, AbstractC11266d.m30447a(this.f110634f, AbstractC11266d.m30447a(this.f110633e, AbstractC11266d.m30447a(this.f110632d, Float.hashCode(this.f110631c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RelativeCurveTo(dx1=");
        sb4.append(this.f110631c);
        sb4.append(", dy1=");
        sb4.append(this.f110632d);
        sb4.append(", dx2=");
        sb4.append(this.f110633e);
        sb4.append(", dy2=");
        sb4.append(this.f110634f);
        sb4.append(", dx3=");
        sb4.append(this.f110635g);
        sb4.append(", dy3=");
        return AbstractC30802r.m94763l(sb4, this.f110636h, ')');
    }
}
