package p465rm;

import android.util.Pair;
import android.util.SparseArray;
import g73.C15556d;
import io.AbstractC20038r;
import io.C18739a;
import io.C18740b;
import io.C18743e;
import io.C18744f;
import io.C20033m;
import io.C20034n;
import io.C20036p;
import io.C20037q;
import io.C20708t;
import io.C20712x;
import io.InterfaceC20035o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import ng3.C26702o;
import p031b9.C2819b1;
import p047c9.C4312c;
import p087db.C11858k0;
import p284ko.C22631o;
import p284ko.InterfaceC22614e;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p497t7.InterfaceC33561b;
import p550vd.AbstractC35903f;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.AbstractC41063y;
import p690zr.C41014d0;
import p690zr.C41041n;
import p690zr.C41050r0;
import p690zr.C41052s0;
import p690zr.C41056u0;
import p690zr.C41060w0;
import p705ea2.C12925v;
import sn.C32725c;
import sn.C32763v;
import sn.C32766w0;
import sn.C32768x0;
import sn.InterfaceC32756r0;
import sn.InterfaceC32757s;

/* JADX INFO: renamed from: rm.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31554n0 {

    /* JADX INFO: renamed from: a */
    public final Object f130291a;

    /* JADX INFO: renamed from: b */
    public final Object f130292b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC32756r0[] f130293c;

    /* JADX INFO: renamed from: d */
    public boolean f130294d;

    /* JADX INFO: renamed from: e */
    public boolean f130295e;

    /* JADX INFO: renamed from: f */
    public C31557o0 f130296f;

    /* JADX INFO: renamed from: g */
    public boolean f130297g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f130298h;

    /* JADX INFO: renamed from: i */
    public final AbstractC31523d[] f130299i;

    /* JADX INFO: renamed from: j */
    public final AbstractC20038r f130300j;

    /* JADX INFO: renamed from: k */
    public final C2819b1 f130301k;

    /* JADX INFO: renamed from: l */
    public C31554n0 f130302l;

    /* JADX INFO: renamed from: m */
    public C32768x0 f130303m;

    /* JADX INFO: renamed from: n */
    public C20712x f130304n;

    /* JADX INFO: renamed from: o */
    public long f130305o;

    public C31554n0(AbstractC31523d[] abstractC31523dArr, long j7, AbstractC20038r abstractC20038r, C22631o c22631o, C2819b1 c2819b1, C31557o0 c31557o0, C20712x c20712x) {
        this.f130299i = abstractC31523dArr;
        this.f130305o = j7;
        this.f130300j = abstractC20038r;
        this.f130301k = c2819b1;
        C32763v c32763v = c31557o0.f130326a;
        this.f130292b = c32763v.f136238a;
        this.f130296f = c31557o0;
        this.f130303m = C32768x0.f136269z;
        this.f130304n = c20712x;
        this.f130293c = new InterfaceC32756r0[abstractC31523dArr.length];
        this.f130298h = new boolean[abstractC31523dArr.length];
        long j13 = c31557o0.f130327b;
        long j14 = c31557o0.f130329d;
        c2819b1.getClass();
        Pair pair = (Pair) c32763v.f136238a;
        Object obj = pair.first;
        C32763v c32763vM102755b = c32763v.m102755b(pair.second);
        C31570t0 c31570t0 = (C31570t0) c2819b1.f11031d.get(obj);
        c31570t0.getClass();
        c2819b1.f11033f.add(c31570t0);
        C31568s0 c31568s0 = (C31568s0) c2819b1.f11032e.get(c31570t0);
        if (c31568s0 != null) {
            c31568s0.f130365a.m102687d(c31568s0.f130366b);
        }
        c31570t0.f130372c.add(c32763vM102755b);
        InterfaceC32757s interfaceC32757sMo102684a = c31570t0.f130370a.mo102684a(c32763vM102755b, c22631o, j13);
        c2819b1.f11030c.put(interfaceC32757sMo102684a, c31570t0);
        c2819b1.m8027e();
        this.f130291a = j14 != -9223372036854775807L ? new C32725c(interfaceC32757sMo102684a, true, 0L, j14) : interfaceC32757sMo102684a;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, sn.s] */
    /* JADX INFO: renamed from: a */
    public final long m97158a(C20712x c20712x, long j7, boolean z4, boolean[] zArr) {
        AbstractC31523d[] abstractC31523dArr;
        InterfaceC32756r0[] interfaceC32756r0Arr;
        int i13 = 0;
        while (true) {
            boolean z13 = true;
            if (i13 >= c20712x.f77581a) {
                break;
            }
            if (z4 || !c20712x.m56900a(this.f130304n, i13)) {
                z13 = false;
            }
            this.f130298h[i13] = z13;
            i13++;
        }
        int i14 = 0;
        while (true) {
            abstractC31523dArr = this.f130299i;
            int length = abstractC31523dArr.length;
            interfaceC32756r0Arr = this.f130293c;
            if (i14 >= length) {
                break;
            }
            if (abstractC31523dArr[i14].f130110w == -2) {
                interfaceC32756r0Arr[i14] = null;
            }
            i14++;
        }
        m97159b();
        this.f130304n = c20712x;
        m97160c();
        long jMo102704j = this.f130291a.mo102704j(c20712x.f77583c, this.f130298h, this.f130293c, zArr, j7);
        for (int i15 = 0; i15 < abstractC31523dArr.length; i15++) {
            if (abstractC31523dArr[i15].f130110w == -2 && this.f130304n.m56901b(i15)) {
                interfaceC32756r0Arr[i15] = new C26702o(25, false);
            }
        }
        this.f130295e = false;
        for (int i16 = 0; i16 < interfaceC32756r0Arr.length; i16++) {
            if (interfaceC32756r0Arr[i16] != null) {
                AbstractC24543a.m71573i(c20712x.m56901b(i16));
                if (abstractC31523dArr[i16].f130110w != -2) {
                    this.f130295e = true;
                }
            } else {
                AbstractC24543a.m71573i(c20712x.f77583c[i16] == null);
            }
        }
        return jMo102704j;
    }

    /* JADX INFO: renamed from: b */
    public final void m97159b() {
        if (this.f130302l != null) {
            return;
        }
        int i13 = 0;
        while (true) {
            C20712x c20712x = this.f130304n;
            if (i13 >= c20712x.f77581a) {
                return;
            }
            boolean zM56901b = c20712x.m56901b(i13);
            InterfaceC20035o interfaceC20035o = this.f130304n.f77583c[i13];
            if (zM56901b && interfaceC20035o != null) {
                interfaceC20035o.mo54490a();
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m97160c() {
        if (this.f130302l != null) {
            return;
        }
        int i13 = 0;
        while (true) {
            C20712x c20712x = this.f130304n;
            if (i13 >= c20712x.f77581a) {
                return;
            }
            boolean zM56901b = c20712x.m56901b(i13);
            InterfaceC20035o interfaceC20035o = this.f130304n.f77583c[i13];
            if (zM56901b && interfaceC20035o != null) {
                interfaceC20035o.mo54491b();
            }
            i13++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, sn.t0] */
    /* JADX INFO: renamed from: d */
    public final long m97161d() {
        if (!this.f130294d) {
            return this.f130296f.f130327b;
        }
        long jMo91533m = this.f130295e ? this.f130291a.mo91533m() : Long.MIN_VALUE;
        return jMo91533m == Long.MIN_VALUE ? this.f130296f.f130330e : jMo91533m;
    }

    /* JADX INFO: renamed from: e */
    public final long m97162e() {
        return this.f130296f.f130327b + this.f130305o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sn.s] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public final void m97163f() {
        m97159b();
        ?? r10 = this.f130291a;
        try {
            boolean z4 = r10 instanceof C32725c;
            C2819b1 c2819b1 = this.f130301k;
            if (z4) {
                c2819b1.m8033k(((C32725c) r10).f136040w);
            } else {
                c2819b1.m8033k(r10);
            }
        } catch (RuntimeException e5) {
            AbstractC24543a.m71578n("MediaPeriodHolder", "Period release failed.", e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:279:0x05fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final C20712x m97164g(float f13, AbstractC31558o1 abstractC31558o1) {
        boolean z4;
        String str;
        int i13;
        C32768x0 c32768x0;
        int i14;
        boolean z13;
        InterfaceC20035o c18740b;
        int i15;
        long[][] jArr;
        int i16;
        int i17;
        InterfaceC22614e interfaceC22614e;
        SparseArray sparseArray;
        C32768x0[] c32768x0Arr;
        int[] iArr;
        int[][][] iArr2;
        int i18;
        int[][][] iArr3;
        int i19;
        int[] iArr4;
        C32768x0 c32768x1 = this.f130303m;
        AbstractC20038r abstractC20038r = this.f130300j;
        abstractC20038r.getClass();
        AbstractC31523d[] abstractC31523dArr = this.f130299i;
        int i24 = 1;
        int[] iArr5 = new int[abstractC31523dArr.length + 1];
        int length = abstractC31523dArr.length + 1;
        C32766w0[][] c32766w0Arr = new C32766w0[length][];
        int[][][] iArr6 = new int[abstractC31523dArr.length + 1][][];
        int i25 = 0;
        for (int i26 = 0; i26 < length; i26++) {
            int i27 = c32768x1.f136270w;
            c32766w0Arr[i26] = new C32766w0[i27];
            iArr6[i26] = new int[i27][];
        }
        int length2 = abstractC31523dArr.length;
        int[] iArr7 = new int[length2];
        for (int i28 = 0; i28 < length2; i28++) {
            iArr7[i28] = abstractC31523dArr[i28].mo49747y();
        }
        int i29 = 0;
        while (i29 < c32768x1.f136270w) {
            C32766w0 c32766w0M102758a = c32768x1.m102758a(i29);
            C31521c0[] c31521c0Arr = c32766w0M102758a.f136262y;
            int i34 = c32766w0M102758a.f136260w;
            int i35 = AbstractC24555m.m71613g(c31521c0Arr[i25].f130077L) == 5 ? i24 : i25;
            int length3 = abstractC31523dArr.length;
            int i36 = i24;
            int i37 = i36;
            int i38 = i25;
            int i39 = i38;
            while (i25 < abstractC31523dArr.length) {
                AbstractC31523d abstractC31523d = abstractC31523dArr[i25];
                C32768x0 c32768x2 = c32768x1;
                AbstractC20038r abstractC20038r2 = abstractC20038r;
                int i44 = i38;
                int iMax = i44;
                while (i44 < i34) {
                    int i45 = i44;
                    iMax = Math.max(iMax, abstractC31523d.mo49746x(c31521c0Arr[i45]) & 7);
                    i44 = i45 + 1;
                }
                int i46 = iArr5[i25] == 0 ? i36 : i38;
                if (iMax > i39 || (iMax == i39 && i35 != 0 && i37 == 0 && i46 != 0)) {
                    i37 = i46;
                    i39 = iMax;
                    length3 = i25;
                }
                i25++;
                c32768x1 = c32768x2;
                abstractC20038r = abstractC20038r2;
            }
            C32768x0 c32768x3 = c32768x1;
            AbstractC20038r abstractC20038r3 = abstractC20038r;
            if (length3 == abstractC31523dArr.length) {
                iArr4 = new int[i34];
            } else {
                AbstractC31523d abstractC31523d2 = abstractC31523dArr[length3];
                int[] iArr8 = new int[i34];
                for (int i47 = i38; i47 < i34; i47++) {
                    iArr8[i47] = abstractC31523d2.mo49746x(c31521c0Arr[i47]);
                }
                iArr4 = iArr8;
            }
            int i48 = iArr5[length3];
            c32766w0Arr[length3][i48] = c32766w0M102758a;
            iArr6[length3][i48] = iArr4;
            iArr5[length3] = i48 + 1;
            i29++;
            i25 = i38;
            i24 = i36;
            c32768x1 = c32768x3;
            abstractC20038r = abstractC20038r3;
        }
        AbstractC20038r abstractC20038r4 = abstractC20038r;
        int i49 = i24;
        int i54 = i25;
        C32768x0[] c32768x0Arr2 = new C32768x0[abstractC31523dArr.length];
        String[] strArr = new String[abstractC31523dArr.length];
        int[] iArr9 = new int[abstractC31523dArr.length];
        for (int i55 = i54; i55 < abstractC31523dArr.length; i55++) {
            int i56 = iArr5[i55];
            c32768x0Arr2[i55] = new C32768x0((C32766w0[]) AbstractC24567y.m71664B(i56, c32766w0Arr[i55]));
            iArr6[i55] = (int[][]) AbstractC24567y.m71664B(i56, iArr6[i55]);
            strArr[i55] = abstractC31523dArr[i55].mo54420h();
            iArr9[i55] = abstractC31523dArr[i55].f130110w;
        }
        C32768x0 c32768x4 = new C32768x0((C32766w0[]) AbstractC24567y.m71664B(iArr5[abstractC31523dArr.length], c32766w0Arr[abstractC31523dArr.length]));
        C20037q c20037q = new C20037q(iArr9, c32768x0Arr2, iArr6, c32768x4);
        C20033m c20033m = (C20033m) abstractC20038r4;
        C18744f c18744f = (C18744f) c20033m.f75163d.get();
        int i57 = c20037q.f75166a;
        C20034n[] c20034nArr = new C20034n[i57];
        int i58 = 2;
        Pair pairM55870e = C20033m.m55870e(2, c20037q, iArr6, new C4312c(3, c18744f, iArr7), new C11858k0(10));
        if (pairM55870e != null) {
            c20034nArr[((Integer) pairM55870e.second).intValue()] = (C20034n) pairM55870e.first;
        }
        int i59 = i54;
        while (true) {
            if (i59 >= i57) {
                z4 = i54;
                break;
            }
            if (2 == iArr9[i59] && c32768x0Arr2[i59].f136270w > 0) {
                z4 = i49;
                break;
            }
            i59++;
        }
        Pair pairM55870e2 = C20033m.m55870e(i49, c20037q, iArr6, new C12925v(c18744f, z4, 1), new C11858k0(11));
        if (pairM55870e2 != null) {
            c20034nArr[((Integer) pairM55870e2.second).intValue()] = (C20034n) pairM55870e2.first;
        }
        if (pairM55870e2 == null) {
            str = null;
        } else {
            C20034n c20034n = (C20034n) pairM55870e2.first;
            str = c20034n.f75164a.f136262y[c20034n.f75165b[i54]].f130100y;
        }
        int i64 = 3;
        Pair pairM55870e3 = C20033m.m55870e(3, c20037q, iArr6, new C4312c(4, c18744f, str), new C11858k0(12));
        if (pairM55870e3 != null) {
            c20034nArr[((Integer) pairM55870e3.second).intValue()] = (C20034n) pairM55870e3.first;
        }
        int i65 = i54;
        while (i65 < i57) {
            int i66 = iArr9[i65];
            if (i66 == i58 || i66 == 1 || i66 == i64) {
                c32768x0Arr = c32768x0Arr2;
                iArr = iArr9;
                iArr2 = iArr6;
                i18 = i65;
            } else {
                C32768x0 c32768x5 = c32768x0Arr2[i65];
                int[][] iArr10 = iArr6[i65];
                int i67 = i54;
                int i68 = i67;
                C32766w0 c32766w0 = null;
                C18743e c18743e = null;
                while (i67 < c32768x5.f136270w) {
                    C32766w0 c32766w0M102758a2 = c32768x5.m102758a(i67);
                    int[] iArr11 = iArr10[i67];
                    C32768x0[] c32768x0Arr3 = c32768x0Arr2;
                    C18743e c18743e2 = c18743e;
                    int i69 = i68;
                    C32766w0 c32766w1 = c32766w0;
                    int i74 = i54;
                    while (i74 < c32766w0M102758a2.f136260w) {
                        int[] iArr12 = iArr9;
                        if (C20033m.m55867b(iArr11[i74], c18744f.f73666j0)) {
                            iArr3 = iArr6;
                            C18743e c18743e3 = new C18743e(c32766w0M102758a2.f136262y[i74], iArr11[i74]);
                            if (c18743e2 != null) {
                                i19 = i65;
                                if (AbstractC41063y.f177072a.mo133310c(c18743e3.f73654x, c18743e2.f73654x).mo133310c(c18743e3.f73653w, c18743e2.f73653w).mo133312e() > 0) {
                                }
                            } else {
                                i19 = i65;
                            }
                            c18743e2 = c18743e3;
                            i69 = i74;
                            c32766w1 = c32766w0M102758a2;
                        } else {
                            iArr3 = iArr6;
                            i19 = i65;
                        }
                        i74++;
                        iArr9 = iArr12;
                        iArr6 = iArr3;
                        i65 = i19;
                    }
                    i67++;
                    c32766w0 = c32766w1;
                    i68 = i69;
                    c32768x0Arr2 = c32768x0Arr3;
                    c18743e = c18743e2;
                }
                c32768x0Arr = c32768x0Arr2;
                iArr = iArr9;
                iArr2 = iArr6;
                i18 = i65;
                c20034nArr[i18] = c32766w0 == null ? null : new C20034n(i54, c32766w0, new int[]{i68});
            }
            i65 = i18 + 1;
            c32768x0Arr2 = c32768x0Arr;
            iArr9 = iArr;
            iArr6 = iArr2;
            i54 = 0;
            i58 = 2;
            i64 = 3;
        }
        C32768x0[] c32768x0Arr4 = c32768x0Arr2;
        int[] iArr13 = iArr9;
        int[][][] iArr14 = iArr6;
        SparseArray sparseArray2 = new SparseArray();
        for (int i75 = 0; i75 < i57; i75++) {
            C32768x0 c32768x6 = c32768x0Arr4[i75];
            for (int i76 = 0; i76 < c32768x6.f136270w; i76++) {
                C20033m.m55868c(sparseArray2, (C20708t) c18744f.f77575X.f77530w.get(c32768x6.m102758a(i76)), i75);
            }
        }
        int i77 = 0;
        while (true) {
            i13 = c32768x4.f136270w;
            if (i77 >= i13) {
                break;
            }
            C20033m.m55868c(sparseArray2, (C20708t) c18744f.f77575X.f77530w.get(c32768x4.m102758a(i77)), -1);
            i77++;
        }
        for (int i78 = 0; i78 < sparseArray2.size(); i78++) {
            Pair pair = (Pair) sparseArray2.valueAt(i78);
            int iKeyAt = sparseArray2.keyAt(i78);
            C20708t c20708t = (C20708t) pair.first;
            int iIntValue = ((Integer) pair.second).intValue();
            int i79 = 0;
            while (i79 < i57) {
                if (iIntValue == i79) {
                    sparseArray = sparseArray2;
                    c20034nArr[i79] = new C20034n(0, c20708t.f77527w, AbstractC35903f.m113999S(c20708t.f77528x));
                } else {
                    sparseArray = sparseArray2;
                    if (iArr13[i79] == iKeyAt) {
                        c20034nArr[i79] = null;
                    }
                }
                i79++;
                sparseArray2 = sparseArray;
            }
        }
        for (int i83 = 0; i83 < i57; i83++) {
            C32768x0 c32768x7 = c32768x0Arr4[i83];
            Map map = (Map) c18744f.f73669m0.get(i83);
            if (map != null && map.containsKey(c32768x7)) {
                C32768x0 c32768x8 = c32768x0Arr4[i83];
                Map map2 = (Map) c18744f.f73669m0.get(i83);
                if (map2 != null) {
                }
                c20034nArr[i83] = null;
            }
        }
        for (int i84 = 0; i84 < i57; i84++) {
            int i85 = iArr13[i84];
            if (c18744f.f73670n0.get(i84) || c18744f.f77576Y.contains(Integer.valueOf(i85))) {
                c20034nArr[i84] = null;
            }
        }
        C15556d c15556d = c20033m.f75162c;
        InterfaceC22614e interfaceC22614e2 = c20033m.f75171b;
        interfaceC22614e2.getClass();
        c15556d.getClass();
        ArrayList arrayList = new ArrayList();
        int i86 = 0;
        for (C20034n c20034n2 : c20034nArr) {
            if (c20034n2 == null || c20034n2.f75165b.length <= 1) {
                arrayList.add(null);
            } else {
                C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
                c41014d0M133251l.m133222a(new C18739a(0L, 0L));
                arrayList.add(c41014d0M133251l);
            }
        }
        int length4 = c20034nArr.length;
        long[][] jArr2 = new long[length4][];
        int i87 = 0;
        while (i87 < c20034nArr.length) {
            C20034n c20034n3 = c20034nArr[i87];
            if (c20034n3 == null) {
                jArr2[i87] = new long[i86];
                interfaceC22614e = interfaceC22614e2;
                i17 = i86;
            } else {
                i17 = i86;
                int[] iArr15 = c20034n3.f75165b;
                jArr2[i87] = new long[iArr15.length];
                int i88 = i17;
                while (i88 < iArr15.length) {
                    jArr2[i87][i88] = c20034n3.f75164a.f136262y[iArr15[i88]].f130073H;
                    i88++;
                    iArr15 = iArr15;
                    interfaceC22614e2 = interfaceC22614e2;
                }
                interfaceC22614e = interfaceC22614e2;
                Arrays.sort(jArr2[i87]);
            }
            i87++;
            i86 = i17;
            interfaceC22614e2 = interfaceC22614e;
        }
        InterfaceC22614e interfaceC22614e3 = interfaceC22614e2;
        int i89 = i86;
        int[] iArr16 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i94 = i89; i94 < length4; i94++) {
            long[] jArr4 = jArr2[i94];
            jArr3[i94] = jArr4.length == 0 ? 0L : jArr4[i89];
        }
        C18740b.m54488u(arrayList, jArr3);
        AbstractC41047q.m133273c(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(C41056u0.f177063x);
        C41050r0 c41050r0 = new C41050r0();
        C41052s0 c41052s0 = new C41052s0(treeMap);
        c41052s0.f177048F = c41050r0;
        int i95 = i89;
        while (i95 < length4) {
            long[] jArr5 = jArr2[i95];
            if (jArr5.length <= 1) {
                i15 = length4;
                jArr = jArr2;
                i16 = i95;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i96 = i89;
                while (true) {
                    long[] jArr6 = jArr2[i95];
                    i15 = length4;
                    double dLog = 0.0d;
                    if (i96 >= jArr6.length) {
                        break;
                    }
                    long[][] jArr7 = jArr2;
                    int i97 = i95;
                    long j7 = jArr6[i96];
                    if (j7 != -1) {
                        dLog = Math.log(j7);
                    }
                    dArr[i96] = dLog;
                    i96++;
                    jArr2 = jArr7;
                    length4 = i15;
                    i95 = i97;
                }
                jArr = jArr2;
                i16 = i95;
                int i98 = length5 - 1;
                double d3 = dArr[i98] - dArr[i89];
                int i99 = i89;
                while (i99 < i98) {
                    double d14 = dArr[i99];
                    int i100 = i99 + 1;
                    c41052s0.m133293d(Double.valueOf(d3 == 0.0d ? 1.0d : (((d14 + dArr[i100]) * 0.5d) - dArr[i89]) / d3), Integer.valueOf(i16));
                    i99 = i100;
                }
            }
            i95 = i16 + 1;
            jArr2 = jArr;
            iArr16 = iArr16;
            length4 = i15;
        }
        int[] iArr17 = iArr16;
        long[][] jArr8 = jArr2;
        C41041n c41041n = c41052s0.f177030x;
        if (c41041n == null) {
            c41041n = new C41041n(0, c41052s0);
            c41052s0.f177030x = c41041n;
        }
        AbstractC41023g0 abstractC41023g0M133252m = AbstractC41023g0.m133252m(c41041n);
        for (int i101 = i89; i101 < abstractC41023g0M133252m.size(); i101++) {
            int iIntValue2 = ((Integer) abstractC41023g0M133252m.get(i101)).intValue();
            int i102 = iArr17[iIntValue2] + 1;
            iArr17[iIntValue2] = i102;
            jArr3[iIntValue2] = jArr8[iIntValue2][i102];
            C18740b.m54488u(arrayList, jArr3);
        }
        for (int i103 = i89; i103 < c20034nArr.length; i103++) {
            if (arrayList.get(i103) != null) {
                jArr3[i103] = jArr3[i103] * 2;
            }
        }
        C18740b.m54488u(arrayList, jArr3);
        C41014d0 c41014d0M133251l2 = AbstractC41023g0.m133251l();
        for (int i104 = i89; i104 < arrayList.size(); i104++) {
            C41014d0 c41014d0 = (C41014d0) arrayList.get(i104);
            c41014d0M133251l2.m133222a(c41014d0 == null ? C41060w0.f177067E : c41014d0.m133239f());
        }
        C41060w0 c41060w0M133239f = c41014d0M133251l2.m133239f();
        InterfaceC20035o[] interfaceC20035oArr = new InterfaceC20035o[c20034nArr.length];
        for (int i105 = 0; i105 < c20034nArr.length; i105++) {
            C20034n c20034n4 = c20034nArr[i105];
            if (c20034n4 != null) {
                int[] iArr18 = c20034n4.f75165b;
                if (iArr18.length != 0) {
                    if (iArr18.length == 1) {
                        c18740b = new C20036p(c20034n4.f75164a, new int[]{iArr18[0]});
                    } else {
                        long j13 = 25000;
                        c18740b = new C18740b(c20034n4.f75164a, iArr18, interfaceC22614e3, InterfaceC33561b.INVALID_OWNERSHIP, j13, j13, (AbstractC41023g0) c41060w0M133239f.get(i105));
                    }
                    interfaceC20035oArr[i105] = c18740b;
                }
            }
        }
        C31534g1[] c31534g1Arr = new C31534g1[i57];
        for (int i106 = 0; i106 < i57; i106++) {
            c31534g1Arr[i106] = (c18744f.f73670n0.get(i106) || c18744f.f77576Y.contains(Integer.valueOf(iArr13[i106])) || (iArr13[i106] != -2 && interfaceC20035oArr[i106] == null)) ? null : C31534g1.f130150b;
        }
        if (c18744f.f73667k0) {
            int i107 = -1;
            int i108 = -1;
            int i109 = 0;
            while (true) {
                if (i109 >= i57) {
                    i14 = -1;
                    z13 = true;
                    break;
                }
                int i110 = iArr13[i109];
                InterfaceC20035o interfaceC20035o = interfaceC20035oArr[i109];
                if ((i110 != 1 && i110 != 2) || interfaceC20035o == null) {
                    break;
                    break;
                }
                int[][] iArr19 = iArr14[i109];
                int iIndexOf = c32768x0Arr4[i109].f136271x.indexOf(interfaceC20035o.mo54502j());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                int i111 = 0;
                while (true) {
                    if (i111 >= interfaceC20035o.length()) {
                        if (i110 != 1) {
                            i14 = -1;
                            if (i107 == -1) {
                                i107 = i109;
                                break;
                            }
                            z13 = false;
                            break;
                        }
                        i14 = -1;
                        if (i108 == -1) {
                            i108 = i109;
                            break;
                        }
                        z13 = false;
                        break;
                    }
                    if ((iArr19[iIndexOf][interfaceC20035o.mo54500e(i111)] & 32) != 32) {
                        break;
                    }
                    i111++;
                }
                i109++;
            }
            if (((i108 == i14 || i107 == i14) ? false : true) & z13) {
                C31534g1 c31534g1 = new C31534g1(true);
                c31534g1Arr[i108] = c31534g1;
                c31534g1Arr[i107] = c31534g1;
            }
        }
        Pair pairCreate = Pair.create(c31534g1Arr, interfaceC20035oArr);
        InterfaceC20035o[] interfaceC20035oArr2 = (InterfaceC20035o[]) pairCreate.second;
        C41014d0 c41014d1 = new C41014d0(4);
        for (int i112 = 0; i112 < i57; i112++) {
            C32768x0 c32768x9 = c20037q.f75168c[i112];
            InterfaceC20035o interfaceC20035o2 = interfaceC20035oArr2[i112];
            int i113 = 0;
            while (i113 < c32768x9.f136270w) {
                C32766w0 c32766w0M102758a3 = c32768x9.m102758a(i113);
                int i114 = c32766w0M102758a3.f136260w;
                int[] iArr20 = new int[i114];
                boolean[] zArr = new boolean[i114];
                int i115 = 0;
                while (i115 < i114) {
                    InterfaceC20035o[] interfaceC20035oArr3 = interfaceC20035oArr2;
                    iArr20[i115] = c20037q.f75169d[i112][i113][i115] & 7;
                    if (interfaceC20035o2 == null || !interfaceC20035o2.mo54502j().equals(c32766w0M102758a3)) {
                        c32768x0 = c32768x9;
                    } else {
                        c32768x0 = c32768x9;
                        boolean z14 = interfaceC20035o2.mo54501i(i115) != -1;
                        zArr[i115] = z14;
                        i115++;
                        interfaceC20035oArr2 = interfaceC20035oArr3;
                        c32768x9 = c32768x0;
                    }
                    zArr[i115] = z14;
                    i115++;
                    interfaceC20035oArr2 = interfaceC20035oArr3;
                    c32768x9 = c32768x0;
                }
                c41014d1.m133222a(new C31561p1(c32766w0M102758a3, iArr20, c20037q.f75167b[i112], zArr));
                i113++;
                interfaceC20035oArr2 = interfaceC20035oArr2;
                c32768x9 = c32768x9;
            }
        }
        for (int i116 = 0; i116 < i13; i116++) {
            C32766w0 c32766w0M102758a4 = c32768x4.m102758a(i116);
            int i117 = c32766w0M102758a4.f136260w;
            int[] iArr21 = new int[i117];
            Arrays.fill(iArr21, 0);
            c41014d1.m133222a(new C31561p1(c32766w0M102758a4, iArr21, AbstractC24555m.m71613g(c32766w0M102758a4.f136262y[0].f130077L), new boolean[i117]));
        }
        C20712x c20712x = new C20712x((C31534g1[]) pairCreate.first, (InterfaceC20035o[]) pairCreate.second, new C31564q1(c41014d1.m133239f()), c20037q);
        for (InterfaceC20035o interfaceC20035o3 : c20712x.f77583c) {
            if (interfaceC20035o3 != null) {
                interfaceC20035o3.mo54493f(f13);
            }
        }
        return c20712x;
    }

    /* JADX INFO: renamed from: h */
    public final void m97165h() {
        Object obj = this.f130291a;
        if (obj instanceof C32725c) {
            long j7 = this.f130296f.f130329d;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            C32725c c32725c = (C32725c) obj;
            c32725c.f136037E = 0L;
            c32725c.f136038F = j7;
        }
    }
}
