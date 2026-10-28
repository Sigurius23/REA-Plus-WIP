package p012ab;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p619xl.C38445a;
import p641y8.AbstractC39319n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C0689l implements InterfaceC0685j {

    /* JADX INFO: renamed from: r */
    public static final double[] f2472r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f2473a;

    /* JADX INFO: renamed from: b */
    public InterfaceC33639k0 f2474b;

    /* JADX INFO: renamed from: c */
    public final C38445a f2475c;

    /* JADX INFO: renamed from: d */
    public final String f2476d;

    /* JADX INFO: renamed from: e */
    public final C38059n f2477e;

    /* JADX INFO: renamed from: f */
    public final C0704y f2478f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f2479g = new boolean[4];

    /* JADX INFO: renamed from: h */
    public final C0687k f2480h;

    /* JADX INFO: renamed from: i */
    public long f2481i;

    /* JADX INFO: renamed from: j */
    public boolean f2482j;

    /* JADX INFO: renamed from: k */
    public boolean f2483k;

    /* JADX INFO: renamed from: l */
    public long f2484l;

    /* JADX INFO: renamed from: m */
    public long f2485m;

    /* JADX INFO: renamed from: n */
    public long f2486n;

    /* JADX INFO: renamed from: o */
    public long f2487o;

    /* JADX INFO: renamed from: p */
    public boolean f2488p;

    /* JADX INFO: renamed from: q */
    public boolean f2489q;

    public C0689l(C38445a c38445a, String str) {
        this.f2475c = c38445a;
        this.f2476d = str;
        C0687k c0687k = new C0687k();
        c0687k.f2469d = new byte[128];
        this.f2480h = c0687k;
        if (c38445a != null) {
            this.f2478f = new C0704y(178, 0);
            this.f2477e = new C38059n();
        } else {
            this.f2478f = null;
            this.f2477e = null;
        }
        this.f2485m = -9223372036854775807L;
        this.f2487o = -9223372036854775807L;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        AbstractC39319n.m125275b(this.f2479g);
        C0687k c0687k = this.f2480h;
        c0687k.f2466a = false;
        c0687k.f2467b = 0;
        c0687k.f2468c = 0;
        C0704y c0704y = this.f2478f;
        if (c0704y != null) {
            c0704y.m1759d();
        }
        this.f2481i = 0L;
        this.f2482j = false;
        this.f2485m = -9223372036854775807L;
        this.f2487o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
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
        C0687k c0687k;
        C0704y c0704y;
        int i13;
        boolean z4;
        boolean z13;
        int i14;
        float f13;
        int i15;
        float f14;
        int i16;
        long j7;
        AbstractC35849g.m113808j(this.f2474b);
        int i17 = c38059n.f163018b;
        int i18 = c38059n.f163019c;
        byte[] bArr = c38059n.f163017a;
        this.f2481i += (long) c38059n.m121848a();
        boolean z14 = false;
        this.f2474b.mo36176d(c38059n, c38059n.m121848a(), 0);
        while (true) {
            int iM125276c = AbstractC39319n.m125276c(bArr, i17, i18, this.f2479g);
            c0687k = this.f2480h;
            c0704y = this.f2478f;
            if (iM125276c == i18) {
                break;
            }
            int i19 = iM125276c + 3;
            int i24 = c38059n.f163017a[i19] & 255;
            int i25 = iM125276c - i17;
            if (this.f2483k) {
                i13 = i18;
            } else {
                if (i25 > 0) {
                    c0687k.m1730a(bArr, i17, iM125276c);
                }
                ?? r14 = i25 < 0 ? -i25 : z14;
                if (c0687k.f2466a) {
                    ?? r15 = c0687k.f2467b - r14;
                    c0687k.f2467b = r15;
                    if (c0687k.f2468c == 0 && i24 == 181) {
                        c0687k.f2468c = r15;
                        i13 = i18;
                    } else {
                        c0687k.f2466a = z14;
                        String str = this.f2473a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(c0687k.f2469d, c0687k.f2467b);
                        int i26 = bArrCopyOf[4] & 255;
                        byte b = bArrCopyOf[5];
                        i13 = i18;
                        int i27 = ((b & 255) >> 4) | (i26 << 4);
                        int i28 = (bArrCopyOf[6] & 255) | ((b & 15) << 8);
                        int i29 = (bArrCopyOf[7] & 240) >> 4;
                        if (i29 == 2) {
                            f13 = i28 * 4;
                            i15 = i27 * 3;
                        } else if (i29 != 3) {
                            if (i29 != 4) {
                                f14 = 1.0f;
                            } else {
                                f13 = i28 * 121;
                                i15 = i27 * 100;
                            }
                            C34608o c34608o = new C34608o();
                            c34608o.f145729a = str;
                            c34608o.f145740l = AbstractC34587d0.m109382o(this.f2476d);
                            c34608o.f145741m = AbstractC34587d0.m109382o("video/mpeg2");
                            c34608o.f145748t = i27;
                            c34608o.f145749u = i28;
                            c34608o.f145752x = f14;
                            c34608o.f145744p = Collections.singletonList(bArrCopyOf);
                            C34610p c34610p = new C34610p(c34608o);
                            i16 = (bArrCopyOf[7] & 15) - 1;
                            if (i16 >= 0 || i16 >= 8) {
                                j7 = 0;
                            } else {
                                double d3 = f2472r[i16];
                                byte b6 = bArrCopyOf[c0687k.f2468c + 9];
                                int i34 = (b6 & 96) >> 5;
                                int i35 = b6 & 31;
                                if (i34 != i35) {
                                    d3 *= (((double) i34) + 1.0d) / ((double) (i35 + 1));
                                }
                                j7 = (long) (1000000.0d / d3);
                            }
                            Pair pairCreate = Pair.create(c34610p, Long.valueOf(j7));
                            this.f2474b.mo36173a((C34610p) pairCreate.first);
                            this.f2484l = ((Long) pairCreate.second).longValue();
                            this.f2483k = true;
                        } else {
                            f13 = i28 * 16;
                            i15 = i27 * 9;
                        }
                        f14 = f13 / i15;
                        C34608o c34608o2 = new C34608o();
                        c34608o2.f145729a = str;
                        c34608o2.f145740l = AbstractC34587d0.m109382o(this.f2476d);
                        c34608o2.f145741m = AbstractC34587d0.m109382o("video/mpeg2");
                        c34608o2.f145748t = i27;
                        c34608o2.f145749u = i28;
                        c34608o2.f145752x = f14;
                        c34608o2.f145744p = Collections.singletonList(bArrCopyOf);
                        C34610p c34610p2 = new C34610p(c34608o2);
                        i16 = (bArrCopyOf[7] & 15) - 1;
                        if (i16 >= 0) {
                            j7 = 0;
                        } else {
                            j7 = 0;
                        }
                        Pair pairCreate2 = Pair.create(c34610p2, Long.valueOf(j7));
                        this.f2474b.mo36173a((C34610p) pairCreate2.first);
                        this.f2484l = ((Long) pairCreate2.second).longValue();
                        this.f2483k = true;
                    }
                } else {
                    i13 = i18;
                    if (i24 == 179) {
                        c0687k.f2466a = true;
                    }
                }
                c0687k.m1730a(C0687k.f2465e, 0, 3);
            }
            if (c0704y == null) {
                z4 = true;
            } else {
                if (i25 > 0) {
                    c0704y.m1756a(bArr, i17, iM125276c);
                    i14 = 0;
                } else {
                    i14 = -i25;
                }
                if (c0704y.m1757b(i14)) {
                    int iM125287n = AbstractC39319n.m125287n(c0704y.f2667f, (byte[]) c0704y.f2666e);
                    int i36 = AbstractC38065t.f163031a;
                    byte[] bArr2 = (byte[]) c0704y.f2666e;
                    C38059n c38059n2 = this.f2477e;
                    c38059n2.m121844D(iM125287n, bArr2);
                    this.f2475c.m123177l(this.f2487o, c38059n2);
                }
                if (i24 == 178) {
                    z4 = true;
                    if (c38059n.f163017a[iM125276c + 2] == 1) {
                        c0704y.m1760e(i24);
                    }
                } else {
                    z4 = true;
                }
            }
            if (i24 == 0 || i24 == 179) {
                int i37 = i13 - iM125276c;
                if (this.f2489q && this.f2483k) {
                    long j13 = this.f2487o;
                    if (j13 != -9223372036854775807L) {
                        this.f2474b.mo36174b(j13, this.f2488p ? 1 : 0, ((int) (this.f2481i - this.f2486n)) - i37, i37, null);
                    }
                }
                if (!this.f2482j || this.f2489q) {
                    this.f2486n = this.f2481i - ((long) i37);
                    long j14 = this.f2485m;
                    if (j14 == -9223372036854775807L) {
                        long j15 = this.f2487o;
                        j14 = j15 != -9223372036854775807L ? j15 + this.f2484l : -9223372036854775807L;
                    }
                    this.f2487o = j14;
                    z14 = false;
                    this.f2488p = false;
                    this.f2485m = -9223372036854775807L;
                    z13 = true;
                    this.f2482j = true;
                } else {
                    z13 = true;
                    z14 = false;
                }
                this.f2489q = i24 == 0 ? z13 : z14;
            } else {
                if (i24 == 184) {
                    this.f2488p = z4;
                }
                z14 = false;
            }
            i17 = i19;
            i18 = i13;
        }
        if (!this.f2483k) {
            c0687k.m1730a(bArr, i17, i18);
        }
        if (c0704y != null) {
            c0704y.m1756a(bArr, i17, i18);
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        this.f2485m = j7;
    }

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
    /* JADX INFO: renamed from: e */
    public final void mo1666e(boolean z4) {
        AbstractC35849g.m113808j(this.f2474b);
        if (z4) {
            boolean z13 = this.f2488p;
            this.f2474b.mo36174b(this.f2487o, z13 ? 1 : 0, (int) (this.f2481i - this.f2486n), 0, null);
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public final void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2473a = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        this.f2474b = interfaceC33648q.mo3101o(c0690l0.f2494e, 2);
        C38445a c38445a = this.f2475c;
        if (c38445a != null) {
            c38445a.m123178m(interfaceC33648q, c0690l0);
        }
    }
}
