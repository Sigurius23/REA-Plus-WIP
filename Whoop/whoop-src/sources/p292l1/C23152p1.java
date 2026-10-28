package p292l1;

import p000.AbstractC11266d;
import p208i2.C17919x;

/* JADX INFO: renamed from: l1.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23152p1 {

    /* JADX INFO: renamed from: a */
    public final long f91563a;

    /* JADX INFO: renamed from: b */
    public final long f91564b;

    /* JADX INFO: renamed from: c */
    public final long f91565c;

    /* JADX INFO: renamed from: d */
    public final long f91566d;

    public C23152p1(long j7, long j13, long j14, long j15) {
        this.f91563a = j7;
        this.f91564b = j13;
        this.f91565c = j14;
        this.f91566d = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23152p1)) {
            return false;
        }
        C23152p1 c23152p1 = (C23152p1) obj;
        return C17919x.m51542d(this.f91563a, c23152p1.f91563a) && C17919x.m51542d(this.f91564b, c23152p1.f91564b) && C17919x.m51542d(this.f91565c, c23152p1.f91565c) && C17919x.m51542d(this.f91566d, c23152p1.f91566d);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f91566d) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f91563a) * 31, this.f91564b, 31), this.f91565c, 31);
    }
}
