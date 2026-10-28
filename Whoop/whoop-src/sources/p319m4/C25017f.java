package p319m4;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import no.nordicsemi.android.dfu.DfuBaseService;
import p005a3.C0237p;
import p136f4.C14051c;
import p333n4.AbstractC26253i;
import p333n4.AbstractC26260p;
import p333n4.C26246b;
import p333n4.C26248d;
import p333n4.C26250f;
import p333n4.C26254j;
import p333n4.C26256l;
import p333n4.C26258n;
import p333n4.InterfaceC26247c;
import p547v8.AbstractC35785b;

/* JADX INFO: renamed from: m4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C25017f extends C25016e {

    /* JADX INFO: renamed from: u0 */
    public int f97966u0;

    /* JADX INFO: renamed from: y0 */
    public int f97970y0;

    /* JADX INFO: renamed from: z0 */
    public int f97971z0;

    /* JADX INFO: renamed from: r0 */
    public ArrayList f97963r0 = new ArrayList();

    /* JADX INFO: renamed from: s0 */
    public C0237p f97964s0 = new C0237p(this);

    /* JADX INFO: renamed from: t0 */
    public C26250f f97965t0 = new C26250f(this);

    /* JADX INFO: renamed from: v0 */
    public InterfaceC26247c f97967v0 = null;

    /* JADX INFO: renamed from: w0 */
    public boolean f97968w0 = false;

    /* JADX INFO: renamed from: x0 */
    public C14051c f97969x0 = new C14051c();

    /* JADX INFO: renamed from: A0 */
    public int f97950A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public int f97951B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public C25014c[] f97952C0 = new C25014c[4];

    /* JADX INFO: renamed from: D0 */
    public C25014c[] f97953D0 = new C25014c[4];

    /* JADX INFO: renamed from: E0 */
    public int f97954E0 = 257;

    /* JADX INFO: renamed from: F0 */
    public boolean f97955F0 = false;

    /* JADX INFO: renamed from: G0 */
    public boolean f97956G0 = false;

    /* JADX INFO: renamed from: H0 */
    public WeakReference f97957H0 = null;

    /* JADX INFO: renamed from: I0 */
    public WeakReference f97958I0 = null;

    /* JADX INFO: renamed from: J0 */
    public WeakReference f97959J0 = null;

    /* JADX INFO: renamed from: K0 */
    public WeakReference f97960K0 = null;

    /* JADX INFO: renamed from: L0 */
    public HashSet f97961L0 = new HashSet();

    /* JADX INFO: renamed from: M0 */
    public C26246b f97962M0 = new C26246b();

    /* JADX INFO: renamed from: b0 */
    public static void m73454b0(C25016e c25016e, InterfaceC26247c interfaceC26247c, C26246b c26246b) {
        int i13;
        int i14;
        if (interfaceC26247c == null) {
            return;
        }
        int i15 = c25016e.f97922h0;
        int[] iArr = c25016e.f97944u;
        if (i15 == 8 || (c25016e instanceof C25020i) || (c25016e instanceof C25013b)) {
            c26246b.f104363e = 0;
            c26246b.f104364f = 0;
            return;
        }
        int[] iArr2 = c25016e.f97940q0;
        c26246b.f104359a = iArr2[0];
        c26246b.f104360b = iArr2[1];
        c26246b.f104361c = c25016e.m73445r();
        c26246b.f104362d = c25016e.m73441l();
        c26246b.f104367i = false;
        c26246b.f104368j = 0;
        boolean z4 = c26246b.f104359a == 3;
        boolean z13 = c26246b.f104360b == 3;
        boolean z14 = z4 && c25016e.f97904X > 0.0f;
        boolean z15 = z13 && c25016e.f97904X > 0.0f;
        if (z4 && c25016e.m73448u(0) && c25016e.f97942s == 0 && !z14) {
            c26246b.f104359a = 2;
            if (z13 && c25016e.f97943t == 0) {
                c26246b.f104359a = 1;
            }
            z4 = false;
        }
        if (z13 && c25016e.m73448u(1) && c25016e.f97943t == 0 && !z15) {
            c26246b.f104360b = 2;
            if (z4 && c25016e.f97942s == 0) {
                c26246b.f104360b = 1;
            }
            z13 = false;
        }
        if (c25016e.mo73394B()) {
            c26246b.f104359a = 1;
            z4 = false;
        }
        if (c25016e.mo73395C()) {
            c26246b.f104360b = 1;
            z13 = false;
        }
        if (z14) {
            if (iArr[0] == 4) {
                c26246b.f104359a = 1;
            } else if (!z13) {
                if (c26246b.f104360b == 1) {
                    i14 = c26246b.f104362d;
                } else {
                    c26246b.f104359a = 2;
                    interfaceC26247c.mo3624a(c25016e, c26246b);
                    i14 = c26246b.f104364f;
                }
                c26246b.f104359a = 1;
                c26246b.f104361c = (int) (c25016e.f97904X * i14);
            }
        }
        if (z15) {
            if (iArr[1] == 4) {
                c26246b.f104360b = 1;
            } else if (!z4) {
                if (c26246b.f104359a == 1) {
                    i13 = c26246b.f104361c;
                } else {
                    c26246b.f104360b = 2;
                    interfaceC26247c.mo3624a(c25016e, c26246b);
                    i13 = c26246b.f104363e;
                }
                c26246b.f104360b = 1;
                if (c25016e.f97905Y == -1) {
                    c26246b.f104362d = (int) (i13 / c25016e.f97904X);
                } else {
                    c26246b.f104362d = (int) (c25016e.f97904X * i13);
                }
            }
        }
        interfaceC26247c.mo3624a(c25016e, c26246b);
        c25016e.m73429S(c26246b.f104363e);
        c25016e.m73424N(c26246b.f104364f);
        c25016e.f97886F = c26246b.f104366h;
        c25016e.m73420J(c26246b.f104365g);
        c26246b.f104368j = 0;
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: D */
    public final void mo73416D() {
        this.f97969x0.m40013t();
        this.f97970y0 = 0;
        this.f97971z0 = 0;
        this.f97963r0.clear();
        super.mo73416D();
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: G */
    public final void mo73419G(C0237p c0237p) {
        super.mo73419G(c0237p);
        int size = this.f97963r0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((C25016e) this.f97963r0.get(i13)).mo73419G(c0237p);
        }
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: T */
    public final void mo73430T(boolean z4, boolean z13) {
        super.mo73430T(z4, z13);
        int size = this.f97963r0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((C25016e) this.f97963r0.get(i13)).mo73430T(z4, z13);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m73455V(C25016e c25016e) {
        this.f97963r0.add(c25016e);
        C25017f c25017f = c25016e.f97901U;
        if (c25017f != null) {
            c25017f.f97963r0.remove(c25016e);
            c25016e.mo73416D();
        }
        c25016e.f97901U = this;
    }

    /* JADX INFO: renamed from: W */
    public final void m73456W(C25016e c25016e, int i13) {
        if (i13 == 0) {
            int i14 = this.f97950A0 + 1;
            C25014c[] c25014cArr = this.f97953D0;
            if (i14 >= c25014cArr.length) {
                this.f97953D0 = (C25014c[]) Arrays.copyOf(c25014cArr, c25014cArr.length * 2);
            }
            C25014c[] c25014cArr2 = this.f97953D0;
            int i15 = this.f97950A0;
            c25014cArr2[i15] = new C25014c(c25016e, 0, this.f97968w0);
            this.f97950A0 = i15 + 1;
            return;
        }
        if (i13 == 1) {
            int i16 = this.f97951B0 + 1;
            C25014c[] c25014cArr3 = this.f97952C0;
            if (i16 >= c25014cArr3.length) {
                this.f97952C0 = (C25014c[]) Arrays.copyOf(c25014cArr3, c25014cArr3.length * 2);
            }
            C25014c[] c25014cArr4 = this.f97952C0;
            int i17 = this.f97951B0;
            c25014cArr4[i17] = new C25014c(c25016e, 1, this.f97968w0);
            this.f97951B0 = i17 + 1;
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m73457X(C14051c c14051c) {
        C25017f c25017f;
        C14051c c14051c2;
        HashSet hashSet = this.f97961L0;
        boolean zM73461c0 = m73461c0(64);
        mo67544c(c14051c, zM73461c0);
        int size = this.f97963r0.size();
        boolean z4 = false;
        for (int i13 = 0; i13 < size; i13++) {
            C25016e c25016e = (C25016e) this.f97963r0.get(i13);
            boolean[] zArr = c25016e.f97900T;
            zArr[0] = false;
            zArr[1] = false;
            if (c25016e instanceof C25013b) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i14 = 0; i14 < size; i14++) {
                C25016e c25016e2 = (C25016e) this.f97963r0.get(i14);
                if (c25016e2 instanceof C25013b) {
                    C25013b c25013b = (C25013b) c25016e2;
                    for (int i15 = 0; i15 < c25013b.f98022s0; i15++) {
                        C25016e c25016e3 = c25013b.f98021r0[i15];
                        if (c25013b.f97852u0 || c25016e3.mo73398d()) {
                            int i16 = c25013b.f97851t0;
                            if (i16 == 0 || i16 == 1) {
                                c25016e3.f97900T[0] = true;
                            } else if (i16 == 2 || i16 == 3) {
                                c25016e3.f97900T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i17 = 0; i17 < size; i17++) {
            C25016e c25016e4 = (C25016e) this.f97963r0.get(i17);
            c25016e4.getClass();
            boolean z13 = c25016e4 instanceof AbstractC25023l;
            if (z13 || (c25016e4 instanceof C25020i)) {
                if (z13) {
                    hashSet.add(c25016e4);
                } else {
                    c25016e4.mo67544c(c14051c, zM73461c0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC25023l abstractC25023l = (AbstractC25023l) ((C25016e) it.next());
                for (int i18 = 0; i18 < abstractC25023l.f98022s0; i18++) {
                    if (hashSet.contains(abstractC25023l.f98021r0[i18])) {
                        abstractC25023l.mo67544c(c14051c, zM73461c0);
                        hashSet.remove(abstractC25023l);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    ((C25016e) it3.next()).mo67544c(c14051c, zM73461c0);
                }
                hashSet.clear();
            }
        }
        if (C14051c.f50153q) {
            HashSet<C25016e> hashSet2 = new HashSet();
            for (int i19 = 0; i19 < size; i19++) {
                C25016e c25016e5 = (C25016e) this.f97963r0.get(i19);
                c25016e5.getClass();
                if (!(c25016e5 instanceof AbstractC25023l) && !(c25016e5 instanceof C25020i)) {
                    hashSet2.add(c25016e5);
                }
            }
            c25017f = this;
            c14051c2 = c14051c;
            c25017f.m73433b(this, c14051c2, hashSet2, this.f97940q0[0] == 2 ? 0 : 1, false);
            for (C25016e c25016e6 : hashSet2) {
                AbstractC25022k.m73476b(this, c14051c2, c25016e6);
                c25016e6.mo67544c(c14051c2, zM73461c0);
            }
        } else {
            c25017f = this;
            c14051c2 = c14051c;
            for (int i24 = 0; i24 < size; i24++) {
                C25016e c25016e7 = (C25016e) c25017f.f97963r0.get(i24);
                if (c25016e7 instanceof C25017f) {
                    int[] iArr = c25016e7.f97940q0;
                    int i25 = iArr[0];
                    int i26 = iArr[1];
                    if (i25 == 2) {
                        c25016e7.m73425O(1);
                    }
                    if (i26 == 2) {
                        c25016e7.m73427Q(1);
                    }
                    c25016e7.mo67544c(c14051c2, zM73461c0);
                    if (i25 == 2) {
                        c25016e7.m73425O(i25);
                    }
                    if (i26 == 2) {
                        c25016e7.m73427Q(i26);
                    }
                } else {
                    AbstractC25022k.m73476b(this, c14051c2, c25016e7);
                    if (!(c25016e7 instanceof AbstractC25023l) && !(c25016e7 instanceof C25020i)) {
                        c25016e7.mo67544c(c14051c2, zM73461c0);
                    }
                }
            }
        }
        if (c25017f.f97950A0 > 0) {
            AbstractC25022k.m73475a(this, c14051c2, null, 0);
        }
        if (c25017f.f97951B0 > 0) {
            AbstractC25022k.m73475a(this, c14051c2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX INFO: renamed from: Y */
    public final boolean m73458Y(int i13, boolean z4) {
        boolean z13;
        boolean z14;
        C26250f c26250f = this.f97965t0;
        ArrayList<AbstractC26260p> arrayList = (ArrayList) c26250f.f104376f;
        C25017f c25017f = (C25017f) c26250f.f104374d;
        boolean z15 = false;
        int iM73440k = c25017f.m73440k(0);
        int[] iArr = c25017f.f97940q0;
        int iM73440k2 = c25017f.m73440k(1);
        int iM73446s = c25017f.m73446s();
        int iM73447t = c25017f.m73447t();
        if (z4 && (iM73440k == 2 || iM73440k2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = z4;
                    break;
                }
                AbstractC26260p abstractC26260p = (AbstractC26260p) it.next();
                if (abstractC26260p.f104410f == i13 && !abstractC26260p.mo77906k()) {
                    z14 = false;
                    break;
                }
            }
            if (i13 == 0) {
                if (z14 && iM73440k == 2) {
                    c25017f.m73425O(1);
                    c25017f.m73429S(c26250f.m77912d(c25017f, 0));
                    c25017f.f97913d.f104409e.mo77918d(c25017f.m73445r());
                }
            } else if (z14 && iM73440k2 == 2) {
                c25017f.m73427Q(1);
                c25017f.m73424N(c26250f.m77912d(c25017f, 1));
                c25017f.f97915e.f104409e.mo77918d(c25017f.m73441l());
            }
        }
        if (i13 == 0) {
            int i14 = iArr[0];
            if (i14 == 1 || i14 == 4) {
                int iM73445r = c25017f.m73445r() + iM73446s;
                c25017f.f97913d.f104413i.mo77918d(iM73445r);
                c25017f.f97913d.f104409e.mo77918d(iM73445r - iM73446s);
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            int i15 = iArr[1];
            if (i15 == 1 || i15 == 4) {
                int iM73441l = c25017f.m73441l() + iM73447t;
                c25017f.f97915e.f104413i.mo77918d(iM73441l);
                c25017f.f97915e.f104409e.mo77918d(iM73441l - iM73447t);
                z13 = true;
            } else {
                z13 = false;
            }
        }
        c26250f.m77915g();
        for (AbstractC26260p abstractC26260p2 : arrayList) {
            if (abstractC26260p2.f104410f == i13 && (abstractC26260p2.f104406b != c25017f || abstractC26260p2.f104411g)) {
                abstractC26260p2.mo77903e();
            }
        }
        for (AbstractC26260p abstractC26260p3 : arrayList) {
            if (abstractC26260p3.f104410f == i13 && (z13 || abstractC26260p3.f104406b != c25017f)) {
                if (!abstractC26260p3.f104412h.f104389j || !abstractC26260p3.f104413i.f104389j || (!(abstractC26260p3 instanceof C26248d) && !abstractC26260p3.f104409e.f104389j)) {
                    c25017f.m73425O(iM73440k);
                    c25017f.m73427Q(iM73440k2);
                    return z15;
                }
            }
        }
        z15 = true;
        c25017f.m73425O(iM73440k);
        c25017f.m73427Q(iM73440k2);
        return z15;
    }

    /* JADX WARN: Code duplicated, block: B:244:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:246:0x040a  */
    /* JADX WARN: Code duplicated, block: B:250:0x0422  */
    /* JADX WARN: Code duplicated, block: B:253:0x0431  */
    /* JADX WARN: Code duplicated, block: B:255:0x043a A[LOOP:14: B:254:0x0438->B:255:0x043a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:264:0x0459 A[LOOP:13: B:263:0x0457->B:264:0x0459, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:276:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:277:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:280:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:281:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:283:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:288:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:296:0x0524  */
    /* JADX WARN: Code duplicated, block: B:298:0x0528  */
    /* JADX WARN: Code duplicated, block: B:299:0x052a  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r26v0, types: [m4.e, m4.f] */
    /* JADX INFO: renamed from: Z */
    public final void m73459Z() {
        C25015d c25015d;
        int i13;
        int i14;
        boolean z4;
        char c3;
        C25015d c25015d2;
        boolean z13;
        boolean[] zArr;
        boolean[] zArr2;
        int i15;
        boolean z14;
        int iMax;
        ?? r15;
        ?? r17;
        boolean z15;
        int iMax2;
        ?? r10;
        boolean z16;
        int i16;
        boolean z17;
        ?? r14;
        ?? r16;
        int i17;
        boolean z18;
        boolean z19;
        boolean z24;
        ?? r18;
        ?? r19;
        int i18;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zM73461c0;
        int size;
        int i19;
        boolean z25;
        C25016e c25016e;
        boolean z26;
        int i24;
        C25015d c25015d3;
        C14051c c14051c = this.f97969x0;
        this.f97906Z = 0;
        this.f97908a0 = 0;
        this.f97955F0 = false;
        this.f97956G0 = false;
        int size2 = this.f97963r0.size();
        int iMax7 = Math.max(0, m73445r());
        int iMax8 = Math.max(0, m73441l());
        int[] iArr = this.f97940q0;
        int i25 = iArr[1];
        int i26 = iArr[0];
        int i27 = this.f97966u0;
        C25015d c25015d4 = this.f97891K;
        C25015d c25015d5 = this.f97890J;
        if (i27 == 0 && AbstractC25022k.m73477c(this.f97954E0, 1)) {
            InterfaceC26247c interfaceC26247c = this.f97967v0;
            int i28 = iArr[0];
            int i29 = iArr[1];
            m73418F();
            ArrayList arrayList = this.f97963r0;
            int size3 = arrayList.size();
            for (int i34 = 0; i34 < size3; i34++) {
                ((C25016e) arrayList.get(i34)).m73418F();
            }
            boolean z27 = this.f97968w0;
            if (i28 == 1) {
                m73422L(0, m73445r());
            } else {
                c25015d5.m73410l(0);
                this.f97906Z = 0;
            }
            int i35 = 0;
            boolean z28 = false;
            boolean z29 = false;
            while (i35 < size3) {
                int i36 = i35;
                C25016e c25016e2 = (C25016e) arrayList.get(i35);
                boolean z34 = z28;
                if (c25016e2 instanceof C25020i) {
                    C25020i c25020i = (C25020i) c25016e2;
                    c25015d3 = c25015d5;
                    if (c25020i.f98019v0 == 1) {
                        int i37 = c25020i.f98016s0;
                        if (i37 != -1) {
                            c25020i.m73470V(i37);
                        } else if (c25020i.f98017t0 != -1 && mo73394B()) {
                            c25020i.m73470V(m73445r() - c25020i.f98017t0);
                        } else if (mo73394B()) {
                            c25020i.m73470V((int) ((c25020i.f98015r0 * m73445r()) + 0.5f));
                        }
                        z34 = true;
                    }
                } else {
                    c25015d3 = c25015d5;
                    if ((c25016e2 instanceof C25013b) && ((C25013b) c25016e2).m73397Z() == 0) {
                        z28 = z34;
                        z29 = true;
                    }
                    i35 = i36 + 1;
                    c25015d5 = c25015d3;
                }
                z28 = z34;
                i35 = i36 + 1;
                c25015d5 = c25015d3;
            }
            c25015d = c25015d5;
            if (z28) {
                for (int i38 = 0; i38 < size3; i38 = i24 + 1) {
                    C25016e c25016e3 = (C25016e) arrayList.get(i38);
                    if (c25016e3 instanceof C25020i) {
                        C25020i c25020i2 = (C25020i) c25016e3;
                        i24 = i38;
                        if (c25020i2.f98019v0 == 1) {
                            AbstractC26253i.m77920b(0, c25020i2, interfaceC26247c, z27);
                        }
                    } else {
                        i24 = i38;
                    }
                }
            }
            AbstractC26253i.m77920b(0, this, interfaceC26247c, z27);
            if (z29) {
                for (int i39 = 0; i39 < size3; i39++) {
                    C25016e c25016e4 = (C25016e) arrayList.get(i39);
                    if (c25016e4 instanceof C25013b) {
                        C25013b c25013b = (C25013b) c25016e4;
                        if (c25013b.m73397Z() == 0 && c25013b.m73396Y()) {
                            AbstractC26253i.m77920b(1, c25013b, interfaceC26247c, z27);
                        }
                    }
                }
            }
            if (i29 == 1) {
                m73423M(0, m73441l());
            } else {
                c25015d4.m73410l(0);
                this.f97908a0 = 0;
            }
            int i44 = 0;
            boolean z35 = false;
            boolean z36 = false;
            while (i44 < size3) {
                C25016e c25016e5 = (C25016e) arrayList.get(i44);
                int i45 = i44;
                if (c25016e5 instanceof C25020i) {
                    C25020i c25020i3 = (C25020i) c25016e5;
                    if (c25020i3.f98019v0 == 0) {
                        int i46 = c25020i3.f98016s0;
                        if (i46 != -1) {
                            c25020i3.m73470V(i46);
                        } else if (c25020i3.f98017t0 != -1 && mo73395C()) {
                            c25020i3.m73470V(m73441l() - c25020i3.f98017t0);
                        } else if (mo73395C()) {
                            c25020i3.m73470V((int) ((c25020i3.f98015r0 * m73441l()) + 0.5f));
                        }
                        z35 = true;
                    }
                } else if ((c25016e5 instanceof C25013b) && ((C25013b) c25016e5).m73397Z() == 1) {
                    z36 = true;
                }
                i44 = i45 + 1;
            }
            if (z35) {
                for (int i47 = 0; i47 < size3; i47++) {
                    C25016e c25016e6 = (C25016e) arrayList.get(i47);
                    if (c25016e6 instanceof C25020i) {
                        C25020i c25020i4 = (C25020i) c25016e6;
                        if (c25020i4.f98019v0 == 0) {
                            AbstractC26253i.m77925g(1, c25020i4, interfaceC26247c);
                        }
                    }
                }
            }
            AbstractC26253i.m77925g(0, this, interfaceC26247c);
            if (z36) {
                for (int i48 = 0; i48 < size3; i48++) {
                    C25016e c25016e7 = (C25016e) arrayList.get(i48);
                    if (c25016e7 instanceof C25013b) {
                        C25013b c25013b2 = (C25013b) c25016e7;
                        if (c25013b2.m73397Z() == 1 && c25013b2.m73396Y()) {
                            AbstractC26253i.m77925g(1, c25013b2, interfaceC26247c);
                        }
                    }
                }
            }
            for (int i49 = 0; i49 < size3; i49++) {
                C25016e c25016e8 = (C25016e) arrayList.get(i49);
                if (c25016e8.m73415A() && AbstractC26253i.m77919a(c25016e8)) {
                    m73454b0(c25016e8, interfaceC26247c, AbstractC26253i.f104393a);
                    if (!(c25016e8 instanceof C25020i)) {
                        AbstractC26253i.m77920b(0, c25016e8, interfaceC26247c, z27);
                        AbstractC26253i.m77925g(0, c25016e8, interfaceC26247c);
                    } else if (((C25020i) c25016e8).f98019v0 == 0) {
                        AbstractC26253i.m77925g(0, c25016e8, interfaceC26247c);
                    } else {
                        AbstractC26253i.m77920b(0, c25016e8, interfaceC26247c, z27);
                    }
                }
            }
            for (int i54 = 0; i54 < size2; i54++) {
                C25016e c25016e9 = (C25016e) this.f97963r0.get(i54);
                if (c25016e9.m73415A() && !(c25016e9 instanceof C25020i) && !(c25016e9 instanceof C25013b) && !(c25016e9 instanceof AbstractC25023l) && !c25016e9.f97887G) {
                    int iM73440k = c25016e9.m73440k(0);
                    int iM73440k2 = c25016e9.m73440k(1);
                    if (iM73440k != 3 || c25016e9.f97942s == 1 || iM73440k2 != 3 || c25016e9.f97943t == 1) {
                        m73454b0(c25016e9, this.f97967v0, new C26246b());
                    }
                }
            }
        } else {
            c25015d = c25015d5;
        }
        int i55 = 2;
        if (size2 <= 2 || !((i26 == 2 || i25 == 2) && AbstractC25022k.m73477c(this.f97954E0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) && AbstractC35785b.m113399V(this, this.f97967v0))) {
            i13 = iMax8;
            i14 = iMax7;
            z4 = false;
        } else {
            if (i26 == 2) {
                if (iMax7 >= m73445r() || iMax7 <= 0) {
                    iMax7 = m73445r();
                } else {
                    m73429S(iMax7);
                    this.f97955F0 = true;
                }
            }
            if (i25 == 2) {
                if (iMax8 >= m73441l() || iMax8 <= 0) {
                    iMax8 = m73441l();
                } else {
                    m73424N(iMax8);
                    this.f97956G0 = true;
                }
            }
            i13 = iMax8;
            i14 = iMax7;
            z4 = true;
        }
        boolean z37 = m73461c0(64) || m73461c0(128);
        c14051c.getClass();
        c14051c.f50161h = false;
        if (this.f97954E0 == 0 || !z37) {
            c3 = 1;
        } else {
            c3 = 1;
            c14051c.f50161h = true;
        }
        ArrayList arrayList2 = this.f97963r0;
        boolean z38 = iArr[0] == 2 || iArr[c3] == 2;
        this.f97950A0 = 0;
        this.f97951B0 = 0;
        for (int i56 = 0; i56 < size2; i56++) {
            C25016e c25016e10 = (C25016e) this.f97963r0.get(i56);
            if (c25016e10 instanceof C25017f) {
                ((C25017f) c25016e10).m73459Z();
            }
        }
        boolean zM73461c1 = m73461c0(64);
        ?? r110 = z4;
        int i57 = 0;
        boolean z39 = true;
        while (z39) {
            int i58 = i55;
            int i59 = i57 + 1;
            try {
                c14051c.m40013t();
                this.f97950A0 = 0;
                this.f97951B0 = 0;
                m73437h(c14051c);
                for (int i64 = 0; i64 < size2; i64++) {
                    ((C25016e) this.f97963r0.get(i64)).m73437h(c14051c);
                }
                m73457X(c14051c);
                try {
                    WeakReference weakReference = this.f97957H0;
                    if (weakReference == null || weakReference.get() == null) {
                        c25015d2 = c25015d4;
                    } else {
                        c25015d2 = c25015d4;
                        try {
                            c14051c.m40000f(c14051c.m40005k((C25015d) this.f97957H0.get()), c14051c.m40005k(c25015d4), 0, 5);
                            this.f97957H0 = null;
                        } catch (Exception e5) {
                            e = e5;
                            z26 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            z13 = z26;
                            zArr = AbstractC25022k.f98023a;
                            if (z13) {
                                zArr[i58] = false;
                                zM73461c0 = m73461c0(64);
                                mo73431U(c14051c, zM73461c0);
                                size = this.f97963r0.size();
                                i19 = 0;
                                z25 = false;
                                while (i19 < size) {
                                    c25016e = (C25016e) this.f97963r0.get(i19);
                                    c25016e.mo73431U(c14051c, zM73461c0);
                                    boolean[] zArr3 = zArr;
                                    boolean z44 = zM73461c0;
                                    if (c25016e.f97921h == -1) {
                                        z25 = true;
                                    } else {
                                        z25 = true;
                                    }
                                    i19++;
                                    zArr = zArr3;
                                    zM73461c0 = z44;
                                    z25 = z25;
                                }
                                zArr2 = zArr;
                                z14 = z25;
                            } else {
                                zArr2 = zArr;
                                mo73431U(c14051c, zM73461c1);
                                for (i15 = 0; i15 < size2; i15++) {
                                    ((C25016e) this.f97963r0.get(i15)).mo73431U(c14051c, zM73461c1);
                                }
                                z14 = false;
                            }
                            if (z38 != 0) {
                                iMax3 = 0;
                                iMax4 = 0;
                                for (i18 = 0; i18 < size2; i18++) {
                                    C25016e c25016e11 = (C25016e) this.f97963r0.get(i18);
                                    iMax3 = Math.max(iMax3, c25016e11.m73445r() + c25016e11.f97906Z);
                                    iMax4 = Math.max(iMax4, c25016e11.m73441l() + c25016e11.f97908a0);
                                }
                                iMax5 = Math.max(this.f97912c0, iMax3);
                                iMax6 = Math.max(this.f97914d0, iMax4);
                                r110 = r110;
                                z14 = z14;
                                if (i26 == i58) {
                                    r110 = r110;
                                    z14 = z14;
                                    m73429S(iMax5);
                                    iArr[0] = i58;
                                    r110 = 1;
                                    z14 = true;
                                }
                                if (i25 == i58) {
                                    m73424N(iMax6);
                                    iArr[1] = i58;
                                    r110 = 1;
                                    z14 = true;
                                }
                            }
                            iMax = Math.max(this.f97912c0, m73445r());
                            if (iMax > m73445r()) {
                                m73429S(iMax);
                                r15 = 1;
                                iArr[0] = 1;
                                r17 = 1;
                                z15 = true;
                            } else {
                                r15 = 1;
                                r17 = r110;
                                z15 = z14;
                            }
                            iMax2 = Math.max(this.f97914d0, m73441l());
                            if (iMax2 > m73441l()) {
                                m73424N(iMax2);
                                iArr[r15] = r15;
                                r19 = r15;
                                z16 = r19 == true ? 1 : 0;
                            } else {
                                r10 = r17;
                            }
                            if (r10 == 0) {
                                z16 = z15;
                                if (iArr[0] == 2) {
                                    r18 = r10;
                                    z24 = z16;
                                    if (m73445r() > i14) {
                                        this.f97955F0 = r15;
                                        iArr[0] = r15;
                                        m73429S(i14);
                                        ?? r24 = r15;
                                        z24 = r24 == true ? 1 : 0;
                                        r18 = r24;
                                    }
                                }
                                r10 = r19;
                                r18 = r10;
                                r18 = r10;
                                z24 = z16;
                                z24 = z16;
                                i16 = 2;
                                r14 = r18;
                                r14 = r18;
                                z17 = z24;
                                z17 = z24;
                                if (iArr[r15] != 2) {
                                }
                                if (i59 > i17) {
                                    r14 = r18;
                                    z17 = z24;
                                    z19 = false;
                                } else {
                                    r14 = r18;
                                    z17 = z24;
                                    z19 = z18;
                                }
                                i57 = i59;
                                i55 = i16;
                                z38 = z38;
                                c25015d4 = c25015d2;
                                r110 = r16;
                                z39 = z19;
                            } else {
                                z16 = z15;
                                r10 = r19;
                                i16 = 2;
                                r14 = r10;
                                z17 = z16;
                            }
                            r14 = r18;
                            z17 = z24;
                            r16 = r14;
                            i17 = 8;
                            z18 = z17;
                            if (i59 > i17) {
                                r14 = r18;
                                z17 = z24;
                                z19 = false;
                            } else {
                                r14 = r18;
                                z17 = z24;
                                z19 = z18;
                            }
                            i57 = i59;
                            i55 = i16;
                            z38 = z38;
                            c25015d4 = c25015d2;
                            r110 = r16;
                            z39 = z19;
                        }
                    }
                    WeakReference weakReference2 = this.f97959J0;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        c14051c.m40000f(c14051c.m40005k(this.f97893M), c14051c.m40005k((C25015d) this.f97959J0.get()), 0, 5);
                        this.f97959J0 = null;
                    }
                    WeakReference weakReference3 = this.f97958I0;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        C25015d c25015d6 = c25015d;
                        try {
                            c25015d = c25015d6;
                            c14051c.m40000f(c14051c.m40005k((C25015d) this.f97958I0.get()), c14051c.m40005k(c25015d6), 0, 5);
                            this.f97958I0 = null;
                        } catch (Exception e13) {
                            e = e13;
                            c25015d = c25015d6;
                            z26 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            z13 = z26;
                        }
                    }
                    WeakReference weakReference4 = this.f97960K0;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        c14051c.m40000f(c14051c.m40005k(this.f97892L), c14051c.m40005k((C25015d) this.f97960K0.get()), 0, 5);
                        this.f97960K0 = null;
                    }
                    c14051c.m40009p();
                    z13 = true;
                } catch (Exception e14) {
                    e = e14;
                    c25015d2 = c25015d4;
                }
            } catch (Exception e15) {
                e = e15;
                c25015d2 = c25015d4;
                z26 = z39;
            }
            zArr = AbstractC25022k.f98023a;
            if (z13) {
                zArr[i58] = false;
                zM73461c0 = m73461c0(64);
                mo73431U(c14051c, zM73461c0);
                size = this.f97963r0.size();
                i19 = 0;
                z25 = false;
                while (i19 < size) {
                    c25016e = (C25016e) this.f97963r0.get(i19);
                    c25016e.mo73431U(c14051c, zM73461c0);
                    boolean[] zArr4 = zArr;
                    boolean z45 = zM73461c0;
                    if (c25016e.f97921h == -1 || c25016e.f97923i != -1) {
                        z25 = true;
                    }
                    i19++;
                    zArr = zArr4;
                    zM73461c0 = z45;
                    z25 = z25;
                }
                zArr2 = zArr;
                z14 = z25;
            } else {
                zArr2 = zArr;
                mo73431U(c14051c, zM73461c1);
                while (i15 < size2) {
                    ((C25016e) this.f97963r0.get(i15)).mo73431U(c14051c, zM73461c1);
                }
                z14 = false;
            }
            if (z38 != 0 && i59 < 8 && zArr2[i58]) {
                iMax3 = 0;
                iMax4 = 0;
                while (i18 < size2) {
                    C25016e c25016e12 = (C25016e) this.f97963r0.get(i18);
                    iMax3 = Math.max(iMax3, c25016e12.m73445r() + c25016e12.f97906Z);
                    iMax4 = Math.max(iMax4, c25016e12.m73441l() + c25016e12.f97908a0);
                }
                iMax5 = Math.max(this.f97912c0, iMax3);
                iMax6 = Math.max(this.f97914d0, iMax4);
                r110 = r110;
                z14 = z14;
                if (i26 == i58 && m73445r() < iMax5) {
                    r110 = r110;
                    z14 = z14;
                    m73429S(iMax5);
                    iArr[0] = i58;
                    r110 = 1;
                    z14 = true;
                }
                if (i25 == i58 && m73441l() < iMax6) {
                    m73424N(iMax6);
                    iArr[1] = i58;
                    r110 = 1;
                    z14 = true;
                }
            }
            iMax = Math.max(this.f97912c0, m73445r());
            if (iMax > m73445r()) {
                m73429S(iMax);
                r15 = 1;
                iArr[0] = 1;
                r17 = 1;
                z15 = true;
            } else {
                r15 = 1;
                r17 = r110;
                z15 = z14;
            }
            iMax2 = Math.max(this.f97914d0, m73441l());
            if (iMax2 > m73441l()) {
                m73424N(iMax2);
                iArr[r15] = r15;
                r19 = r15;
                z16 = r19 == true ? 1 : 0;
            } else {
                r10 = r17;
            }
            if (r10 == 0) {
                z16 = z15;
                if (iArr[0] == 2 && i14 > 0) {
                    r18 = r10;
                    z24 = z16;
                    if (m73445r() > i14) {
                        this.f97955F0 = r15;
                        iArr[0] = r15;
                        m73429S(i14);
                        ?? r25 = r15;
                        z24 = r25 == true ? 1 : 0;
                        r18 = r25;
                    }
                }
                r10 = r19;
                r18 = r10;
                r18 = r10;
                z24 = z16;
                z24 = z16;
                i16 = 2;
                r14 = r18;
                r14 = r18;
                z17 = z24;
                z17 = z24;
                if (iArr[r15] != 2 && i13 > 0 && m73441l() > i13) {
                    this.f97956G0 = r15;
                    iArr[r15] = r15;
                    m73424N(i13);
                    i17 = 8;
                    r16 = 1;
                    z18 = true;
                }
                if (i59 > i17) {
                    r14 = r18;
                    z17 = z24;
                    z19 = false;
                } else {
                    r14 = r18;
                    z17 = z24;
                    z19 = z18;
                }
                i57 = i59;
                i55 = i16;
                z38 = z38;
                c25015d4 = c25015d2;
                r110 = r16;
                z39 = z19;
            } else {
                z16 = z15;
                r10 = r19;
                i16 = 2;
                r14 = r10;
                z17 = z16;
            }
            r14 = r18;
            z17 = z24;
            r16 = r14;
            i17 = 8;
            z18 = z17;
            if (i59 > i17) {
                r14 = r18;
                z17 = z24;
                z19 = false;
            } else {
                r14 = r18;
                z17 = z24;
                z19 = z18;
            }
            i57 = i59;
            i55 = i16;
            z38 = z38;
            c25015d4 = c25015d2;
            r110 = r16;
            z39 = z19;
        }
        this.f97963r0 = arrayList2;
        if (r110 != 0) {
            iArr[0] = i26;
            iArr[1] = i25;
        }
        mo73419G(c14051c.f50166m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX INFO: renamed from: a0 */
    public final void m73460a0(int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        char c3;
        ?? r10;
        int i24;
        InterfaceC26247c interfaceC26247c;
        int i25;
        int i26;
        boolean zM73458Y;
        int i27;
        int i28;
        ArrayList arrayList;
        InterfaceC26247c interfaceC26247c2;
        int i29;
        int i34;
        InterfaceC26247c interfaceC26247c3;
        int i35;
        int i36;
        C26256l c26256l;
        C26258n c26258n;
        ?? r14;
        int i37;
        int i38;
        int i39;
        int i44;
        char c7;
        boolean z4;
        ?? r15;
        this.f97970y0 = i18;
        this.f97971z0 = i19;
        C0237p c0237p = this.f97964s0;
        C25017f c25017f = (C25017f) c0237p.f814z;
        ArrayList arrayList2 = (ArrayList) c0237p.f812x;
        InterfaceC26247c interfaceC26247c4 = this.f97967v0;
        C26250f c26250f = this.f97965t0;
        int size = this.f97963r0.size();
        int iM73445r = m73445r();
        int iM73441l = m73441l();
        boolean zM73477c = AbstractC25022k.m73477c(i13, 128);
        boolean z13 = zM73477c || AbstractC25022k.m73477c(i13, 64);
        boolean z14 = false;
        if (z13) {
            int i45 = 0;
            while (true) {
                if (i45 < size) {
                    c3 = 1;
                    C25016e c25016e = (C25016e) this.f97963r0.get(i45);
                    boolean z15 = z13;
                    int[] iArr = c25016e.f97940q0;
                    boolean z16 = (iArr[0] == 3) && (iArr[1] == 3) && c25016e.f97904X > 0.0f;
                    if ((c25016e.m73452y() && z16) || ((c25016e.m73453z() && z16) || (c25016e instanceof AbstractC25023l) || c25016e.m73452y() || c25016e.m73453z())) {
                        r10 = 0;
                    } else {
                        i45++;
                        z13 = z15;
                    }
                } else {
                    c3 = 1;
                    r10 = z13;
                }
            }
        } else {
            c3 = 1;
            r10 = z13;
        }
        int i46 = r10 & (((i14 == 1073741824 && i16 == 1073741824) || zM73477c) ? c3 : (char) 0);
        if (i46 != 0) {
            int[] iArr2 = this.f97884D;
            int iMin = Math.min(iArr2[0], i15);
            int iMin2 = Math.min(iArr2[c3], i17);
            int i47 = 1073741824;
            if (i14 == 1073741824) {
                if (m73445r() != iMin) {
                    m73429S(iMin);
                    ?? r16 = c3;
                    c26250f.f104372b = r16;
                    r15 = r16;
                } else {
                    r15 = c3;
                }
                i47 = 1073741824;
                r14 = r15;
            } else {
                r14 = c3;
            }
            if (i16 == i47) {
                if (m73441l() != iMin2) {
                    m73424N(iMin2);
                    c26250f.f104372b = r14;
                }
                i47 = 1073741824;
            }
            if (i14 == i47 && i16 == i47) {
                ArrayList<AbstractC26260p> arrayList3 = (ArrayList) c26250f.f104376f;
                C25017f c25017f2 = (C25017f) c26250f.f104374d;
                if (c26250f.f104372b || c26250f.f104373c) {
                    int i48 = i46;
                    for (C25016e c25016e2 : c25017f2.f97963r0) {
                        int i49 = i48;
                        c25016e2.m73438i();
                        c25016e2.f97907a = z14;
                        c25016e2.f97913d.m77929n();
                        c25016e2.f97915e.m77934m();
                        size = size;
                        i48 = i49;
                        z14 = false;
                    }
                    i24 = i48;
                    i25 = size;
                    c25017f2.m73438i();
                    i39 = 0;
                    c25017f2.f97907a = false;
                    c25017f2.f97913d.m77929n();
                    c25017f2.f97915e.m77934m();
                    c26250f.f104373c = false;
                } else {
                    i24 = i46;
                    i25 = size;
                    i39 = 0;
                }
                c26250f.m77910b((C25017f) c26250f.f104375e);
                c25017f2.f97906Z = i39;
                int[] iArr3 = c25017f2.f97940q0;
                c25017f2.f97908a0 = i39;
                int iM73440k = c25017f2.m73440k(i39);
                int iM73440k2 = c25017f2.m73440k(1);
                if (c26250f.f104372b) {
                    c26250f.m77911c();
                }
                int iM73446s = c25017f2.m73446s();
                int iM73447t = c25017f2.m73447t();
                interfaceC26247c = interfaceC26247c4;
                c25017f2.f97913d.f104412h.mo77918d(iM73446s);
                c25017f2.f97915e.f104412h.mo77918d(iM73447t);
                c26250f.m77915g();
                if (iM73440k == 2 || iM73440k2 == 2) {
                    if (zM73477c) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            if (!((AbstractC26260p) it.next()).mo77906k()) {
                                zM73477c = false;
                                break;
                            }
                        }
                    }
                    if (zM73477c && iM73440k == 2) {
                        c25017f2.m73425O(1);
                        c25017f2.m73429S(c26250f.m77912d(c25017f2, 0));
                        c25017f2.f97913d.f104409e.mo77918d(c25017f2.m73445r());
                    }
                    if (zM73477c && iM73440k2 == 2) {
                        i44 = 1;
                        c25017f2.m73427Q(1);
                        c25017f2.m73424N(c26250f.m77912d(c25017f2, 1));
                        c25017f2.f97915e.f104409e.mo77918d(c25017f2.m73441l());
                    } else {
                        i44 = 1;
                    }
                    c7 = 0;
                } else {
                    iM73446s = iM73446s;
                    c7 = 0;
                    i44 = 1;
                }
                int i54 = iArr3[c7];
                if (i54 == i44 || i54 == 4) {
                    int iM73445r2 = c25017f2.m73445r() + iM73446s;
                    c25017f2.f97913d.f104413i.mo77918d(iM73445r2);
                    c25017f2.f97913d.f104409e.mo77918d(iM73445r2 - iM73446s);
                    c26250f.m77915g();
                    int i55 = iArr3[1];
                    if (i55 == 1 || i55 == 4) {
                        int iM73441l2 = c25017f2.m73441l() + iM73447t;
                        c25017f2.f97915e.f104413i.mo77918d(iM73441l2);
                        c25017f2.f97915e.f104409e.mo77918d(iM73441l2 - iM73447t);
                    }
                    c26250f.m77915g();
                    z4 = true;
                } else {
                    z4 = false;
                }
                for (AbstractC26260p abstractC26260p : arrayList3) {
                    if (abstractC26260p.f104406b != c25017f2 || abstractC26260p.f104411g) {
                        abstractC26260p.mo77903e();
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        zM73458Y = true;
                        break;
                    }
                    AbstractC26260p abstractC26260p2 = (AbstractC26260p) it3.next();
                    if (z4 || abstractC26260p2.f104406b != c25017f2) {
                        if (!abstractC26260p2.f104412h.f104389j || ((!abstractC26260p2.f104413i.f104389j && !(abstractC26260p2 instanceof C26254j)) || (!abstractC26260p2.f104409e.f104389j && !(abstractC26260p2 instanceof C26248d) && !(abstractC26260p2 instanceof C26254j)))) {
                            zM73458Y = false;
                            break;
                        }
                    }
                }
                c25017f2.m73425O(iM73440k);
                c25017f2.m73427Q(iM73440k2);
                i26 = 2;
                i38 = 1073741824;
            } else {
                i24 = i46;
                interfaceC26247c = interfaceC26247c4;
                i25 = size;
                C25017f c25017f3 = (C25017f) c26250f.f104374d;
                if (c26250f.f104372b) {
                    for (C25016e c25016e3 : c25017f3.f97963r0) {
                        c25016e3.m73438i();
                        c25016e3.f97907a = false;
                        C26256l c26256l2 = c25016e3.f97913d;
                        c26256l2.f104409e.f104389j = false;
                        c26256l2.f104411g = false;
                        c26256l2.m77929n();
                        C26258n c26258n2 = c25016e3.f97915e;
                        c26258n2.f104409e.f104389j = false;
                        c26258n2.f104411g = false;
                        c26258n2.m77934m();
                    }
                    i37 = 0;
                    c25017f3.m73438i();
                    c25017f3.f97907a = false;
                    C26256l c26256l3 = c25017f3.f97913d;
                    c26256l3.f104409e.f104389j = false;
                    c26256l3.f104411g = false;
                    c26256l3.m77929n();
                    C26258n c26258n3 = c25017f3.f97915e;
                    c26258n3.f104409e.f104389j = false;
                    c26258n3.f104411g = false;
                    c26258n3.m77934m();
                    c26250f.m77911c();
                } else {
                    i37 = 0;
                }
                c26250f.m77910b((C25017f) c26250f.f104375e);
                c25017f3.f97906Z = i37;
                c25017f3.f97908a0 = i37;
                c25017f3.f97913d.f104412h.mo77918d(i37);
                c25017f3.f97915e.f104412h.mo77918d(i37);
                i38 = 1073741824;
                if (i14 == 1073741824) {
                    zM73458Y = m73458Y(i37, zM73477c);
                    i26 = 1;
                } else {
                    i26 = 0;
                    zM73458Y = true;
                }
                if (i16 == 1073741824) {
                    zM73458Y &= m73458Y(1, zM73477c);
                    i26++;
                }
            }
            if (zM73458Y) {
                mo73430T(i14 == i38, i16 == i38);
            }
        } else {
            i24 = i46;
            interfaceC26247c = interfaceC26247c4;
            i25 = size;
            i26 = 0;
            zM73458Y = false;
        }
        if (zM73458Y && i26 == 2) {
            return;
        }
        int i56 = this.f97954E0;
        if (i25 > 0) {
            int size2 = this.f97963r0.size();
            boolean zM73461c0 = m73461c0(64);
            InterfaceC26247c interfaceC26247c5 = this.f97967v0;
            int i57 = 0;
            while (i57 < size2) {
                C25016e c25016e4 = (C25016e) this.f97963r0.get(i57);
                if ((c25016e4 instanceof C25020i) || (c25016e4 instanceof C25013b) || c25016e4.f97887G || (zM73461c0 && (c26256l = c25016e4.f97913d) != null && (c26258n = c25016e4.f97915e) != null && c26256l.f104409e.f104389j && c26258n.f104409e.f104389j)) {
                    i36 = size2;
                } else {
                    int iM73440k3 = c25016e4.m73440k(0);
                    int iM73440k4 = c25016e4.m73440k(1);
                    i36 = size2;
                    boolean z17 = iM73440k3 == 3 && c25016e4.f97942s != 1 && iM73440k4 == 3 && c25016e4.f97943t != 1;
                    if (!z17 && m73461c0(1) && !(c25016e4 instanceof AbstractC25023l)) {
                        if (iM73440k3 == 3 && c25016e4.f97942s == 0 && iM73440k4 != 3 && !c25016e4.m73452y()) {
                            z17 = true;
                        }
                        if (iM73440k4 == 3 && c25016e4.f97943t == 0 && iM73440k3 != 3 && !c25016e4.m73452y()) {
                            z17 = true;
                        }
                        if ((iM73440k3 == 3 || iM73440k4 == 3) && c25016e4.f97904X > 0.0f) {
                            z17 = true;
                        }
                    }
                    if (!z17) {
                        c0237p.m675F(0, c25016e4, interfaceC26247c5);
                    }
                }
                i57++;
                size2 = i36;
            }
            i27 = 0;
            interfaceC26247c5.mo3625b();
        } else {
            i27 = 0;
        }
        c0237p.m696a0(this);
        int size3 = arrayList2.size();
        if (i25 > 0) {
            c0237p.m693X(this, i27, iM73445r, iM73441l);
        }
        if (size3 > 0) {
            int[] iArr4 = this.f97940q0;
            int i58 = iArr4[i27] == 2 ? 1 : i27;
            int i59 = iArr4[1] == 2 ? 1 : i27;
            int iMax = Math.max(m73445r(), c25017f.f97912c0);
            int iMax2 = Math.max(m73441l(), c25017f.f97914d0);
            int i64 = i27;
            int i65 = i64;
            while (i64 < size3) {
                C25016e c25016e5 = (C25016e) arrayList2.get(i64);
                if (c25016e5 instanceof AbstractC25023l) {
                    int iM73445r3 = c25016e5.m73445r();
                    int iM73441l3 = c25016e5.m73441l();
                    i29 = i59;
                    i34 = i58;
                    interfaceC26247c3 = interfaceC26247c;
                    int i66 = i65 | (c0237p.m675F(1, c25016e5, interfaceC26247c3) ? 1 : 0);
                    int iM73445r4 = c25016e5.m73445r();
                    int iM73441l4 = c25016e5.m73441l();
                    if (iM73445r4 != iM73445r3) {
                        c25016e5.m73429S(iM73445r4);
                        if (i34 != 0 && c25016e5.m73446s() + c25016e5.f97902V > iMax) {
                            iMax = Math.max(iMax, c25016e5.mo73439j(4).m73403e() + c25016e5.m73446s() + c25016e5.f97902V);
                        }
                        i35 = 1;
                    } else {
                        i35 = i66;
                    }
                    if (iM73441l4 != iM73441l3) {
                        c25016e5.m73424N(iM73441l4);
                        if (i29 != 0 && c25016e5.m73447t() + c25016e5.f97903W > iMax2) {
                            iMax2 = Math.max(iMax2, c25016e5.mo73439j(5).m73403e() + c25016e5.m73447t() + c25016e5.f97903W);
                        }
                        i35 = 1;
                    }
                    i65 = (((AbstractC25023l) c25016e5).f98034z0 ? 1 : 0) | i35;
                } else {
                    i29 = i59;
                    i34 = i58;
                    interfaceC26247c3 = interfaceC26247c;
                }
                i64++;
                i58 = i34;
                interfaceC26247c = interfaceC26247c3;
                i59 = i29;
            }
            int i67 = i59;
            int i68 = i58;
            int i69 = 0;
            while (true) {
                InterfaceC26247c interfaceC26247c6 = interfaceC26247c;
                if (i69 >= 2) {
                    break;
                }
                int i74 = i65;
                int i75 = 0;
                while (i75 < size3) {
                    C25016e c25016e6 = (C25016e) arrayList2.get(i75);
                    if (((c25016e6 instanceof AbstractC25021j) && !(c25016e6 instanceof AbstractC25023l)) || (c25016e6 instanceof C25020i) || c25016e6.f97922h0 == 8 || ((i24 != 0 && c25016e6.f97913d.f104409e.f104389j && c25016e6.f97915e.f104409e.f104389j) || (c25016e6 instanceof AbstractC25023l))) {
                        i28 = size3;
                        interfaceC26247c2 = interfaceC26247c6;
                        arrayList = arrayList2;
                    } else {
                        int iM73445r5 = c25016e6.m73445r();
                        int iM73441l5 = c25016e6.m73441l();
                        i28 = size3;
                        int i76 = c25016e6.f97910b0;
                        arrayList = arrayList2;
                        i74 |= c0237p.m675F(i69 == 1 ? 2 : 1, c25016e6, interfaceC26247c6) ? 1 : 0;
                        int iM73445r6 = c25016e6.m73445r();
                        interfaceC26247c2 = interfaceC26247c6;
                        int iM73441l6 = c25016e6.m73441l();
                        if (iM73445r6 != iM73445r5) {
                            c25016e6.m73429S(iM73445r6);
                            if (i68 != 0 && c25016e6.m73446s() + c25016e6.f97902V > iMax) {
                                iMax = Math.max(iMax, c25016e6.mo73439j(4).m73403e() + c25016e6.m73446s() + c25016e6.f97902V);
                            }
                            i74 = 1;
                        }
                        if (iM73441l6 != iM73441l5) {
                            c25016e6.m73424N(iM73441l6);
                            if (i67 != 0 && c25016e6.m73447t() + c25016e6.f97903W > iMax2) {
                                iMax2 = Math.max(iMax2, c25016e6.mo73439j(5).m73403e() + c25016e6.m73447t() + c25016e6.f97903W);
                            }
                            i74 = 1;
                        }
                        if (c25016e6.f97886F && i76 != c25016e6.f97910b0) {
                            i74 = 1;
                        }
                    }
                    i75++;
                    size3 = i28;
                    arrayList2 = arrayList;
                    interfaceC26247c6 = interfaceC26247c2;
                }
                int i77 = size3;
                interfaceC26247c = interfaceC26247c6;
                ArrayList arrayList4 = arrayList2;
                if (i74 == 0) {
                    break;
                }
                i69++;
                c0237p.m693X(this, i69, iM73445r, iM73441l);
                size3 = i77;
                arrayList2 = arrayList4;
                i65 = 0;
            }
        }
        this.f97954E0 = i56;
        C14051c.f50153q = m73461c0(512);
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m73461c0(int i13) {
        return (this.f97954E0 & i13) == i13;
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: o */
    public final void mo73444o(StringBuilder sb4) {
        sb4.append(this.f97927k + ":{\n");
        StringBuilder sb5 = new StringBuilder("  actualWidth:");
        sb5.append(this.f97902V);
        sb4.append(sb5.toString());
        sb4.append("\n");
        sb4.append("  actualHeight:" + this.f97903W);
        sb4.append("\n");
        Iterator it = this.f97963r0.iterator();
        while (it.hasNext()) {
            ((C25016e) it.next()).mo73444o(sb4);
            sb4.append(",\n");
        }
        sb4.append("}");
    }
}
