package cn;

import p309lo.AbstractC24567y;
import p588wm.C37373o;
import p588wm.C37375q;

/* JADX INFO: renamed from: cn.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C4845g implements InterfaceC4844f {

    /* JADX INFO: renamed from: a */
    public final long[] f20127a;

    /* JADX INFO: renamed from: b */
    public final long[] f20128b;

    /* JADX INFO: renamed from: c */
    public final long f20129c;

    /* JADX INFO: renamed from: d */
    public final long f20130d;

    public C4845g(long[] jArr, long[] jArr2, long j7, long j13) {
        this.f20127a = jArr;
        this.f20128b = jArr2;
        this.f20129c = j7;
        this.f20130d = j13;
    }

    @Override // cn.InterfaceC4844f
    /* JADX INFO: renamed from: a */
    public final long mo15415a(long j7) {
        return this.f20127a[AbstractC24567y.m71674e(this.f20128b, j7, true)];
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        long[] jArr = this.f20127a;
        int iM71674e = AbstractC24567y.m71674e(jArr, j7, true);
        long j13 = jArr[iM71674e];
        long[] jArr2 = this.f20128b;
        C37375q c37375q = new C37375q(j13, jArr2[iM71674e]);
        if (j13 >= j7 || iM71674e == jArr.length - 1) {
            return new C37373o(c37375q, c37375q);
        }
        int i13 = iM71674e + 1;
        return new C37373o(c37375q, new C37375q(jArr[i13], jArr2[i13]));
    }

    @Override // cn.InterfaceC4844f
    /* JADX INFO: renamed from: d */
    public final long mo15416d() {
        return this.f20130d;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return true;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f20129c;
    }
}
