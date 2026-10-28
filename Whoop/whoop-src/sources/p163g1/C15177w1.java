package p163g1;

import androidx.compose.runtime.Composer;
import p000.AbstractC11266d;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: g1.w1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15177w1 {

    /* JADX INFO: renamed from: a */
    public final long f56957a;

    /* JADX INFO: renamed from: b */
    public final long f56958b;

    /* JADX INFO: renamed from: c */
    public final long f56959c;

    /* JADX INFO: renamed from: d */
    public final long f56960d;

    /* JADX INFO: renamed from: e */
    public final long f56961e;

    /* JADX INFO: renamed from: f */
    public final long f56962f;

    /* JADX INFO: renamed from: g */
    public final long f56963g;

    /* JADX INFO: renamed from: h */
    public final long f56964h;

    /* JADX INFO: renamed from: i */
    public final long f56965i;

    /* JADX INFO: renamed from: j */
    public final long f56966j;

    public C15177w1(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25) {
        this.f56957a = j7;
        this.f56958b = j13;
        this.f56959c = j14;
        this.f56960d = j15;
        this.f56961e = j16;
        this.f56962f = j17;
        this.f56963g = j18;
        this.f56964h = j19;
        this.f56965i = j24;
        this.f56966j = j25;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC28601c1 m43209a(boolean z4, boolean z13, Composer composer) {
        long j7;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1491563694);
        if (z4) {
            j7 = z13 ? this.f56963g : this.f56964h;
        } else {
            j7 = z13 ? this.f56965i : this.f56966j;
        }
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(new C17919x(j7), c28655q);
        c28655q.m87173q(false);
        return interfaceC28601c1M87238F;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC28601c1 m43210b(boolean z4, boolean z13, Composer composer) {
        long j7;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1575395620);
        if (z4) {
            j7 = z13 ? this.f56959c : this.f56960d;
        } else {
            j7 = z13 ? this.f56961e : this.f56962f;
        }
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(new C17919x(j7), c28655q);
        c28655q.m87173q(false);
        return interfaceC28601c1M87238F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15177w1.class != obj.getClass()) {
            return false;
        }
        C15177w1 c15177w1 = (C15177w1) obj;
        return C17919x.m51542d(this.f56957a, c15177w1.f56957a) && C17919x.m51542d(this.f56958b, c15177w1.f56958b) && C17919x.m51542d(this.f56959c, c15177w1.f56959c) && C17919x.m51542d(this.f56960d, c15177w1.f56960d) && C17919x.m51542d(this.f56961e, c15177w1.f56961e) && C17919x.m51542d(this.f56962f, c15177w1.f56962f) && C17919x.m51542d(this.f56963g, c15177w1.f56963g) && C17919x.m51542d(this.f56964h, c15177w1.f56964h) && C17919x.m51542d(this.f56965i, c15177w1.f56965i) && C17919x.m51542d(this.f56966j, c15177w1.f56966j);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f56966j) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f56957a) * 31, this.f56958b, 31), this.f56959c, 31), this.f56960d, 31), this.f56961e, 31), this.f56962f, 31), this.f56963g, 31), this.f56964h, 31), this.f56965i, 31);
    }
}
