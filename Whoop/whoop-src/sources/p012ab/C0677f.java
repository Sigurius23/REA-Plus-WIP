package p012ab;

import com.iterable.iterableapi.C5363q;
import java.util.Arrays;
import java.util.Collections;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p309lo.C24561s;
import p499t9.AbstractC33618a;
import p499t9.C33642m;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C0677f implements InterfaceC0685j {

    /* JADX INFO: renamed from: x */
    public static final byte[] f2380x = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f2381a;

    /* JADX INFO: renamed from: d */
    public final String f2384d;

    /* JADX INFO: renamed from: e */
    public final int f2385e;

    /* JADX INFO: renamed from: f */
    public final String f2386f;

    /* JADX INFO: renamed from: g */
    public String f2387g;

    /* JADX INFO: renamed from: h */
    public InterfaceC33639k0 f2388h;

    /* JADX INFO: renamed from: i */
    public InterfaceC33639k0 f2389i;

    /* JADX INFO: renamed from: m */
    public boolean f2393m;

    /* JADX INFO: renamed from: n */
    public boolean f2394n;

    /* JADX INFO: renamed from: q */
    public int f2397q;

    /* JADX INFO: renamed from: r */
    public boolean f2398r;

    /* JADX INFO: renamed from: t */
    public int f2400t;

    /* JADX INFO: renamed from: v */
    public InterfaceC33639k0 f2402v;

    /* JADX INFO: renamed from: w */
    public long f2403w;

    /* JADX INFO: renamed from: b */
    public final C24561s f2382b = new C24561s(new byte[7], 7, 5, (byte) 0);

    /* JADX INFO: renamed from: c */
    public final C38059n f2383c = new C38059n(Arrays.copyOf(f2380x, 10));

    /* JADX INFO: renamed from: o */
    public int f2395o = -1;

    /* JADX INFO: renamed from: p */
    public int f2396p = -1;

    /* JADX INFO: renamed from: s */
    public long f2399s = -9223372036854775807L;

    /* JADX INFO: renamed from: u */
    public long f2401u = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public int f2390j = 0;

    /* JADX INFO: renamed from: k */
    public int f2391k = 0;

    /* JADX INFO: renamed from: l */
    public int f2392l = 256;

    public C0677f(boolean z4, String str, int i13, String str2) {
        this.f2381a = z4;
        this.f2384d = str;
        this.f2385e = i13;
        this.f2386f = str2;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        this.f2401u = -9223372036854775807L;
        this.f2394n = false;
        this.f2390j = 0;
        this.f2391k = 0;
        this.f2392l = 256;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0201  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public final void mo1664c(C38059n c38059n) {
        byte b;
        int i13;
        int i14;
        char c3;
        int i15;
        char c7;
        int i16;
        int i17;
        int i18;
        this.f2388h.getClass();
        int i19 = AbstractC38065t.f163031a;
        while (c38059n.m121848a() > 0) {
            int i24 = this.f2390j;
            byte b6 = -1;
            C38059n c38059n2 = this.f2383c;
            int i25 = 3;
            C24561s c24561s = this.f2382b;
            int i26 = 4;
            int i27 = 0;
            int i28 = 1;
            if (i24 == 0) {
                byte[] bArr = c38059n.f163017a;
                int i29 = c38059n.f163018b;
                int i34 = c38059n.f163019c;
                while (true) {
                    if (i29 < i34) {
                        int i35 = i29 + 1;
                        int i36 = i25;
                        byte b8 = bArr[i29];
                        int i37 = b8 & 255;
                        if (this.f2392l == 512 && ((65280 | (((byte) i37) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.f2394n) {
                                int i38 = i29 - 1;
                                c38059n.m121846F(i29);
                                byte[] bArr2 = c24561s.f95858b;
                                if (c38059n.m121848a() < i28) {
                                    b = -1;
                                } else {
                                    c38059n.m121852e(bArr2, i27, i28);
                                    c24561s.m71640q(i26);
                                    int iM71632i = c24561s.m71632i(i28);
                                    int i39 = this.f2395o;
                                    if (i39 == -1 || iM71632i == i39) {
                                        if (this.f2396p != -1) {
                                            byte[] bArr3 = c24561s.f95858b;
                                            if (c38059n.m121848a() >= i28) {
                                                c38059n.m121852e(bArr3, i27, i28);
                                                c24561s.m71640q(2);
                                                i16 = 4;
                                                if (c24561s.m71632i(4) != this.f2396p) {
                                                    b = -1;
                                                } else {
                                                    c38059n.m121846F(i35);
                                                }
                                            }
                                        } else {
                                            i16 = 4;
                                        }
                                        byte[] bArr4 = c24561s.f95858b;
                                        if (c38059n.m121848a() >= i16) {
                                            c38059n.m121852e(bArr4, i27, i16);
                                            c24561s.m71640q(14);
                                            int iM71632i2 = c24561s.m71632i(13);
                                            if (iM71632i2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = c38059n.f163017a;
                                                int i44 = c38059n.f163019c;
                                                int i45 = i38 + iM71632i2;
                                                if (i45 < i44) {
                                                    byte b14 = bArr5[i45];
                                                    b = -1;
                                                    if (b14 == -1) {
                                                        int i46 = i45 + 1;
                                                        if (i46 != i44) {
                                                            byte b15 = bArr5[i46];
                                                            if (((65280 | (b15 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b15 & 8) >> 3) == iM71632i) {
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
                            this.f2397q = (b8 & 8) >> 3;
                            this.f2393m = (b8 & 1) == 0;
                            if (this.f2394n) {
                                this.f2390j = i36;
                                this.f2391k = 0;
                            } else {
                                this.f2390j = 1;
                                this.f2391k = 0;
                            }
                            c38059n.m121846F(i35);
                        } else {
                            b = b6;
                            i13 = i28;
                        }
                        int i47 = this.f2392l;
                        int i48 = i37 | i47;
                        if (i48 == 329) {
                            i14 = 3;
                            c3 = 256;
                            i15 = 0;
                            c7 = 2;
                            this.f2392l = 768;
                        } else if (i48 == 511) {
                            i14 = 3;
                            c3 = 256;
                            i15 = 0;
                            c7 = 2;
                            this.f2392l = 512;
                        } else if (i48 == 836) {
                            i14 = 3;
                            c3 = 256;
                            i15 = 0;
                            c7 = 2;
                            this.f2392l = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        } else if (i48 != 1075) {
                            c3 = 256;
                            if (i47 != 256) {
                                this.f2392l = 256;
                                i14 = 3;
                                i15 = 0;
                                c7 = 2;
                            } else {
                                i14 = 3;
                                i15 = 0;
                                c7 = 2;
                            }
                            i28 = i13;
                            b6 = b;
                            i26 = 4;
                            i27 = i15;
                            i25 = i14;
                        } else {
                            this.f2390j = 2;
                            this.f2391k = 3;
                            this.f2400t = 0;
                            c38059n2.m121846F(0);
                            c38059n.m121846F(i35);
                        }
                        i29 = i35;
                        i28 = i13;
                        b6 = b;
                        i26 = 4;
                        i27 = i15;
                        i25 = i14;
                    } else {
                        c38059n.m121846F(i29);
                    }
                }
            } else if (i24 != 1) {
                if (i24 == 2) {
                    byte[] bArr6 = c38059n2.f163017a;
                    int iMin = Math.min(c38059n.m121848a(), 10 - this.f2391k);
                    c38059n.m121852e(bArr6, this.f2391k, iMin);
                    int i49 = this.f2391k + iMin;
                    this.f2391k = i49;
                    if (i49 == 10) {
                        this.f2389i.mo36176d(c38059n2, 10, 0);
                        c38059n2.m121846F(6);
                        InterfaceC33639k0 interfaceC33639k0 = this.f2389i;
                        int iM121866s = c38059n2.m121866s() + 10;
                        this.f2390j = 4;
                        this.f2391k = 10;
                        this.f2402v = interfaceC33639k0;
                        this.f2403w = 0L;
                        this.f2400t = iM121866s;
                    }
                } else if (i24 == 3) {
                    int i54 = this.f2393m ? 7 : 5;
                    byte[] bArr7 = c24561s.f95858b;
                    int iMin2 = Math.min(c38059n.m121848a(), i54 - this.f2391k);
                    c38059n.m121852e(bArr7, this.f2391k, iMin2);
                    int i55 = this.f2391k + iMin2;
                    this.f2391k = i55;
                    if (i55 == i54) {
                        c24561s.m71640q(0);
                        if (this.f2398r) {
                            c24561s.m71643t(10);
                        } else {
                            int iM71632i3 = c24561s.m71632i(2) + 1;
                            if (iM71632i3 != 2) {
                                AbstractC38046a.m121826u("AdtsReader", "Detected audio object type: " + iM71632i3 + ", but assuming AAC LC.");
                                iM71632i3 = 2;
                            }
                            c24561s.m71643t(5);
                            int iM71632i4 = c24561s.m71632i(3);
                            int i56 = this.f2396p;
                            byte[] bArr8 = {(byte) (((iM71632i3 << 3) & 248) | ((i56 >> 1) & 7)), (byte) (((iM71632i4 << 3) & 120) | ((i56 << 7) & 128))};
                            C5363q c5363qM106221m = AbstractC33618a.m106221m(new C24561s(bArr8, 2, 5, (byte) 0), false);
                            C34608o c34608o = new C34608o();
                            c34608o.f145729a = this.f2387g;
                            c34608o.f145740l = AbstractC34587d0.m109382o(this.f2386f);
                            c34608o.f145741m = AbstractC34587d0.m109382o("audio/mp4a-latm");
                            c34608o.f145738j = c5363qM106221m.f21805a;
                            c34608o.f145719C = c5363qM106221m.f21807c;
                            c34608o.f145720D = c5363qM106221m.f21806b;
                            c34608o.f145744p = Collections.singletonList(bArr8);
                            c34608o.f145732d = this.f2384d;
                            c34608o.f145734f = this.f2385e;
                            C34610p c34610p = new C34610p(c34608o);
                            this.f2399s = 1024000000 / ((long) c34610p.f145760E);
                            this.f2388h.mo36173a(c34610p);
                            this.f2398r = true;
                        }
                        c24561s.m71643t(4);
                        int iM71632i5 = c24561s.m71632i(13);
                        int i57 = iM71632i5 - 7;
                        if (this.f2393m) {
                            i57 = iM71632i5 - 9;
                        }
                        InterfaceC33639k0 interfaceC33639k1 = this.f2388h;
                        long j7 = this.f2399s;
                        this.f2390j = 4;
                        this.f2391k = 0;
                        this.f2402v = interfaceC33639k1;
                        this.f2403w = j7;
                        this.f2400t = i57;
                    }
                } else {
                    if (i24 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(c38059n.m121848a(), this.f2400t - this.f2391k);
                    this.f2402v.mo36176d(c38059n, iMin3, 0);
                    int i58 = this.f2391k + iMin3;
                    this.f2391k = i58;
                    if (i58 == this.f2400t) {
                        AbstractC35849g.m113807i(this.f2401u != -9223372036854775807L);
                        this.f2402v.mo36174b(this.f2401u, 1, this.f2400t, 0, null);
                        this.f2401u += this.f2403w;
                        this.f2390j = 0;
                        this.f2391k = 0;
                        this.f2392l = 256;
                    }
                }
            } else if (c38059n.m121848a() != 0) {
                c24561s.f95858b[0] = c38059n.f163017a[c38059n.f163018b];
                c24561s.m71640q(2);
                int iM71632i6 = c24561s.m71632i(4);
                int i59 = this.f2396p;
                if (i59 == -1 || iM71632i6 == i59) {
                    if (!this.f2394n) {
                        this.f2394n = true;
                        this.f2395o = this.f2397q;
                        this.f2396p = iM71632i6;
                    }
                    this.f2390j = 3;
                    this.f2391k = 0;
                } else {
                    this.f2394n = false;
                    this.f2390j = 0;
                    this.f2391k = 0;
                    this.f2392l = 256;
                }
            }
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        this.f2401u = j7;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: e */
    public final void mo1666e(boolean z4) {
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public final void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2387g = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(c0690l0.f2494e, 1);
        this.f2388h = interfaceC33639k0Mo3101o;
        this.f2402v = interfaceC33639k0Mo3101o;
        if (!this.f2381a) {
            this.f2389i = new C33642m();
            return;
        }
        c0690l0.m1733c();
        c0690l0.m1738h();
        InterfaceC33639k0 interfaceC33639k0Mo3101o2 = interfaceC33648q.mo3101o(c0690l0.f2494e, 5);
        this.f2389i = interfaceC33639k0Mo3101o2;
        C34608o c34608o = new C34608o();
        c0690l0.m1738h();
        c34608o.f145729a = (String) c0690l0.f2495f;
        c34608o.f145740l = AbstractC34587d0.m109382o(this.f2386f);
        c34608o.f145741m = AbstractC34587d0.m109382o("application/id3");
        AbstractC21702c.m61152w(c34608o, interfaceC33639k0Mo3101o2);
    }
}
