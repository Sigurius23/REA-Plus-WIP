package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C27445p extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110622c;

    /* JADX INFO: renamed from: d */
    public final float f110623d;

    public C27445p(float f13, float f14) {
        super(1);
        this.f110622c = f13;
        this.f110623d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27445p)) {
            return false;
        }
        C27445p c27445p = (C27445p) obj;
        return Float.compare(this.f110622c, c27445p.f110622c) == 0 && Float.compare(this.f110623d, c27445p.f110623d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110623d) + (Float.hashCode(this.f110622c) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ReflectiveQuadTo(x=");
        sb4.append(this.f110622c);
        sb4.append(", y=");
        return AbstractC30802r.m94763l(sb4, this.f110623d, ')');
    }
}
