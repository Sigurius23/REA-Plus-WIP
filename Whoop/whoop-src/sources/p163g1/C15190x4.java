package p163g1;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: g1.x4 */
/* JADX INFO: loaded from: classes.dex */
public final class C15190x4 {

    /* JADX INFO: renamed from: a */
    public final float f57006a;

    /* JADX INFO: renamed from: b */
    public final float f57007b;

    /* JADX INFO: renamed from: c */
    public final float f57008c;

    public C15190x4(float f13, float f14, float f15) {
        this.f57006a = f13;
        this.f57007b = f14;
        this.f57008c = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15190x4)) {
            return false;
        }
        C15190x4 c15190x4 = (C15190x4) obj;
        return this.f57006a == c15190x4.f57006a && this.f57007b == c15190x4.f57007b && this.f57008c == c15190x4.f57008c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57008c) + AbstractC11266d.m30447a(this.f57007b, Float.hashCode(this.f57006a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ResistanceConfig(basis=");
        sb4.append(this.f57006a);
        sb4.append(", factorAtMin=");
        sb4.append(this.f57007b);
        sb4.append(", factorAtMax=");
        return AbstractC30802r.m94763l(sb4, this.f57008c, ')');
    }
}
