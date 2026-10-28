package p002a0;

import java.util.Arrays;
import m83.AbstractC25260n;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0062y implements Cloneable {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ boolean f195w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ long[] f196x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object[] f197y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ int f198z;

    public C0062y(int i13) {
        if (i13 == 0) {
            this.f196x = AbstractC2177a.f8658b;
            this.f197y = AbstractC2177a.f8659c;
            return;
        }
        int i14 = i13 * 8;
        for (int i15 = 4; i15 < 32; i15++) {
            int i16 = (1 << i15) - 12;
            if (i14 <= i16) {
                i14 = i16;
                break;
            }
        }
        int i17 = i14 / 8;
        this.f196x = new long[i17];
        this.f197y = new Object[i17];
    }

    /* JADX INFO: renamed from: a */
    public final void m149a() {
        int i13 = this.f198z;
        Object[] objArr = this.f197y;
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = null;
        }
        this.f198z = 0;
        this.f195w = false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m150b(long j7) {
        return m152d(j7) >= 0;
    }

    /* JADX INFO: renamed from: c */
    public final Object m151c(long j7) {
        Object obj;
        int iM6854b = AbstractC2177a.m6854b(this.f196x, this.f198z, j7);
        if (iM6854b < 0 || (obj = this.f197y[iM6854b]) == AbstractC0064z.f201a) {
            return null;
        }
        return obj;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC22676k.m65748h(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0062y c0062y = (C0062y) objClone;
        c0062y.f196x = (long[]) this.f196x.clone();
        c0062y.f197y = (Object[]) this.f197y.clone();
        return c0062y;
    }

    /* JADX INFO: renamed from: d */
    public final int m152d(long j7) {
        if (this.f195w) {
            int i13 = this.f198z;
            long[] jArr = this.f196x;
            Object[] objArr = this.f197y;
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                Object obj = objArr[i15];
                if (obj != AbstractC0064z.f201a) {
                    if (i15 != i14) {
                        jArr[i14] = jArr[i15];
                        objArr[i14] = obj;
                        objArr[i15] = null;
                    }
                    i14++;
                }
            }
            this.f195w = false;
            this.f198z = i14;
        }
        return AbstractC2177a.m6854b(this.f196x, this.f198z, j7);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m153e() {
        return m157i() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final long m154f(int i13) {
        int i14;
        if (i13 < 0 || i13 >= (i14 = this.f198z)) {
            AbstractC34924m.m110133O("Expected index to be within 0..size()-1, but was " + i13);
            throw null;
        }
        if (this.f195w) {
            long[] jArr = this.f196x;
            Object[] objArr = this.f197y;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = objArr[i16];
                if (obj != AbstractC0064z.f201a) {
                    if (i16 != i15) {
                        jArr[i15] = jArr[i16];
                        objArr[i15] = obj;
                        objArr[i16] = null;
                    }
                    i15++;
                }
            }
            this.f195w = false;
            this.f198z = i15;
        }
        return this.f196x[i13];
    }

    /* JADX INFO: renamed from: g */
    public final void m155g(long j7, Object obj) {
        Object obj2 = AbstractC0064z.f201a;
        int iM6854b = AbstractC2177a.m6854b(this.f196x, this.f198z, j7);
        if (iM6854b >= 0) {
            this.f197y[iM6854b] = obj;
            return;
        }
        int i13 = ~iM6854b;
        int i14 = this.f198z;
        if (i13 < i14) {
            Object[] objArr = this.f197y;
            if (objArr[i13] == obj2) {
                this.f196x[i13] = j7;
                objArr[i13] = obj;
                return;
            }
        }
        if (this.f195w) {
            long[] jArr = this.f196x;
            if (i14 >= jArr.length) {
                Object[] objArr2 = this.f197y;
                int i15 = 0;
                for (int i16 = 0; i16 < i14; i16++) {
                    Object obj3 = objArr2[i16];
                    if (obj3 != obj2) {
                        if (i16 != i15) {
                            jArr[i15] = jArr[i16];
                            objArr2[i15] = obj3;
                            objArr2[i16] = null;
                        }
                        i15++;
                    }
                }
                this.f195w = false;
                this.f198z = i15;
                i13 = ~AbstractC2177a.m6854b(this.f196x, i15, j7);
            }
        }
        int i17 = this.f198z;
        if (i17 >= this.f196x.length) {
            int i18 = (i17 + 1) * 8;
            for (int i19 = 4; i19 < 32; i19++) {
                int i24 = (1 << i19) - 12;
                if (i18 <= i24) {
                    i18 = i24;
                    break;
                }
            }
            int i25 = i18 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f196x, i25);
            AbstractC22676k.m65749i(jArrCopyOf, "copyOf(...)");
            this.f196x = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f197y, i25);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            this.f197y = objArrCopyOf;
        }
        int i26 = this.f198z;
        if (i26 - i13 != 0) {
            long[] jArr2 = this.f196x;
            int i27 = i13 + 1;
            AbstractC25260n.m74066g0(jArr2, jArr2, i27, i13, i26);
            Object[] objArr3 = this.f197y;
            AbstractC25260n.m74062d0(i27, i13, this.f198z, objArr3, objArr3);
        }
        this.f196x[i13] = j7;
        this.f197y[i13] = obj;
        this.f198z++;
    }

    /* JADX INFO: renamed from: h */
    public final void m156h(long j7) {
        int iM6854b = AbstractC2177a.m6854b(this.f196x, this.f198z, j7);
        if (iM6854b >= 0) {
            Object[] objArr = this.f197y;
            Object obj = objArr[iM6854b];
            Object obj2 = AbstractC0064z.f201a;
            if (obj != obj2) {
                objArr[iM6854b] = obj2;
                this.f195w = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m157i() {
        if (this.f195w) {
            int i13 = this.f198z;
            long[] jArr = this.f196x;
            Object[] objArr = this.f197y;
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                Object obj = objArr[i15];
                if (obj != AbstractC0064z.f201a) {
                    if (i15 != i14) {
                        jArr[i14] = jArr[i15];
                        objArr[i14] = obj;
                        objArr[i15] = null;
                    }
                    i14++;
                }
            }
            this.f195w = false;
            this.f198z = i14;
        }
        return this.f198z;
    }

    /* JADX INFO: renamed from: j */
    public final Object m158j(int i13) {
        int i14;
        if (i13 < 0 || i13 >= (i14 = this.f198z)) {
            AbstractC34924m.m110133O("Expected index to be within 0..size()-1, but was " + i13);
            throw null;
        }
        if (this.f195w) {
            long[] jArr = this.f196x;
            Object[] objArr = this.f197y;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = objArr[i16];
                if (obj != AbstractC0064z.f201a) {
                    if (i16 != i15) {
                        jArr[i15] = jArr[i16];
                        objArr[i15] = obj;
                        objArr[i16] = null;
                    }
                    i15++;
                }
            }
            this.f195w = false;
            this.f198z = i15;
        }
        return this.f197y[i13];
    }

    public final String toString() {
        if (m157i() <= 0) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder(this.f198z * 28);
        sb4.append('{');
        int i13 = this.f198z;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb4.append(", ");
            }
            sb4.append(m154f(i14));
            sb4.append('=');
            Object objM158j = m158j(i14);
            if (objM158j != sb4) {
                sb4.append(objM158j);
            } else {
                sb4.append("(this Map)");
            }
        }
        sb4.append('}');
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C0062y(Object obj) {
        this(10);
    }
}
