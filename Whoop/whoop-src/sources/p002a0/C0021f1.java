package p002a0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import m83.AbstractC25260n;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.f1 */
/* JADX INFO: loaded from: classes.dex */
public class C0021f1 {

    /* JADX INFO: renamed from: w */
    public int[] f48w;

    /* JADX INFO: renamed from: x */
    public Object[] f49x;

    /* JADX INFO: renamed from: y */
    public int f50y;

    public C0021f1(int i13) {
        this.f48w = i13 == 0 ? AbstractC2177a.f8657a : new int[i13];
        this.f49x = i13 == 0 ? AbstractC2177a.f8659c : new Object[i13 << 1];
    }

    /* JADX INFO: renamed from: a */
    public final int m33a(Object obj) {
        int i13 = this.f50y * 2;
        Object[] objArr = this.f49x;
        if (obj == null) {
            for (int i14 = 1; i14 < i13; i14 += 2) {
                if (objArr[i14] == null) {
                    return i14 >> 1;
                }
            }
            return -1;
        }
        for (int i15 = 1; i15 < i13; i15 += 2) {
            if (obj.equals(objArr[i15])) {
                return i15 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m34b(int i13) {
        int i14 = this.f50y;
        int[] iArr = this.f48w;
        if (iArr.length < i13) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f48w = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f49x, i13 * 2);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            this.f49x = objArrCopyOf;
        }
        if (this.f50y != i14) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m35c(int i13, Object obj) {
        int i14 = this.f50y;
        if (i14 == 0) {
            return -1;
        }
        int iM6853a = AbstractC2177a.m6853a(i14, i13, this.f48w);
        if (iM6853a < 0 || AbstractC22676k.m65745e(obj, this.f49x[iM6853a << 1])) {
            return iM6853a;
        }
        int i15 = iM6853a + 1;
        while (i15 < i14 && this.f48w[i15] == i13) {
            if (AbstractC22676k.m65745e(obj, this.f49x[i15 << 1])) {
                return i15;
            }
            i15++;
        }
        for (int i16 = iM6853a - 1; i16 >= 0 && this.f48w[i16] == i13; i16--) {
            if (AbstractC22676k.m65745e(obj, this.f49x[i16 << 1])) {
                return i16;
            }
        }
        return ~i15;
    }

    public void clear() {
        if (this.f50y > 0) {
            this.f48w = AbstractC2177a.f8657a;
            this.f49x = AbstractC2177a.f8659c;
            this.f50y = 0;
        }
        if (this.f50y > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m36d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m33a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m36d(Object obj) {
        return obj == null ? m37e() : m35c(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m37e() {
        int i13 = this.f50y;
        if (i13 == 0) {
            return -1;
        }
        int iM6853a = AbstractC2177a.m6853a(i13, 0, this.f48w);
        if (iM6853a < 0 || this.f49x[iM6853a << 1] == null) {
            return iM6853a;
        }
        int i14 = iM6853a + 1;
        while (i14 < i13 && this.f48w[i14] == 0) {
            if (this.f49x[i14 << 1] == null) {
                return i14;
            }
            i14++;
        }
        for (int i15 = iM6853a - 1; i15 >= 0 && this.f48w[i15] == 0; i15--) {
            if (this.f49x[i15 << 1] == null) {
                return i15;
            }
        }
        return ~i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0021f1) {
                int i13 = this.f50y;
                if (i13 != ((C0021f1) obj).f50y) {
                    return false;
                }
                C0021f1 c0021f1 = (C0021f1) obj;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object objM38g = m38g(i14);
                    Object objM42k = m42k(i14);
                    Object obj2 = c0021f1.get(objM38g);
                    if (objM42k == null) {
                        if (obj2 != null || !c0021f1.containsKey(objM38g)) {
                            return false;
                        }
                    } else if (!objM42k.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f50y != ((Map) obj).size()) {
                return false;
            }
            int i15 = this.f50y;
            for (int i16 = 0; i16 < i15; i16++) {
                Object objM38g2 = m38g(i16);
                Object objM42k2 = m42k(i16);
                Object obj3 = ((Map) obj).get(objM38g2);
                if (objM42k2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM38g2)) {
                        return false;
                    }
                } else if (!objM42k2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final Object m38g(int i13) {
        boolean z4 = false;
        if (i13 >= 0 && i13 < this.f50y) {
            z4 = true;
        }
        if (z4) {
            return this.f49x[i13 << 1];
        }
        AbstractC34924m.m110133O("Expected index to be within 0..size()-1, but was " + i13);
        throw null;
    }

    public Object get(Object obj) {
        int iM36d = m36d(obj);
        if (iM36d >= 0) {
            return this.f49x[(iM36d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM36d = m36d(obj);
        return iM36d >= 0 ? this.f49x[(iM36d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public void mo39h(C0022g c0022g) {
        int i13 = c0022g.f50y;
        m34b(this.f50y + i13);
        if (this.f50y != 0) {
            for (int i14 = 0; i14 < i13; i14++) {
                put(c0022g.m38g(i14), c0022g.m42k(i14));
            }
        } else if (i13 > 0) {
            AbstractC25260n.m74064e0(0, 0, c0022g.f48w, this.f48w, i13);
            AbstractC25260n.m74062d0(0, 0, i13 << 1, c0022g.f49x, this.f49x);
            this.f50y = i13;
        }
    }

    public int hashCode() {
        int[] iArr = this.f48w;
        Object[] objArr = this.f49x;
        int i13 = this.f50y;
        int i14 = 1;
        int i15 = 0;
        int iHashCode = 0;
        while (i15 < i13) {
            Object obj = objArr[i14];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i15];
            i15++;
            i14 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public Object mo40i(int i13) {
        int i14;
        if (i13 < 0 || i13 >= (i14 = this.f50y)) {
            AbstractC34924m.m110133O("Expected index to be within 0..size()-1, but was " + i13);
            throw null;
        }
        Object[] objArr = this.f49x;
        int i15 = i13 << 1;
        Object obj = objArr[i15 + 1];
        if (i14 <= 1) {
            clear();
            return obj;
        }
        int i16 = i14 - 1;
        int[] iArr = this.f48w;
        if (iArr.length <= 8 || i14 >= iArr.length / 3) {
            if (i13 < i16) {
                int i17 = i13 + 1;
                AbstractC25260n.m74064e0(i13, i17, iArr, iArr, i14);
                Object[] objArr2 = this.f49x;
                AbstractC25260n.m74062d0(i15, i17 << 1, i14 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f49x;
            int i18 = i16 << 1;
            objArr3[i18] = null;
            objArr3[i18 + 1] = null;
        } else {
            int i19 = i14 > 8 ? i14 + (i14 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i19);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f48w = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f49x, i19 << 1);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            this.f49x = objArrCopyOf;
            if (i14 != this.f50y) {
                throw new ConcurrentModificationException();
            }
            if (i13 > 0) {
                AbstractC25260n.m74064e0(0, 0, iArr, this.f48w, i13);
                AbstractC25260n.m74062d0(0, 0, i15, objArr, this.f49x);
            }
            if (i13 < i16) {
                int i24 = i13 + 1;
                AbstractC25260n.m74064e0(i13, i24, iArr, this.f48w, i14);
                AbstractC25260n.m74062d0(i15, i24 << 1, i14 << 1, objArr, this.f49x);
            }
        }
        if (i14 != this.f50y) {
            throw new ConcurrentModificationException();
        }
        this.f50y = i16;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f50y <= 0;
    }

    /* JADX INFO: renamed from: j */
    public Object mo41j(int i13, Object obj) {
        boolean z4 = false;
        if (i13 >= 0 && i13 < this.f50y) {
            z4 = true;
        }
        if (!z4) {
            AbstractC34924m.m110133O("Expected index to be within 0..size()-1, but was " + i13);
            throw null;
        }
        int i14 = (i13 << 1) + 1;
        Object[] objArr = this.f49x;
        Object obj2 = objArr[i14];
        objArr[i14] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: k */
    public final Object m42k(int i13) {
        boolean z4 = false;
        if (i13 >= 0 && i13 < this.f50y) {
            z4 = true;
        }
        if (z4) {
            return this.f49x[(i13 << 1) + 1];
        }
        AbstractC34924m.m110133O("Expected index to be within 0..size()-1, but was " + i13);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i13 = this.f50y;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM35c = obj != null ? m35c(iHashCode, obj) : m37e();
        if (iM35c >= 0) {
            int i14 = (iM35c << 1) + 1;
            Object[] objArr = this.f49x;
            Object obj3 = objArr[i14];
            objArr[i14] = obj2;
            return obj3;
        }
        int i15 = ~iM35c;
        int[] iArr = this.f48w;
        if (i13 >= iArr.length) {
            int i16 = 8;
            if (i13 >= 8) {
                i16 = (i13 >> 1) + i13;
            } else if (i13 < 4) {
                i16 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f48w = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f49x, i16 << 1);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            this.f49x = objArrCopyOf;
            if (i13 != this.f50y) {
                throw new ConcurrentModificationException();
            }
        }
        if (i15 < i13) {
            int[] iArr2 = this.f48w;
            int i17 = i15 + 1;
            AbstractC25260n.m74064e0(i17, i15, iArr2, iArr2, i13);
            Object[] objArr2 = this.f49x;
            AbstractC25260n.m74062d0(i17 << 1, i15 << 1, this.f50y << 1, objArr2, objArr2);
        }
        int i18 = this.f50y;
        if (i13 == i18) {
            int[] iArr3 = this.f48w;
            if (i15 < iArr3.length) {
                iArr3[i15] = iHashCode;
                Object[] objArr3 = this.f49x;
                int i19 = i15 << 1;
                objArr3[i19] = obj;
                objArr3[i19 + 1] = obj2;
                this.f50y = i18 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM36d = m36d(obj);
        if (iM36d >= 0) {
            return mo40i(iM36d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM36d = m36d(obj);
        if (iM36d >= 0) {
            return mo41j(iM36d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f50y;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder(this.f50y * 28);
        sb4.append('{');
        int i13 = this.f50y;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb4.append(", ");
            }
            Object objM38g = m38g(i14);
            if (objM38g != sb4) {
                sb4.append(objM38g);
            } else {
                sb4.append("(this Map)");
            }
            sb4.append('=');
            Object objM42k = m42k(i14);
            if (objM42k != sb4) {
                sb4.append(objM42k);
            } else {
                sb4.append("(this Map)");
            }
        }
        sb4.append('}');
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM36d = m36d(obj);
        if (iM36d < 0 || !AbstractC22676k.m65745e(obj2, m42k(iM36d))) {
            return false;
        }
        mo40i(iM36d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM36d = m36d(obj);
        if (iM36d < 0 || !AbstractC22676k.m65745e(obj2, m42k(iM36d))) {
            return false;
        }
        mo41j(iM36d, obj3);
        return true;
    }
}
