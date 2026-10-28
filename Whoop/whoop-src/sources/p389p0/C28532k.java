package p389p0;

import p088dc.AbstractC11895b;
import p268k0.AbstractC22086a;

/* JADX INFO: renamed from: p0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C28532k {

    /* JADX INFO: renamed from: a */
    public final int f115445a;

    /* JADX INFO: renamed from: b */
    public final int f115446b;

    public C28532k(int i13, int i14) {
        this.f115445a = i13;
        this.f115446b = i14;
        if (!(i13 >= 0)) {
            AbstractC22086a.m63158a("negative start index");
        }
        if (i14 >= i13) {
            return;
        }
        AbstractC22086a.m63158a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28532k)) {
            return false;
        }
        C28532k c28532k = (C28532k) obj;
        return this.f115445a == c28532k.f115445a && this.f115446b == c28532k.f115446b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115446b) + (Integer.hashCode(this.f115445a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Interval(start=");
        sb4.append(this.f115445a);
        sb4.append(", end=");
        return AbstractC11895b.m31999r(sb4, this.f115446b, ')');
    }
}
