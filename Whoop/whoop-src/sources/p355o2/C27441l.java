package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C27441l extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110610c;

    /* JADX INFO: renamed from: d */
    public final float f110611d;

    public C27441l(float f13, float f14) {
        super(3);
        this.f110610c = f13;
        this.f110611d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27441l)) {
            return false;
        }
        C27441l c27441l = (C27441l) obj;
        return Float.compare(this.f110610c, c27441l.f110610c) == 0 && Float.compare(this.f110611d, c27441l.f110611d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110611d) + (Float.hashCode(this.f110610c) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LineTo(x=");
        sb4.append(this.f110610c);
        sb4.append(", y=");
        return AbstractC30802r.m94763l(sb4, this.f110611d, ')');
    }
}
