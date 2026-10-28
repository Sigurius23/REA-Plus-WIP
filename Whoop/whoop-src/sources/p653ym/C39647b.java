package p653ym;

import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import in.C18715c;
import in.InterfaceC18714b;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p151fn.C14629q;
import p308ln.C24519a;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p465rm.C31559p;
import p479s4.AbstractC32128i;
import p479s4.AbstractC32131l;
import p499t9.C33624d;
import p499t9.C33650s;
import p499t9.C33653v;
import p588wm.C37359a;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37374p;
import p588wm.InterfaceC37377s;
import p690zr.AbstractC41023g0;
import s40.AbstractC32145e0;
import so.C32800q;

/* JADX INFO: renamed from: ym.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39647b implements InterfaceC37367i {

    /* JADX INFO: renamed from: e */
    public InterfaceC37369k f170577e;

    /* JADX INFO: renamed from: f */
    public InterfaceC37377s f170578f;

    /* JADX INFO: renamed from: h */
    public C18715c f170580h;

    /* JADX INFO: renamed from: i */
    public C33653v f170581i;

    /* JADX INFO: renamed from: j */
    public int f170582j;

    /* JADX INFO: renamed from: k */
    public int f170583k;

    /* JADX INFO: renamed from: l */
    public C14629q f170584l;

    /* JADX INFO: renamed from: m */
    public int f170585m;

    /* JADX INFO: renamed from: n */
    public long f170586n;

    /* JADX INFO: renamed from: a */
    public final byte[] f170573a = new byte[42];

    /* JADX INFO: renamed from: b */
    public final C13117a f170574b = new C13117a(new byte[32768], 0, 1, false);

    /* JADX INFO: renamed from: c */
    public final boolean f170575c = false;

    /* JADX INFO: renamed from: d */
    public final C33650s f170576d = new C33650s();

    /* JADX INFO: renamed from: g */
    public int f170579g = 0;

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        if (j7 == 0) {
            this.f170579g = 0;
        } else {
            C14629q c14629q = this.f170584l;
            if (c14629q != null) {
                c14629q.m106253e(j13);
            }
        }
        this.f170586n = j13 != 0 ? -1L : 0L;
        this.f170585m = 0;
        this.f170574b.m36686H(0);
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) {
        AbstractC32131l.m100077r(interfaceC37368j, false);
        byte[] bArr = new byte[4];
        ((C37364f) interfaceC37368j).mo3092c(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f170577e = interfaceC37369k;
        this.f170578f = interfaceC37369k.mo3102o(0, 1);
        interfaceC37369k.mo3098l();
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0308  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, byte, int] */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        int i13;
        int i14;
        C18715c c18715c;
        C33653v c33653v;
        C18715c c18715c2;
        InterfaceC37374p c37370l;
        long j7;
        long j13;
        boolean zM100052f;
        int i15 = this.f170579g;
        boolean z4 = true;
        if (i15 == 0) {
            boolean z13 = !this.f170575c;
            ((C37364f) interfaceC37368j).f159847F = 0;
            C37364f c37364f = (C37364f) interfaceC37368j;
            long jMo3095g = c37364f.mo3095g();
            C18715c c18715cM100077r = AbstractC32131l.m100077r(interfaceC37368j, z13);
            c37364f.mo3100n((int) (c37364f.mo3095g() - jMo3095g));
            this.f170580h = c18715cM100077r;
            this.f170579g = 1;
            return 0;
        }
        byte[] bArr = this.f170573a;
        if (i15 == 1) {
            ((C37364f) interfaceC37368j).mo3092c(bArr, 0, bArr.length, false);
            ((C37364f) interfaceC37368j).f159847F = 0;
            this.f170579g = 2;
            return 0;
        }
        int i16 = 24;
        int i17 = 4;
        int i18 = 3;
        if (i15 == 2) {
            byte[] bArr2 = new byte[4];
            ((C37364f) interfaceC37368j).mo3094f(bArr2, 0, 4, false);
            if (((((long) bArr2[3]) & 255) | ((((long) bArr2[0]) & 255) << 24) | ((((long) bArr2[1]) & 255) << 16) | ((((long) bArr2[2]) & 255) << 8)) != 1716281667) {
                throw ParserException.m15562a(null, "Failed to read FLAC stream marker.");
            }
            this.f170579g = 3;
            return 0;
        }
        int i19 = 7;
        if (i15 == 3) {
            ?? r10 = 0;
            C33653v c33653v2 = this.f170581i;
            boolean z14 = false;
            while (!z14) {
                ((C37364f) interfaceC37368j).f159847F = r10;
                byte[] bArr3 = new byte[i17];
                C24561s c24561s = new C24561s(bArr3, i17, (int) r10, (byte) r10);
                C37364f c37364f2 = (C37364f) interfaceC37368j;
                c37364f2.mo3092c(bArr3, r10, i17, r10);
                boolean zM71631h = c24561s.m71631h();
                int iM71632i = c24561s.m71632i(i19);
                int iM71632i2 = c24561s.m71632i(i16) + i17;
                if (iM71632i == 0) {
                    byte[] bArr4 = new byte[38];
                    c37364f2.mo3094f(bArr4, r10, 38, r10);
                    c33653v2 = new C33653v(bArr4, i17, 1);
                    i13 = i16;
                    i14 = i18;
                } else {
                    if (c33653v2 == null) {
                        throw new IllegalArgumentException();
                    }
                    C18715c c18715c3 = (C18715c) c33653v2.f140455m;
                    if (iM71632i == i18) {
                        C13117a c13117a = new C13117a(iM71632i2);
                        c37364f2.mo3094f(c13117a.f45381a, r10, iM71632i2, r10);
                        i13 = i16;
                        c33653v = new C33653v(c33653v2.f140444b, c33653v2.f140445c, c33653v2.f140446d, c33653v2.f140447e, c33653v2.f140448f, c33653v2.f140450h, c33653v2.f140451i, c33653v2.f140453k, AbstractC32131l.m100078s(c13117a), (C18715c) c33653v2.f140455m);
                        i14 = i18;
                    } else {
                        i13 = i16;
                        if (iM71632i == i17) {
                            C13117a c13117a2 = new C13117a(iM71632i2);
                            c37364f2.mo3094f(c13117a2.f45381a, 0, iM71632i2, false);
                            c13117a2.m36690L(i17);
                            C18715c c18715cM100099f = AbstractC32145e0.m100099f(Arrays.asList(AbstractC32145e0.m100101h(c13117a2, false, false).f140425a));
                            if (c18715c3 == null) {
                                c18715c2 = c18715cM100099f;
                            } else if (c18715cM100099f == null) {
                                c18715c2 = c18715c3;
                            } else {
                                InterfaceC18714b[] interfaceC18714bArr = c18715cM100099f.f73525w;
                                if (interfaceC18714bArr.length == 0) {
                                    c18715c2 = c18715c3;
                                } else {
                                    InterfaceC18714b[] interfaceC18714bArr2 = c18715c3.f73525w;
                                    int i24 = AbstractC24567y.f95875a;
                                    Object[] objArrCopyOf = Arrays.copyOf(interfaceC18714bArr2, interfaceC18714bArr2.length + interfaceC18714bArr.length);
                                    System.arraycopy(interfaceC18714bArr, 0, objArrCopyOf, interfaceC18714bArr2.length, interfaceC18714bArr.length);
                                    c18715c2 = new C18715c((InterfaceC18714b[]) objArrCopyOf);
                                }
                            }
                            i14 = i18;
                            c33653v = new C33653v(c33653v2.f140444b, c33653v2.f140445c, c33653v2.f140446d, c33653v2.f140447e, c33653v2.f140448f, c33653v2.f140450h, c33653v2.f140451i, c33653v2.f140453k, (C32800q) c33653v2.f140454l, c18715c2);
                        } else {
                            i14 = i18;
                            if (iM71632i == 6) {
                                C13117a c13117a3 = new C13117a(iM71632i2);
                                c37364f2.mo3094f(c13117a3.f45381a, 0, iM71632i2, false);
                                c13117a3.m36690L(i17);
                                C18715c c18715c4 = new C18715c(AbstractC41023g0.m133256r(C24519a.m71426b(c13117a3)));
                                if (c18715c3 == null) {
                                    c18715c = c18715c4;
                                } else {
                                    InterfaceC18714b[] interfaceC18714bArr3 = c18715c4.f73525w;
                                    if (interfaceC18714bArr3.length == 0) {
                                        c18715c = c18715c3;
                                    } else {
                                        InterfaceC18714b[] interfaceC18714bArr4 = c18715c3.f73525w;
                                        int i25 = AbstractC24567y.f95875a;
                                        Object[] objArrCopyOf2 = Arrays.copyOf(interfaceC18714bArr4, interfaceC18714bArr4.length + interfaceC18714bArr3.length);
                                        System.arraycopy(interfaceC18714bArr3, 0, objArrCopyOf2, interfaceC18714bArr4.length, interfaceC18714bArr3.length);
                                        c18715c4 = new C18715c((InterfaceC18714b[]) objArrCopyOf2);
                                        c18715c = c18715c4;
                                    }
                                }
                                c33653v = new C33653v(c33653v2.f140444b, c33653v2.f140445c, c33653v2.f140446d, c33653v2.f140447e, c33653v2.f140448f, c33653v2.f140450h, c33653v2.f140451i, c33653v2.f140453k, (C32800q) c33653v2.f140454l, c18715c);
                            } else {
                                c37364f2.mo3100n(iM71632i2);
                            }
                        }
                    }
                    c33653v2 = c33653v;
                }
                int i26 = AbstractC24567y.f95875a;
                this.f170581i = c33653v2;
                z14 = zM71631h;
                i18 = i14;
                i16 = i13;
                r10 = 0;
                i17 = 4;
                i19 = 7;
            }
            this.f170581i.getClass();
            this.f170582j = Math.max(this.f170581i.f140446d, 6);
            InterfaceC37377s interfaceC37377s = this.f170578f;
            int i27 = AbstractC24567y.f95875a;
            interfaceC37377s.mo102730a(this.f170581i.m106293d(bArr, this.f170580h));
            this.f170579g = 4;
            return 0;
        }
        long j14 = 0;
        if (i15 == 4) {
            ((C37364f) interfaceC37368j).f159847F = 0;
            byte[] bArr5 = new byte[2];
            C37364f c37364f3 = (C37364f) interfaceC37368j;
            c37364f3.mo3092c(bArr5, 0, 2, false);
            int i28 = (bArr5[1] & 255) | ((bArr5[0] & 255) << 8);
            if ((i28 >> 2) != 16382) {
                c37364f3.f159847F = 0;
                throw ParserException.m15562a(null, "First frame does not start with sync code.");
            }
            c37364f3.f159847F = 0;
            this.f170583k = i28;
            InterfaceC37369k interfaceC37369k = this.f170577e;
            int i29 = AbstractC24567y.f95875a;
            long j15 = c37364f3.f159852z;
            long j16 = c37364f3.f159851y;
            this.f170581i.getClass();
            C33653v c33653v3 = this.f170581i;
            if (((C32800q) c33653v3.f140454l) != null) {
                c37370l = new C37370l(c33653v3, j15);
            } else if (j16 == -1 || c33653v3.f140453k <= 0) {
                c37370l = new C37370l(c33653v3.m106292c());
            } else {
                int i34 = this.f170583k;
                int i35 = c33653v3.f140446d;
                C31559p c31559p = new C31559p(c33653v3, 21);
                C39646a c39646a = new C39646a(c33653v3, i34);
                long jM106292c = c33653v3.m106292c();
                long j17 = c33653v3.f140453k;
                int i36 = c33653v3.f140447e;
                if (i36 > 0) {
                    j7 = ((((long) i36) + ((long) i35)) / 2) + 1;
                } else {
                    int i37 = c33653v3.f140444b;
                    j7 = (((((i37 != c33653v3.f140445c || i37 <= 0) ? 4096L : i37) * ((long) c33653v3.f140450h)) * ((long) c33653v3.f140451i)) / 8) + 64;
                }
                C14629q c14629q = new C14629q(c31559p, c39646a, jM106292c, j17, j15, j16, j7, Math.max(6, i35));
                this.f170584l = c14629q;
                c37370l = (C37359a) c14629q.f140382c;
            }
            interfaceC37369k.mo3111x(c37370l);
            this.f170579g = 5;
            return 0;
        }
        if (i15 != 5) {
            throw new IllegalStateException();
        }
        this.f170578f.getClass();
        this.f170581i.getClass();
        C14629q c14629q2 = this.f170584l;
        if (c14629q2 != null && ((C33624d) c14629q2.f140384e) != null) {
            return c14629q2.m106252b(interfaceC37368j, c33650s);
        }
        if (this.f170586n == -1) {
            C33653v c33653v4 = this.f170581i;
            ((C37364f) interfaceC37368j).f159847F = 0;
            C37364f c37364f4 = (C37364f) interfaceC37368j;
            c37364f4.m119648a(1, false);
            byte[] bArr6 = new byte[1];
            c37364f4.mo3092c(bArr6, 0, 1, false);
            boolean z15 = (bArr6[0] & 1) == 1;
            c37364f4.m119648a(2, false);
            i19 = z15 ? 7 : 6;
            C13117a c13117a4 = new C13117a(i19);
            byte[] bArr7 = c13117a4.f45381a;
            int i38 = 0;
            while (i38 < i19) {
                int iMo3099m = c37364f4.mo3099m(bArr7, i38, i19 - i38);
                if (iMo3099m == -1) {
                    break;
                }
                i38 += iMo3099m;
            }
            c13117a4.m36688J(i38);
            c37364f4.f159847F = 0;
            try {
                long jM36683E = c13117a4.m36683E();
                if (!z15) {
                    jM36683E *= (long) c33653v4.f140445c;
                }
                j14 = jM36683E;
            } catch (NumberFormatException unused) {
                z4 = false;
            }
            long j18 = j14;
            if (!z4) {
                throw ParserException.m15562a(null, null);
            }
            this.f170586n = j18;
        } else {
            C13117a c13117a5 = this.f170574b;
            int i39 = c13117a5.f45383c;
            if (i39 < 32768) {
                int i44 = ((C37364f) interfaceC37368j).read(c13117a5.f45381a, i39, 32768 - i39);
                z4 = i44 == -1;
                if (!z4) {
                    c13117a5.m36688J(i39 + i44);
                } else if (c13117a5.m36692a() == 0) {
                    long j19 = this.f170586n * 1000000;
                    C33653v c33653v5 = this.f170581i;
                    int i45 = AbstractC24567y.f95875a;
                    this.f170578f.mo102733d(j19 / ((long) c33653v5.f140448f), 1, this.f170585m, 0, null);
                    return -1;
                }
            } else {
                z4 = false;
            }
            int i46 = c13117a5.f45382b;
            int i47 = this.f170585m;
            int i48 = this.f170582j;
            if (i47 < i48) {
                c13117a5.m36690L(Math.min(i48 - i47, c13117a5.m36692a()));
            }
            this.f170581i.getClass();
            int i49 = c13117a5.f45382b;
            while (true) {
                int i54 = c13117a5.f45383c - 16;
                C33650s c33650s2 = this.f170576d;
                if (i49 > i54) {
                    if (z4) {
                        while (true) {
                            int i55 = c13117a5.f45383c;
                            if (i49 <= i55 - this.f170582j) {
                                c13117a5.m36689K(i49);
                                try {
                                    zM100052f = AbstractC32128i.m100052f(c13117a5, this.f170581i, this.f170583k, c33650s2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM100052f = false;
                                }
                                if (c13117a5.f45382b > c13117a5.f45383c) {
                                    zM100052f = false;
                                }
                                if (zM100052f) {
                                    c13117a5.m36689K(i49);
                                    j13 = c33650s2.f140436a;
                                    break;
                                }
                                i49++;
                            } else {
                                c13117a5.m36689K(i55);
                            }
                        }
                    } else {
                        c13117a5.m36689K(i49);
                    }
                    j13 = -1;
                    break;
                }
                c13117a5.m36689K(i49);
                if (AbstractC32128i.m100052f(c13117a5, this.f170581i, this.f170583k, c33650s2)) {
                    c13117a5.m36689K(i49);
                    j13 = c33650s2.f140436a;
                    break;
                }
                i49++;
            }
            int i56 = c13117a5.f45382b - i46;
            c13117a5.m36689K(i46);
            this.f170578f.mo102732c(i56, c13117a5);
            int i57 = this.f170585m + i56;
            this.f170585m = i57;
            if (j13 != -1) {
                long j24 = this.f170586n * 1000000;
                C33653v c33653v6 = this.f170581i;
                int i58 = AbstractC24567y.f95875a;
                this.f170578f.mo102733d(j24 / ((long) c33653v6.f140448f), 1, i57, 0, null);
                this.f170585m = 0;
                this.f170586n = j13;
            }
            if (c13117a5.m36692a() < 16) {
                int iM36692a = c13117a5.m36692a();
                byte[] bArr8 = c13117a5.f45381a;
                System.arraycopy(bArr8, c13117a5.f45382b, bArr8, 0, iM36692a);
                c13117a5.m36689K(0);
                c13117a5.m36688J(iM36692a);
            }
        }
        return 0;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
