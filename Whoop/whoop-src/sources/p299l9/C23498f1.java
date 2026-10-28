package p299l9;

import p031b9.C2846k1;
import p031b9.C2854n0;
import p031b9.C2856o0;
import p361o9.InterfaceC27679s;

/* JADX INFO: renamed from: l9.f1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23498f1 implements InterfaceC23482a0, InterfaceC23539z {

    /* JADX INFO: renamed from: w */
    public final InterfaceC23482a0 f93016w;

    /* JADX INFO: renamed from: x */
    public final long f93017x;

    /* JADX INFO: renamed from: y */
    public InterfaceC23539z f93018y;

    public C23498f1(InterfaceC23482a0 interfaceC23482a0, long j7) {
        this.f93016w = interfaceC23482a0;
        this.f93017x = j7;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: a */
    public final boolean mo36121a() {
        return this.f93016w.mo36121a();
    }

    @Override // p299l9.InterfaceC23483a1
    /* JADX INFO: renamed from: b */
    public final void mo8198b(InterfaceC23486b1 interfaceC23486b1) {
        InterfaceC23539z interfaceC23539z = this.f93018y;
        interfaceC23539z.getClass();
        interfaceC23539z.mo8198b(this);
    }

    @Override // p299l9.InterfaceC23539z
    /* JADX INFO: renamed from: c */
    public final void mo8200c(InterfaceC23482a0 interfaceC23482a0) {
        InterfaceC23539z interfaceC23539z = this.f93018y;
        interfaceC23539z.getClass();
        interfaceC23539z.mo8200c(this);
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: d */
    public final long mo36122d() {
        long jMo36122d = this.f93016w.mo36122d();
        if (jMo36122d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo36122d + this.f93017x;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: e */
    public final long mo36123e(long j7) {
        long j13 = this.f93017x;
        return this.f93016w.mo36123e(j7 - j13) + j13;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: f */
    public final long mo36124f() {
        long jMo36124f = this.f93016w.mo36124f();
        if (jMo36124f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo36124f + this.f93017x;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: h */
    public final void mo36125h() {
        this.f93016w.mo36125h();
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: i */
    public final void mo36126i(long j7) {
        this.f93016w.mo36126i(j7 - this.f93017x);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: k */
    public final C23501g1 mo36128k() {
        return this.f93016w.mo36128k();
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: m */
    public final long mo36129m() {
        long jMo36129m = this.f93016w.mo36129m();
        if (jMo36129m == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo36129m + this.f93017x;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: n */
    public final void mo36130n(long j7) {
        this.f93016w.mo36130n(j7 - this.f93017x);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: s */
    public final long mo36131s(long j7, C2846k1 c2846k1) {
        long j13 = this.f93017x;
        return this.f93016w.mo36131s(j7 - j13, c2846k1) + j13;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: t */
    public final void mo36132t(InterfaceC23539z interfaceC23539z, long j7) {
        this.f93018y = interfaceC23539z;
        this.f93016w.mo36132t(this, j7 - this.f93017x);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: u */
    public final long mo36133u(InterfaceC27679s[] interfaceC27679sArr, boolean[] zArr, InterfaceC23540z0[] interfaceC23540z0Arr, boolean[] zArr2, long j7) {
        InterfaceC23540z0[] interfaceC23540z0Arr2 = new InterfaceC23540z0[interfaceC23540z0Arr.length];
        int i13 = 0;
        while (true) {
            InterfaceC23540z0 interfaceC23540z0 = null;
            if (i13 >= interfaceC23540z0Arr.length) {
                break;
            }
            C23495e1 c23495e1 = (C23495e1) interfaceC23540z0Arr[i13];
            if (c23495e1 != null) {
                interfaceC23540z0 = c23495e1.f93002w;
            }
            interfaceC23540z0Arr2[i13] = interfaceC23540z0;
            i13++;
        }
        InterfaceC23482a0 interfaceC23482a0 = this.f93016w;
        long j13 = this.f93017x;
        long jMo36133u = interfaceC23482a0.mo36133u(interfaceC27679sArr, zArr, interfaceC23540z0Arr2, zArr2, j7 - j13);
        for (int i14 = 0; i14 < interfaceC23540z0Arr.length; i14++) {
            InterfaceC23540z0 interfaceC23540z1 = interfaceC23540z0Arr2[i14];
            if (interfaceC23540z1 == null) {
                interfaceC23540z0Arr[i14] = null;
            } else {
                InterfaceC23540z0 interfaceC23540z2 = interfaceC23540z0Arr[i14];
                if (interfaceC23540z2 == null || ((C23495e1) interfaceC23540z2).f93002w != interfaceC23540z1) {
                    interfaceC23540z0Arr[i14] = new C23495e1(interfaceC23540z1, j13);
                }
            }
        }
        return jMo36133u + j13;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: x */
    public final boolean mo36134x(C2856o0 c2856o0) {
        C2854n0 c2854n0 = new C2854n0();
        long j7 = c2856o0.f11327a;
        c2854n0.f11324b = c2856o0.f11328b;
        c2854n0.f11325c = c2856o0.f11329c;
        c2854n0.f11323a = j7 - this.f93017x;
        return this.f93016w.mo36134x(new C2856o0(c2854n0));
    }
}
