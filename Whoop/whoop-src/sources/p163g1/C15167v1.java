package p163g1;

import p000.AbstractC11266d;
import p208i2.C17919x;

/* JADX INFO: renamed from: g1.v1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15167v1 {

    /* JADX INFO: renamed from: a */
    public final long f56896a;

    /* JADX INFO: renamed from: b */
    public final long f56897b;

    /* JADX INFO: renamed from: c */
    public final long f56898c;

    public C15167v1(long j7, long j13, long j14) {
        this.f56896a = j7;
        this.f56897b = j13;
        this.f56898c = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15167v1.class != obj.getClass()) {
            return false;
        }
        C15167v1 c15167v1 = (C15167v1) obj;
        return C17919x.m51542d(this.f56896a, c15167v1.f56896a) && C17919x.m51542d(this.f56897b, c15167v1.f56897b) && C17919x.m51542d(this.f56898c, c15167v1.f56898c);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f56898c) + AbstractC11266d.m30451e(Long.hashCode(this.f56896a) * 31, this.f56897b, 31);
    }
}
