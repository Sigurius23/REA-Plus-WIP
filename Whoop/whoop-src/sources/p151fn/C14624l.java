package p151fn;

import android.util.Log;
import ed3.C13117a;
import java.util.Arrays;
import java.util.Collections;
import p012ab.C0690l0;
import p012ab.C0693n;
import p012ab.C0704y;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import p619xl.C38445a;

/* JADX INFO: renamed from: fn.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C14624l implements InterfaceC14620h {

    /* JADX INFO: renamed from: l */
    public static final float[] f53916l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final C38445a f53917a;

    /* JADX INFO: renamed from: b */
    public final C13117a f53918b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f53919c = new boolean[4];

    /* JADX INFO: renamed from: d */
    public final C14623k f53920d;

    /* JADX INFO: renamed from: e */
    public final C0704y f53921e;

    /* JADX INFO: renamed from: f */
    public C0693n f53922f;

    /* JADX INFO: renamed from: g */
    public long f53923g;

    /* JADX INFO: renamed from: h */
    public String f53924h;

    /* JADX INFO: renamed from: i */
    public InterfaceC37377s f53925i;

    /* JADX INFO: renamed from: j */
    public boolean f53926j;

    /* JADX INFO: renamed from: k */
    public long f53927k;

    public C14624l(C38445a c38445a) {
        this.f53917a = c38445a;
        C14623k c14623k = new C14623k();
        c14623k.f53915e = new byte[128];
        this.f53920d = c14623k;
        this.f53927k = -9223372036854775807L;
        this.f53921e = new C0704y(178, 1);
        this.f53918b = new C13117a();
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: a */
    public final void mo41817a() {
        AbstractC24543a.m71576l(this.f53919c);
        C14623k c14623k = this.f53920d;
        c14623k.f53911a = false;
        c14623k.f53913c = 0;
        c14623k.f53912b = 0;
        C0693n c0693n = this.f53922f;
        if (c0693n != null) {
            c0693n.f2503b = false;
            c0693n.f2504c = false;
            c0693n.f2505d = false;
            c0693n.f2506e = -1;
        }
        C0704y c0704y = this.f53921e;
        if (c0704y != null) {
            c0704y.m1759d();
        }
        this.f53923g = 0L;
        this.f53927k = -9223372036854775807L;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: d */
    public final void mo41818d(int i13, long j7) {
        if (j7 != -9223372036854775807L) {
            this.f53927k = j7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: f */
    public final void mo1711f(C13117a c13117a) {
        int i13;
        int i14;
        boolean z4;
        int i15;
        int i16;
        float f13;
        AbstractC24543a.m71574j(this.f53922f);
        AbstractC24543a.m71574j(this.f53925i);
        int i17 = c13117a.f45382b;
        int i18 = c13117a.f45383c;
        byte[] bArr = c13117a.f45381a;
        this.f53923g += (long) c13117a.m36692a();
        this.f53925i.mo102732c(c13117a.m36692a(), c13117a);
        while (true) {
            int iM71580p = AbstractC24543a.m71580p(bArr, i17, i18, this.f53919c);
            C14623k c14623k = this.f53920d;
            C0704y c0704y = this.f53921e;
            if (iM71580p == i18) {
                if (!this.f53926j) {
                    c14623k.m41823a(bArr, i17, i18);
                }
                this.f53922f.m1747a(bArr, i17, i18);
                if (c0704y != null) {
                    c0704y.m1756a(bArr, i17, i18);
                    return;
                }
                return;
            }
            int i19 = iM71580p + 3;
            byte b = c13117a.f45381a[i19];
            int i24 = b & 255;
            int i25 = iM71580p - i17;
            if (this.f53926j) {
                i13 = i18;
                i14 = i19;
            } else {
                if (i25 > 0) {
                    c14623k.m41823a(bArr, i17, iM71580p);
                }
                int i26 = i25 < 0 ? -i25 : 0;
                int i27 = c14623k.f53912b;
                if (i27 != 0) {
                    i13 = i18;
                    if (i27 == 1) {
                        i14 = i19;
                        i16 = 0;
                        if (i24 != 181) {
                            Log.w("H263Reader", "Unexpected start code value");
                            c14623k.f53911a = false;
                            c14623k.f53913c = 0;
                            c14623k.f53912b = 0;
                        } else {
                            c14623k.f53912b = 2;
                        }
                    } else if (i27 != 2) {
                        i14 = i19;
                        if (i27 != 3) {
                            if (i27 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i24 == 179 || i24 == 181) {
                                c14623k.f53913c -= i26;
                                c14623k.f53911a = false;
                                InterfaceC37377s interfaceC37377s = this.f53925i;
                                int i28 = c14623k.f53914d;
                                String str = this.f53924h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(c14623k.f53915e, c14623k.f53913c);
                                C24561s c24561s = new C24561s(bArrCopyOf, bArrCopyOf.length, 0, (byte) 0);
                                c24561s.m71644u(i28);
                                c24561s.m71644u(4);
                                c24561s.m71642s();
                                c24561s.m71643t(8);
                                if (c24561s.m71631h()) {
                                    c24561s.m71643t(4);
                                    c24561s.m71643t(3);
                                }
                                int iM71632i = c24561s.m71632i(4);
                                if (iM71632i == 15) {
                                    int iM71632i2 = c24561s.m71632i(8);
                                    int iM71632i3 = c24561s.m71632i(8);
                                    if (iM71632i3 == 0) {
                                        Log.w("H263Reader", "Invalid aspect ratio");
                                        f13 = 1.0f;
                                    } else {
                                        f13 = iM71632i2 / iM71632i3;
                                    }
                                } else if (iM71632i < 7) {
                                    f13 = f53916l[iM71632i];
                                } else {
                                    Log.w("H263Reader", "Invalid aspect ratio");
                                    f13 = 1.0f;
                                }
                                if (c24561s.m71631h()) {
                                    c24561s.m71643t(2);
                                    c24561s.m71643t(1);
                                    if (c24561s.m71631h()) {
                                        c24561s.m71643t(15);
                                        c24561s.m71642s();
                                        c24561s.m71643t(15);
                                        c24561s.m71642s();
                                        c24561s.m71643t(15);
                                        c24561s.m71642s();
                                        c24561s.m71643t(3);
                                        c24561s.m71643t(11);
                                        c24561s.m71642s();
                                        c24561s.m71643t(15);
                                        c24561s.m71642s();
                                    }
                                }
                                if (c24561s.m71632i(2) != 0) {
                                    Log.w("H263Reader", "Unhandled video object layer shape");
                                }
                                c24561s.m71642s();
                                int iM71632i4 = c24561s.m71632i(16);
                                c24561s.m71642s();
                                if (c24561s.m71631h()) {
                                    if (iM71632i4 == 0) {
                                        Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i29 = 0;
                                        for (int i34 = iM71632i4 - 1; i34 > 0; i34 >>= 1) {
                                            i29++;
                                        }
                                        c24561s.m71643t(i29);
                                    }
                                }
                                c24561s.m71642s();
                                int iM71632i5 = c24561s.m71632i(13);
                                c24561s.m71642s();
                                int iM71632i6 = c24561s.m71632i(13);
                                c24561s.m71642s();
                                c24561s.m71642s();
                                C31518b0 c31518b0 = new C31518b0();
                                c31518b0.f130037a = str;
                                c31518b0.f130047k = "video/mp4v-es";
                                c31518b0.f130052p = iM71632i5;
                                c31518b0.f130053q = iM71632i6;
                                c31518b0.f130056t = f13;
                                c31518b0.f130049m = Collections.singletonList(bArrCopyOf);
                                interfaceC37377s.mo102730a(new C31521c0(c31518b0));
                                this.f53926j = true;
                            } else {
                                i16 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            Log.w("H263Reader", "Unexpected start code value");
                            i16 = 0;
                            c14623k.f53911a = false;
                            c14623k.f53913c = 0;
                            c14623k.f53912b = 0;
                        } else {
                            i16 = 0;
                            c14623k.f53914d = c14623k.f53913c;
                            c14623k.f53912b = 4;
                        }
                    } else {
                        i14 = i19;
                        i16 = 0;
                        if (i24 > 31) {
                            Log.w("H263Reader", "Unexpected start code value");
                            c14623k.f53911a = false;
                            c14623k.f53913c = 0;
                            c14623k.f53912b = 0;
                        } else {
                            c14623k.f53912b = 3;
                        }
                    }
                } else {
                    i13 = i18;
                    i14 = i19;
                    i16 = 0;
                    if (i24 == 176) {
                        c14623k.f53912b = 1;
                        c14623k.f53911a = true;
                    }
                }
                c14623k.m41823a(C14623k.f53910f, i16, 3);
            }
            this.f53922f.m1747a(bArr, i17, iM71580p);
            if (c0704y == null) {
                z4 = true;
            } else {
                if (i25 > 0) {
                    c0704y.m1756a(bArr, i17, iM71580p);
                    i15 = 0;
                } else {
                    i15 = -i25;
                }
                if (c0704y.m1757b(i15)) {
                    int iM71563E = AbstractC24543a.m71563E(c0704y.f2667f, (byte[]) c0704y.f2666e);
                    int i35 = AbstractC24567y.f95875a;
                    byte[] bArr2 = (byte[]) c0704y.f2666e;
                    C13117a c13117a2 = this.f53918b;
                    c13117a2.m36687I(iM71563E, bArr2);
                    this.f53917a.m123176k(this.f53927k, c13117a2);
                }
                if (i24 == 178) {
                    z4 = true;
                    if (c13117a.f45381a[iM71580p + 2] == 1) {
                        c0704y.m1760e(i24);
                    }
                } else {
                    z4 = true;
                }
            }
            int i36 = i13 - iM71580p;
            long j7 = this.f53923g - ((long) i36);
            C0693n c0693n = this.f53922f;
            boolean z13 = this.f53926j;
            if (c0693n.f2506e == 182 && z13 && c0693n.f2503b) {
                long j13 = c0693n.f2509h;
                if (j13 != -9223372036854775807L) {
                    ((InterfaceC37377s) c0693n.f2510i).mo102733d(j13, c0693n.f2505d ? 1 : 0, (int) (j7 - c0693n.f2508g), i36, null);
                }
            }
            if (c0693n.f2506e != 179) {
                c0693n.f2508g = j7;
            }
            C0693n c0693n2 = this.f53922f;
            long j14 = this.f53927k;
            c0693n2.f2506e = i24;
            c0693n2.f2505d = false;
            c0693n2.f2503b = (i24 == 182 || i24 == 179) ? z4 : false;
            c0693n2.f2504c = i24 == 182 ? z4 : false;
            c0693n2.f2507f = 0;
            c0693n2.f2509h = j14;
            i18 = i13;
            i17 = i14;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: g */
    public final void mo1712g(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f53924h = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(c0690l0.f2494e, 2);
        this.f53925i = interfaceC37377sMo3102o;
        this.f53922f = new C0693n(interfaceC37377sMo3102o, 1);
        this.f53917a.m123179n(interfaceC37369k, c0690l0);
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: h */
    public final void mo1713h() {
    }
}
