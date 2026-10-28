package p151fn;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.iterable.iterableapi.C5363q;
import ed3.C13117a;
import java.util.Arrays;
import java.util.Collections;
import no.nordicsemi.android.dfu.DfuBaseService;
import p012ab.C0690l0;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p588wm.C37366h;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: fn.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C14617e implements InterfaceC14620h {

    /* JADX INFO: renamed from: v */
    public static final byte[] f53853v = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f53854a;

    /* JADX INFO: renamed from: d */
    public final String f53857d;

    /* JADX INFO: renamed from: e */
    public String f53858e;

    /* JADX INFO: renamed from: f */
    public InterfaceC37377s f53859f;

    /* JADX INFO: renamed from: g */
    public InterfaceC37377s f53860g;

    /* JADX INFO: renamed from: k */
    public boolean f53864k;

    /* JADX INFO: renamed from: l */
    public boolean f53865l;

    /* JADX INFO: renamed from: o */
    public int f53868o;

    /* JADX INFO: renamed from: p */
    public boolean f53869p;

    /* JADX INFO: renamed from: r */
    public int f53871r;

    /* JADX INFO: renamed from: t */
    public InterfaceC37377s f53873t;

    /* JADX INFO: renamed from: u */
    public long f53874u;

    /* JADX INFO: renamed from: b */
    public final C24561s f53855b = new C24561s(new byte[7], 7, 0, (byte) 0);

    /* JADX INFO: renamed from: c */
    public final C13117a f53856c = new C13117a(Arrays.copyOf(f53853v, 10), 1, (byte) 0);

    /* JADX INFO: renamed from: h */
    public int f53861h = 0;

    /* JADX INFO: renamed from: i */
    public int f53862i = 0;

    /* JADX INFO: renamed from: j */
    public int f53863j = 256;

    /* JADX INFO: renamed from: m */
    public int f53866m = -1;

    /* JADX INFO: renamed from: n */
    public int f53867n = -1;

    /* JADX INFO: renamed from: q */
    public long f53870q = -9223372036854775807L;

    /* JADX INFO: renamed from: s */
    public long f53872s = -9223372036854775807L;

    public C14617e(boolean z4, String str) {
        this.f53854a = z4;
        this.f53857d = str;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: a */
    public final void mo41817a() {
        this.f53872s = -9223372036854775807L;
        this.f53865l = false;
        this.f53861h = 0;
        this.f53862i = 0;
        this.f53863j = 256;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: d */
    public final void mo41818d(int i13, long j7) {
        if (j7 != -9223372036854775807L) {
            this.f53872s = j7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01ed  */
    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: f */
    public final void mo1711f(C13117a c13117a) throws ParserException {
        byte b;
        int i13;
        int i14;
        char c3;
        int i15;
        char c7;
        int i16;
        int i17;
        int i18;
        this.f53859f.getClass();
        int i19 = AbstractC24567y.f95875a;
        while (c13117a.m36692a() > 0) {
            int i24 = this.f53861h;
            byte b6 = -1;
            C13117a c13117a2 = this.f53856c;
            int i25 = 3;
            C24561s c24561s = this.f53855b;
            int i26 = 4;
            int i27 = 1;
            int i28 = 0;
            if (i24 == 0) {
                byte[] bArr = c13117a.f45381a;
                int i29 = c13117a.f45382b;
                int i34 = c13117a.f45383c;
                while (true) {
                    if (i29 < i34) {
                        int i35 = i29 + 1;
                        int i36 = i25;
                        byte b8 = bArr[i29];
                        int i37 = b8 & 255;
                        if (this.f53863j == 512 && ((65280 | (((byte) i37) & 255)) & 65526) == 65520) {
                            if (!this.f53865l) {
                                int i38 = i29 - 1;
                                c13117a.m36689K(i29);
                                byte[] bArr2 = c24561s.f95858b;
                                if (c13117a.m36692a() < i27) {
                                    b = -1;
                                } else {
                                    c13117a.m36697g(bArr2, i28, i27);
                                    c24561s.m71640q(i26);
                                    int iM71632i = c24561s.m71632i(i27);
                                    int i39 = this.f53866m;
                                    if (i39 == -1 || iM71632i == i39) {
                                        if (this.f53867n != -1) {
                                            byte[] bArr3 = c24561s.f95858b;
                                            if (c13117a.m36692a() >= i27) {
                                                c13117a.m36697g(bArr3, i28, i27);
                                                c24561s.m71640q(2);
                                                i16 = 4;
                                                if (c24561s.m71632i(4) != this.f53867n) {
                                                    b = -1;
                                                } else {
                                                    c13117a.m36689K(i35);
                                                }
                                            }
                                        } else {
                                            i16 = 4;
                                        }
                                        byte[] bArr4 = c24561s.f95858b;
                                        if (c13117a.m36692a() >= i16) {
                                            c13117a.m36697g(bArr4, i28, i16);
                                            c24561s.m71640q(14);
                                            int iM71632i2 = c24561s.m71632i(13);
                                            if (iM71632i2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = c13117a.f45381a;
                                                int i44 = c13117a.f45383c;
                                                int i45 = i38 + iM71632i2;
                                                if (i45 < i44) {
                                                    byte b14 = bArr5[i45];
                                                    b = -1;
                                                    if (b14 == -1) {
                                                        int i46 = i45 + 1;
                                                        if (i46 != i44) {
                                                            byte b15 = bArr5[i46];
                                                            if (((65280 | (b15 & 255)) & 65526) == 65520 && ((b15 & 8) >> 3) == iM71632i) {
                                                            }
                                                        }
                                                    } else if (b14 == 73 && ((i17 = i45 + 1) == i44 || (bArr5[i17] == 68 && ((i18 = i45 + 2) == i44 || bArr5[i18] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i13 = 1;
                            }
                            this.f53868o = (b8 & 8) >> 3;
                            this.f53864k = (b8 & 1) == 0;
                            if (this.f53865l) {
                                this.f53861h = i36;
                                this.f53862i = 0;
                            } else {
                                this.f53861h = 1;
                                this.f53862i = 0;
                            }
                            c13117a.m36689K(i35);
                        } else {
                            b = b6;
                            i13 = i27;
                        }
                        int i47 = this.f53863j;
                        int i48 = i37 | i47;
                        if (i48 == 329) {
                            i14 = 3;
                            c3 = 256;
                            i15 = 0;
                            c7 = 2;
                            this.f53863j = 768;
                        } else if (i48 == 511) {
                            i14 = 3;
                            c3 = 256;
                            i15 = 0;
                            c7 = 2;
                            this.f53863j = 512;
                        } else if (i48 == 836) {
                            i14 = 3;
                            c3 = 256;
                            i15 = 0;
                            c7 = 2;
                            this.f53863j = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        } else if (i48 != 1075) {
                            c3 = 256;
                            if (i47 != 256) {
                                this.f53863j = 256;
                                i14 = 3;
                                i15 = 0;
                                c7 = 2;
                            } else {
                                i14 = 3;
                                i15 = 0;
                                c7 = 2;
                            }
                            i27 = i13;
                            b6 = b;
                            i26 = 4;
                            i28 = i15;
                            i25 = i14;
                        } else {
                            this.f53861h = 2;
                            this.f53862i = 3;
                            this.f53871r = 0;
                            c13117a2.m36689K(0);
                            c13117a.m36689K(i35);
                        }
                        i29 = i35;
                        i27 = i13;
                        b6 = b;
                        i26 = 4;
                        i28 = i15;
                        i25 = i14;
                    } else {
                        c13117a.m36689K(i29);
                    }
                }
            } else if (i24 != 1) {
                if (i24 == 2) {
                    byte[] bArr6 = c13117a2.f45381a;
                    int iMin = Math.min(c13117a.m36692a(), 10 - this.f53862i);
                    c13117a.m36697g(bArr6, this.f53862i, iMin);
                    int i49 = this.f53862i + iMin;
                    this.f53862i = i49;
                    if (i49 == 10) {
                        this.f53860g.mo102732c(10, c13117a2);
                        c13117a2.m36689K(6);
                        InterfaceC37377s interfaceC37377s = this.f53860g;
                        int iM36713w = c13117a2.m36713w() + 10;
                        this.f53861h = 4;
                        this.f53862i = 10;
                        this.f53873t = interfaceC37377s;
                        this.f53874u = 0L;
                        this.f53871r = iM36713w;
                    }
                } else if (i24 == 3) {
                    int i54 = this.f53864k ? 7 : 5;
                    byte[] bArr7 = c24561s.f95858b;
                    int iMin2 = Math.min(c13117a.m36692a(), i54 - this.f53862i);
                    c13117a.m36697g(bArr7, this.f53862i, iMin2);
                    int i55 = this.f53862i + iMin2;
                    this.f53862i = i55;
                    if (i55 == i54) {
                        c24561s.m71640q(0);
                        if (this.f53869p) {
                            c24561s.m71643t(10);
                        } else {
                            int iM71632i3 = c24561s.m71632i(2) + 1;
                            if (iM71632i3 != 2) {
                                StringBuilder sb4 = new StringBuilder(61);
                                sb4.append("Detected audio object type: ");
                                sb4.append(iM71632i3);
                                sb4.append(", but assuming AAC LC.");
                                Log.w("AdtsReader", sb4.toString());
                                iM71632i3 = 2;
                            }
                            c24561s.m71643t(5);
                            int iM71632i4 = c24561s.m71632i(3);
                            int i56 = this.f53867n;
                            byte[] bArr8 = {(byte) (((iM71632i3 << 3) & 248) | ((i56 >> 1) & 7)), (byte) (((iM71632i4 << 3) & 120) | ((i56 << 7) & 128))};
                            C5363q c5363qM107332f = AbstractC33922a.m107332f(new C24561s(bArr8, 2, 0, (byte) 0), false);
                            C31518b0 c31518b0 = new C31518b0();
                            c31518b0.f130037a = this.f53858e;
                            c31518b0.f130047k = "audio/mp4a-latm";
                            c31518b0.f130044h = c5363qM107332f.f21805a;
                            c31518b0.f130060x = c5363qM107332f.f21807c;
                            c31518b0.f130061y = c5363qM107332f.f21806b;
                            c31518b0.f130049m = Collections.singletonList(bArr8);
                            c31518b0.f130039c = this.f53857d;
                            C31521c0 c31521c0 = new C31521c0(c31518b0);
                            this.f53870q = 1024000000 / ((long) c31521c0.f130091Z);
                            this.f53859f.mo102730a(c31521c0);
                            this.f53869p = true;
                        }
                        c24561s.m71643t(4);
                        int iM71632i5 = c24561s.m71632i(13);
                        int i57 = iM71632i5 - 7;
                        if (this.f53864k) {
                            i57 = iM71632i5 - 9;
                        }
                        InterfaceC37377s interfaceC37377s2 = this.f53859f;
                        long j7 = this.f53870q;
                        this.f53861h = 4;
                        this.f53862i = 0;
                        this.f53873t = interfaceC37377s2;
                        this.f53874u = j7;
                        this.f53871r = i57;
                    }
                } else {
                    if (i24 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(c13117a.m36692a(), this.f53871r - this.f53862i);
                    this.f53873t.mo102732c(iMin3, c13117a);
                    int i58 = this.f53862i + iMin3;
                    this.f53862i = i58;
                    int i59 = this.f53871r;
                    if (i58 == i59) {
                        long j13 = this.f53872s;
                        if (j13 != -9223372036854775807L) {
                            this.f53873t.mo102733d(j13, 1, i59, 0, null);
                            this.f53872s += this.f53874u;
                        }
                        this.f53861h = 0;
                        this.f53862i = 0;
                        this.f53863j = 256;
                    }
                }
            } else if (c13117a.m36692a() != 0) {
                c24561s.f95858b[0] = c13117a.f45381a[c13117a.f45382b];
                c24561s.m71640q(2);
                int iM71632i6 = c24561s.m71632i(4);
                int i64 = this.f53867n;
                if (i64 == -1 || iM71632i6 == i64) {
                    if (!this.f53865l) {
                        this.f53865l = true;
                        this.f53866m = this.f53868o;
                        this.f53867n = iM71632i6;
                    }
                    this.f53861h = 3;
                    this.f53862i = 0;
                } else {
                    this.f53865l = false;
                    this.f53861h = 0;
                    this.f53862i = 0;
                    this.f53863j = 256;
                }
            }
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: g */
    public final void mo1712g(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f53858e = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(c0690l0.f2494e, 1);
        this.f53859f = interfaceC37377sMo3102o;
        this.f53873t = interfaceC37377sMo3102o;
        if (!this.f53854a) {
            this.f53860g = new C37366h();
            return;
        }
        c0690l0.m1733c();
        c0690l0.m1738h();
        InterfaceC37377s interfaceC37377sMo3102o2 = interfaceC37369k.mo3102o(c0690l0.f2494e, 5);
        this.f53860g = interfaceC37377sMo3102o2;
        C31518b0 c31518b0 = new C31518b0();
        c0690l0.m1738h();
        c31518b0.f130037a = (String) c0690l0.f2495f;
        c31518b0.f130047k = "application/id3";
        interfaceC37377sMo3102o2.mo102730a(new C31521c0(c31518b0));
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: h */
    public final void mo1713h() {
    }
}
