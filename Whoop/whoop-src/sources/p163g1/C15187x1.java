package p163g1;

import p000.AbstractC11266d;
import p208i2.C17919x;

/* JADX INFO: renamed from: g1.x1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15187x1 implements InterfaceC15103o7 {

    /* JADX INFO: renamed from: a */
    public final long f56993a;

    /* JADX INFO: renamed from: b */
    public final long f56994b;

    /* JADX INFO: renamed from: c */
    public final long f56995c;

    /* JADX INFO: renamed from: d */
    public final long f56996d;

    /* JADX INFO: renamed from: e */
    public final long f56997e;

    /* JADX INFO: renamed from: f */
    public final long f56998f;

    /* JADX INFO: renamed from: g */
    public final long f56999g;

    /* JADX INFO: renamed from: h */
    public final long f57000h;

    public C15187x1(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f56993a = j7;
        this.f56994b = j13;
        this.f56995c = j14;
        this.f56996d = j15;
        this.f56997e = j16;
        this.f56998f = j17;
        this.f56999g = j18;
        this.f57000h = j19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15187x1.class != obj.getClass()) {
            return false;
        }
        C15187x1 c15187x1 = (C15187x1) obj;
        return C17919x.m51542d(this.f56993a, c15187x1.f56993a) && C17919x.m51542d(this.f56994b, c15187x1.f56994b) && C17919x.m51542d(this.f56995c, c15187x1.f56995c) && C17919x.m51542d(this.f56996d, c15187x1.f56996d) && C17919x.m51542d(this.f56997e, c15187x1.f56997e) && C17919x.m51542d(this.f56998f, c15187x1.f56998f) && C17919x.m51542d(this.f56999g, c15187x1.f56999g) && C17919x.m51542d(this.f57000h, c15187x1.f57000h);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f57000h) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f56993a) * 31, this.f56994b, 31), this.f56995c, 31), this.f56996d, 31), this.f56997e, 31), this.f56998f, 31), this.f56999g, 31);
    }
}
