package p291l0;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: l0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23014y0 {

    /* JADX INFO: renamed from: a */
    public final int f90751a;

    /* JADX INFO: renamed from: b */
    public final int f90752b;

    /* JADX INFO: renamed from: c */
    public final int f90753c;

    /* JADX INFO: renamed from: d */
    public final int f90754d;

    public C23014y0(int i13, int i14, int i15, int i16) {
        this.f90751a = i13;
        this.f90752b = i14;
        this.f90753c = i15;
        this.f90754d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23014y0)) {
            return false;
        }
        C23014y0 c23014y0 = (C23014y0) obj;
        return this.f90751a == c23014y0.f90751a && this.f90752b == c23014y0.f90752b && this.f90753c == c23014y0.f90753c && this.f90754d == c23014y0.f90754d;
    }

    public final int hashCode() {
        return (((((this.f90751a * 31) + this.f90752b) * 31) + this.f90753c) * 31) + this.f90754d;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InsetsValues(left=");
        sb4.append(this.f90751a);
        sb4.append(", top=");
        sb4.append(this.f90752b);
        sb4.append(", right=");
        sb4.append(this.f90753c);
        sb4.append(", bottom=");
        return AbstractC11895b.m31999r(sb4, this.f90754d, ')');
    }
}
