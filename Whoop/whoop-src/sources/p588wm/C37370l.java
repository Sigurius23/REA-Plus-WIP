package p588wm;

import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p499t9.C33653v;
import so.C32800q;

/* JADX INFO: renamed from: wm.l */
/* JADX INFO: loaded from: classes6.dex */
public class C37370l implements InterfaceC37374p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f159857a = 1;

    /* JADX INFO: renamed from: b */
    public final long f159858b;

    /* JADX INFO: renamed from: c */
    public final Object f159859c;

    public C37370l(C33653v c33653v, long j7) {
        this.f159859c = c33653v;
        this.f159858b = j7;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        switch (this.f159857a) {
            case 0:
                C33653v c33653v = (C33653v) this.f159859c;
                AbstractC24543a.m71574j((C32800q) c33653v.f140454l);
                C32800q c32800q = (C32800q) c33653v.f140454l;
                long[] jArr = (long[]) c32800q.f136504w;
                long[] jArr2 = (long[]) c32800q.f136505x;
                int iM71674e = AbstractC24567y.m71674e(jArr, AbstractC24567y.m71678i((((long) c33653v.f140448f) * j7) / 1000000, 0L, c33653v.f140453k - 1), false);
                long j13 = iM71674e == -1 ? 0L : jArr[iM71674e];
                long j14 = iM71674e != -1 ? jArr2[iM71674e] : 0L;
                int i13 = c33653v.f140448f;
                long j15 = (j13 * 1000000) / ((long) i13);
                long j16 = this.f159858b;
                C37375q c37375q = new C37375q(j15, j14 + j16);
                if (j15 == j7 || iM71674e == jArr.length - 1) {
                    return new C37373o(c37375q, c37375q);
                }
                int i14 = iM71674e + 1;
                return new C37373o(c37375q, new C37375q((jArr[i14] * 1000000) / ((long) i13), j16 + jArr2[i14]));
            default:
                return (C37373o) this.f159859c;
        }
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        switch (this.f159857a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        switch (this.f159857a) {
            case 0:
                return ((C33653v) this.f159859c).m106292c();
            default:
                return this.f159858b;
        }
    }

    public C37370l(long j7) {
        this(j7, 0L);
    }

    public C37370l(long j7, long j13) {
        this.f159858b = j7;
        C37375q c37375q = j13 == 0 ? C37375q.f159869c : new C37375q(0L, j13);
        this.f159859c = new C37373o(c37375q, c37375q);
    }
}
