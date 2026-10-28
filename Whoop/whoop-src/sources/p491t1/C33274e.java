package p491t1;

import f93.C14289a;
import java.util.Arrays;
import java.util.ListIterator;
import m83.AbstractC25260n;
import p390p1.AbstractC28657q1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35744b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: t1.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C33274e extends AbstractC33272c {

    /* JADX INFO: renamed from: w */
    public final Object[] f138727w;

    /* JADX INFO: renamed from: x */
    public final Object[] f138728x;

    /* JADX INFO: renamed from: y */
    public final int f138729y;

    /* JADX INFO: renamed from: z */
    public final int f138730z;

    public C33274e(Object[] objArr, Object[] objArr2, int i13, int i14) {
        this.f138727w = objArr;
        this.f138728x = objArr2;
        this.f138729y = i13;
        this.f138730z = i14;
        if (!(mo73980a() > 32)) {
            AbstractC28657q1.m87188a("Trie-based persistent vector should have at least 33 elements, got " + mo73980a());
        }
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: n */
    public static Object[] m105558n(Object[] objArr, int i13, int i14, Object obj, C14289a c14289a) {
        Object[] objArrCopyOf;
        int iM118955G = AbstractC37056f.m118955G(i14, i13);
        if (i13 == 0) {
            if (iM118955G == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            }
            AbstractC25260n.m74062d0(iM118955G + 1, iM118955G, 31, objArr, objArrCopyOf);
            c14289a.f52186x = objArr[31];
            objArrCopyOf[iM118955G] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC22676k.m65749i(objArrCopyOf2, "copyOf(...)");
        int i15 = i13 - 5;
        Object obj2 = objArr[iM118955G];
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iM118955G] = m105558n((Object[]) obj2, i15, i14, obj, c14289a);
        while (true) {
            iM118955G++;
            if (iM118955G >= 32 || objArrCopyOf2[iM118955G] == null) {
                break;
            }
            Object obj3 = objArr[iM118955G];
            AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iM118955G] = m105558n((Object[]) obj3, i15, 0, c14289a.f52186x, c14289a);
        }
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: p */
    public static Object[] m105559p(Object[] objArr, int i13, int i14, C14289a c14289a) {
        Object[] objArrM105559p;
        int iM118955G = AbstractC37056f.m118955G(i14, i13);
        if (i13 == 5) {
            c14289a.f52186x = objArr[iM118955G];
            objArrM105559p = null;
        } else {
            Object obj = objArr[iM118955G];
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM105559p = m105559p((Object[]) obj, i13 - 5, i14, c14289a);
        }
        if (objArrM105559p == null && iM118955G == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iM118955G] = objArrM105559p;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: w */
    public static Object[] m105560w(int i13, int i14, Object obj, Object[] objArr) {
        int iM118955G = AbstractC37056f.m118955G(i14, i13);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        if (i13 == 0) {
            objArrCopyOf[iM118955G] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM118955G];
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iM118955G] = m105560w(i13 - 5, i14, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f138729y;
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: c */
    public final AbstractC33272c mo105551c(int i13, Object obj) {
        int i14 = this.f138729y;
        AbstractC35744b.m113230c(i13, i14);
        if (i13 == i14) {
            return mo105552d(obj);
        }
        int iM105566v = m105566v();
        Object[] objArr = this.f138727w;
        if (i13 >= iM105566v) {
            return m105561o(objArr, i13 - iM105566v, obj);
        }
        C14289a c14289a = new C14289a(null, 4);
        return m105561o(m105558n(objArr, this.f138730z, i13, obj, c14289a), 0, c14289a.f52186x);
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: d */
    public final AbstractC33272c mo105552d(Object obj) {
        int iM105566v = m105566v();
        int i13 = this.f138729y;
        int i14 = i13 - iM105566v;
        Object[] objArr = this.f138727w;
        Object[] objArr2 = this.f138728x;
        if (i14 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return m105562q(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i14] = obj;
        return new C33274e(objArr, objArrCopyOf, i13 + 1, this.f138730z);
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: g */
    public final C33275f mo105554g() {
        return new C33275f(this, this.f138727w, this.f138728x, this.f138730z);
    }

    @Override // java.util.List
    public final Object get(int i13) {
        Object[] objArr;
        AbstractC35744b.m113229b(i13, mo73980a());
        if (m105566v() <= i13) {
            objArr = this.f138728x;
        } else {
            objArr = this.f138727w;
            for (int i14 = this.f138730z; i14 > 0; i14 -= 5) {
                Object obj = objArr[AbstractC37056f.m118955G(i13, i14)];
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i13 & 31];
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: j */
    public final AbstractC33272c mo105555j(C33271b c33271b) {
        C33275f c33275f = new C33275f(this, this.f138727w, this.f138728x, this.f138730z);
        c33275f.m105574I(c33271b);
        return c33275f.m105581d();
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: l */
    public final AbstractC33272c mo105556l(int i13) {
        AbstractC35744b.m113229b(i13, this.f138729y);
        int iM105566v = m105566v();
        Object[] objArr = this.f138727w;
        int i14 = this.f138730z;
        return i13 >= iM105566v ? m105565u(objArr, iM105566v, i14, i13 - iM105566v) : m105565u(m105564t(objArr, i14, i13, new C14289a(this.f138728x[0], 4)), iM105566v, i14, 0);
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final ListIterator listIterator(int i13) {
        AbstractC35744b.m113230c(i13, this.f138729y);
        return new C33276g(i13, this.f138729y, (this.f138730z / 5) + 1, this.f138727w, this.f138728x);
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: m */
    public final AbstractC33272c mo105557m(int i13, Object obj) {
        int i14 = this.f138729y;
        AbstractC35744b.m113229b(i13, i14);
        int iM105566v = m105566v();
        Object[] objArr = this.f138727w;
        Object[] objArr2 = this.f138728x;
        int i15 = this.f138730z;
        if (iM105566v > i13) {
            return new C33274e(m105560w(i15, i13, obj, objArr), objArr2, i14, i15);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i13 & 31] = obj;
        return new C33274e(objArr, objArrCopyOf, i14, i15);
    }

    /* JADX INFO: renamed from: o */
    public final C33274e m105561o(Object[] objArr, int i13, Object obj) {
        int iM105566v = m105566v();
        int i14 = this.f138729y;
        int i15 = i14 - iM105566v;
        Object[] objArr2 = this.f138728x;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        if (i15 < 32) {
            AbstractC25260n.m74062d0(i13 + 1, i13, i15, objArr2, objArrCopyOf);
            objArrCopyOf[i13] = obj;
            return new C33274e(objArr, objArrCopyOf, i14 + 1, this.f138730z);
        }
        Object obj2 = objArr2[31];
        AbstractC25260n.m74062d0(i13 + 1, i13, i15 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i13] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m105562q(objArr, objArrCopyOf, objArr3);
    }

    /* JADX INFO: renamed from: q */
    public final C33274e m105562q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i13 = this.f138729y;
        int i14 = i13 >> 5;
        int i15 = this.f138730z;
        if (i14 <= (1 << i15)) {
            return new C33274e(m105563r(i15, objArr, objArr2), objArr3, i13 + 1, i15);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i16 = i15 + 5;
        return new C33274e(m105563r(i16, objArr4, objArr2), objArr3, i13 + 1, i16);
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m105563r(int i13, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iM118955G = AbstractC37056f.m118955G(mo73980a() - 1, i13);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i13 == 5) {
            objArrCopyOf[iM118955G] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM118955G] = m105563r(i13 - 5, (Object[]) objArrCopyOf[iM118955G], objArr2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: t */
    public final Object[] m105564t(Object[] objArr, int i13, int i14, C14289a c14289a) {
        Object[] objArrCopyOf;
        int iM118955G = AbstractC37056f.m118955G(i14, i13);
        if (i13 == 0) {
            if (iM118955G == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            }
            AbstractC25260n.m74062d0(iM118955G, iM118955G + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c14289a.f52186x;
            c14289a.f52186x = objArr[iM118955G];
            return objArrCopyOf;
        }
        int iM118955G2 = objArr[31] == null ? AbstractC37056f.m118955G(m105566v() - 1, i13) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC22676k.m65749i(objArrCopyOf2, "copyOf(...)");
        int i15 = i13 - 5;
        int i16 = iM118955G + 1;
        if (i16 <= iM118955G2) {
            while (true) {
                Object obj = objArrCopyOf2[iM118955G2];
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iM118955G2] = m105564t((Object[]) obj, i15, 0, c14289a);
                if (iM118955G2 == i16) {
                    break;
                }
                iM118955G2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM118955G];
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iM118955G] = m105564t((Object[]) obj2, i15, i14, c14289a);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC33272c m105565u(Object[] objArr, int i13, int i14, int i15) {
        int i16 = this.f138729y - i13;
        if (i16 != 1) {
            Object[] objArr2 = this.f138728x;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            int i17 = i16 - 1;
            if (i15 < i17) {
                AbstractC25260n.m74062d0(i15, i15 + 1, i16, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i17] = null;
            return new C33274e(objArr, objArrCopyOf, (i13 + i16) - 1, i14);
        }
        if (i14 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC22676k.m65749i(objArr, "copyOf(...)");
            }
            return new C33279j(objArr);
        }
        C14289a c14289a = new C14289a(null, 4);
        Object[] objArrM105559p = m105559p(objArr, i14, i13 - 1, c14289a);
        AbstractC22676k.m65747g(objArrM105559p);
        Object obj = c14289a.f52186x;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrM105559p[1] != null) {
            return new C33274e(objArrM105559p, objArr3, i13, i14);
        }
        Object obj2 = objArrM105559p[0];
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new C33274e((Object[]) obj2, objArr3, i13, i14 - 5);
    }

    /* JADX INFO: renamed from: v */
    public final int m105566v() {
        return (this.f138729y - 1) & (-32);
    }
}
