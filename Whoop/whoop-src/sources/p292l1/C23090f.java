package p292l1;

import p000.AbstractC11266d;
import p208i2.C17919x;

/* JADX INFO: renamed from: l1.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C23090f {

    /* JADX INFO: renamed from: a */
    public final long f91162a;

    /* JADX INFO: renamed from: b */
    public final long f91163b;

    /* JADX INFO: renamed from: c */
    public final long f91164c;

    /* JADX INFO: renamed from: d */
    public final long f91165d;

    public C23090f(long j7, long j13, long j14, long j15) {
        this.f91162a = j7;
        this.f91163b = j13;
        this.f91164c = j14;
        this.f91165d = j15;
    }

    /* JADX INFO: renamed from: a */
    public final C23090f m67066a(long j7, long j13, long j14, long j15) {
        if (j7 == 16) {
            j7 = this.f91162a;
        }
        return new C23090f(j7, j13 != 16 ? j13 : this.f91163b, j14 != 16 ? j14 : this.f91164c, j15 != 16 ? j15 : this.f91165d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23090f)) {
            return false;
        }
        C23090f c23090f = (C23090f) obj;
        return C17919x.m51542d(this.f91162a, c23090f.f91162a) && C17919x.m51542d(this.f91163b, c23090f.f91163b) && C17919x.m51542d(this.f91164c, c23090f.f91164c) && C17919x.m51542d(this.f91165d, c23090f.f91165d);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f91165d) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f91162a) * 31, this.f91163b, 31), this.f91164c, 31);
    }
}
