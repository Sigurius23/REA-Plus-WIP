package p299l9;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import p031b9.C2846k1;
import p031b9.C2856o0;
import p361o9.InterfaceC27679s;
import p516u8.AbstractC34587d0;
import p516u8.C34610p;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: l9.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C23487c implements InterfaceC23482a0, InterfaceC23539z {

    /* JADX INFO: renamed from: E */
    public long f92969E;

    /* JADX INFO: renamed from: F */
    public long f92970F;

    /* JADX INFO: renamed from: G */
    public ClippingMediaSource$IllegalClippingException f92971G;

    /* JADX INFO: renamed from: w */
    public final InterfaceC23482a0 f92972w;

    /* JADX INFO: renamed from: x */
    public InterfaceC23539z f92973x;

    /* JADX INFO: renamed from: y */
    public C23484b[] f92974y = new C23484b[0];

    /* JADX INFO: renamed from: z */
    public long f92975z;

    public C23487c(InterfaceC23482a0 interfaceC23482a0, boolean z4, long j7, long j13) {
        this.f92972w = interfaceC23482a0;
        this.f92975z = z4 ? j7 : -9223372036854775807L;
        this.f92969E = j7;
        this.f92970F = j13;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: a */
    public final boolean mo36121a() {
        return this.f92972w.mo36121a();
    }

    @Override // p299l9.InterfaceC23483a1
    /* JADX INFO: renamed from: b */
    public final void mo8198b(InterfaceC23486b1 interfaceC23486b1) {
        InterfaceC23539z interfaceC23539z = this.f92973x;
        interfaceC23539z.getClass();
        interfaceC23539z.mo8198b(this);
    }

    @Override // p299l9.InterfaceC23539z
    /* JADX INFO: renamed from: c */
    public final void mo8200c(InterfaceC23482a0 interfaceC23482a0) {
        if (this.f92971G != null) {
            return;
        }
        InterfaceC23539z interfaceC23539z = this.f92973x;
        interfaceC23539z.getClass();
        interfaceC23539z.mo8200c(this);
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: d */
    public final long mo36122d() {
        long jMo36122d = this.f92972w.mo36122d();
        if (jMo36122d != Long.MIN_VALUE) {
            long j7 = this.f92970F;
            if (j7 == Long.MIN_VALUE || jMo36122d < j7) {
                return jMo36122d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: e */
    public final long mo36123e(long j7) {
        this.f92975z = -9223372036854775807L;
        for (C23484b c23484b : this.f92974y) {
            if (c23484b != null) {
                c23484b.f92967x = false;
            }
        }
        long jMo36123e = this.f92972w.mo36123e(j7);
        long j13 = this.f92969E;
        long j14 = this.f92970F;
        long jMax = Math.max(jMo36123e, j13);
        return j14 != Long.MIN_VALUE ? Math.min(jMax, j14) : jMax;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: f */
    public final long mo36124f() {
        if (m68052g()) {
            long j7 = this.f92975z;
            this.f92975z = -9223372036854775807L;
            long jMo36124f = mo36124f();
            return jMo36124f != -9223372036854775807L ? jMo36124f : j7;
        }
        long jMo36124f2 = this.f92972w.mo36124f();
        if (jMo36124f2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j13 = this.f92969E;
        long j14 = this.f92970F;
        long jMax = Math.max(jMo36124f2, j13);
        return j14 != Long.MIN_VALUE ? Math.min(jMax, j14) : jMax;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m68052g() {
        return this.f92975z != -9223372036854775807L;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: h */
    public final void mo36125h() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f92971G;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.f92972w.mo36125h();
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: i */
    public final void mo36126i(long j7) {
        this.f92972w.mo36126i(j7);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: k */
    public final C23501g1 mo36128k() {
        return this.f92972w.mo36128k();
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: m */
    public final long mo36129m() {
        long jMo36129m = this.f92972w.mo36129m();
        if (jMo36129m != Long.MIN_VALUE) {
            long j7 = this.f92970F;
            if (j7 == Long.MIN_VALUE || jMo36129m < j7) {
                return jMo36129m;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: n */
    public final void mo36130n(long j7) {
        this.f92972w.mo36130n(j7);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: s */
    public final long mo36131s(long j7, C2846k1 c2846k1) {
        long j13 = this.f92969E;
        if (j7 == j13) {
            return j13;
        }
        long jM121915h = AbstractC38065t.m121915h(c2846k1.f11248a, 0L, j7 - j13);
        long j14 = c2846k1.f11249b;
        long j15 = this.f92970F;
        long jM121915h2 = AbstractC38065t.m121915h(j14, 0L, j15 == Long.MIN_VALUE ? Long.MAX_VALUE : j15 - j7);
        if (jM121915h != c2846k1.f11248a || jM121915h2 != c2846k1.f11249b) {
            c2846k1 = new C2846k1(jM121915h, jM121915h2);
        }
        return this.f92972w.mo36131s(j7, c2846k1);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: t */
    public final void mo36132t(InterfaceC23539z interfaceC23539z, long j7) {
        this.f92973x = interfaceC23539z;
        this.f92972w.mo36132t(this, j7);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: u */
    public final long mo36133u(InterfaceC27679s[] interfaceC27679sArr, boolean[] zArr, InterfaceC23540z0[] interfaceC23540z0Arr, boolean[] zArr2, long j7) {
        long j13;
        this.f92974y = new C23484b[interfaceC23540z0Arr.length];
        InterfaceC23540z0[] interfaceC23540z0Arr2 = new InterfaceC23540z0[interfaceC23540z0Arr.length];
        for (int i13 = 0; i13 < interfaceC23540z0Arr.length; i13++) {
            C23484b[] c23484bArr = this.f92974y;
            C23484b c23484b = (C23484b) interfaceC23540z0Arr[i13];
            c23484bArr[i13] = c23484b;
            interfaceC23540z0Arr2[i13] = c23484b != null ? c23484b.f92966w : null;
        }
        long jMo36133u = this.f92972w.mo36133u(interfaceC27679sArr, zArr, interfaceC23540z0Arr2, zArr2, j7);
        long j14 = this.f92970F;
        long jMax = Math.max(jMo36133u, j7);
        if (j14 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j14);
        }
        if (m68052g()) {
            if (jMo36133u >= j7) {
                if (jMo36133u != 0) {
                    int length = interfaceC27679sArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length) {
                            InterfaceC27679s interfaceC27679s = interfaceC27679sArr[i14];
                            if (interfaceC27679s != null) {
                                C34610p c34610pMo68082n = interfaceC27679s.mo68082n();
                                if (!AbstractC34587d0.m109368a(c34610pMo68082n.f145783n, c34610pMo68082n.f145780k)) {
                                }
                            }
                            i14++;
                        }
                    }
                }
                j13 = -9223372036854775807L;
            }
            j13 = jMax;
        } else {
            j13 = -9223372036854775807L;
        }
        this.f92975z = j13;
        for (int i15 = 0; i15 < interfaceC23540z0Arr.length; i15++) {
            InterfaceC23540z0 interfaceC23540z0 = interfaceC23540z0Arr2[i15];
            if (interfaceC23540z0 == null) {
                this.f92974y[i15] = null;
            } else {
                C23484b[] c23484bArr2 = this.f92974y;
                C23484b c23484b2 = c23484bArr2[i15];
                if (c23484b2 == null || c23484b2.f92966w != interfaceC23540z0) {
                    c23484bArr2[i15] = new C23484b(this, interfaceC23540z0);
                }
            }
            interfaceC23540z0Arr[i15] = this.f92974y[i15];
        }
        return jMax;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: x */
    public final boolean mo36134x(C2856o0 c2856o0) {
        return this.f92972w.mo36134x(c2856o0);
    }
}
