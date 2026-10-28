package p012ab;

import a33.C0352d;
import android.util.SparseArray;
import ed3.C13117a;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Arrays;
import jh3.AbstractC21702c;
import p151fn.C14625m;
import p151fn.InterfaceC14620h;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24557o;
import p309lo.C24558p;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p479s4.AbstractC32123d;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34592g;
import p516u8.C34608o;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import p607x8.AbstractC38047b;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p641y8.AbstractC39319n;
import p641y8.C39317l;
import p641y8.C39318m;
import re.C31271g;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C0697r implements InterfaceC0685j, InterfaceC14620h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2558a;

    /* JADX INFO: renamed from: b */
    public final boolean f2559b;

    /* JADX INFO: renamed from: c */
    public final boolean f2560c;

    /* JADX INFO: renamed from: d */
    public long f2561d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f2562e;

    /* JADX INFO: renamed from: f */
    public String f2563f;

    /* JADX INFO: renamed from: g */
    public boolean f2564g;

    /* JADX INFO: renamed from: h */
    public long f2565h;

    /* JADX INFO: renamed from: i */
    public boolean f2566i;

    /* JADX INFO: renamed from: j */
    public final Object f2567j;

    /* JADX INFO: renamed from: k */
    public final Object f2568k;

    /* JADX INFO: renamed from: l */
    public final Object f2569l;

    /* JADX INFO: renamed from: m */
    public final Object f2570m;

    /* JADX INFO: renamed from: n */
    public Object f2571n;

    /* JADX INFO: renamed from: o */
    public Object f2572o;

    /* JADX INFO: renamed from: p */
    public final Object f2573p;

    public C0697r(C20378c c20378c, boolean z4, boolean z13) {
        this.f2558a = 1;
        this.f2567j = c20378c;
        this.f2559b = z4;
        this.f2560c = z13;
        this.f2562e = new boolean[3];
        this.f2568k = new C0704y(7, 1);
        this.f2569l = new C0704y(8, 1);
        this.f2570m = new C0704y(6, 1);
        this.f2565h = -9223372036854775807L;
        this.f2573p = new C13117a();
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        switch (this.f2558a) {
            case 0:
                this.f2561d = 0L;
                this.f2566i = false;
                this.f2565h = -9223372036854775807L;
                AbstractC39319n.m125275b(this.f2562e);
                ((C0704y) this.f2568k).m1759d();
                ((C0704y) this.f2569l).m1759d();
                ((C0704y) this.f2570m).m1759d();
                ((C31271g) ((C0352d) this.f2567j).f1239z).m96290b(0);
                C0696q c0696q = (C0696q) this.f2572o;
                if (c0696q != null) {
                    c0696q.f2549k = false;
                    c0696q.f2553o = false;
                    C0695p c0695p = c0696q.f2552n;
                    c0695p.f2524b = false;
                    c0695p.f2523a = false;
                }
                break;
            default:
                this.f2561d = 0L;
                this.f2566i = false;
                this.f2565h = -9223372036854775807L;
                AbstractC24543a.m71576l(this.f2562e);
                ((C0704y) this.f2568k).m1759d();
                ((C0704y) this.f2569l).m1759d();
                ((C0704y) this.f2570m).m1759d();
                C14625m c14625m = (C14625m) this.f2572o;
                if (c14625m != null) {
                    c14625m.f53938k = false;
                    c14625m.f53942o = false;
                    C0695p c0695p2 = c14625m.f53941n;
                    c0695p2.f2524b = false;
                    c0695p2.f2523a = false;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0297  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x022e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0230  */
    /* JADX WARN: Code duplicated, block: B:80:0x0246  */
    /* JADX WARN: Code duplicated, block: B:83:0x024d  */
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
    /* JADX INFO: renamed from: b */
    public void m1749b(int i13, int i14, long j7, long j13) {
        long j14;
        int i15;
        long j15;
        long j16;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z16;
        C38059n c38059n = (C38059n) this.f2573p;
        C0704y c0704y = (C0704y) this.f2570m;
        C31271g c31271g = (C31271g) ((C0352d) this.f2567j).f1239z;
        C0704y c0704y2 = (C0704y) this.f2569l;
        C0704y c0704y3 = (C0704y) this.f2568k;
        if (!this.f2564g || ((C0696q) this.f2572o).f2541c) {
            c0704y3.m1757b(i14);
            c0704y2.m1757b(i14);
            if (this.f2564g) {
                if (c0704y3.f2665d) {
                    C39318m c39318mM125284k = AbstractC39319n.m125284k((byte[]) c0704y3.f2666e, 3, c0704y3.f2667f);
                    int i24 = c39318mM125284k.f169166s;
                    c31271g.getClass();
                    AbstractC35849g.m113807i(i24 >= 0);
                    c31271g.f128784a = i24;
                    c31271g.m96290b(i24);
                    ((C0696q) this.f2572o).f2542d.append(c39318mM125284k.f169151d, c39318mM125284k);
                    c0704y3.m1759d();
                } else if (c0704y2.f2665d) {
                    C24561s c24561s = new C24561s(4, c0704y2.f2667f, 6, (byte[]) c0704y2.f2666e);
                    int iM71636m = c24561s.m71636m();
                    int iM71636m2 = c24561s.m71636m();
                    c24561s.m71642s();
                    ((C0696q) this.f2572o).f2543e.append(iM71636m, new C39317l(iM71636m, iM71636m2, c24561s.m71631h()));
                    c0704y2.m1759d();
                }
            } else if (c0704y3.f2665d && c0704y2.f2665d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) c0704y3.f2666e, c0704y3.f2667f));
                arrayList.add(Arrays.copyOf((byte[]) c0704y2.f2666e, c0704y2.f2667f));
                C39318m c39318mM125284k2 = AbstractC39319n.m125284k((byte[]) c0704y3.f2666e, 3, c0704y3.f2667f);
                int i25 = c39318mM125284k2.f169166s;
                C24561s c24561s2 = new C24561s(4, c0704y2.f2667f, 6, (byte[]) c0704y2.f2666e);
                int iM71636m3 = c24561s2.m71636m();
                int iM71636m4 = c24561s2.m71636m();
                c24561s2.m71642s();
                C39317l c39317l = new C39317l(iM71636m3, iM71636m4, c24561s2.m71631h());
                int i26 = c39318mM125284k2.f169148a;
                int i27 = c39318mM125284k2.f169149b;
                int i28 = c39318mM125284k2.f169150c;
                byte[] bArr = AbstractC38047b.f162977a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i26), Integer.valueOf(i27), Integer.valueOf(i28));
                InterfaceC33639k0 interfaceC33639k0 = (InterfaceC33639k0) this.f2571n;
                C34608o c34608o = new C34608o();
                c34608o.f145729a = this.f2563f;
                c34608o.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                c34608o.f145741m = AbstractC34587d0.m109382o("video/avc");
                c34608o.f145738j = str;
                c34608o.f145748t = c39318mM125284k2.f169152e;
                c34608o.f145749u = c39318mM125284k2.f169153f;
                c34608o.f145717A = new C34592g(c39318mM125284k2.f169163p, c39318mM125284k2.f169164q, c39318mM125284k2.f169165r, c39318mM125284k2.f169155h + 8, c39318mM125284k2.f169156i + 8, null);
                c34608o.f145752x = c39318mM125284k2.f169154g;
                c34608o.f145744p = arrayList;
                c34608o.f145743o = i25;
                AbstractC21702c.m61152w(c34608o, interfaceC33639k0);
                this.f2564g = true;
                c31271g.getClass();
                AbstractC35849g.m113807i(i25 >= 0);
                c31271g.f128784a = i25;
                c31271g.m96290b(i25);
                ((C0696q) this.f2572o).f2542d.append(c39318mM125284k2.f169151d, c39318mM125284k2);
                ((C0696q) this.f2572o).f2543e.append(iM71636m3, c39317l);
                c0704y3.m1759d();
                c0704y2.m1759d();
            }
        }
        if (c0704y.m1757b(i14)) {
            c38059n.m121844D(AbstractC39319n.m125287n(c0704y.f2667f, (byte[]) c0704y.f2666e), (byte[]) c0704y.f2666e);
            c38059n.m121846F(4);
            c31271g.m96289a(j13, c38059n);
        }
        C0696q c0696q = (C0696q) this.f2572o;
        boolean z17 = this.f2564g;
        if (c0696q.f2547i == 9) {
            if (z17 && c0696q.f2553o) {
                j14 = c0696q.f2548j;
                i15 = i13 + ((int) (j7 - j14));
                j15 = c0696q.f2555q;
                if (j15 != -9223372036854775807L) {
                    j16 = c0696q.f2554p;
                    if (j14 != j16) {
                        c0696q.f2539a.mo36174b(j15, c0696q.f2556r ? 1 : 0, (int) (j14 - j16), i15, null);
                    }
                }
            }
            c0696q.f2554p = c0696q.f2548j;
            c0696q.f2555q = c0696q.f2550l;
            c0696q.f2556r = false;
            c0696q.f2553o = true;
        } else if (c0696q.f2541c) {
            C0695p c0695p = c0696q.f2552n;
            C0695p c0695p2 = c0696q.f2551m;
            if (c0695p.f2523a) {
                if (c0695p2.f2523a) {
                    C39318m c39318m = (C39318m) c0695p.f2538p;
                    AbstractC35849g.m113808j(c39318m);
                    C39318m c39318m2 = (C39318m) c0695p2.f2538p;
                    AbstractC35849g.m113808j(c39318m2);
                    int i29 = c39318m2.f169160m;
                    if (c0695p.f2527e != c0695p2.f2527e || c0695p.f2528f != c0695p2.f2528f || c0695p.f2529g != c0695p2.f2529g || ((c0695p.f2530h && c0695p2.f2530h && c0695p.f2531i != c0695p2.f2531i) || (((i17 = c0695p.f2525c) != (i18 = c0695p2.f2525c) && (i17 == 0 || i18 == 0)) || (((i19 = c39318m.f169160m) == 0 && i29 == 0 && (c0695p.f2534l != c0695p2.f2534l || c0695p.f2535m != c0695p2.f2535m)) || ((i19 == 1 && i29 == 1 && (c0695p.f2536n != c0695p2.f2536n || c0695p.f2537o != c0695p2.f2537o)) || (z16 = c0695p.f2532j) != c0695p2.f2532j || (z16 && c0695p.f2533k != c0695p2.f2533k)))))) {
                        if (z17) {
                            j14 = c0696q.f2548j;
                            i15 = i13 + ((int) (j7 - j14));
                            j15 = c0696q.f2555q;
                            if (j15 != -9223372036854775807L) {
                                j16 = c0696q.f2554p;
                                if (j14 != j16) {
                                    c0696q.f2539a.mo36174b(j15, c0696q.f2556r ? 1 : 0, (int) (j14 - j16), i15, null);
                                }
                            }
                        }
                        c0696q.f2554p = c0696q.f2548j;
                        c0696q.f2555q = c0696q.f2550l;
                        c0696q.f2556r = false;
                        c0696q.f2553o = true;
                    }
                } else {
                    if (z17) {
                        j14 = c0696q.f2548j;
                        i15 = i13 + ((int) (j7 - j14));
                        j15 = c0696q.f2555q;
                        if (j15 != -9223372036854775807L) {
                            j16 = c0696q.f2554p;
                            if (j14 != j16) {
                                c0696q.f2539a.mo36174b(j15, c0696q.f2556r ? 1 : 0, (int) (j14 - j16), i15, null);
                            }
                        }
                    }
                    c0696q.f2554p = c0696q.f2548j;
                    c0696q.f2555q = c0696q.f2550l;
                    c0696q.f2556r = false;
                    c0696q.f2553o = true;
                }
            }
        }
        if (c0696q.f2540b) {
            C0695p c0695p3 = c0696q.f2552n;
            z4 = c0695p3.f2524b && ((i16 = c0695p3.f2526d) == 7 || i16 == 2);
        } else {
            z4 = c0696q.f2557s;
        }
        boolean z18 = c0696q.f2556r;
        int i34 = c0696q.f2547i;
        if (i34 != 5) {
            if (z4) {
                z13 = true;
                if (i34 == 1) {
                }
                z15 = z18 | z14;
                c0696q.f2556r = z15;
                c0696q.f2547i = 24;
                if (z15) {
                    this.f2566i = false;
                }
            }
            z14 = false;
            z15 = z18 | z14;
            c0696q.f2556r = z15;
            c0696q.f2547i = 24;
            if (z15) {
                this.f2566i = false;
            }
        }
        z13 = true;
        z14 = z13;
        z15 = z18 | z14;
        c0696q.f2556r = z15;
        c0696q.f2547i = 24;
        if (z15) {
            this.f2566i = false;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public void mo1664c(C38059n c38059n) {
        int i13;
        AbstractC35849g.m113808j((InterfaceC33639k0) this.f2571n);
        int i14 = AbstractC38065t.f163031a;
        int i15 = c38059n.f163018b;
        int i16 = c38059n.f163019c;
        byte[] bArr = c38059n.f163017a;
        this.f2561d += (long) c38059n.m121848a();
        ((InterfaceC33639k0) this.f2571n).mo36176d(c38059n, c38059n.m121848a(), 0);
        while (true) {
            int iM125276c = AbstractC39319n.m125276c(bArr, i15, i16, this.f2562e);
            if (iM125276c == i16) {
                m1750j(bArr, i15, i16);
                return;
            }
            int i17 = bArr[iM125276c + 3] & 31;
            if (iM125276c <= 0 || bArr[iM125276c - 1] != 0) {
                i13 = 3;
            } else {
                iM125276c--;
                i13 = 4;
            }
            int i18 = iM125276c;
            int i19 = i13;
            int i24 = i18 - i15;
            if (i24 > 0) {
                m1750j(bArr, i15, i18);
            }
            int i25 = i16 - i18;
            long j7 = this.f2561d - ((long) i25);
            m1749b(i25, i24 < 0 ? -i24 : 0, j7, this.f2565h);
            m1751k(i17, j7, this.f2565h);
            i15 = i18 + i19;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        switch (this.f2558a) {
            case 0:
                this.f2565h = j7;
                this.f2566i = ((i13 & 2) != 0) | this.f2566i;
                break;
            default:
                if (j7 != -9223372036854775807L) {
                    this.f2565h = j7;
                }
                this.f2566i = ((i13 & 2) != 0) | this.f2566i;
                break;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: e */
    public void mo1666e(boolean z4) {
        AbstractC35849g.m113808j((InterfaceC33639k0) this.f2571n);
        int i13 = AbstractC38065t.f163031a;
        if (z4) {
            ((C31271g) ((C0352d) this.f2567j).f1239z).m96290b(0);
            m1749b(0, 0, this.f2561d, this.f2565h);
            m1751k(9, this.f2561d, this.f2565h);
            m1749b(0, 0, this.f2561d, this.f2565h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:90:0x027b  */
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
    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: f */
    public void mo1711f(C13117a c13117a) {
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        long j7;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z4;
        C0704y c0704y = (C0704y) this.f2568k;
        C0704y c0704y2 = (C0704y) this.f2569l;
        C0704y c0704y3 = (C0704y) this.f2570m;
        AbstractC24543a.m71574j((InterfaceC37377s) this.f2571n);
        int i25 = AbstractC24567y.f95875a;
        int i26 = c13117a.f45382b;
        int i27 = c13117a.f45383c;
        byte[] bArr2 = c13117a.f45381a;
        this.f2561d += (long) c13117a.m36692a();
        ((InterfaceC37377s) this.f2571n).mo102732c(c13117a.m36692a(), c13117a);
        while (true) {
            int iM71580p = AbstractC24543a.m71580p(bArr2, i26, i27, this.f2562e);
            if (iM71580p == i27) {
                m1750j(bArr2, i26, i27);
                return;
            }
            int i28 = iM71580p + 3;
            int i29 = bArr2[i28] & 31;
            int i34 = iM71580p - i26;
            if (i34 > 0) {
                m1750j(bArr2, i26, iM71580p);
            }
            int i35 = i27 - iM71580p;
            long j13 = this.f2561d - ((long) i35);
            int i36 = i34 < 0 ? -i34 : 0;
            long j14 = this.f2565h;
            C13117a c13117a2 = (C13117a) this.f2573p;
            if (!this.f2564g || ((C14625m) this.f2572o).f53930c) {
                c0704y.m1757b(i36);
                c0704y2.m1757b(i36);
                if (this.f2564g) {
                    i13 = i27;
                    bArr = bArr2;
                    i14 = i28;
                    i15 = i29;
                    j7 = j13;
                    if (c0704y.f2665d) {
                        C24558p c24558pM71590z = AbstractC24543a.m71590z((byte[]) c0704y.f2666e, 3, c0704y.f2667f);
                        ((C14625m) this.f2572o).f53931d.append(c24558pM71590z.f95841d, c24558pM71590z);
                        c0704y.m1759d();
                    } else if (c0704y2.f2665d) {
                        C24561s c24561s = new C24561s(4, c0704y2.f2667f, 1, (byte[]) c0704y2.f2666e);
                        int iM71636m = c24561s.m71636m();
                        int iM71636m2 = c24561s.m71636m();
                        c24561s.m71642s();
                        ((C14625m) this.f2572o).f53932e.append(iM71636m, new C24557o(iM71636m, iM71636m2, c24561s.m71631h()));
                        c0704y2.m1759d();
                    }
                } else if (c0704y.f2665d && c0704y2.f2665d) {
                    ArrayList arrayList = new ArrayList();
                    i13 = i27;
                    arrayList.add(Arrays.copyOf((byte[]) c0704y.f2666e, c0704y.f2667f));
                    arrayList.add(Arrays.copyOf((byte[]) c0704y2.f2666e, c0704y2.f2667f));
                    bArr = bArr2;
                    C24558p c24558pM71590z2 = AbstractC24543a.m71590z((byte[]) c0704y.f2666e, 3, c0704y.f2667f);
                    i14 = i28;
                    j7 = j13;
                    C24561s c24561s2 = new C24561s(4, c0704y2.f2667f, 1, (byte[]) c0704y2.f2666e);
                    int iM71636m3 = c24561s2.m71636m();
                    int iM71636m4 = c24561s2.m71636m();
                    c24561s2.m71642s();
                    C24557o c24557o = new C24557o(iM71636m3, iM71636m4, c24561s2.m71631h());
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c24558pM71590z2.f95838a), Integer.valueOf(c24558pM71590z2.f95839b), Integer.valueOf(c24558pM71590z2.f95840c));
                    InterfaceC37377s interfaceC37377s = (InterfaceC37377s) this.f2571n;
                    C31518b0 c31518b0 = new C31518b0();
                    i15 = i29;
                    c31518b0.f130037a = this.f2563f;
                    c31518b0.f130047k = "video/avc";
                    c31518b0.f130044h = str;
                    c31518b0.f130052p = c24558pM71590z2.f95842e;
                    c31518b0.f130053q = c24558pM71590z2.f95843f;
                    c31518b0.f130056t = c24558pM71590z2.f95844g;
                    c31518b0.f130049m = arrayList;
                    interfaceC37377s.mo102730a(new C31521c0(c31518b0));
                    this.f2564g = true;
                    ((C14625m) this.f2572o).f53931d.append(c24558pM71590z2.f95841d, c24558pM71590z2);
                    ((C14625m) this.f2572o).f53932e.append(iM71636m3, c24557o);
                    c0704y.m1759d();
                    c0704y2.m1759d();
                } else {
                    i13 = i27;
                    bArr = bArr2;
                    i14 = i28;
                    i15 = i29;
                    j7 = j13;
                }
            } else {
                i13 = i27;
                bArr = bArr2;
                i14 = i28;
                i15 = i29;
                j7 = j13;
            }
            if (c0704y3.m1757b(i36)) {
                c13117a2.m36687I(AbstractC24543a.m71563E(c0704y3.f2667f, (byte[]) c0704y3.f2666e), (byte[]) c0704y3.f2666e);
                c13117a2.m36689K(4);
                AbstractC32123d.m100022b(j14, c13117a2, (InterfaceC37377s[]) ((C20378c) this.f2567j).f76423y);
            }
            C14625m c14625m = (C14625m) this.f2572o;
            boolean z13 = this.f2564g;
            boolean z14 = this.f2566i;
            if (c14625m.f53936i == 9) {
                if (!z13 && c14625m.f53942o) {
                    long j15 = c14625m.f53937j;
                    int i37 = i35 + ((int) (j7 - j15));
                    long j16 = c14625m.f53944q;
                    if (j16 != -9223372036854775807L) {
                        c14625m.f53928a.mo102733d(j16, c14625m.f53945r ? 1 : 0, (int) (j15 - c14625m.f53943p), i37, null);
                    }
                }
                c14625m.f53943p = c14625m.f53937j;
                c14625m.f53944q = c14625m.f53939l;
                c14625m.f53945r = false;
                c14625m.f53942o = true;
            } else {
                if (c14625m.f53930c) {
                    C0695p c0695p = c14625m.f53941n;
                    C0695p c0695p2 = c14625m.f53940m;
                    if (c0695p.f2523a) {
                        if (c0695p2.f2523a) {
                            C24558p c24558p = (C24558p) c0695p.f2538p;
                            AbstractC24543a.m71574j(c24558p);
                            C24558p c24558p2 = (C24558p) c0695p2.f2538p;
                            AbstractC24543a.m71574j(c24558p2);
                            int i38 = c24558p2.f95848k;
                            if (c0695p.f2527e != c0695p2.f2527e || c0695p.f2528f != c0695p2.f2528f || c0695p.f2529g != c0695p2.f2529g || ((c0695p.f2530h && c0695p2.f2530h && c0695p.f2531i != c0695p2.f2531i) || (((i18 = c0695p.f2525c) != (i19 = c0695p2.f2525c) && (i18 == 0 || i19 == 0)) || (((i24 = c24558p.f95848k) == 0 && i38 == 0 && (c0695p.f2534l != c0695p2.f2534l || c0695p.f2535m != c0695p2.f2535m)) || ((i24 == 1 && i38 == 1 && (c0695p.f2536n != c0695p2.f2536n || c0695p.f2537o != c0695p2.f2537o)) || (z4 = c0695p.f2532j) != c0695p2.f2532j || (z4 && c0695p.f2533k != c0695p2.f2533k)))))) {
                            }
                        }
                        if (!z13) {
                        }
                        c14625m.f53943p = c14625m.f53937j;
                        c14625m.f53944q = c14625m.f53939l;
                        c14625m.f53945r = false;
                        c14625m.f53942o = true;
                    }
                }
                z14 = z14;
            }
            if (c14625m.f53929b) {
                C0695p c0695p3 = c14625m.f53941n;
                z14 = c0695p3.f2524b && ((i17 = c0695p3.f2526d) == 7 || i17 == 2);
            }
            boolean z15 = c14625m.f53945r;
            int i39 = c14625m.f53936i;
            boolean z16 = z15 | (i39 == 5 || (z14 && i39 == 1));
            c14625m.f53945r = z16;
            if (z16) {
                this.f2566i = false;
            }
            long j17 = this.f2565h;
            if (!this.f2564g || ((C14625m) this.f2572o).f53930c) {
                i16 = i15;
                c0704y.m1760e(i16);
                c0704y2.m1760e(i16);
            } else {
                i16 = i15;
            }
            c0704y3.m1760e(i16);
            C14625m c14625m2 = (C14625m) this.f2572o;
            c14625m2.f53936i = i16;
            c14625m2.f53939l = j17;
            c14625m2.f53937j = j7;
            if ((c14625m2.f53929b && i16 == 1) || (c14625m2.f53930c && (i16 == 5 || i16 == 1 || i16 == 2))) {
                C0695p c0695p4 = c14625m2.f53940m;
                c14625m2.f53940m = c14625m2.f53941n;
                c14625m2.f53941n = c0695p4;
                c0695p4.f2524b = false;
                c0695p4.f2523a = false;
                c14625m2.f53935h = 0;
                c14625m2.f53938k = true;
            }
            i27 = i13;
            bArr2 = bArr;
            i26 = i14;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: g */
    public void mo1712g(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2563f = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(c0690l0.f2494e, 2);
        this.f2571n = interfaceC37377sMo3102o;
        this.f2572o = new C14625m(interfaceC37377sMo3102o, this.f2559b, this.f2560c);
        ((C20378c) this.f2567j).m56586o(interfaceC37369k, c0690l0);
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: h */
    public void mo1713h() {
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2563f = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(c0690l0.f2494e, 2);
        this.f2571n = interfaceC33639k0Mo3101o;
        this.f2572o = new C0696q(interfaceC33639k0Mo3101o, this.f2559b, this.f2560c);
        ((C0352d) this.f2567j).m936h(interfaceC33648q, c0690l0);
    }

    /* JADX WARN: Code duplicated, block: B:154:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:157:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:176:0x02da  */
    /* JADX WARN: Code duplicated, block: B:177:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0132  */
    /* JADX WARN: Code duplicated, block: B:80:0x0148  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX INFO: renamed from: j */
    public final void m1750j(byte[] bArr, int i13, int i14) {
        boolean zM71631h;
        boolean zM71631h2;
        boolean z4;
        boolean z13;
        int iM71636m;
        int i15;
        int iM71637n;
        int iM71637n2;
        int iM71632i;
        int iM71637n3;
        boolean zM71631h3;
        boolean zM71631h4;
        boolean z14;
        boolean z15;
        int iM71636m2;
        int i16;
        int iM71637n4;
        int iM71637n5;
        int iM71632i2;
        int iM71637n6;
        switch (this.f2558a) {
            case 0:
                if (!this.f2564g || ((C0696q) this.f2572o).f2541c) {
                    ((C0704y) this.f2568k).m1756a(bArr, i13, i14);
                    ((C0704y) this.f2569l).m1756a(bArr, i13, i14);
                }
                ((C0704y) this.f2570m).m1756a(bArr, i13, i14);
                C0696q c0696q = (C0696q) this.f2572o;
                SparseArray sparseArray = c0696q.f2543e;
                C24561s c24561s = c0696q.f2544f;
                if (c0696q.f2549k) {
                    int i17 = i14 - i13;
                    byte[] bArr2 = c0696q.f2545g;
                    int length = bArr2.length;
                    int i18 = c0696q.f2546h + i17;
                    if (length < i18) {
                        c0696q.f2545g = Arrays.copyOf(bArr2, i18 * 2);
                    }
                    System.arraycopy(bArr, i13, c0696q.f2545g, c0696q.f2546h, i17);
                    int i19 = c0696q.f2546h + i17;
                    c0696q.f2546h = i19;
                    c24561s.f95858b = c0696q.f2545g;
                    c24561s.f95860d = 0;
                    c24561s.f95859c = i19;
                    c24561s.f95861e = 0;
                    c24561s.m71624a();
                    if (c24561s.m71627d(8)) {
                        c24561s.m71642s();
                        int iM71632i3 = c24561s.m71632i(2);
                        c24561s.m71643t(5);
                        if (c24561s.m71628e()) {
                            c24561s.m71636m();
                            if (c24561s.m71628e()) {
                                int iM71636m3 = c24561s.m71636m();
                                if (!c0696q.f2541c) {
                                    c0696q.f2549k = false;
                                    C0695p c0695p = c0696q.f2552n;
                                    c0695p.f2526d = iM71636m3;
                                    c0695p.f2524b = true;
                                    break;
                                } else if (c24561s.m71628e()) {
                                    int iM71636m4 = c24561s.m71636m();
                                    if (sparseArray.indexOfKey(iM71636m4) >= 0) {
                                        C39317l c39317l = (C39317l) sparseArray.get(iM71636m4);
                                        SparseArray sparseArray2 = c0696q.f2542d;
                                        int i24 = c39317l.f169146a;
                                        boolean z16 = c39317l.f169147b;
                                        C39318m c39318m = (C39318m) sparseArray2.get(i24);
                                        boolean z17 = c39318m.f169157j;
                                        int i25 = c39318m.f169161n;
                                        int i26 = c39318m.f169159l;
                                        if (z17) {
                                            if (c24561s.m71627d(2)) {
                                                c24561s.m71643t(2);
                                            }
                                        }
                                        if (c24561s.m71627d(i26)) {
                                            int iM71632i4 = c24561s.m71632i(i26);
                                            if (!c39318m.f169158k) {
                                                if (c24561s.m71627d(1)) {
                                                    zM71631h = c24561s.m71631h();
                                                    if (!zM71631h) {
                                                        zM71631h2 = false;
                                                    } else if (c24561s.m71627d(1)) {
                                                        zM71631h2 = c24561s.m71631h();
                                                        z4 = true;
                                                    }
                                                    if (c0696q.f2547i == 5) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (z13) {
                                                        iM71636m = 0;
                                                    } else if (!c24561s.m71628e()) {
                                                        iM71636m = c24561s.m71636m();
                                                    }
                                                    i15 = c39318m.f169160m;
                                                    if (i15 == 0) {
                                                        if (i15 == 1 || c39318m.f169162o) {
                                                            iM71637n = 0;
                                                            iM71637n2 = 0;
                                                            iM71632i = 0;
                                                        } else if (c24561s.m71628e()) {
                                                            iM71637n3 = c24561s.m71637n();
                                                            if (!z16 || zM71631h) {
                                                                iM71637n = 0;
                                                                iM71637n2 = 0;
                                                            } else if (c24561s.m71628e()) {
                                                                iM71637n2 = c24561s.m71637n();
                                                                iM71637n = 0;
                                                            }
                                                            iM71632i = 0;
                                                        }
                                                        C0695p c0695p2 = c0696q.f2552n;
                                                        c0695p2.f2538p = c39318m;
                                                        c0695p2.f2525c = iM71632i3;
                                                        c0695p2.f2526d = iM71636m3;
                                                        c0695p2.f2527e = iM71632i4;
                                                        c0695p2.f2528f = iM71636m4;
                                                        c0695p2.f2529g = zM71631h;
                                                        c0695p2.f2530h = z4;
                                                        c0695p2.f2531i = zM71631h2;
                                                        c0695p2.f2532j = z13;
                                                        c0695p2.f2533k = iM71636m;
                                                        c0695p2.f2534l = iM71632i;
                                                        c0695p2.f2535m = iM71637n;
                                                        c0695p2.f2536n = iM71637n3;
                                                        c0695p2.f2537o = iM71637n2;
                                                        c0695p2.f2523a = true;
                                                        c0695p2.f2524b = true;
                                                        c0696q.f2549k = false;
                                                        break;
                                                    } else if (!c24561s.m71627d(i25)) {
                                                        iM71632i = c24561s.m71632i(i25);
                                                        if (z16 || zM71631h) {
                                                            iM71637n = 0;
                                                        } else if (c24561s.m71628e()) {
                                                            iM71637n = c24561s.m71637n();
                                                        }
                                                        iM71637n2 = 0;
                                                    }
                                                    iM71637n3 = 0;
                                                    C0695p c0695p3 = c0696q.f2552n;
                                                    c0695p3.f2538p = c39318m;
                                                    c0695p3.f2525c = iM71632i3;
                                                    c0695p3.f2526d = iM71636m3;
                                                    c0695p3.f2527e = iM71632i4;
                                                    c0695p3.f2528f = iM71636m4;
                                                    c0695p3.f2529g = zM71631h;
                                                    c0695p3.f2530h = z4;
                                                    c0695p3.f2531i = zM71631h2;
                                                    c0695p3.f2532j = z13;
                                                    c0695p3.f2533k = iM71636m;
                                                    c0695p3.f2534l = iM71632i;
                                                    c0695p3.f2535m = iM71637n;
                                                    c0695p3.f2536n = iM71637n3;
                                                    c0695p3.f2537o = iM71637n2;
                                                    c0695p3.f2523a = true;
                                                    c0695p3.f2524b = true;
                                                    c0696q.f2549k = false;
                                                    break;
                                                }
                                            } else {
                                                zM71631h = false;
                                                zM71631h2 = false;
                                            }
                                            z4 = zM71631h2;
                                            if (c0696q.f2547i == 5) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                iM71636m = 0;
                                            } else if (!c24561s.m71628e()) {
                                                iM71636m = c24561s.m71636m();
                                            }
                                            i15 = c39318m.f169160m;
                                            if (i15 == 0) {
                                                if (i15 == 1) {
                                                }
                                                iM71637n = 0;
                                                iM71637n2 = 0;
                                                iM71632i = 0;
                                            } else if (!c24561s.m71627d(i25)) {
                                                iM71632i = c24561s.m71632i(i25);
                                                if (z16) {
                                                    iM71637n = 0;
                                                } else {
                                                    iM71637n = 0;
                                                }
                                                iM71637n2 = 0;
                                            }
                                            iM71637n3 = 0;
                                            C0695p c0695p4 = c0696q.f2552n;
                                            c0695p4.f2538p = c39318m;
                                            c0695p4.f2525c = iM71632i3;
                                            c0695p4.f2526d = iM71636m3;
                                            c0695p4.f2527e = iM71632i4;
                                            c0695p4.f2528f = iM71636m4;
                                            c0695p4.f2529g = zM71631h;
                                            c0695p4.f2530h = z4;
                                            c0695p4.f2531i = zM71631h2;
                                            c0695p4.f2532j = z13;
                                            c0695p4.f2533k = iM71636m;
                                            c0695p4.f2534l = iM71632i;
                                            c0695p4.f2535m = iM71637n;
                                            c0695p4.f2536n = iM71637n3;
                                            c0695p4.f2537o = iM71637n2;
                                            c0695p4.f2523a = true;
                                            c0695p4.f2524b = true;
                                            c0696q.f2549k = false;
                                            break;
                                        }
                                    } else {
                                        c0696q.f2549k = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default:
                if (!this.f2564g || ((C14625m) this.f2572o).f53930c) {
                    ((C0704y) this.f2568k).m1756a(bArr, i13, i14);
                    ((C0704y) this.f2569l).m1756a(bArr, i13, i14);
                }
                ((C0704y) this.f2570m).m1756a(bArr, i13, i14);
                C14625m c14625m = (C14625m) this.f2572o;
                SparseArray sparseArray3 = c14625m.f53932e;
                C24561s c24561s2 = c14625m.f53933f;
                if (c14625m.f53938k) {
                    int i27 = i14 - i13;
                    byte[] bArr3 = c14625m.f53934g;
                    int length2 = bArr3.length;
                    int i28 = c14625m.f53935h + i27;
                    if (length2 < i28) {
                        c14625m.f53934g = Arrays.copyOf(bArr3, i28 * 2);
                    }
                    System.arraycopy(bArr, i13, c14625m.f53934g, c14625m.f53935h, i27);
                    int i29 = c14625m.f53935h + i27;
                    c14625m.f53935h = i29;
                    c24561s2.f95858b = c14625m.f53934g;
                    c24561s2.f95860d = 0;
                    c24561s2.f95859c = i29;
                    c24561s2.f95861e = 0;
                    c24561s2.m71624a();
                    if (c24561s2.m71627d(8)) {
                        c24561s2.m71642s();
                        int iM71632i5 = c24561s2.m71632i(2);
                        c24561s2.m71643t(5);
                        if (c24561s2.m71628e()) {
                            c24561s2.m71636m();
                            if (c24561s2.m71628e()) {
                                int iM71636m5 = c24561s2.m71636m();
                                if (!c14625m.f53930c) {
                                    c14625m.f53938k = false;
                                    C0695p c0695p5 = c14625m.f53941n;
                                    c0695p5.f2526d = iM71636m5;
                                    c0695p5.f2524b = true;
                                    break;
                                } else if (c24561s2.m71628e()) {
                                    int iM71636m6 = c24561s2.m71636m();
                                    if (sparseArray3.indexOfKey(iM71636m6) >= 0) {
                                        C24557o c24557o = (C24557o) sparseArray3.get(iM71636m6);
                                        SparseArray sparseArray4 = c14625m.f53931d;
                                        int i34 = c24557o.f95836a;
                                        boolean z18 = c24557o.f95837b;
                                        C24558p c24558p = (C24558p) sparseArray4.get(i34);
                                        boolean z19 = c24558p.f95845h;
                                        int i35 = c24558p.f95849l;
                                        int i36 = c24558p.f95847j;
                                        if (z19) {
                                            if (c24561s2.m71627d(2)) {
                                                c24561s2.m71643t(2);
                                            }
                                        }
                                        if (c24561s2.m71627d(i36)) {
                                            int iM71632i6 = c24561s2.m71632i(i36);
                                            if (!c24558p.f95846i) {
                                                if (c24561s2.m71627d(1)) {
                                                    zM71631h3 = c24561s2.m71631h();
                                                    if (!zM71631h3) {
                                                        zM71631h4 = false;
                                                    } else if (c24561s2.m71627d(1)) {
                                                        zM71631h4 = c24561s2.m71631h();
                                                        z14 = true;
                                                    }
                                                    if (c14625m.f53936i == 5) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if (z15) {
                                                        iM71636m2 = 0;
                                                    } else if (!c24561s2.m71628e()) {
                                                        iM71636m2 = c24561s2.m71636m();
                                                    }
                                                    i16 = c24558p.f95848k;
                                                    if (i16 == 0) {
                                                        if (i16 == 1 || c24558p.f95850m) {
                                                            iM71637n4 = 0;
                                                            iM71637n5 = 0;
                                                            iM71632i2 = 0;
                                                        } else if (c24561s2.m71628e()) {
                                                            iM71637n6 = c24561s2.m71637n();
                                                            if (!z18 || zM71631h3) {
                                                                iM71637n4 = 0;
                                                                iM71637n5 = 0;
                                                            } else if (c24561s2.m71628e()) {
                                                                iM71637n5 = c24561s2.m71637n();
                                                                iM71637n4 = 0;
                                                            }
                                                            iM71632i2 = 0;
                                                        }
                                                        C0695p c0695p6 = c14625m.f53941n;
                                                        c0695p6.f2538p = c24558p;
                                                        c0695p6.f2525c = iM71632i5;
                                                        c0695p6.f2526d = iM71636m5;
                                                        c0695p6.f2527e = iM71632i6;
                                                        c0695p6.f2528f = iM71636m6;
                                                        c0695p6.f2529g = zM71631h3;
                                                        c0695p6.f2530h = z14;
                                                        c0695p6.f2531i = zM71631h4;
                                                        c0695p6.f2532j = z15;
                                                        c0695p6.f2533k = iM71636m2;
                                                        c0695p6.f2534l = iM71632i2;
                                                        c0695p6.f2535m = iM71637n4;
                                                        c0695p6.f2536n = iM71637n6;
                                                        c0695p6.f2537o = iM71637n5;
                                                        c0695p6.f2523a = true;
                                                        c0695p6.f2524b = true;
                                                        c14625m.f53938k = false;
                                                        break;
                                                    } else if (!c24561s2.m71627d(i35)) {
                                                        iM71632i2 = c24561s2.m71632i(i35);
                                                        if (z18 || zM71631h3) {
                                                            iM71637n4 = 0;
                                                        } else if (c24561s2.m71628e()) {
                                                            iM71637n4 = c24561s2.m71637n();
                                                        }
                                                        iM71637n5 = 0;
                                                    }
                                                    iM71637n6 = 0;
                                                    C0695p c0695p7 = c14625m.f53941n;
                                                    c0695p7.f2538p = c24558p;
                                                    c0695p7.f2525c = iM71632i5;
                                                    c0695p7.f2526d = iM71636m5;
                                                    c0695p7.f2527e = iM71632i6;
                                                    c0695p7.f2528f = iM71636m6;
                                                    c0695p7.f2529g = zM71631h3;
                                                    c0695p7.f2530h = z14;
                                                    c0695p7.f2531i = zM71631h4;
                                                    c0695p7.f2532j = z15;
                                                    c0695p7.f2533k = iM71636m2;
                                                    c0695p7.f2534l = iM71632i2;
                                                    c0695p7.f2535m = iM71637n4;
                                                    c0695p7.f2536n = iM71637n6;
                                                    c0695p7.f2537o = iM71637n5;
                                                    c0695p7.f2523a = true;
                                                    c0695p7.f2524b = true;
                                                    c14625m.f53938k = false;
                                                    break;
                                                }
                                            } else {
                                                zM71631h3 = false;
                                                zM71631h4 = false;
                                            }
                                            z14 = zM71631h4;
                                            if (c14625m.f53936i == 5) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (z15) {
                                                iM71636m2 = 0;
                                            } else if (!c24561s2.m71628e()) {
                                                iM71636m2 = c24561s2.m71636m();
                                            }
                                            i16 = c24558p.f95848k;
                                            if (i16 == 0) {
                                                if (i16 == 1) {
                                                }
                                                iM71637n4 = 0;
                                                iM71637n5 = 0;
                                                iM71632i2 = 0;
                                            } else if (!c24561s2.m71627d(i35)) {
                                                iM71632i2 = c24561s2.m71632i(i35);
                                                if (z18) {
                                                    iM71637n4 = 0;
                                                } else {
                                                    iM71637n4 = 0;
                                                }
                                                iM71637n5 = 0;
                                            }
                                            iM71637n6 = 0;
                                            C0695p c0695p8 = c14625m.f53941n;
                                            c0695p8.f2538p = c24558p;
                                            c0695p8.f2525c = iM71632i5;
                                            c0695p8.f2526d = iM71636m5;
                                            c0695p8.f2527e = iM71632i6;
                                            c0695p8.f2528f = iM71636m6;
                                            c0695p8.f2529g = zM71631h3;
                                            c0695p8.f2530h = z14;
                                            c0695p8.f2531i = zM71631h4;
                                            c0695p8.f2532j = z15;
                                            c0695p8.f2533k = iM71636m2;
                                            c0695p8.f2534l = iM71632i2;
                                            c0695p8.f2535m = iM71637n4;
                                            c0695p8.f2536n = iM71637n6;
                                            c0695p8.f2537o = iM71637n5;
                                            c0695p8.f2523a = true;
                                            c0695p8.f2524b = true;
                                            c14625m.f53938k = false;
                                            break;
                                        }
                                    } else {
                                        c14625m.f53938k = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1751k(int i13, long j7, long j13) {
        if (!this.f2564g || ((C0696q) this.f2572o).f2541c) {
            ((C0704y) this.f2568k).m1760e(i13);
            ((C0704y) this.f2569l).m1760e(i13);
        }
        ((C0704y) this.f2570m).m1760e(i13);
        C0696q c0696q = (C0696q) this.f2572o;
        boolean z4 = this.f2566i;
        c0696q.f2547i = i13;
        c0696q.f2550l = j13;
        c0696q.f2548j = j7;
        c0696q.f2557s = z4;
        if (!c0696q.f2540b || i13 != 1) {
            if (!c0696q.f2541c) {
                return;
            }
            if (i13 != 5 && i13 != 1 && i13 != 2) {
                return;
            }
        }
        C0695p c0695p = c0696q.f2551m;
        c0696q.f2551m = c0696q.f2552n;
        c0696q.f2552n = c0695p;
        c0695p.f2524b = false;
        c0695p.f2523a = false;
        c0696q.f2546h = 0;
        c0696q.f2549k = true;
    }

    public C0697r(C0352d c0352d, boolean z4, boolean z13) {
        this.f2558a = 0;
        this.f2567j = c0352d;
        this.f2559b = z4;
        this.f2560c = z13;
        this.f2562e = new boolean[3];
        this.f2568k = new C0704y(7, 0);
        this.f2569l = new C0704y(8, 0);
        this.f2570m = new C0704y(6, 0);
        this.f2565h = -9223372036854775807L;
        this.f2573p = new C38059n();
    }
}
