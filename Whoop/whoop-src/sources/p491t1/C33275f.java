package p491t1;

import d93.InterfaceC11821b;
import f93.C14289a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import m83.AbstractC25248h;
import m83.AbstractC25260n;
import p002a0.C0030i1;
import p390p1.AbstractC28657q1;
import p569w1.C36688b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import v63.AbstractC35744b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: t1.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C33275f extends AbstractC25248h implements Collection, InterfaceC11821b {

    /* JADX INFO: renamed from: E */
    public C36688b f138731E = new C36688b();

    /* JADX INFO: renamed from: F */
    public Object[] f138732F;

    /* JADX INFO: renamed from: G */
    public Object[] f138733G;

    /* JADX INFO: renamed from: H */
    public int f138734H;

    /* JADX INFO: renamed from: w */
    public AbstractC33272c f138735w;

    /* JADX INFO: renamed from: x */
    public Object[] f138736x;

    /* JADX INFO: renamed from: y */
    public Object[] f138737y;

    /* JADX INFO: renamed from: z */
    public int f138738z;

    public C33275f(AbstractC33272c abstractC33272c, Object[] objArr, Object[] objArr2, int i13) {
        this.f138735w = abstractC33272c;
        this.f138736x = objArr;
        this.f138737y = objArr2;
        this.f138738z = i13;
        this.f138732F = objArr;
        this.f138733G = objArr2;
        this.f138734H = abstractC33272c.mo73980a();
    }

    /* JADX INFO: renamed from: e */
    public static void m105567e(Object[] objArr, int i13, Iterator it) {
        while (i13 < 32 && it.hasNext()) {
            objArr[i13] = it.next();
            i13++;
        }
    }

    /* JADX INFO: renamed from: A */
    public final Object[] m105568A(Object[] objArr, int i13, Object[][] objArr2) {
        C0030i1 c0030i1M65777h = AbstractC22681m0.m65777h(objArr2);
        int i14 = i13 >> 5;
        int i15 = this.f138738z;
        Object[] objArrM105595z = i14 < (1 << i15) ? m105595z(objArr, i13, i15, c0030i1M65777h) : m105588p(objArr);
        while (c0030i1M65777h.hasNext()) {
            this.f138738z += 5;
            objArrM105595z = m105591t(objArrM105595z);
            int i16 = this.f138738z;
            m105595z(objArrM105595z, 1 << i16, i16, c0030i1M65777h);
        }
        return objArrM105595z;
    }

    /* JADX INFO: renamed from: B */
    public final void m105569B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i13 = this.f138734H;
        int i14 = i13 >> 5;
        int i15 = this.f138738z;
        if (i14 > (1 << i15)) {
            this.f138732F = m105570D(this.f138738z + 5, m105591t(objArr), objArr2);
            this.f138733G = objArr3;
            this.f138738z += 5;
            this.f138734H++;
            return;
        }
        if (objArr == null) {
            this.f138732F = objArr2;
            this.f138733G = objArr3;
            this.f138734H = i13 + 1;
        } else {
            this.f138732F = m105570D(i15, objArr, objArr2);
            this.f138733G = objArr3;
            this.f138734H++;
        }
    }

    /* JADX INFO: renamed from: D */
    public final Object[] m105570D(int i13, Object[] objArr, Object[] objArr2) {
        int iM118955G = AbstractC37056f.m118955G(mo74007a() - 1, i13);
        Object[] objArrM105588p = m105588p(objArr);
        if (i13 == 5) {
            objArrM105588p[iM118955G] = objArr2;
            return objArrM105588p;
        }
        objArrM105588p[iM118955G] = m105570D(i13 - 5, (Object[]) objArrM105588p[iM118955G], objArr2);
        return objArrM105588p;
    }

    /* JADX INFO: renamed from: E */
    public final int m105571E(Function1 function1, Object[] objArr, int i13, int i14, C14289a c14289a, ArrayList arrayList, ArrayList arrayList2) {
        if (m105586n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c14289a.f52186x;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM105590r = objArr2;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj2 = objArr[i15];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i14 == 32) {
                    objArrM105590r = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m105590r();
                    i14 = 0;
                }
                objArrM105590r[i14] = obj2;
                i14++;
            }
        }
        c14289a.f52186x = objArrM105590r;
        if (objArr2 != objArrM105590r) {
            arrayList2.add(objArr2);
        }
        return i14;
    }

    /* JADX INFO: renamed from: F */
    public final int m105572F(Function1 function1, Object[] objArr, int i13, C14289a c14289a) {
        Object[] objArrM105588p = objArr;
        int i14 = i13;
        boolean z4 = false;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj = objArr[i15];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z4) {
                    objArrM105588p = m105588p(objArr);
                    z4 = true;
                    i14 = i15;
                }
            } else if (z4) {
                objArrM105588p[i14] = obj;
                i14++;
            }
        }
        c14289a.f52186x = objArrM105588p;
        return i14;
    }

    /* JADX INFO: renamed from: G */
    public final int m105573G(Function1 function1, int i13, C14289a c14289a) {
        int iM105572F = m105572F(function1, this.f138733G, i13, c14289a);
        if (iM105572F == i13) {
            return i13;
        }
        Object obj = c14289a.f52186x;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM105572F, i13, (Object) null);
        this.f138733G = objArr;
        this.f138734H -= i13 - iM105572F;
        return iM105572F;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m105574I(Function1 function1) {
        Object[] objArrM105595z;
        int i13;
        Function1 function2 = function1;
        int iM105580P = m105580P();
        Object[] objArrM105592u = null;
        C14289a c14289a = new C14289a(objArrM105592u, 4);
        boolean z4 = false;
        if (this.f138732F != null) {
            AbstractC33270a abstractC33270aM105587o = m105587o(0);
            int iM105572F = 32;
            while (iM105572F == 32 && abstractC33270aM105587o.hasNext()) {
                iM105572F = m105572F(function2, (Object[]) abstractC33270aM105587o.next(), 32, c14289a);
            }
            if (iM105572F == 32) {
                int iM105573G = m105573G(function2, iM105580P, c14289a);
                if (iM105573G == 0) {
                    m105594w(this.f138734H, this.f138738z, this.f138732F);
                }
                if (iM105573G != iM105580P) {
                }
            } else {
                int i14 = (abstractC33270aM105587o.f138722w - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM105571E = iM105572F;
                while (abstractC33270aM105587o.hasNext()) {
                    iM105571E = m105571E(function2, (Object[]) abstractC33270aM105587o.next(), 32, iM105571E, c14289a, arrayList2, arrayList);
                    function2 = function1;
                }
                int iM105571E2 = m105571E(function1, this.f138733G, iM105580P, iM105571E, c14289a, arrayList2, arrayList);
                Object obj = c14289a.f52186x;
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM105571E2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrM105595z = this.f138732F;
                    AbstractC22676k.m65747g(objArrM105595z);
                } else {
                    objArrM105595z = m105595z(this.f138732F, i14, this.f138738z, arrayList.iterator());
                }
                int size = i14 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC28657q1.m87188a("invalid size");
                }
                if (size == 0) {
                    this.f138738z = 0;
                } else {
                    int i15 = size - 1;
                    while (true) {
                        i13 = this.f138738z;
                        if ((i15 >> i13) != 0) {
                            break;
                        }
                        this.f138738z = i13 - 5;
                        Object[] objArr2 = objArrM105595z[0];
                        AbstractC22676k.m65748h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrM105595z = objArr2;
                    }
                    objArrM105592u = m105592u(i15, i13, objArrM105595z);
                }
                this.f138732F = objArrM105592u;
                this.f138733G = objArr;
                this.f138734H = size + iM105571E2;
            }
            z4 = true;
        } else if (m105573G(function2, iM105580P, c14289a) != iM105580P) {
            z4 = true;
        }
        if (z4) {
            ((AbstractList) this).modCount++;
        }
        return z4;
    }

    /* JADX INFO: renamed from: K */
    public final Object[] m105575K(Object[] objArr, int i13, int i14, C14289a c14289a) {
        int iM118955G = AbstractC37056f.m118955G(i14, i13);
        if (i13 == 0) {
            Object obj = objArr[iM118955G];
            Object[] objArrM105588p = m105588p(objArr);
            AbstractC25260n.m74062d0(iM118955G, iM118955G + 1, 32, objArr, objArrM105588p);
            objArrM105588p[31] = c14289a.f52186x;
            c14289a.f52186x = obj;
            return objArrM105588p;
        }
        int iM118955G2 = objArr[31] == null ? AbstractC37056f.m118955G(m105577M() - 1, i13) : 31;
        Object[] objArrM105588p2 = m105588p(objArr);
        int i15 = i13 - 5;
        int i16 = iM118955G + 1;
        if (i16 <= iM118955G2) {
            while (true) {
                Object obj2 = objArrM105588p2[iM118955G2];
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrM105588p2[iM118955G2] = m105575K((Object[]) obj2, i15, 0, c14289a);
                if (iM118955G2 == i16) {
                    break;
                }
                iM118955G2--;
            }
        }
        Object obj3 = objArrM105588p2[iM118955G];
        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM105588p2[iM118955G] = m105575K((Object[]) obj3, i15, i14, c14289a);
        return objArrM105588p2;
    }

    /* JADX INFO: renamed from: L */
    public final Object m105576L(Object[] objArr, int i13, int i14, int i15) {
        int i16 = this.f138734H - i13;
        if (i16 == 1) {
            Object obj = this.f138733G[0];
            m105594w(i13, i14, objArr);
            return obj;
        }
        Object[] objArr2 = this.f138733G;
        Object obj2 = objArr2[i15];
        Object[] objArrM105588p = m105588p(objArr2);
        AbstractC25260n.m74062d0(i15, i15 + 1, i16, objArr2, objArrM105588p);
        objArrM105588p[i16 - 1] = null;
        this.f138732F = objArr;
        this.f138733G = objArrM105588p;
        this.f138734H = (i13 + i16) - 1;
        this.f138738z = i14;
        return obj2;
    }

    /* JADX INFO: renamed from: M */
    public final int m105577M() {
        int i13 = this.f138734H;
        if (i13 <= 32) {
            return 0;
        }
        return (i13 - 1) & (-32);
    }

    /* JADX INFO: renamed from: N */
    public final Object[] m105578N(Object[] objArr, int i13, int i14, Object obj, C14289a c14289a) {
        int iM118955G = AbstractC37056f.m118955G(i14, i13);
        Object[] objArrM105588p = m105588p(objArr);
        if (i13 != 0) {
            Object obj2 = objArrM105588p[iM118955G];
            AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM105588p[iM118955G] = m105578N((Object[]) obj2, i13 - 5, i14, obj, c14289a);
            return objArrM105588p;
        }
        if (objArrM105588p != objArr) {
            ((AbstractList) this).modCount++;
        }
        c14289a.f52186x = objArrM105588p[iM118955G];
        objArrM105588p[iM118955G] = obj;
        return objArrM105588p;
    }

    /* JADX INFO: renamed from: O */
    public final void m105579O(Collection collection, int i13, Object[] objArr, int i14, Object[][] objArr2, int i15, Object[] objArr3) {
        Object[] objArrM105590r;
        if (i15 < 1) {
            AbstractC28657q1.m87188a("requires at least one nullBuffer");
        }
        Object[] objArrM105588p = m105588p(objArr);
        objArr2[0] = objArrM105588p;
        int i16 = i13 & 31;
        int size = ((collection.size() + i13) - 1) & 31;
        int i17 = (i14 - i16) + size;
        if (i17 < 32) {
            AbstractC25260n.m74062d0(size + 1, i16, i14, objArrM105588p, objArr3);
        } else {
            int i18 = i17 - 31;
            if (i15 == 1) {
                objArrM105590r = objArrM105588p;
            } else {
                objArrM105590r = m105590r();
                i15--;
                objArr2[i15] = objArrM105590r;
            }
            int i19 = i14 - i18;
            AbstractC25260n.m74062d0(0, i19, i14, objArrM105588p, objArr3);
            AbstractC25260n.m74062d0(size + 1, i16, i19, objArrM105588p, objArrM105590r);
            objArr3 = objArrM105590r;
        }
        Iterator it = collection.iterator();
        m105567e(objArrM105588p, i16, it);
        for (int i24 = 1; i24 < i15; i24++) {
            Object[] objArrM105590r2 = m105590r();
            m105567e(objArrM105590r2, 0, it);
            objArr2[i24] = objArrM105590r2;
        }
        m105567e(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: P */
    public final int m105580P() {
        int i13 = this.f138734H;
        return i13 <= 32 ? i13 : i13 - ((i13 - 1) & (-32));
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: a */
    public final int mo74007a() {
        return this.f138734H;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        AbstractC35744b.m113230c(i13, mo74007a());
        if (i13 == mo74007a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM105577M = m105577M();
        if (i13 >= iM105577M) {
            m105585m(this.f138732F, i13 - iM105577M, obj);
            return;
        }
        C14289a c14289a = new C14289a(null, 4);
        Object[] objArr = this.f138732F;
        AbstractC22676k.m65747g(objArr);
        m105585m(m105584l(objArr, this.f138738z, i13, obj, c14289a), 0, c14289a.f52186x);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        Collection collection2;
        C33275f c33275f;
        Object[] objArrM105590r;
        AbstractC35744b.m113230c(i13, this.f138734H);
        if (i13 == this.f138734H) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i14 = (i13 >> 5) << 5;
        int size = ((collection.size() + (this.f138734H - i14)) - 1) / 32;
        if (size == 0) {
            int i15 = i13 & 31;
            int size2 = ((collection.size() + i13) - 1) & 31;
            Object[] objArr = this.f138733G;
            Object[] objArrM105588p = m105588p(objArr);
            AbstractC25260n.m74062d0(size2 + 1, i15, m105580P(), objArr, objArrM105588p);
            m105567e(objArrM105588p, i15, collection.iterator());
            this.f138733G = objArrM105588p;
            this.f138734H = collection.size() + this.f138734H;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM105580P = m105580P();
        int size3 = collection.size() + this.f138734H;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i13 >= m105577M()) {
            objArrM105590r = m105590r();
            collection2 = collection;
            m105579O(collection2, i13, this.f138733G, iM105580P, objArr2, size, objArrM105590r);
            c33275f = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            c33275f = this;
            if (size3 > iM105580P) {
                int i16 = size3 - iM105580P;
                Object[] objArrM105589q = m105589q(i16, c33275f.f138733G);
                c33275f.m105583j(collection2, i13, i16, objArr2, size, objArrM105589q);
                objArr2 = objArr2;
                objArrM105590r = objArrM105589q;
            } else {
                Object[] objArr3 = c33275f.f138733G;
                objArrM105590r = m105590r();
                int i17 = iM105580P - size3;
                AbstractC25260n.m74062d0(0, i17, iM105580P, objArr3, objArrM105590r);
                int i18 = 32 - i17;
                Object[] objArrM105589q2 = m105589q(i18, c33275f.f138733G);
                int i19 = size - 1;
                objArr2[i19] = objArrM105589q2;
                c33275f.m105583j(collection2, i13, i18, objArr2, i19, objArrM105589q2);
                collection2 = collection2;
            }
        }
        c33275f.f138732F = m105568A(c33275f.f138732F, i14, objArr2);
        c33275f.f138733G = objArrM105590r;
        c33275f.f138734H = collection2.size() + c33275f.f138734H;
        return true;
    }

    @Override // m83.AbstractC25248h
    /* JADX INFO: renamed from: c */
    public final Object mo74008c(int i13) {
        AbstractC35744b.m113229b(i13, mo74007a());
        ((AbstractList) this).modCount++;
        int iM105577M = m105577M();
        if (i13 >= iM105577M) {
            return m105576L(this.f138732F, iM105577M, this.f138738z, i13 - iM105577M);
        }
        C14289a c14289a = new C14289a(this.f138733G[0], 4);
        Object[] objArr = this.f138732F;
        AbstractC22676k.m65747g(objArr);
        m105576L(m105575K(objArr, this.f138738z, i13, c14289a), iM105577M, this.f138738z, 0);
        return c14289a.f52186x;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC33272c m105581d() {
        AbstractC33272c c33274e;
        Object[] objArr = this.f138732F;
        if (objArr == this.f138736x && this.f138733G == this.f138737y) {
            c33274e = this.f138735w;
        } else {
            this.f138731E = new C36688b();
            this.f138736x = objArr;
            Object[] objArr2 = this.f138733G;
            this.f138737y = objArr2;
            if (objArr != null) {
                c33274e = new C33274e(objArr, objArr2, this.f138734H, this.f138738z);
            } else if (objArr2.length == 0) {
                c33274e = C33279j.f138746x;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f138734H);
                AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
                c33274e = new C33279j(objArrCopyOf);
            }
        }
        this.f138735w = c33274e;
        return c33274e;
    }

    /* JADX INFO: renamed from: g */
    public final int m105582g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        Object[] objArr;
        AbstractC35744b.m113229b(i13, mo74007a());
        if (m105577M() <= i13) {
            objArr = this.f138733G;
        } else {
            objArr = this.f138732F;
            AbstractC22676k.m65747g(objArr);
            for (int i14 = this.f138738z; i14 > 0; i14 -= 5) {
                Object obj = objArr[AbstractC37056f.m118955G(i13, i14)];
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i13 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m105583j(Collection collection, int i13, int i14, Object[][] objArr, int i15, Object[] objArr2) {
        if (this.f138732F == null) {
            throw new IllegalStateException("root is null");
        }
        int i16 = i13 >> 5;
        AbstractC33270a abstractC33270aM105587o = m105587o(m105577M() >> 5);
        int i17 = i15;
        Object[] objArrM105589q = objArr2;
        while (abstractC33270aM105587o.f138722w - 1 != i16) {
            Object[] objArr3 = (Object[]) abstractC33270aM105587o.previous();
            AbstractC25260n.m74062d0(0, 32 - i14, 32, objArr3, objArrM105589q);
            objArrM105589q = m105589q(i14, objArr3);
            i17--;
            objArr[i17] = objArrM105589q;
        }
        Object[] objArr4 = (Object[]) abstractC33270aM105587o.previous();
        int iM105577M = i15 - (((m105577M() >> 5) - 1) - i16);
        if (iM105577M < i15) {
            objArr2 = objArr[iM105577M];
            AbstractC22676k.m65747g(objArr2);
        }
        m105579O(collection, i13, objArr4, 32, objArr, iM105577M, objArr2);
    }

    /* JADX INFO: renamed from: l */
    public final Object[] m105584l(Object[] objArr, int i13, int i14, Object obj, C14289a c14289a) {
        Object obj2;
        int iM118955G = AbstractC37056f.m118955G(i14, i13);
        if (i13 == 0) {
            c14289a.f52186x = objArr[31];
            Object[] objArrM105588p = m105588p(objArr);
            AbstractC25260n.m74062d0(iM118955G + 1, iM118955G, 31, objArr, objArrM105588p);
            objArrM105588p[iM118955G] = obj;
            return objArrM105588p;
        }
        Object[] objArrM105588p2 = m105588p(objArr);
        int i15 = i13 - 5;
        Object obj3 = objArrM105588p2[iM118955G];
        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM105588p2[iM118955G] = m105584l((Object[]) obj3, i15, i14, obj, c14289a);
        while (true) {
            iM118955G++;
            if (iM118955G >= 32 || (obj2 = objArrM105588p2[iM118955G]) == null) {
                break;
            }
            objArrM105588p2[iM118955G] = m105584l((Object[]) obj2, i15, 0, c14289a.f52186x, c14289a);
        }
        return objArrM105588p2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        AbstractC35744b.m113230c(i13, this.f138734H);
        return new C33277h(this, i13);
    }

    /* JADX INFO: renamed from: m */
    public final void m105585m(Object[] objArr, int i13, Object obj) {
        int iM105580P = m105580P();
        Object[] objArrM105588p = m105588p(this.f138733G);
        if (iM105580P >= 32) {
            Object[] objArr2 = this.f138733G;
            Object obj2 = objArr2[31];
            AbstractC25260n.m74062d0(i13 + 1, i13, 31, objArr2, objArrM105588p);
            objArrM105588p[i13] = obj;
            m105569B(objArr, objArrM105588p, m105591t(obj2));
            return;
        }
        AbstractC25260n.m74062d0(i13 + 1, i13, iM105580P, this.f138733G, objArrM105588p);
        objArrM105588p[i13] = obj;
        this.f138732F = objArr;
        this.f138733G = objArrM105588p;
        this.f138734H++;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m105586n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f138731E;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC33270a m105587o(int i13) {
        Object[] objArr = this.f138732F;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iM105577M = m105577M() >> 5;
        AbstractC35744b.m113230c(i13, iM105577M);
        int i14 = this.f138738z;
        return i14 == 0 ? new C33278i(objArr, i13) : new C33280k(objArr, i13, iM105577M, i14 / 5);
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m105588p(Object[] objArr) {
        if (objArr == null) {
            return m105590r();
        }
        if (m105586n(objArr)) {
            return objArr;
        }
        Object[] objArrM105590r = m105590r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC25260n.m74068i0(0, length, 6, objArr, objArrM105590r);
        return objArrM105590r;
    }

    /* JADX INFO: renamed from: q */
    public final Object[] m105589q(int i13, Object[] objArr) {
        if (m105586n(objArr)) {
            AbstractC25260n.m74062d0(i13, 0, 32 - i13, objArr, objArr);
            return objArr;
        }
        Object[] objArrM105590r = m105590r();
        AbstractC25260n.m74062d0(i13, 0, 32 - i13, objArr, objArrM105590r);
        return objArrM105590r;
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m105590r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f138731E;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m105574I(new C33271b(1, collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        AbstractC35744b.m113229b(i13, mo74007a());
        if (m105577M() > i13) {
            C14289a c14289a = new C14289a(null, 4);
            Object[] objArr = this.f138732F;
            AbstractC22676k.m65747g(objArr);
            this.f138732F = m105578N(objArr, this.f138738z, i13, obj, c14289a);
            return c14289a.f52186x;
        }
        Object[] objArrM105588p = m105588p(this.f138733G);
        if (objArrM105588p != this.f138733G) {
            ((AbstractList) this).modCount++;
        }
        int i14 = i13 & 31;
        Object obj2 = objArrM105588p[i14];
        objArrM105588p[i14] = obj;
        this.f138733G = objArrM105588p;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final Object[] m105591t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f138731E;
        return objArr;
    }

    /* JADX INFO: renamed from: u */
    public final Object[] m105592u(int i13, int i14, Object[] objArr) {
        if (i14 < 0) {
            AbstractC28657q1.m87188a("shift should be positive");
        }
        if (i14 == 0) {
            return objArr;
        }
        int iM118955G = AbstractC37056f.m118955G(i13, i14);
        Object obj = objArr[iM118955G];
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objM105592u = m105592u(i13, i14 - 5, (Object[]) obj);
        if (iM118955G < 31) {
            int i15 = iM118955G + 1;
            if (objArr[i15] != null) {
                if (m105586n(objArr)) {
                    Arrays.fill(objArr, i15, 32, (Object) null);
                }
                Object[] objArrM105590r = m105590r();
                AbstractC25260n.m74062d0(0, 0, i15, objArr, objArrM105590r);
                objArr = objArrM105590r;
            }
        }
        if (objM105592u == objArr[iM118955G]) {
            return objArr;
        }
        Object[] objArrM105588p = m105588p(objArr);
        objArrM105588p[iM118955G] = objM105592u;
        return objArrM105588p;
    }

    /* JADX INFO: renamed from: v */
    public final Object[] m105593v(Object[] objArr, int i13, int i14, C14289a c14289a) {
        Object[] objArrM105593v;
        int iM118955G = AbstractC37056f.m118955G(i14 - 1, i13);
        if (i13 == 5) {
            c14289a.f52186x = objArr[iM118955G];
            objArrM105593v = null;
        } else {
            Object obj = objArr[iM118955G];
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM105593v = m105593v((Object[]) obj, i13 - 5, i14, c14289a);
        }
        if (objArrM105593v == null && iM118955G == 0) {
            return null;
        }
        Object[] objArrM105588p = m105588p(objArr);
        objArrM105588p[iM118955G] = objArrM105593v;
        return objArrM105588p;
    }

    /* JADX INFO: renamed from: w */
    public final void m105594w(int i13, int i14, Object[] objArr) {
        Object obj = null;
        if (i14 == 0) {
            this.f138732F = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f138733G = objArr;
            this.f138734H = i13;
            this.f138738z = i14;
            return;
        }
        C14289a c14289a = new C14289a(obj, 4);
        AbstractC22676k.m65747g(objArr);
        Object[] objArrM105593v = m105593v(objArr, i14, i13, c14289a);
        AbstractC22676k.m65747g(objArrM105593v);
        Object obj2 = c14289a.f52186x;
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f138733G = (Object[]) obj2;
        this.f138734H = i13;
        if (objArrM105593v[1] == null) {
            this.f138732F = (Object[]) objArrM105593v[0];
            this.f138738z = i14 - 5;
        } else {
            this.f138732F = objArrM105593v;
            this.f138738z = i14;
        }
    }

    /* JADX INFO: renamed from: z */
    public final Object[] m105595z(Object[] objArr, int i13, int i14, Iterator it) {
        if (!it.hasNext()) {
            AbstractC28657q1.m87188a("invalid buffersIterator");
        }
        if (!(i14 >= 0)) {
            AbstractC28657q1.m87188a("negative shift");
        }
        if (i14 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM105588p = m105588p(objArr);
        int iM118955G = AbstractC37056f.m118955G(i13, i14);
        int i15 = i14 - 5;
        objArrM105588p[iM118955G] = m105595z((Object[]) objArrM105588p[iM118955G], i13, i15, it);
        while (true) {
            iM118955G++;
            if (iM118955G >= 32 || !it.hasNext()) {
                break;
            }
            objArrM105588p[iM118955G] = m105595z((Object[]) objArrM105588p[iM118955G], 0, i15, it);
        }
        return objArrM105588p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM105580P = m105580P();
        if (iM105580P < 32) {
            Object[] objArrM105588p = m105588p(this.f138733G);
            objArrM105588p[iM105580P] = obj;
            this.f138733G = objArrM105588p;
            this.f138734H = mo74007a() + 1;
        } else {
            m105569B(this.f138732F, this.f138733G, m105591t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM105580P = m105580P();
        Iterator it = collection.iterator();
        if (32 - iM105580P >= collection.size()) {
            Object[] objArrM105588p = m105588p(this.f138733G);
            m105567e(objArrM105588p, iM105580P, it);
            this.f138733G = objArrM105588p;
            this.f138734H = collection.size() + this.f138734H;
            return true;
        }
        int size = ((collection.size() + iM105580P) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM105588p2 = m105588p(this.f138733G);
        m105567e(objArrM105588p2, iM105580P, it);
        objArr[0] = objArrM105588p2;
        for (int i13 = 1; i13 < size; i13++) {
            Object[] objArrM105590r = m105590r();
            m105567e(objArrM105590r, 0, it);
            objArr[i13] = objArrM105590r;
        }
        this.f138732F = m105568A(this.f138732F, m105577M(), objArr);
        Object[] objArrM105590r2 = m105590r();
        m105567e(objArrM105590r2, 0, it);
        this.f138733G = objArrM105590r2;
        this.f138734H = collection.size() + this.f138734H;
        return true;
    }
}
