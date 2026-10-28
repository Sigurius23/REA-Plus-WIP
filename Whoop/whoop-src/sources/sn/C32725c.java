package sn;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;
import io.InterfaceC20035o;
import java.util.ArrayList;
import p047c9.C4320k;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import p465rm.C31537h1;

/* JADX INFO: renamed from: sn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C32725c implements InterfaceC32757s, InterfaceC32755r {

    /* JADX INFO: renamed from: E */
    public long f136037E;

    /* JADX INFO: renamed from: F */
    public long f136038F;

    /* JADX INFO: renamed from: G */
    public ClippingMediaSource$IllegalClippingException f136039G;

    /* JADX INFO: renamed from: w */
    public final InterfaceC32757s f136040w;

    /* JADX INFO: renamed from: x */
    public InterfaceC32755r f136041x;

    /* JADX INFO: renamed from: y */
    public C32723b[] f136042y = new C32723b[0];

    /* JADX INFO: renamed from: z */
    public long f136043z;

    public C32725c(InterfaceC32757s interfaceC32757s, boolean z4, long j7, long j13) {
        this.f136040w = interfaceC32757s;
        this.f136043z = z4 ? j7 : -9223372036854775807L;
        this.f136037E = j7;
        this.f136038F = j13;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: a */
    public final boolean mo91531a() {
        return this.f136040w.mo91531a();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: b */
    public final void mo102699b(InterfaceC32755r interfaceC32755r, long j7) {
        this.f136041x = interfaceC32755r;
        this.f136040w.mo102699b(this, j7);
    }

    @Override // sn.InterfaceC32758s0
    /* JADX INFO: renamed from: c */
    public final void mo97274c(InterfaceC32760t0 interfaceC32760t0) {
        InterfaceC32755r interfaceC32755r = this.f136041x;
        interfaceC32755r.getClass();
        interfaceC32755r.mo97274c(this);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: d */
    public final long mo91532d() {
        long jMo91532d = this.f136040w.mo91532d();
        if (jMo91532d != Long.MIN_VALUE) {
            long j7 = this.f136038F;
            if (j7 == Long.MIN_VALUE || jMo91532d < j7) {
                return jMo91532d;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: e */
    public final long mo102700e(long j7) {
        this.f136043z = -9223372036854775807L;
        boolean z4 = false;
        for (C32723b c32723b : this.f136042y) {
            if (c32723b != null) {
                c32723b.f136033x = false;
            }
        }
        long jMo102700e = this.f136040w.mo102700e(j7);
        if (jMo102700e == j7) {
            z4 = true;
        } else if (jMo102700e >= this.f136037E) {
            long j13 = this.f136038F;
            if (j13 == Long.MIN_VALUE || jMo102700e <= j13) {
                z4 = true;
            }
        }
        AbstractC24543a.m71573i(z4);
        return jMo102700e;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: f */
    public final long mo102701f() {
        if (m102706l()) {
            long j7 = this.f136043z;
            this.f136043z = -9223372036854775807L;
            long jMo102701f = mo102701f();
            return jMo102701f != -9223372036854775807L ? jMo102701f : j7;
        }
        long jMo102701f2 = this.f136040w.mo102701f();
        if (jMo102701f2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC24543a.m71573i(jMo102701f2 >= this.f136037E);
        long j13 = this.f136038F;
        AbstractC24543a.m71573i(j13 == Long.MIN_VALUE || jMo102701f2 <= j13);
        return jMo102701f2;
    }

    @Override // sn.InterfaceC32755r
    /* JADX INFO: renamed from: g */
    public final void mo97282g(InterfaceC32757s interfaceC32757s) {
        if (this.f136039G != null) {
            return;
        }
        InterfaceC32755r interfaceC32755r = this.f136041x;
        interfaceC32755r.getClass();
        interfaceC32755r.mo97282g(this);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: h */
    public final void mo102702h() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f136039G;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.f136040w.mo102702h();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: i */
    public final void mo102703i(long j7) {
        this.f136040w.mo102703i(j7);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: j */
    public final long mo102704j(InterfaceC20035o[] interfaceC20035oArr, boolean[] zArr, InterfaceC32756r0[] interfaceC32756r0Arr, boolean[] zArr2, long j7) {
        long j13;
        C4320k c4320kM71611e;
        int iM13611a;
        this.f136042y = new C32723b[interfaceC32756r0Arr.length];
        InterfaceC32756r0[] interfaceC32756r0Arr2 = new InterfaceC32756r0[interfaceC32756r0Arr.length];
        int i13 = 0;
        while (true) {
            InterfaceC32756r0 interfaceC32756r0 = null;
            if (i13 >= interfaceC32756r0Arr.length) {
                break;
            }
            C32723b[] c32723bArr = this.f136042y;
            C32723b c32723b = (C32723b) interfaceC32756r0Arr[i13];
            c32723bArr[i13] = c32723b;
            if (c32723b != null) {
                interfaceC32756r0 = c32723b.f136032w;
            }
            interfaceC32756r0Arr2[i13] = interfaceC32756r0;
            i13++;
        }
        long jMo102704j = this.f136040w.mo102704j(interfaceC20035oArr, zArr, interfaceC32756r0Arr2, zArr2, j7);
        boolean z4 = true;
        if (m102706l()) {
            long j14 = this.f136037E;
            if (j7 != j14 || j14 == 0) {
                j13 = -9223372036854775807L;
            } else {
                int length = interfaceC20035oArr.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        j13 = -9223372036854775807L;
                    } else {
                        InterfaceC20035o interfaceC20035o = interfaceC20035oArr[i14];
                        if (interfaceC20035o != null) {
                            C31521c0 c31521c0Mo54504n = interfaceC20035o.mo54504n();
                            String str = c31521c0Mo54504n.f130077L;
                            String str2 = c31521c0Mo54504n.f130074I;
                            ArrayList arrayList = AbstractC24555m.f95827a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        continue;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null && (c4320kM71611e = AbstractC24555m.m71611e(str2)) != null && (iM13611a = c4320kM71611e.m13611a()) != 0 && iM13611a != 16) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            }
                            j13 = jMo102704j;
                        }
                        i14++;
                    }
                }
            }
        } else {
            j13 = -9223372036854775807L;
        }
        this.f136043z = j13;
        if (jMo102704j != j7) {
            if (jMo102704j >= this.f136037E) {
                long j15 = this.f136038F;
                if (j15 != Long.MIN_VALUE && jMo102704j > j15) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
        }
        AbstractC24543a.m71573i(z4);
        for (int i15 = 0; i15 < interfaceC32756r0Arr.length; i15++) {
            InterfaceC32756r0 interfaceC32756r1 = interfaceC32756r0Arr2[i15];
            if (interfaceC32756r1 == null) {
                this.f136042y[i15] = null;
            } else {
                C32723b[] c32723bArr2 = this.f136042y;
                C32723b c32723b2 = c32723bArr2[i15];
                if (c32723b2 == null || c32723b2.f136032w != interfaceC32756r1) {
                    c32723bArr2[i15] = new C32723b(this, interfaceC32756r1);
                }
            }
            interfaceC32756r0Arr[i15] = this.f136042y[i15];
        }
        return jMo102704j;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: k */
    public final C32768x0 mo102705k() {
        return this.f136040w.mo102705k();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m102706l() {
        return this.f136043z != -9223372036854775807L;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: m */
    public final long mo91533m() {
        long jMo91533m = this.f136040w.mo91533m();
        if (jMo91533m != Long.MIN_VALUE) {
            long j7 = this.f136038F;
            if (j7 == Long.MIN_VALUE || jMo91533m < j7) {
                return jMo91533m;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: n */
    public final void mo91534n(long j7) {
        this.f136040w.mo91534n(j7);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: u */
    public final boolean mo91536u(long j7) {
        return this.f136040w.mo91536u(j7);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: v */
    public final long mo102707v(long j7, C31537h1 c31537h1) {
        long j13 = this.f136037E;
        if (j7 == j13) {
            return j13;
        }
        long jM71678i = AbstractC24567y.m71678i(c31537h1.f130168a, 0L, j7 - j13);
        long j14 = c31537h1.f130169b;
        long j15 = this.f136038F;
        long jM71678i2 = AbstractC24567y.m71678i(j14, 0L, j15 == Long.MIN_VALUE ? Long.MAX_VALUE : j15 - j7);
        if (jM71678i != c31537h1.f130168a || jM71678i2 != c31537h1.f130169b) {
            c31537h1 = new C31537h1(jM71678i, jM71678i2);
        }
        return this.f136040w.mo102707v(j7, c31537h1);
    }
}
