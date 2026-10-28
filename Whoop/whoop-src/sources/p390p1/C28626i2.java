package p390p1;

import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import m83.AbstractC25260n;
import p002a0.AbstractC0054u;
import p002a0.C0020f0;
import p002a0.C0023g0;
import p002a0.C0026h0;
import p002a0.C0047q0;
import p005a3.C0264x;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: p1.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C28626i2 {

    /* JADX INFO: renamed from: a */
    public final C28614f2 f115781a;

    /* JADX INFO: renamed from: b */
    public int[] f115782b;

    /* JADX INFO: renamed from: c */
    public Object[] f115783c;

    /* JADX INFO: renamed from: d */
    public ArrayList f115784d;

    /* JADX INFO: renamed from: e */
    public HashMap f115785e;

    /* JADX INFO: renamed from: f */
    public C0023g0 f115786f;

    /* JADX INFO: renamed from: g */
    public int f115787g;

    /* JADX INFO: renamed from: h */
    public int f115788h;

    /* JADX INFO: renamed from: i */
    public int f115789i;

    /* JADX INFO: renamed from: j */
    public int f115790j;

    /* JADX INFO: renamed from: k */
    public int f115791k;

    /* JADX INFO: renamed from: l */
    public int f115792l;

    /* JADX INFO: renamed from: m */
    public int f115793m;

    /* JADX INFO: renamed from: n */
    public int f115794n;

    /* JADX INFO: renamed from: o */
    public int f115795o;

    /* JADX INFO: renamed from: p */
    public final C0264x f115796p;

    /* JADX INFO: renamed from: q */
    public final C0264x f115797q;

    /* JADX INFO: renamed from: r */
    public final C0264x f115798r;

    /* JADX INFO: renamed from: s */
    public C0023g0 f115799s;

    /* JADX INFO: renamed from: t */
    public int f115800t;

    /* JADX INFO: renamed from: u */
    public int f115801u;

    /* JADX INFO: renamed from: v */
    public int f115802v;

    /* JADX INFO: renamed from: w */
    public boolean f115803w;

    /* JADX INFO: renamed from: x */
    public C0020f0 f115804x;

    public C28626i2(C28614f2 c28614f2) {
        this.f115781a = c28614f2;
        int[] iArr = c28614f2.f115764w;
        this.f115782b = iArr;
        Object[] objArr = c28614f2.f115766y;
        this.f115783c = objArr;
        this.f115784d = c28614f2.f115761I;
        this.f115785e = c28614f2.f115762J;
        this.f115786f = c28614f2.f115763K;
        int i13 = c28614f2.f115765x;
        this.f115787g = i13;
        this.f115788h = (iArr.length / 5) - i13;
        int i14 = c28614f2.f115767z;
        this.f115791k = i14;
        this.f115792l = objArr.length - i14;
        this.f115793m = i13;
        this.f115796p = new C0264x();
        this.f115797q = new C0264x();
        this.f115798r = new C0264x();
        this.f115801u = i13;
        this.f115802v = -1;
    }

    /* JADX INFO: renamed from: i */
    public static int m87034i(int i13, int i14, int i15, int i16) {
        return i13 > i14 ? -(((i16 - i15) - i13) + 1) : i13;
    }

    /* JADX INFO: renamed from: y */
    public static void m87035y(C28626i2 c28626i2) {
        int i13 = c28626i2.f115802v;
        int iM87072r = c28626i2.m87072r(i13);
        int[] iArr = c28626i2.f115782b;
        int i14 = (iM87072r * 5) + 1;
        int i15 = iArr[i14];
        if ((i15 & 134217728) != 0) {
            return;
        }
        int i16 = (i15 & (-134217729)) | 134217728;
        iArr[i14] = i16;
        if ((67108864 & i16) != 0) {
            return;
        }
        c28626i2.m87054S(c28626i2.m87039D(iArr, i13));
    }

    /* JADX INFO: renamed from: A */
    public final void m87036A(int i13) {
        C28591a c28591a;
        int i14;
        C28591a c28591a2;
        int i15;
        int i16;
        int i17 = this.f115788h;
        int i18 = this.f115787g;
        if (i18 != i13) {
            if (!this.f115784d.isEmpty()) {
                int iM87069o = m87069o() - this.f115788h;
                if (i18 < i13) {
                    for (int iM87027b = AbstractC28622h2.m87027b(this.f115784d, i18, iM87069o); iM87027b < this.f115784d.size() && (i15 = (c28591a2 = (C28591a) this.f115784d.get(iM87027b)).f115705a) < 0 && (i16 = i15 + iM87069o) < i13; iM87027b++) {
                        c28591a2.f115705a = i16;
                    }
                } else {
                    for (int iM87027b2 = AbstractC28622h2.m87027b(this.f115784d, i13, iM87069o); iM87027b2 < this.f115784d.size() && (i14 = (c28591a = (C28591a) this.f115784d.get(iM87027b2)).f115705a) >= 0; iM87027b2++) {
                        c28591a.f115705a = -(iM87069o - i14);
                    }
                }
            }
            if (i17 > 0) {
                int[] iArr = this.f115782b;
                int i19 = i13 * 5;
                int i24 = i17 * 5;
                int i25 = i18 * 5;
                if (i13 < i18) {
                    AbstractC25260n.m74064e0(i24 + i19, i19, iArr, iArr, i25);
                } else {
                    AbstractC25260n.m74064e0(i25, i25 + i24, iArr, iArr, i19 + i24);
                }
            }
            if (i13 < i18) {
                i18 = i13 + i17;
            }
            int iM87069o2 = m87069o();
            if (i18 >= iM87069o2) {
                AbstractC28659r.m87192c("Check failed");
            }
            while (i18 < iM87069o2) {
                int i26 = (i18 * 5) + 2;
                int i27 = this.f115782b[i26];
                int iM87070p = i27 > -2 ? i27 : (m87070p() + i27) - (-2);
                if (iM87070p >= i13) {
                    iM87070p = -((m87070p() - iM87070p) - (-2));
                }
                if (iM87070p != i27) {
                    this.f115782b[i26] = iM87070p;
                }
                i18++;
                if (i18 == i13) {
                    i18 += i17;
                }
            }
        }
        this.f115787g = i13;
    }

    /* JADX INFO: renamed from: B */
    public final void m87037B(int i13, int i14) {
        int i15 = this.f115792l;
        int i16 = this.f115791k;
        int i17 = this.f115793m;
        if (i16 != i13) {
            Object[] objArr = this.f115783c;
            if (i13 < i16) {
                System.arraycopy(objArr, i13, objArr, i13 + i15, i16 - i13);
            } else {
                int i18 = i16 + i15;
                System.arraycopy(objArr, i18, objArr, i16, (i13 + i15) - i18);
            }
        }
        int iMin = Math.min(i14 + 1, m87070p());
        if (i17 != iMin) {
            int length = this.f115783c.length - i15;
            if (iMin < i17) {
                int iM87072r = m87072r(iMin);
                int iM87072r2 = m87072r(i17);
                int i19 = this.f115787g;
                while (iM87072r < iM87072r2) {
                    int i24 = (iM87072r * 5) + 4;
                    int i25 = this.f115782b[i24];
                    if (!(i25 >= 0)) {
                        AbstractC28659r.m87192c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f115782b[i24] = -((length - i25) + 1);
                    iM87072r++;
                    if (iM87072r == i19) {
                        iM87072r += this.f115788h;
                    }
                }
            } else {
                int iM87072r3 = m87072r(i17);
                int iM87072r4 = m87072r(iMin);
                while (iM87072r3 < iM87072r4) {
                    int i26 = (iM87072r3 * 5) + 4;
                    int i27 = this.f115782b[i26];
                    if (!(i27 < 0)) {
                        AbstractC28659r.m87192c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f115782b[i26] = i27 + length + 1;
                    iM87072r3++;
                    if (iM87072r3 == this.f115787g) {
                        iM87072r3 += this.f115788h;
                    }
                }
            }
            this.f115793m = iMin;
        }
        this.f115791k = i13;
    }

    /* JADX INFO: renamed from: C */
    public final Object m87038C(int i13) {
        int iM87072r = m87072r(i13);
        int[] iArr = this.f115782b;
        if ((iArr[(iM87072r * 5) + 1] & 1073741824) != 0) {
            return this.f115783c[m87063h(m87062g(iArr, iM87072r))];
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final int m87039D(int[] iArr, int i13) {
        int i14 = iArr[(m87072r(i13) * 5) + 2];
        return i14 > -2 ? i14 : (m87070p() + i14) - (-2);
    }

    /* JADX INFO: renamed from: E */
    public final Object m87040E(Object obj) {
        if (this.f115794n > 0) {
            m87077w(1, this.f115802v);
        }
        Object[] objArr = this.f115783c;
        int i13 = this.f115789i;
        this.f115789i = i13 + 1;
        Object obj2 = objArr[m87063h(i13)];
        if (this.f115789i > this.f115790j) {
            AbstractC28659r.m87192c("Writing to an invalid slot");
        }
        this.f115783c[m87063h(this.f115789i - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: F */
    public final void m87041F() {
        int i13;
        C0020f0 c0020f0 = this.f115804x;
        if (c0020f0 != null) {
            while (c0020f0.f47b != 0) {
                int iM87241I = AbstractC28683x.m87241I(c0020f0);
                int iM87072r = m87072r(iM87241I);
                int iM87074t = iM87241I + 1;
                int iM87074t2 = m87074t(iM87241I) + iM87241I;
                while (true) {
                    if (iM87074t >= iM87074t2) {
                        i13 = 0;
                        break;
                    } else {
                        if ((this.f115782b[(m87072r(iM87074t) * 5) + 1] & 201326592) != 0) {
                            i13 = 1;
                            break;
                        }
                        iM87074t += m87074t(iM87074t);
                    }
                }
                int[] iArr = this.f115782b;
                int i14 = (iM87072r * 5) + 1;
                int i15 = iArr[i14];
                if (((67108864 & i15) != 0 ? 1 : 0) != i13) {
                    iArr[i14] = (i13 << 26) | ((-67108865) & i15);
                    int iM87039D = m87039D(iArr, iM87241I);
                    if (iM87039D >= 0) {
                        AbstractC28683x.m87258l(c0020f0, iM87039D);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m87042G() {
        if (!(this.f115794n == 0)) {
            AbstractC28659r.m87192c("Cannot remove group while inserting");
        }
        int i13 = this.f115800t;
        int i14 = this.f115789i;
        int iM87062g = m87062g(this.f115782b, m87072r(i13));
        int iM87046K = m87046K();
        m87049N(this.f115802v);
        C0020f0 c0020f0 = this.f115804x;
        if (c0020f0 != null) {
            while (true) {
                int i15 = c0020f0.f47b;
                if (i15 == 0) {
                    break;
                }
                if (i15 == 0) {
                    AbstractC34924m.m110136R("IntList is empty.");
                    throw null;
                }
                if (c0020f0.f46a[0] < i13) {
                    break;
                }
                AbstractC28683x.m87241I(c0020f0);
            }
        }
        boolean zM87043H = m87043H(i13, this.f115800t - i13);
        m87044I(iM87062g, this.f115789i - iM87062g, i13 - 1);
        this.f115800t = i13;
        this.f115789i = i14;
        this.f115795o -= iM87046K;
        return zM87043H;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m87043H(int i13, int i14) {
        boolean z4 = false;
        if (i14 > 0) {
            ArrayList arrayList = this.f115784d;
            m87036A(i13);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f115785e;
                int i15 = i13 + i14;
                int iM87027b = AbstractC28622h2.m87027b(this.f115784d, i15, m87069o() - this.f115788h);
                if (iM87027b >= this.f115784d.size()) {
                    iM87027b--;
                }
                int i16 = iM87027b + 1;
                int i17 = 0;
                while (iM87027b >= 0) {
                    C28591a c28591a = (C28591a) this.f115784d.get(iM87027b);
                    int iM87058c = m87058c(c28591a);
                    if (iM87058c < i13) {
                        break;
                    }
                    if (iM87058c < i15) {
                        c28591a.f115705a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i17 == 0) {
                            i17 = iM87027b + 1;
                        }
                        i16 = iM87027b;
                    }
                    iM87027b--;
                }
                z4 = i16 < i17;
                if (z4) {
                    this.f115784d.subList(i16, i17).clear();
                }
            }
            this.f115787g = i13;
            this.f115788h += i14;
            int i18 = this.f115793m;
            if (i18 > i13) {
                this.f115793m = Math.max(i13, i18 - i14);
            }
            int i19 = this.f115801u;
            if (i19 >= this.f115787g) {
                this.f115801u = i19 - i14;
            }
            int i24 = this.f115802v;
            if (i24 >= 0 && (this.f115782b[(m87072r(i24) * 5) + 1] & 67108864) != 0) {
                m87054S(i24);
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: I */
    public final void m87044I(int i13, int i14, int i15) {
        if (i14 > 0) {
            int i16 = this.f115792l;
            int i17 = i13 + i14;
            m87037B(i17, i15);
            this.f115791k = i13;
            this.f115792l = i16 + i14;
            AbstractC25260n.m74073n0(i13, i17, null, this.f115783c);
            int i18 = this.f115790j;
            if (i18 >= i13) {
                this.f115790j = i18 - i14;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final Object m87045J(int i13, int i14, Object obj) {
        int iM87048M = m87048M(this.f115782b, m87072r(i13));
        int iM87062g = m87062g(this.f115782b, m87072r(i13 + 1));
        int i15 = iM87048M + i14;
        if (i15 < iM87048M || i15 >= iM87062g) {
            AbstractC28659r.m87192c("Write to an invalid slot index " + i14 + " for group " + i13);
        }
        int iM87063h = m87063h(i15);
        Object[] objArr = this.f115783c;
        Object obj2 = objArr[iM87063h];
        objArr[iM87063h] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: K */
    public final int m87046K() {
        int iM87072r = m87072r(this.f115800t);
        int iM87026a = AbstractC28622h2.m87026a(this.f115782b, iM87072r) + this.f115800t;
        this.f115800t = iM87026a;
        this.f115789i = m87062g(this.f115782b, m87072r(iM87026a));
        int i13 = this.f115782b[(iM87072r * 5) + 1];
        if ((1073741824 & i13) != 0) {
            return 1;
        }
        return i13 & 67108863;
    }

    /* JADX INFO: renamed from: L */
    public final void m87047L() {
        int i13 = this.f115801u;
        this.f115800t = i13;
        this.f115789i = m87062g(this.f115782b, m87072r(i13));
    }

    /* JADX INFO: renamed from: M */
    public final int m87048M(int[] iArr, int i13) {
        if (i13 >= m87069o()) {
            return this.f115783c.length - this.f115792l;
        }
        int iM87028c = AbstractC28622h2.m87028c(iArr, i13);
        return iM87028c < 0 ? (this.f115783c.length - this.f115792l) + iM87028c + 1 : iM87028c;
    }

    /* JADX INFO: renamed from: N */
    public final AbstractC28644n0 m87049N(int i13) {
        C28591a c28591aM87052Q;
        HashMap map = this.f115785e;
        if (map == null || (c28591aM87052Q = m87052Q(i13)) == null) {
            return null;
        }
        return (AbstractC28644n0) map.get(c28591aM87052Q);
    }

    /* JADX INFO: renamed from: O */
    public final void m87050O() {
        if (this.f115794n != 0) {
            AbstractC28659r.m87192c("Key must be supplied when inserting");
        }
        C28676v0 c28676v0 = C28635l.f115821a;
        m87051P(c28676v0, c28676v0, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final void m87051P(Object obj, Object obj2, boolean z4, int i13) {
        int i14;
        int i15 = this.f115802v;
        Object[] objArr = this.f115794n > 0;
        this.f115798r.m799c(this.f115795o);
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objArr == true) {
            int i16 = this.f115800t;
            int iM87062g = m87062g(this.f115782b, m87072r(i16));
            m87076v(1);
            this.f115789i = iM87062g;
            this.f115790j = iM87062g;
            int iM87072r = m87072r(i16);
            int i17 = obj != c28676v0 ? 1 : 0;
            int i18 = (z4 || obj2 == c28676v0) ? 0 : 1;
            int iM87034i = m87034i(iM87062g, this.f115791k, this.f115792l, this.f115783c.length);
            if (iM87034i >= 0 && this.f115793m < i16) {
                iM87034i = -(((this.f115783c.length - this.f115792l) - iM87034i) + 1);
            }
            int[] iArr = this.f115782b;
            int i19 = this.f115802v;
            int i24 = iM87072r * 5;
            iArr[i24] = i13;
            iArr[i24 + 1] = ((z4 ? 1 : 0) << 30) | (i17 << 29) | (i18 << 28);
            iArr[i24 + 2] = i19;
            iArr[i24 + 3] = 0;
            iArr[i24 + 4] = iM87034i;
            int i25 = (z4 ? 1 : 0) + i17 + i18;
            if (i25 > 0) {
                m87077w(i25, i16);
                Object[] objArr2 = this.f115783c;
                int i26 = this.f115789i;
                if (z4) {
                    objArr2[i26] = obj2;
                    i26++;
                }
                if (i17 != 0) {
                    objArr2[i26] = obj;
                    i26++;
                }
                if (i18 != 0) {
                    objArr2[i26] = obj2;
                    i26++;
                }
                this.f115789i = i26;
            }
            this.f115795o = 0;
            i14 = i16 + 1;
            this.f115802v = i16;
            this.f115800t = i14;
            if (i15 >= 0) {
                m87049N(i15);
            }
        } else {
            this.f115796p.m799c(i15);
            this.f115797q.m799c((m87069o() - this.f115788h) - this.f115801u);
            int i27 = this.f115800t;
            int iM87072r2 = m87072r(i27);
            if (!AbstractC22676k.m65745e(obj2, c28676v0)) {
                if (z4) {
                    m87055T(this.f115800t, obj2);
                } else {
                    m87053R(obj2);
                }
            }
            this.f115789i = m87048M(this.f115782b, iM87072r2);
            this.f115790j = m87062g(this.f115782b, m87072r(this.f115800t + 1));
            int[] iArr2 = this.f115782b;
            int i28 = iM87072r2 * 5;
            this.f115795o = iArr2[i28 + 1] & 67108863;
            this.f115802v = i27;
            this.f115800t = i27 + 1;
            i14 = i27 + iArr2[i28 + 3];
        }
        this.f115801u = i14;
    }

    /* JADX INFO: renamed from: Q */
    public final C28591a m87052Q(int i13) {
        ArrayList arrayList;
        int iM87030e;
        if (i13 < 0 || i13 >= m87070p() || (iM87030e = AbstractC28622h2.m87030e((arrayList = this.f115784d), i13, m87070p())) < 0) {
            return null;
        }
        return (C28591a) arrayList.get(iM87030e);
    }

    /* JADX INFO: renamed from: R */
    public final void m87053R(Object obj) {
        int iM87072r = m87072r(this.f115800t);
        int i13 = (iM87072r * 5) + 1;
        if ((this.f115782b[i13] & 268435456) == 0) {
            AbstractC28659r.m87192c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f115783c;
        int[] iArr = this.f115782b;
        objArr[m87063h(Integer.bitCount(iArr[i13] >> 29) + m87062g(iArr, iM87072r))] = obj;
    }

    /* JADX INFO: renamed from: S */
    public final void m87054S(int i13) {
        if (i13 >= 0) {
            C0020f0 c0020f0 = this.f115804x;
            if (c0020f0 == null) {
                c0020f0 = new C0020f0();
                this.f115804x = c0020f0;
            }
            AbstractC28683x.m87258l(c0020f0, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: T */
    public final void m87055T(int i13, Object obj) {
        boolean z4;
        int iM87072r = m87072r(i13);
        int[] iArr = this.f115782b;
        if (iM87072r < iArr.length) {
            z4 = (iArr[(iM87072r * 5) + 1] & 1073741824) != 0;
        }
        if (!z4) {
            AbstractC28659r.m87192c("Updating the node of a group at " + i13 + " that was not created with as a node group");
        }
        this.f115783c[m87063h(m87062g(this.f115782b, iM87072r))] = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m87056a(int i13) {
        boolean z4 = false;
        if (!(i13 >= 0)) {
            AbstractC28659r.m87192c("Cannot seek backwards");
        }
        if (!(this.f115794n <= 0)) {
            AbstractC28657q1.m87189b("Cannot call seek() while inserting");
        }
        if (i13 == 0) {
            return;
        }
        int i14 = this.f115800t + i13;
        if (i14 >= this.f115802v && i14 <= this.f115801u) {
            z4 = true;
        }
        if (!z4) {
            AbstractC28659r.m87192c("Cannot seek outside the current group (" + this.f115802v + '-' + this.f115801u + ')');
        }
        this.f115800t = i14;
        int iM87062g = m87062g(this.f115782b, m87072r(i14));
        this.f115789i = iM87062g;
        this.f115790j = iM87062g;
    }

    /* JADX INFO: renamed from: b */
    public final C28591a m87057b(int i13) {
        ArrayList arrayList = this.f115784d;
        int iM87030e = AbstractC28622h2.m87030e(arrayList, i13, m87070p());
        if (iM87030e >= 0) {
            return (C28591a) arrayList.get(iM87030e);
        }
        if (i13 > this.f115787g) {
            i13 = -(m87070p() - i13);
        }
        C28591a c28591a = new C28591a(i13);
        arrayList.add(-(iM87030e + 1), c28591a);
        return c28591a;
    }

    /* JADX INFO: renamed from: c */
    public final int m87058c(C28591a c28591a) {
        int i13 = c28591a.f115705a;
        return i13 < 0 ? m87070p() + i13 : i13;
    }

    /* JADX INFO: renamed from: d */
    public final void m87059d() {
        int i13 = this.f115794n;
        this.f115794n = i13 + 1;
        if (i13 == 0) {
            this.f115797q.m799c((m87069o() - this.f115788h) - this.f115801u);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m87060e(boolean z4) {
        this.f115803w = true;
        if (z4 && this.f115796p.f903b == 0) {
            m87036A(m87070p());
            m87037B(this.f115783c.length - this.f115792l, this.f115787g);
            int i13 = this.f115791k;
            Arrays.fill(this.f115783c, i13, this.f115792l + i13, (Object) null);
            m87041F();
        }
        int[] iArr = this.f115782b;
        int i14 = this.f115787g;
        Object[] objArr = this.f115783c;
        int i15 = this.f115791k;
        ArrayList arrayList = this.f115784d;
        HashMap map = this.f115785e;
        C0023g0 c0023g0 = this.f115786f;
        C28614f2 c28614f2 = this.f115781a;
        if (!c28614f2.f115759G) {
            AbstractC28657q1.m87188a("Unexpected writer close()");
        }
        c28614f2.f115759G = false;
        c28614f2.f115764w = iArr;
        c28614f2.f115765x = i14;
        c28614f2.f115766y = objArr;
        c28614f2.f115767z = i15;
        c28614f2.f115761I = arrayList;
        c28614f2.f115762J = map;
        c28614f2.f115763K = c0023g0;
    }

    /* JADX INFO: renamed from: f */
    public final int m87061f(int i13) {
        return m87062g(this.f115782b, m87072r(i13));
    }

    /* JADX INFO: renamed from: g */
    public final int m87062g(int[] iArr, int i13) {
        if (i13 >= m87069o()) {
            return this.f115783c.length - this.f115792l;
        }
        int i14 = iArr[(i13 * 5) + 4];
        return i14 < 0 ? (this.f115783c.length - this.f115792l) + i14 + 1 : i14;
    }

    /* JADX INFO: renamed from: h */
    public final int m87063h(int i13) {
        return (this.f115792l * (i13 < this.f115791k ? 0 : 1)) + i13;
    }

    /* JADX INFO: renamed from: j */
    public final void m87064j() {
        C0047q0 c0047q0;
        boolean z4 = this.f115794n > 0;
        int i13 = this.f115800t;
        int i14 = this.f115801u;
        int i15 = this.f115802v;
        int iM87072r = m87072r(i15);
        int i16 = this.f115795o;
        int i17 = i13 - i15;
        int i18 = iM87072r * 5;
        int i19 = i18 + 1;
        boolean z13 = (this.f115782b[i19] & 1073741824) != 0;
        C0264x c0264x = this.f115798r;
        if (z4) {
            C0023g0 c0023g0 = this.f115799s;
            if (c0023g0 != null && (c0047q0 = (C0047q0) c0023g0.m121b(i15)) != null) {
                Object[] objArr = c0047q0.f136a;
                int i24 = c0047q0.f137b;
                for (int i25 = 0; i25 < i24; i25++) {
                    m87040E(objArr[i25]);
                }
            }
            int[] iArr = this.f115782b;
            iArr[i18 + 3] = i17;
            AbstractC28622h2.m87029d(iM87072r, i16, iArr);
            int iM798b = c0264x.m798b();
            if (z13) {
                i16 = 1;
            }
            this.f115795o = iM798b + i16;
            int iM87039D = m87039D(this.f115782b, i15);
            this.f115802v = iM87039D;
            int iM87070p = iM87039D < 0 ? m87070p() : m87072r(iM87039D + 1);
            int iM87062g = iM87070p >= 0 ? m87062g(this.f115782b, iM87070p) : 0;
            this.f115789i = iM87062g;
            this.f115790j = iM87062g;
            return;
        }
        if (i13 != i14) {
            AbstractC28659r.m87192c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f115782b;
        int i26 = i18 + 3;
        int i27 = iArr2[i26];
        int i28 = iArr2[i19] & 67108863;
        iArr2[i26] = i17;
        AbstractC28622h2.m87029d(iM87072r, i16, iArr2);
        int iM798b2 = this.f115796p.m798b();
        this.f115801u = (m87069o() - this.f115788h) - this.f115797q.m798b();
        this.f115802v = iM798b2;
        int iM87039D2 = m87039D(this.f115782b, i15);
        int iM798b3 = c0264x.m798b();
        this.f115795o = iM798b3;
        if (iM87039D2 == iM798b2) {
            this.f115795o = iM798b3 + (z13 ? 0 : i16 - i28);
            return;
        }
        int i29 = i17 - i27;
        int i34 = z13 ? 0 : i16 - i28;
        if (i29 != 0 || i34 != 0) {
            while (iM87039D2 != 0 && iM87039D2 != iM798b2 && (i34 != 0 || i29 != 0)) {
                int iM87072r2 = m87072r(iM87039D2);
                if (i29 != 0) {
                    int[] iArr3 = this.f115782b;
                    int i35 = (iM87072r2 * 5) + 3;
                    iArr3[i35] = iArr3[i35] + i29;
                }
                if (i34 != 0) {
                    int[] iArr4 = this.f115782b;
                    AbstractC28622h2.m87029d(iM87072r2, (iArr4[(iM87072r2 * 5) + 1] & 67108863) + i34, iArr4);
                }
                int[] iArr5 = this.f115782b;
                if ((iArr5[(iM87072r2 * 5) + 1] & 1073741824) != 0) {
                    i34 = 0;
                }
                iM87039D2 = m87039D(iArr5, iM87039D2);
            }
        }
        this.f115795o += i34;
    }

    /* JADX INFO: renamed from: k */
    public final void m87065k() {
        if (this.f115794n <= 0) {
            AbstractC28657q1.m87189b("Unbalanced begin/end insert");
        }
        int i13 = this.f115794n - 1;
        this.f115794n = i13;
        if (i13 == 0) {
            if (this.f115798r.f903b != this.f115796p.f903b) {
                AbstractC28659r.m87192c("startGroup/endGroup mismatch while inserting");
            }
            this.f115801u = (m87069o() - this.f115788h) - this.f115797q.m798b();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m87066l(int i13) {
        boolean z4 = false;
        if (!(this.f115794n <= 0)) {
            AbstractC28659r.m87192c("Cannot call ensureStarted() while inserting");
        }
        int i14 = this.f115802v;
        if (i14 != i13) {
            if (i13 >= i14 && i13 < this.f115801u) {
                z4 = true;
            }
            if (!z4) {
                AbstractC28659r.m87192c("Started group at " + i13 + " must be a subgroup of the group at " + i14);
            }
            int i15 = this.f115800t;
            int i16 = this.f115789i;
            int i17 = this.f115790j;
            this.f115800t = i13;
            m87050O();
            this.f115800t = i15;
            this.f115789i = i16;
            this.f115790j = i17;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m87067m(int i13, int i14, int i15) {
        if (i13 >= this.f115787g) {
            i13 = -((m87070p() - i13) + 2);
        }
        while (i15 < i14) {
            this.f115782b[(m87072r(i15) * 5) + 2] = i13;
            int i16 = this.f115782b[(m87072r(i15) * 5) + 3] + i15;
            m87067m(i15, i16, i15 + 1);
            i15 = i16;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m87068n(int i13, InterfaceC4351m interfaceC4351m) {
        int i14;
        int i15;
        C28591a c28591a;
        int iM87039D = m87039D(this.f115782b, i13);
        int iM87070p = m87070p();
        int iM87074t = m87074t(i13) + i13;
        int i16 = i13;
        C0026h0 c0026h0 = null;
        C0020f0 c0020f0 = null;
        while (i16 < iM87074t) {
            int i17 = i16 + 1;
            int iM87061f = m87061f(i17);
            for (int iM87061f2 = m87061f(i16); iM87061f2 < iM87061f; iM87061f2++) {
                Object obj = this.f115783c[m87063h(iM87061f2)];
                if ((obj instanceof C28594a2) && (c28591a = ((C28594a2) obj).f115708b) != null && c28591a.m86976a()) {
                    int iM87058c = m87058c(c28591a);
                    if (c0026h0 == null) {
                        int[] iArr = AbstractC0054u.f166a;
                        c0026h0 = new C0026h0();
                    }
                    if (c0020f0 == null) {
                        c0020f0 = new C0020f0();
                    }
                    c0026h0.m61a(iM87058c);
                    c0020f0.m26a(iM87058c);
                    c0020f0.m26a(iM87061f2);
                } else {
                    interfaceC4351m.invoke(Integer.valueOf(iM87061f2), obj);
                }
            }
            int iM87039D2 = i17 < iM87070p ? m87039D(this.f115782b, i17) : -1;
            if (iM87039D2 != i16) {
                while (true) {
                    if (c0020f0 == null || c0026h0 == null || !c0026h0.m65e(i16)) {
                        i14 = iM87070p;
                    } else {
                        int i18 = c0020f0.f47b;
                        int i19 = i18 / 2;
                        int i24 = 0;
                        int i25 = 0;
                        while (i24 < i19) {
                            int i26 = i24 * 2;
                            int i27 = iM87070p;
                            int iM28c = c0020f0.m28c(i26);
                            if (iM28c == i16) {
                                int iM28c2 = c0020f0.m28c(i26 + 1);
                                interfaceC4351m.invoke(Integer.valueOf(iM28c2), this.f115783c[m87063h(iM28c2)]);
                            } else if (i26 != i25) {
                                int i28 = i25 + 1;
                                c0020f0.m32g(i25, iM28c);
                                i25 += 2;
                                c0020f0.m32g(i28, c0020f0.m28c(i26 + 1));
                            } else {
                                i25 += 2;
                            }
                            i24++;
                            interfaceC4351m = interfaceC4351m;
                            iM87070p = i27;
                        }
                        i14 = iM87070p;
                        if (i25 != i18) {
                            if (i25 < 0 || i25 > (i15 = c0020f0.f47b) || i18 < 0 || i18 > i15) {
                                AbstractC34924m.m110135Q("Index must be between 0 and size");
                                throw null;
                            }
                            if (i18 < i25) {
                                AbstractC34924m.m110133O("The end index must be < start index");
                                throw null;
                            }
                            if (i18 != i25) {
                                if (i18 < i15) {
                                    int[] iArr2 = c0020f0.f46a;
                                    AbstractC25260n.m74064e0(i25, i18, iArr2, iArr2, i15);
                                }
                                c0020f0.f47b -= i18 - i25;
                            }
                        }
                    }
                    if (i16 == i13 || iM87039D == iM87039D2) {
                        break;
                    }
                    i16 = iM87039D;
                    iM87070p = i14;
                    iM87039D = m87039D(this.f115782b, iM87039D);
                    interfaceC4351m = interfaceC4351m;
                }
            } else {
                i14 = iM87070p;
            }
            iM87039D = iM87039D2;
            i16 = i17;
            iM87070p = i14;
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m87069o() {
        return this.f115782b.length / 5;
    }

    /* JADX INFO: renamed from: p */
    public final int m87070p() {
        return m87069o() - this.f115788h;
    }

    /* JADX INFO: renamed from: q */
    public final Object m87071q(int i13) {
        int iM87072r = m87072r(i13);
        int[] iArr = this.f115782b;
        int i14 = (iM87072r * 5) + 1;
        if ((iArr[i14] & 268435456) == 0) {
            return C28635l.f115821a;
        }
        return this.f115783c[Integer.bitCount(iArr[i14] >> 29) + m87062g(iArr, iM87072r)];
    }

    /* JADX INFO: renamed from: r */
    public final int m87072r(int i13) {
        return (this.f115788h * (i13 < this.f115787g ? 0 : 1)) + i13;
    }

    /* JADX INFO: renamed from: s */
    public final Object m87073s(int i13) {
        int iM87072r = m87072r(i13);
        int[] iArr = this.f115782b;
        int i14 = iM87072r * 5;
        int i15 = iArr[i14 + 1];
        if ((536870912 & i15) == 0) {
            return null;
        }
        return this.f115783c[Integer.bitCount(i15 >> 30) + iArr[i14 + 4]];
    }

    /* JADX INFO: renamed from: t */
    public final int m87074t(int i13) {
        return AbstractC28622h2.m87026a(this.f115782b, m87072r(i13));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f115800t + " end=" + this.f115801u + " size = " + m87070p() + " gap=" + this.f115787g + '-' + (this.f115787g + this.f115788h) + ')';
    }

    /* JADX INFO: renamed from: u */
    public final boolean m87075u(int i13, int i14) {
        int iM87069o;
        int iM87074t;
        if (i14 == this.f115802v) {
            iM87069o = this.f115801u;
        } else {
            C0264x c0264x = this.f115796p;
            if (i14 > c0264x.m797a(0)) {
                iM87074t = m87074t(i14);
            } else {
                int[] iArr = c0264x.f902a;
                int iMin = Math.min(iArr.length, c0264x.f903b);
                int i15 = 0;
                while (true) {
                    if (i15 >= iMin) {
                        i15 = -1;
                        break;
                    }
                    if (iArr[i15] == i14) {
                        break;
                    }
                    i15++;
                }
                if (i15 < 0) {
                    iM87074t = m87074t(i14);
                } else {
                    iM87069o = (m87069o() - this.f115788h) - this.f115797q.f902a[i15];
                }
            }
            iM87069o = iM87074t + i14;
        }
        return i13 > i14 && i13 < iM87069o;
    }

    /* JADX INFO: renamed from: v */
    public final void m87076v(int i13) {
        if (i13 > 0) {
            int i14 = this.f115800t;
            m87036A(i14);
            int i15 = this.f115787g;
            int i16 = this.f115788h;
            int[] iArr = this.f115782b;
            int length = iArr.length / 5;
            int i17 = length - i16;
            if (i16 < i13) {
                int iMax = Math.max(Math.max(length * 2, i17 + i13), 32);
                int[] iArr2 = new int[iMax * 5];
                int i18 = iMax - i17;
                AbstractC25260n.m74064e0(0, 0, iArr, iArr2, i15 * 5);
                AbstractC25260n.m74064e0((i15 + i18) * 5, (i16 + i15) * 5, iArr, iArr2, length * 5);
                this.f115782b = iArr2;
                i16 = i18;
            }
            int i19 = this.f115801u;
            if (i19 >= i15) {
                this.f115801u = i19 + i13;
            }
            int i24 = i15 + i13;
            this.f115787g = i24;
            this.f115788h = i16 - i13;
            int iM87034i = m87034i(i17 > 0 ? m87061f(i14 + i13) : 0, this.f115793m >= i15 ? this.f115791k : 0, this.f115792l, this.f115783c.length);
            for (int i25 = i15; i25 < i24; i25++) {
                this.f115782b[(i25 * 5) + 4] = iM87034i;
            }
            int i26 = this.f115793m;
            if (i26 >= i15) {
                this.f115793m = i26 + i13;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m87077w(int i13, int i14) {
        if (i13 > 0) {
            m87037B(this.f115789i, i14);
            int i15 = this.f115791k;
            int i16 = this.f115792l;
            if (i16 < i13) {
                Object[] objArr = this.f115783c;
                int length = objArr.length;
                int i17 = length - i16;
                int iMax = Math.max(Math.max(length * 2, i17 + i13), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i18 = 0; i18 < iMax; i18++) {
                    objArr2[i18] = null;
                }
                int i19 = iMax - i17;
                int i24 = i16 + i15;
                System.arraycopy(objArr, 0, objArr2, 0, i15);
                System.arraycopy(objArr, i24, objArr2, i15 + i19, length - i24);
                this.f115783c = objArr2;
                i16 = i19;
            }
            int i25 = this.f115790j;
            if (i25 >= i15) {
                this.f115790j = i25 + i13;
            }
            this.f115791k = i15 + i13;
            this.f115792l = i16 - i13;
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m87078x(int i13) {
        return (this.f115782b[(m87072r(i13) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public final void m87079z(C28614f2 c28614f2, int i13) {
        if (this.f115794n <= 0) {
            AbstractC28659r.m87192c("Check failed");
        }
        boolean z4 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i13 == 0 && this.f115800t == 0 && this.f115781a.f115765x == 0) {
            int[] iArr = c28614f2.f115764w;
            int i14 = iArr[(i13 * 5) + 3];
            int i15 = c28614f2.f115765x;
            if (i14 == i15) {
                int[] iArr2 = this.f115782b;
                Object[] objArr3 = this.f115783c;
                ArrayList arrayList = this.f115784d;
                HashMap map = this.f115785e;
                C0023g0 c0023g0 = this.f115786f;
                Object[] objArr4 = c28614f2.f115766y;
                int i16 = c28614f2.f115767z;
                HashMap map2 = c28614f2.f115762J;
                C0023g0 c0023g1 = c28614f2.f115763K;
                this.f115782b = iArr;
                this.f115783c = objArr4;
                this.f115784d = c28614f2.f115761I;
                this.f115787g = i15;
                this.f115788h = (iArr.length / 5) - i15;
                this.f115791k = i16;
                this.f115792l = objArr4.length - i16;
                this.f115793m = i15;
                this.f115785e = map2;
                this.f115786f = c0023g1;
                c28614f2.f115764w = iArr2;
                c28614f2.f115765x = objArr2 == true ? 1 : 0;
                c28614f2.f115766y = objArr3;
                c28614f2.f115767z = objArr == true ? 1 : 0;
                c28614f2.f115761I = arrayList;
                c28614f2.f115762J = map;
                c28614f2.f115763K = c0023g0;
                return;
            }
        }
        C28626i2 c28626i2M87017e = c28614f2.m87017e();
        try {
            AbstractC28683x.m87270x(c28626i2M87017e, i13, this, true, true, false);
            boolean z13 = true;
        } finally {
            c28626i2M87017e.m87060e(z4);
        }
    }
}
