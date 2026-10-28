package p292l1;

import p000.AbstractC11266d;
import p208i2.C17919x;

/* JADX INFO: renamed from: l1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C23120k {

    /* JADX INFO: renamed from: a */
    public final long f91347a;

    /* JADX INFO: renamed from: b */
    public final long f91348b;

    /* JADX INFO: renamed from: c */
    public final long f91349c;

    /* JADX INFO: renamed from: d */
    public final long f91350d;

    public C23120k(long j7, long j13, long j14, long j15) {
        this.f91347a = j7;
        this.f91348b = j13;
        this.f91349c = j14;
        this.f91350d = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23120k)) {
            return false;
        }
        C23120k c23120k = (C23120k) obj;
        return C17919x.m51542d(this.f91347a, c23120k.f91347a) && C17919x.m51542d(this.f91348b, c23120k.f91348b) && C17919x.m51542d(this.f91349c, c23120k.f91349c) && C17919x.m51542d(this.f91350d, c23120k.f91350d);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f91350d) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f91347a) * 31, this.f91348b, 31), this.f91349c, 31);
    }
}
