package p002a0;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: a0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0046q {

    /* JADX INFO: renamed from: a */
    public final long f135a;

    /* JADX INFO: renamed from: a */
    public static long m97a(int i13, int i14) {
        return (((long) i14) & 4294967295L) | (((long) i13) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0046q) {
            return this.f135a == ((C0046q) obj).f135a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135a);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("(");
        long j7 = this.f135a;
        sb4.append((int) (j7 >> 32));
        sb4.append(", ");
        return AbstractC11895b.m31999r(sb4, (int) (j7 & 4294967295L), ')');
    }
}
