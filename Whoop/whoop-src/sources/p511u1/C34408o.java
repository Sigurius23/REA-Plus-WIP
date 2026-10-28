package p511u1;

import androidx.room.AbstractC1772c1;
import e93.AbstractC12889b;
import i93.C18282h;
import java.util.Arrays;
import m83.AbstractC25260n;
import p390p1.AbstractC28657q1;
import p569w1.C36687a;
import p569w1.C36688b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C34408o {

    /* JADX INFO: renamed from: e */
    public static final C34408o f144623e = new C34408o(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f144624a;

    /* JADX INFO: renamed from: b */
    public int f144625b;

    /* JADX INFO: renamed from: c */
    public final C36688b f144626c;

    /* JADX INFO: renamed from: d */
    public Object[] f144627d;

    public C34408o(int i13, int i14, Object[] objArr, C36688b c36688b) {
        this.f144624a = i13;
        this.f144625b = i14;
        this.f144626c = c36688b;
        this.f144627d = objArr;
    }

    /* JADX INFO: renamed from: j */
    public static C34408o m108766j(int i13, Object obj, Object obj2, int i14, Object obj3, Object obj4, int i15, C36688b c36688b) {
        if (i15 > 30) {
            return new C34408o(0, 0, new Object[]{obj, obj2, obj3, obj4}, c36688b);
        }
        int iM5367B = AbstractC1772c1.m5367B(i13, i15);
        int iM5367B2 = AbstractC1772c1.m5367B(i14, i15);
        if (iM5367B != iM5367B2) {
            return new C34408o((1 << iM5367B) | (1 << iM5367B2), 0, iM5367B < iM5367B2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c36688b);
        }
        return new C34408o(0, 1 << iM5367B, new Object[]{m108766j(i13, obj, obj2, i14, obj3, obj4, i15 + 5, c36688b)}, c36688b);
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m108767a(int i13, int i14, int i15, Object obj, Object obj2, int i16, C36688b c36688b) {
        Object obj3 = this.f144627d[i13];
        C34408o c34408oM108766j = m108766j(obj3 != null ? obj3.hashCode() : 0, obj3, m108789x(i13), i15, obj, obj2, i16 + 5, c36688b);
        int iM108785t = m108785t(i14);
        int i17 = iM108785t + 1;
        Object[] objArr = this.f144627d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC25260n.m74068i0(0, i13, 6, objArr, objArr2);
        AbstractC25260n.m74062d0(i13, i13 + 2, i17, objArr, objArr2);
        objArr2[iM108785t - 1] = c34408oM108766j;
        AbstractC25260n.m74062d0(iM108785t, i17, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public final int m108768b() {
        if (this.f144625b == 0) {
            return this.f144627d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f144624a);
        int length = this.f144627d.length;
        for (int i13 = iBitCount * 2; i13 < length; i13++) {
            iBitCount += m108784s(i13).m108768b();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m108769c(Object obj) {
        C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, this.f144627d.length));
        int i13 = c18282hM36268d0.f71133w;
        int i14 = c18282hM36268d0.f71134x;
        int i15 = c18282hM36268d0.f71135y;
        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
            while (!AbstractC22676k.m65745e(obj, this.f144627d[i13])) {
                if (i13 != i14) {
                    i13 += i15;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m108770d(int i13, int i14, Object obj) {
        int iM5367B = 1 << AbstractC1772c1.m5367B(i13, i14);
        if (m108774h(iM5367B)) {
            return AbstractC22676k.m65745e(obj, this.f144627d[m108772f(iM5367B)]);
        }
        if (!m108775i(iM5367B)) {
            return false;
        }
        C34408o c34408oM108784s = m108784s(m108785t(iM5367B));
        return i14 == 30 ? c34408oM108784s.m108769c(obj) : c34408oM108784s.m108770d(i13, i14 + 5, obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m108771e(C34408o c34408o) {
        if (this == c34408o) {
            return true;
        }
        if (this.f144625b == c34408o.f144625b && this.f144624a == c34408o.f144624a) {
            int length = this.f144627d.length;
            for (int i13 = 0; i13 < length; i13++) {
                if (this.f144627d[i13] == c34408o.f144627d[i13]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m108772f(int i13) {
        return Integer.bitCount((i13 - 1) & this.f144624a) * 2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m108773g(int i13, int i14, Object obj) {
        int iM5367B = 1 << AbstractC1772c1.m5367B(i13, i14);
        if (m108774h(iM5367B)) {
            int iM108772f = m108772f(iM5367B);
            if (AbstractC22676k.m65745e(obj, this.f144627d[iM108772f])) {
                return m108789x(iM108772f);
            }
            return null;
        }
        if (!m108775i(iM5367B)) {
            return null;
        }
        C34408o c34408oM108784s = m108784s(m108785t(iM5367B));
        if (i14 != 30) {
            return c34408oM108784s.m108773g(i13, i14 + 5, obj);
        }
        C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, c34408oM108784s.f144627d.length));
        int i15 = c18282hM36268d0.f71133w;
        int i16 = c18282hM36268d0.f71134x;
        int i17 = c18282hM36268d0.f71135y;
        if ((i17 <= 0 || i15 > i16) && (i17 >= 0 || i16 > i15)) {
            return null;
        }
        while (!AbstractC22676k.m65745e(obj, c34408oM108784s.f144627d[i15])) {
            if (i15 == i16) {
                return null;
            }
            i15 += i17;
        }
        return c34408oM108784s.m108789x(i15);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m108774h(int i13) {
        return (i13 & this.f144624a) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m108775i(int i13) {
        return (i13 & this.f144625b) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final C34408o m108776k(int i13, C34398e c34398e) {
        c34398e.m108764g(c34398e.f144608F - 1);
        c34398e.f144612z = m108789x(i13);
        Object[] objArr = this.f144627d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f144626c != c34398e.f144610x) {
            return new C34408o(0, 0, AbstractC1772c1.m5388e(i13, objArr), c34398e.f144610x);
        }
        this.f144627d = AbstractC1772c1.m5388e(i13, objArr);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C34408o m108777l(int i13, Object obj, Object obj2, int i14, C34398e c34398e) {
        C34398e c34398e2;
        C34408o c34408oM108777l;
        int iM5367B = 1 << AbstractC1772c1.m5367B(i13, i14);
        boolean zM108774h = m108774h(iM5367B);
        C36688b c36688b = this.f144626c;
        if (zM108774h) {
            int iM108772f = m108772f(iM5367B);
            if (!AbstractC22676k.m65745e(obj, this.f144627d[iM108772f])) {
                c34398e.m108764g(c34398e.f144608F + 1);
                C36688b c36688b2 = c34398e.f144610x;
                if (c36688b != c36688b2) {
                    return new C34408o(this.f144624a ^ iM5367B, this.f144625b | iM5367B, m108767a(iM108772f, iM5367B, i13, obj, obj2, i14, c36688b2), c36688b2);
                }
                this.f144627d = m108767a(iM108772f, iM5367B, i13, obj, obj2, i14, c36688b2);
                this.f144624a ^= iM5367B;
                this.f144625b |= iM5367B;
                return this;
            }
            c34398e.f144612z = m108789x(iM108772f);
            if (m108789x(iM108772f) == obj2) {
                return this;
            }
            if (c36688b == c34398e.f144610x) {
                this.f144627d[iM108772f + 1] = obj2;
                return this;
            }
            c34398e.f144607E++;
            Object[] objArr = this.f144627d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iM108772f + 1] = obj2;
            return new C34408o(this.f144624a, this.f144625b, objArrCopyOf, c34398e.f144610x);
        }
        if (!m108775i(iM5367B)) {
            c34398e.m108764g(c34398e.f144608F + 1);
            C36688b c36688b3 = c34398e.f144610x;
            int iM108772f2 = m108772f(iM5367B);
            if (c36688b != c36688b3) {
                return new C34408o(this.f144624a | iM5367B, this.f144625b, AbstractC1772c1.m5387d(this.f144627d, iM108772f2, obj, obj2), c36688b3);
            }
            this.f144627d = AbstractC1772c1.m5387d(this.f144627d, iM108772f2, obj, obj2);
            this.f144624a |= iM5367B;
            return this;
        }
        int iM108785t = m108785t(iM5367B);
        C34408o c34408oM108784s = m108784s(iM108785t);
        if (i14 == 30) {
            C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, c34408oM108784s.f144627d.length));
            int i15 = c18282hM36268d0.f71133w;
            int i16 = c18282hM36268d0.f71134x;
            int i17 = c18282hM36268d0.f71135y;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (true) {
                    if (!AbstractC22676k.m65745e(obj, c34408oM108784s.f144627d[i15])) {
                        if (i15 == i16) {
                            c34398e.m108764g(c34398e.f144608F + 1);
                            c34408oM108777l = new C34408o(0, 0, AbstractC1772c1.m5387d(c34408oM108784s.f144627d, 0, obj, obj2), c34398e.f144610x);
                            break;
                        }
                        i15 += i17;
                    } else {
                        c34398e.f144612z = c34408oM108784s.m108789x(i15);
                        if (c34408oM108784s.f144626c != c34398e.f144610x) {
                            c34398e.f144607E++;
                            Object[] objArr2 = c34408oM108784s.f144627d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            AbstractC22676k.m65749i(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i15 + 1] = obj2;
                            c34408oM108777l = new C34408o(0, 0, objArrCopyOf2, c34398e.f144610x);
                            break;
                        }
                        c34408oM108784s.f144627d[i15 + 1] = obj2;
                        c34408oM108777l = c34408oM108784s;
                        break;
                    }
                }
            } else {
                c34398e.m108764g(c34398e.f144608F + 1);
                c34408oM108777l = new C34408o(0, 0, AbstractC1772c1.m5387d(c34408oM108784s.f144627d, 0, obj, obj2), c34398e.f144610x);
                break;
            }
            c34398e2 = c34398e;
        } else {
            c34398e2 = c34398e;
            c34408oM108777l = c34408oM108784s.m108777l(i13, obj, obj2, i14 + 5, c34398e2);
        }
        return c34408oM108784s == c34408oM108777l ? this : m108783r(iM108785t, c34408oM108777l, c34398e2.f144610x);
    }

    /* JADX INFO: renamed from: m */
    public final C34408o m108778m(C34408o c34408o, int i13, C36687a c36687a, C34398e c34398e) {
        C34408o c34408o2;
        Object[] objArr;
        C34408o c34408oM108766j;
        if (this == c34408o) {
            c36687a.f157124a += m108768b();
            return this;
        }
        int i14 = 0;
        if (i13 > 30) {
            C36688b c36688b = c34398e.f144610x;
            int i15 = c34408o.f144625b;
            Object[] objArr2 = this.f144627d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c34408o.f144627d.length);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            int length = this.f144627d.length;
            C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, c34408o.f144627d.length));
            int i16 = c18282hM36268d0.f71133w;
            int i17 = c18282hM36268d0.f71134x;
            int i18 = c18282hM36268d0.f71135y;
            if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                while (true) {
                    if (m108769c(c34408o.f144627d[i16])) {
                        c36687a.f157124a++;
                    } else {
                        Object[] objArr3 = c34408o.f144627d;
                        objArrCopyOf[length] = objArr3[i16];
                        objArrCopyOf[length + 1] = objArr3[i16 + 1];
                        length += 2;
                    }
                    if (i16 == i17) {
                        break;
                    }
                    i16 += i18;
                }
            }
            if (length != this.f144627d.length) {
                if (length == c34408o.f144627d.length) {
                    return c34408o;
                }
                if (length == objArrCopyOf.length) {
                    return new C34408o(0, 0, objArrCopyOf, c36688b);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                AbstractC22676k.m65749i(objArrCopyOf2, "copyOf(...)");
                return new C34408o(0, 0, objArrCopyOf2, c36688b);
            }
        } else {
            int i19 = this.f144625b | c34408o.f144625b;
            int i24 = this.f144624a;
            int i25 = c34408o.f144624a;
            int i26 = (i24 ^ i25) & (~i19);
            int i27 = i24 & i25;
            int i28 = i26;
            while (i27 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i27);
                if (AbstractC22676k.m65745e(this.f144627d[m108772f(iLowestOneBit)], c34408o.f144627d[c34408o.m108772f(iLowestOneBit)])) {
                    i28 |= iLowestOneBit;
                } else {
                    i19 |= iLowestOneBit;
                }
                i27 ^= iLowestOneBit;
            }
            if ((i19 & i28) != 0) {
                AbstractC28657q1.m87189b("Check failed.");
            }
            if (AbstractC22676k.m65745e(this.f144626c, c34398e.f144610x) && this.f144624a == i28 && this.f144625b == i19) {
                c34408o2 = this;
            } else {
                c34408o2 = new C34408o(i28, i19, new Object[Integer.bitCount(i19) + (Integer.bitCount(i28) * 2)], null);
            }
            int i29 = i19;
            int i34 = 0;
            while (i29 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i29);
                Object[] objArr4 = c34408o2.f144627d;
                int length2 = (objArr4.length - 1) - i34;
                if (m108775i(iLowestOneBit2)) {
                    c34408oM108766j = m108784s(m108785t(iLowestOneBit2));
                    if (c34408o.m108775i(iLowestOneBit2)) {
                        c34408oM108766j = c34408oM108766j.m108778m(c34408o.m108784s(c34408o.m108785t(iLowestOneBit2)), i13 + 5, c36687a, c34398e);
                        objArr = objArr4;
                    } else if (c34408o.m108774h(iLowestOneBit2)) {
                        int iM108772f = c34408o.m108772f(iLowestOneBit2);
                        Object obj = c34408o.f144627d[iM108772f];
                        Object objM108789x = c34408o.m108789x(iM108772f);
                        int i35 = c34398e.f144608F;
                        objArr = objArr4;
                        c34408oM108766j = c34408oM108766j.m108777l(obj != null ? obj.hashCode() : i14, obj, objM108789x, i13 + 5, c34398e);
                        if (c34398e.f144608F == i35) {
                            c36687a.f157124a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c34408o.m108775i(iLowestOneBit2)) {
                        C34408o c34408oM108784s = c34408o.m108784s(c34408o.m108785t(iLowestOneBit2));
                        if (m108774h(iLowestOneBit2)) {
                            int iM108772f2 = m108772f(iLowestOneBit2);
                            Object obj2 = this.f144627d[iM108772f2];
                            int i36 = i13 + 5;
                            if (c34408oM108784s.m108770d(obj2 != null ? obj2.hashCode() : 0, i36, obj2)) {
                                c36687a.f157124a++;
                                c34408oM108766j = c34408oM108784s;
                            } else {
                                c34408oM108766j = c34408oM108784s.m108777l(obj2 != null ? obj2.hashCode() : 0, obj2, m108789x(iM108772f2), i36, c34398e);
                            }
                        } else {
                            c34408oM108766j = c34408oM108784s;
                        }
                    } else {
                        int iM108772f3 = m108772f(iLowestOneBit2);
                        Object obj3 = this.f144627d[iM108772f3];
                        Object objM108789x2 = m108789x(iM108772f3);
                        int iM108772f4 = c34408o.m108772f(iLowestOneBit2);
                        Object obj4 = c34408o.f144627d[iM108772f4];
                        c34408oM108766j = m108766j(obj3 != null ? obj3.hashCode() : 0, obj3, objM108789x2, obj4 != null ? obj4.hashCode() : 0, obj4, c34408o.m108789x(iM108772f4), i13 + 5, c34398e.f144610x);
                    }
                }
                objArr[length2] = c34408oM108766j;
                i34++;
                i29 ^= iLowestOneBit2;
                i14 = 0;
            }
            int i37 = 0;
            while (i28 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i28);
                int i38 = i37 * 2;
                if (c34408o.m108774h(iLowestOneBit3)) {
                    int iM108772f5 = c34408o.m108772f(iLowestOneBit3);
                    Object[] objArr5 = c34408o2.f144627d;
                    objArr5[i38] = c34408o.f144627d[iM108772f5];
                    objArr5[i38 + 1] = c34408o.m108789x(iM108772f5);
                    if (m108774h(iLowestOneBit3)) {
                        c36687a.f157124a++;
                    }
                } else {
                    int iM108772f6 = m108772f(iLowestOneBit3);
                    Object[] objArr6 = c34408o2.f144627d;
                    objArr6[i38] = this.f144627d[iM108772f6];
                    objArr6[i38 + 1] = m108789x(iM108772f6);
                }
                i37++;
                i28 ^= iLowestOneBit3;
            }
            if (!m108771e(c34408o2)) {
                return c34408o.m108771e(c34408o2) ? c34408o : c34408o2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final C34408o m108779n(int i13, Object obj, int i14, C34398e c34398e) {
        C34408o c34408oM108779n;
        int iM5367B = 1 << AbstractC1772c1.m5367B(i13, i14);
        if (m108774h(iM5367B)) {
            int iM108772f = m108772f(iM5367B);
            if (AbstractC22676k.m65745e(obj, this.f144627d[iM108772f])) {
                return m108781p(iM108772f, iM5367B, c34398e);
            }
        } else if (m108775i(iM5367B)) {
            int iM108785t = m108785t(iM5367B);
            C34408o c34408oM108784s = m108784s(iM108785t);
            if (i14 == 30) {
                C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, c34408oM108784s.f144627d.length));
                int i15 = c18282hM36268d0.f71133w;
                int i16 = c18282hM36268d0.f71134x;
                int i17 = c18282hM36268d0.f71135y;
                if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                    while (true) {
                        if (!AbstractC22676k.m65745e(obj, c34408oM108784s.f144627d[i15])) {
                            if (i15 == i16) {
                                c34408oM108779n = c34408oM108784s;
                                break;
                            }
                            i15 += i17;
                        } else {
                            c34408oM108779n = c34408oM108784s.m108776k(i15, c34398e);
                            break;
                        }
                    }
                } else {
                    c34408oM108779n = c34408oM108784s;
                    break;
                }
            } else {
                c34408oM108779n = c34408oM108784s.m108779n(i13, obj, i14 + 5, c34398e);
            }
            return m108782q(c34408oM108784s, c34408oM108779n, iM108785t, iM5367B, c34398e.f144610x);
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final C34408o m108780o(int i13, Object obj, Object obj2, int i14, C34398e c34398e) {
        C34408o c34408o;
        C34408o c34408oM108780o;
        int iM5367B = 1 << AbstractC1772c1.m5367B(i13, i14);
        if (m108774h(iM5367B)) {
            int iM108772f = m108772f(iM5367B);
            if (AbstractC22676k.m65745e(obj, this.f144627d[iM108772f]) && AbstractC22676k.m65745e(obj2, m108789x(iM108772f))) {
                return m108781p(iM108772f, iM5367B, c34398e);
            }
        } else if (m108775i(iM5367B)) {
            int iM108785t = m108785t(iM5367B);
            C34408o c34408oM108784s = m108784s(iM108785t);
            if (i14 == 30) {
                C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, c34408oM108784s.f144627d.length));
                int i15 = c18282hM36268d0.f71133w;
                int i16 = c18282hM36268d0.f71134x;
                int i17 = c18282hM36268d0.f71135y;
                if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                    while (true) {
                        if (!AbstractC22676k.m65745e(obj, c34408oM108784s.f144627d[i15]) || !AbstractC22676k.m65745e(obj2, c34408oM108784s.m108789x(i15))) {
                            if (i15 == i16) {
                                c34408oM108780o = c34408oM108784s;
                                break;
                            }
                            i15 += i17;
                        } else {
                            c34408oM108780o = c34408oM108784s.m108776k(i15, c34398e);
                            break;
                        }
                    }
                } else {
                    c34408oM108780o = c34408oM108784s;
                    break;
                }
                c34408o = c34408oM108784s;
            } else {
                c34408o = c34408oM108784s;
                c34408oM108780o = c34408o.m108780o(i13, obj, obj2, i14 + 5, c34398e);
            }
            return m108782q(c34408o, c34408oM108780o, iM108785t, iM5367B, c34398e.f144610x);
        }
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final C34408o m108781p(int i13, int i14, C34398e c34398e) {
        c34398e.m108764g(c34398e.f144608F - 1);
        c34398e.f144612z = m108789x(i13);
        Object[] objArr = this.f144627d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f144626c != c34398e.f144610x) {
            return new C34408o(i14 ^ this.f144624a, this.f144625b, AbstractC1772c1.m5388e(i13, objArr), c34398e.f144610x);
        }
        this.f144627d = AbstractC1772c1.m5388e(i13, objArr);
        this.f144624a ^= i14;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final C34408o m108782q(C34408o c34408o, C34408o c34408o2, int i13, int i14, C36688b c36688b) {
        C36688b c36688b2 = this.f144626c;
        if (c34408o2 != null) {
            return (c36688b2 == c36688b || c34408o != c34408o2) ? m108783r(i13, c34408o2, c36688b) : this;
        }
        Object[] objArr = this.f144627d;
        if (objArr.length == 1) {
            return null;
        }
        if (c36688b2 != c36688b) {
            return new C34408o(this.f144624a, i14 ^ this.f144625b, AbstractC1772c1.m5389f(i13, objArr), c36688b);
        }
        this.f144627d = AbstractC1772c1.m5389f(i13, objArr);
        this.f144625b ^= i14;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final C34408o m108783r(int i13, C34408o c34408o, C36688b c36688b) {
        Object[] objArr = this.f144627d;
        if (objArr.length == 1 && c34408o.f144627d.length == 2 && c34408o.f144625b == 0) {
            c34408o.f144624a = this.f144625b;
            return c34408o;
        }
        if (this.f144626c == c36688b) {
            objArr[i13] = c34408o;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i13] = c34408o;
        return new C34408o(this.f144624a, this.f144625b, objArrCopyOf, c36688b);
    }

    /* JADX INFO: renamed from: s */
    public final C34408o m108784s(int i13) {
        Object obj = this.f144627d[i13];
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C34408o) obj;
    }

    /* JADX INFO: renamed from: t */
    public final int m108785t(int i13) {
        return (this.f144627d.length - 1) - Integer.bitCount((i13 - 1) & this.f144625b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        r14.f12311y = m108788w(r12, r4, (p511u1.C34408o) r14.f12311y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bd3.C3143v m108786u(java.lang.Object r12, int r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p511u1.C34408o.m108786u(java.lang.Object, int, java.lang.Object, int):bd3.v");
    }

    /* JADX INFO: renamed from: v */
    public final C34408o m108787v(int i13, int i14, Object obj) {
        C34408o c34408oM108787v;
        int iM5367B = 1 << AbstractC1772c1.m5367B(i13, i14);
        if (m108774h(iM5367B)) {
            int iM108772f = m108772f(iM5367B);
            if (AbstractC22676k.m65745e(obj, this.f144627d[iM108772f])) {
                Object[] objArr = this.f144627d;
                if (objArr.length != 2) {
                    return new C34408o(this.f144624a ^ iM5367B, this.f144625b, AbstractC1772c1.m5388e(iM108772f, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (m108775i(iM5367B)) {
            int iM108785t = m108785t(iM5367B);
            C34408o c34408oM108784s = m108784s(iM108785t);
            if (i14 == 30) {
                C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, c34408oM108784s.f144627d.length));
                int i15 = c18282hM36268d0.f71133w;
                int i16 = c18282hM36268d0.f71134x;
                int i17 = c18282hM36268d0.f71135y;
                if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                    while (true) {
                        if (!AbstractC22676k.m65745e(obj, c34408oM108784s.f144627d[i15])) {
                            if (i15 == i16) {
                                c34408oM108787v = c34408oM108784s;
                                break;
                            }
                            i15 += i17;
                        } else {
                            Object[] objArr2 = c34408oM108784s.f144627d;
                            if (objArr2.length != 2) {
                                c34408oM108787v = new C34408o(0, 0, AbstractC1772c1.m5388e(i15, objArr2), null);
                                break;
                            }
                            c34408oM108787v = null;
                            break;
                        }
                    }
                } else {
                    c34408oM108787v = c34408oM108784s;
                    break;
                }
            } else {
                c34408oM108787v = c34408oM108784s.m108787v(i13, i14 + 5, obj);
            }
            if (c34408oM108787v == null) {
                Object[] objArr3 = this.f144627d;
                if (objArr3.length != 1) {
                    return new C34408o(this.f144624a, iM5367B ^ this.f144625b, AbstractC1772c1.m5389f(iM108785t, objArr3), null);
                }
                return null;
            }
            if (c34408oM108784s != c34408oM108787v) {
                return m108788w(iM108785t, iM5367B, c34408oM108787v);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final C34408o m108788w(int i13, int i14, C34408o c34408o) {
        Object[] objArr = c34408o.f144627d;
        if (objArr.length != 2 || c34408o.f144625b != 0) {
            Object[] objArr2 = this.f144627d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i13] = c34408o;
            return new C34408o(this.f144624a, this.f144625b, objArrCopyOf, null);
        }
        if (this.f144627d.length == 1) {
            c34408o.f144624a = this.f144625b;
            return c34408o;
        }
        int iM108772f = m108772f(i14);
        Object[] objArr3 = this.f144627d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC22676k.m65749i(objArrCopyOf2, "copyOf(...)");
        AbstractC25260n.m74062d0(i13 + 2, i13 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        AbstractC25260n.m74062d0(iM108772f + 2, iM108772f, i13, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iM108772f] = obj;
        objArrCopyOf2[iM108772f + 1] = obj2;
        return new C34408o(this.f144624a ^ i14, i14 ^ this.f144625b, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: x */
    public final Object m108789x(int i13) {
        return this.f144627d[i13 + 1];
    }
}
