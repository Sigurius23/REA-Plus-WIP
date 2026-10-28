package p390p1;

import java.util.ArrayList;
import p005a3.C0264x;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: p1.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C28610e2 {

    /* JADX INFO: renamed from: a */
    public final C28614f2 f115738a;

    /* JADX INFO: renamed from: b */
    public final int[] f115739b;

    /* JADX INFO: renamed from: c */
    public final int f115740c;

    /* JADX INFO: renamed from: d */
    public Object[] f115741d;

    /* JADX INFO: renamed from: e */
    public final int f115742e;

    /* JADX INFO: renamed from: f */
    public boolean f115743f;

    /* JADX INFO: renamed from: g */
    public int f115744g;

    /* JADX INFO: renamed from: h */
    public int f115745h;

    /* JADX INFO: renamed from: i */
    public int f115746i;

    /* JADX INFO: renamed from: j */
    public final C0264x f115747j;

    /* JADX INFO: renamed from: k */
    public int f115748k;

    /* JADX INFO: renamed from: l */
    public int f115749l;

    /* JADX INFO: renamed from: m */
    public int f115750m;

    /* JADX INFO: renamed from: n */
    public boolean f115751n;

    public C28610e2(C28614f2 c28614f2) {
        this.f115738a = c28614f2;
        this.f115739b = c28614f2.f115764w;
        int i13 = c28614f2.f115765x;
        this.f115740c = i13;
        this.f115741d = c28614f2.f115766y;
        this.f115742e = c28614f2.f115767z;
        this.f115745h = i13;
        this.f115746i = -1;
        this.f115747j = new C0264x();
    }

    /* JADX INFO: renamed from: a */
    public final C28591a m86989a(int i13) {
        ArrayList arrayList = this.f115738a.f115761I;
        int iM87030e = AbstractC28622h2.m87030e(arrayList, i13, this.f115740c);
        if (iM87030e >= 0) {
            return (C28591a) arrayList.get(iM87030e);
        }
        C28591a c28591a = new C28591a(i13);
        arrayList.add(-(iM87030e + 1), c28591a);
        return c28591a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m86990b(int[] iArr, int i13) {
        int i14 = i13 * 5;
        int i15 = iArr[i14 + 1];
        if ((268435456 & i15) != 0) {
            return this.f115741d[i14 >= iArr.length ? iArr.length : iArr[i14 + 4] + Integer.bitCount(i15 >> 29)];
        }
        return C28635l.f115821a;
    }

    /* JADX INFO: renamed from: c */
    public final void m86991c() {
        this.f115743f = true;
        C28614f2 c28614f2 = this.f115738a;
        c28614f2.getClass();
        if (this.f115738a != c28614f2 || c28614f2.f115757E <= 0) {
            AbstractC28659r.m87192c("Unexpected reader close()");
        }
        c28614f2.f115757E--;
        this.f115741d = new Object[0];
    }

    /* JADX INFO: renamed from: d */
    public final boolean m86992d(int i13) {
        return (this.f115739b[(i13 * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m86993e() {
        if (this.f115748k == 0) {
            if (!(this.f115744g == this.f115745h)) {
                AbstractC28659r.m87192c("endGroup() not called at the end of a group");
            }
            int i13 = (this.f115746i * 5) + 2;
            int[] iArr = this.f115739b;
            int i14 = iArr[i13];
            this.f115746i = i14;
            int i15 = this.f115740c;
            this.f115745h = i14 < 0 ? i15 : AbstractC28622h2.m87026a(iArr, i14) + i14;
            int iM798b = this.f115747j.m798b();
            if (iM798b < 0) {
                this.f115749l = 0;
                this.f115750m = 0;
            } else {
                this.f115749l = iM798b;
                this.f115750m = i14 >= i15 - 1 ? this.f115742e : iArr[((i14 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m86994f() {
        int i13 = this.f115744g;
        if (i13 < this.f115745h) {
            return m86990b(this.f115739b, i13);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m86995g() {
        int i13 = this.f115744g;
        if (i13 >= this.f115745h) {
            return 0;
        }
        return this.f115739b[i13 * 5];
    }

    /* JADX INFO: renamed from: h */
    public final Object m86996h(int i13, int i14) {
        int[] iArr = this.f115739b;
        int iM87028c = AbstractC28622h2.m87028c(iArr, i13);
        int i15 = i13 + 1;
        int i16 = iM87028c + i14;
        return i16 < (i15 < this.f115740c ? iArr[(i15 * 5) + 4] : this.f115742e) ? this.f115741d[i16] : C28635l.f115821a;
    }

    /* JADX INFO: renamed from: i */
    public final int m86997i(int i13) {
        return this.f115739b[i13 * 5];
    }

    /* JADX INFO: renamed from: j */
    public final boolean m86998j(int i13) {
        return (this.f115739b[(i13 * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m86999k(int i13) {
        return (this.f115739b[(i13 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m87000l(int i13) {
        return (this.f115739b[(i13 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final Object m87001m() {
        int i13;
        if (this.f115748k > 0 || (i13 = this.f115749l) >= this.f115750m) {
            this.f115751n = false;
            return C28635l.f115821a;
        }
        this.f115751n = true;
        Object[] objArr = this.f115741d;
        this.f115749l = i13 + 1;
        return objArr[i13];
    }

    /* JADX INFO: renamed from: n */
    public final Object m87002n(int i13) {
        int i14 = i13 * 5;
        int[] iArr = this.f115739b;
        int i15 = iArr[i14 + 1] & 1073741824;
        if (i15 != 0) {
            return i15 != 0 ? this.f115741d[iArr[i14 + 4]] : C28635l.f115821a;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final int m87003o(int i13) {
        return this.f115739b[(i13 * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: p */
    public final Object m87004p(int[] iArr, int i13) {
        int i14 = i13 * 5;
        int i15 = iArr[i14 + 1];
        if ((536870912 & i15) == 0) {
            return null;
        }
        return this.f115741d[Integer.bitCount(i15 >> 30) + iArr[i14 + 4]];
    }

    /* JADX INFO: renamed from: q */
    public final int m87005q(int i13) {
        return this.f115739b[(i13 * 5) + 2];
    }

    /* JADX INFO: renamed from: r */
    public final void m87006r(int i13) {
        if (!(this.f115748k == 0)) {
            AbstractC28659r.m87192c("Cannot reposition while in an empty region");
        }
        this.f115744g = i13;
        int[] iArr = this.f115739b;
        int i14 = this.f115740c;
        int i15 = i13 < i14 ? iArr[(i13 * 5) + 2] : -1;
        if (i15 != this.f115746i) {
            this.f115746i = i15;
            if (i15 < 0) {
                this.f115745h = i14;
            } else {
                this.f115745h = AbstractC28622h2.m87026a(iArr, i15) + i15;
            }
            this.f115749l = 0;
            this.f115750m = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m87007s() {
        if (!(this.f115748k == 0)) {
            AbstractC28659r.m87192c("Cannot skip while in an empty region");
        }
        int i13 = this.f115744g;
        int[] iArr = this.f115739b;
        int i14 = (iArr[(i13 * 5) + 1] & 1073741824) == 0 ? iArr[(i13 * 5) + 1] & 67108863 : 1;
        this.f115744g = AbstractC28622h2.m87026a(iArr, i13) + i13;
        return i14;
    }

    /* JADX INFO: renamed from: t */
    public final void m87008t() {
        if (!(this.f115748k == 0)) {
            AbstractC28659r.m87192c("Cannot skip the enclosing group while in an empty region");
        }
        this.f115744g = this.f115745h;
        this.f115749l = 0;
        this.f115750m = 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SlotReader(current=");
        sb4.append(this.f115744g);
        sb4.append(", key=");
        sb4.append(m86995g());
        sb4.append(", parent=");
        sb4.append(this.f115746i);
        sb4.append(", end=");
        return AbstractC11895b.m31999r(sb4, this.f115745h, ')');
    }

    /* JADX INFO: renamed from: u */
    public final void m87009u() {
        if (this.f115748k <= 0) {
            int i13 = this.f115746i;
            int i14 = this.f115744g;
            int[] iArr = this.f115739b;
            if (!(iArr[(i14 * 5) + 2] == i13)) {
                AbstractC28657q1.m87188a("Invalid slot table detected");
            }
            int i15 = this.f115749l;
            int i16 = this.f115750m;
            C0264x c0264x = this.f115747j;
            if (i15 == 0 && i16 == 0) {
                c0264x.m799c(-1);
            } else {
                c0264x.m799c(i15);
            }
            this.f115746i = i14;
            this.f115745h = AbstractC28622h2.m87026a(iArr, i14) + i14;
            int i17 = i14 + 1;
            this.f115744g = i17;
            this.f115749l = AbstractC28622h2.m87028c(iArr, i14);
            this.f115750m = i14 >= this.f115740c - 1 ? this.f115742e : iArr[(i17 * 5) + 4];
        }
    }
}
