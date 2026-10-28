package p294l3;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p493t3.C33491c;

/* JADX INFO: renamed from: l3.z */
/* JADX INFO: loaded from: classes.dex */
public final class C23291z {

    /* JADX INFO: renamed from: a */
    public final C33491c f92277a;

    /* JADX INFO: renamed from: b */
    public final int f92278b;

    /* JADX INFO: renamed from: c */
    public final int f92279c;

    public C23291z(C33491c c33491c, int i13, int i14) {
        this.f92277a = c33491c;
        this.f92278b = i13;
        this.f92279c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23291z)) {
            return false;
        }
        C23291z c23291z = (C23291z) obj;
        return this.f92277a.equals(c23291z.f92277a) && this.f92278b == c23291z.f92278b && this.f92279c == c23291z.f92279c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92279c) + AbstractC11266d.m30448b(this.f92278b, this.f92277a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb4.append(this.f92277a);
        sb4.append(", startIndex=");
        sb4.append(this.f92278b);
        sb4.append(", endIndex=");
        return AbstractC11895b.m31999r(sb4, this.f92279c, ')');
    }
}
