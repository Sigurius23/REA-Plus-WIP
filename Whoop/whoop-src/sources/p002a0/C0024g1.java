package p002a0;

import java.util.Arrays;
import m83.AbstractC25260n;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0024g1 implements Cloneable {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ boolean f55w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ int[] f56x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object[] f57y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ int f58z;

    public C0024g1(int i13) {
        if (i13 == 0) {
            this.f56x = AbstractC2177a.f8657a;
            this.f57y = AbstractC2177a.f8659c;
            return;
        }
        int i14 = i13 * 4;
        for (int i15 = 4; i15 < 32; i15++) {
            int i16 = (1 << i15) - 12;
            if (i14 <= i16) {
                i14 = i16;
                break;
            }
        }
        int i17 = i14 / 4;
        this.f56x = new int[i17];
        this.f57y = new Object[i17];
    }

    /* JADX INFO: renamed from: a */
    public final void m52a(int i13, Object obj) {
        int i14 = this.f58z;
        if (i14 != 0 && i13 <= this.f56x[i14 - 1]) {
            m57f(i13, obj);
            return;
        }
        if (this.f55w && i14 >= this.f56x.length) {
            AbstractC0064z.m159a(this);
        }
        int i15 = this.f58z;
        if (i15 >= this.f56x.length) {
            int i16 = (i15 + 1) * 4;
            for (int i17 = 4; i17 < 32; i17++) {
                int i18 = (1 << i17) - 12;
                if (i16 <= i18) {
                    i16 = i18;
                    break;
                }
            }
            int i19 = i16 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f56x, i19);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f56x = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f57y, i19);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            this.f57y = objArrCopyOf;
        }
        this.f56x[i15] = i13;
        this.f57y[i15] = obj;
        this.f58z = i15 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0024g1 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC22676k.m65748h(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C0024g1 c0024g1 = (C0024g1) objClone;
        c0024g1.f56x = (int[]) this.f56x.clone();
        c0024g1.f57y = (Object[]) this.f57y.clone();
        return c0024g1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m54c(int i13) {
        if (this.f55w) {
            AbstractC0064z.m159a(this);
        }
        return AbstractC2177a.m6853a(this.f58z, i13, this.f56x) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final Object m55d(int i13) {
        Object obj;
        int iM6853a = AbstractC2177a.m6853a(this.f58z, i13, this.f56x);
        if (iM6853a < 0 || (obj = this.f57y[iM6853a]) == AbstractC0064z.f203c) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final int m56e(int i13) {
        if (this.f55w) {
            AbstractC0064z.m159a(this);
        }
        return this.f56x[i13];
    }

    /* JADX INFO: renamed from: f */
    public final void m57f(int i13, Object obj) {
        int iM6853a = AbstractC2177a.m6853a(this.f58z, i13, this.f56x);
        if (iM6853a >= 0) {
            this.f57y[iM6853a] = obj;
            return;
        }
        int i14 = ~iM6853a;
        int i15 = this.f58z;
        if (i14 < i15) {
            Object[] objArr = this.f57y;
            if (objArr[i14] == AbstractC0064z.f203c) {
                this.f56x[i14] = i13;
                objArr[i14] = obj;
                return;
            }
        }
        if (this.f55w && i15 >= this.f56x.length) {
            AbstractC0064z.m159a(this);
            i14 = ~AbstractC2177a.m6853a(this.f58z, i13, this.f56x);
        }
        int i16 = this.f58z;
        if (i16 >= this.f56x.length) {
            int i17 = (i16 + 1) * 4;
            for (int i18 = 4; i18 < 32; i18++) {
                int i19 = (1 << i18) - 12;
                if (i17 <= i19) {
                    i17 = i19;
                    break;
                }
            }
            int i24 = i17 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f56x, i24);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f56x = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f57y, i24);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            this.f57y = objArrCopyOf;
        }
        int i25 = this.f58z;
        if (i25 - i14 != 0) {
            int[] iArr = this.f56x;
            int i26 = i14 + 1;
            AbstractC25260n.m74064e0(i26, i14, iArr, iArr, i25);
            Object[] objArr2 = this.f57y;
            AbstractC25260n.m74062d0(i26, i14, this.f58z, objArr2, objArr2);
        }
        this.f56x[i14] = i13;
        this.f57y[i14] = obj;
        this.f58z++;
    }

    /* JADX INFO: renamed from: g */
    public final int m58g() {
        if (this.f55w) {
            AbstractC0064z.m159a(this);
        }
        return this.f58z;
    }

    /* JADX INFO: renamed from: h */
    public final Object m59h(int i13) {
        if (this.f55w) {
            AbstractC0064z.m159a(this);
        }
        Object[] objArr = this.f57y;
        if (i13 < objArr.length) {
            return objArr[i13];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (m58g() <= 0) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder(this.f58z * 28);
        sb4.append('{');
        int i13 = this.f58z;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb4.append(", ");
            }
            sb4.append(m56e(i14));
            sb4.append('=');
            Object objM59h = m59h(i14);
            if (objM59h != this) {
                sb4.append(objM59h);
            } else {
                sb4.append("(this Map)");
            }
        }
        sb4.append('}');
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C0024g1(Object obj) {
        this(10);
    }
}
