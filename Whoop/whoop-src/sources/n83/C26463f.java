package n83;

import d93.InterfaceC11824e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p511u1.C34400g;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n83.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C26463f implements Map, Serializable, InterfaceC11824e {

    /* JADX INFO: renamed from: N */
    public static final C26463f f105103N;

    /* JADX INFO: renamed from: E */
    public int f105104E;

    /* JADX INFO: renamed from: F */
    public int f105105F;

    /* JADX INFO: renamed from: G */
    public int f105106G;

    /* JADX INFO: renamed from: H */
    public int f105107H;

    /* JADX INFO: renamed from: I */
    public int f105108I;

    /* JADX INFO: renamed from: J */
    public C34400g f105109J;

    /* JADX INFO: renamed from: K */
    public C26465h f105110K;

    /* JADX INFO: renamed from: L */
    public C26464g f105111L;

    /* JADX INFO: renamed from: M */
    public boolean f105112M;

    /* JADX INFO: renamed from: w */
    public Object[] f105113w;

    /* JADX INFO: renamed from: x */
    public Object[] f105114x;

    /* JADX INFO: renamed from: y */
    public int[] f105115y;

    /* JADX INFO: renamed from: z */
    public int[] f105116z;

    static {
        C26463f c26463f = new C26463f(0);
        c26463f.f105112M = true;
        f105103N = c26463f;
    }

    public C26463f() {
        this(8);
    }

    /* JADX INFO: renamed from: a */
    public final int m78379a(Object obj) {
        m78381c();
        while (true) {
            int iM78388k = m78388k(obj);
            int i13 = this.f105104E * 2;
            int length = this.f105116z.length / 2;
            if (i13 > length) {
                i13 = length;
            }
            int i14 = 0;
            while (true) {
                int[] iArr = this.f105116z;
                int i15 = iArr[iM78388k];
                if (i15 <= 0) {
                    int i16 = this.f105105F;
                    Object[] objArr = this.f105113w;
                    if (i16 >= objArr.length) {
                        m78385h(1);
                        break;
                    }
                    int i17 = i16 + 1;
                    this.f105105F = i17;
                    objArr[i16] = obj;
                    this.f105115y[i16] = iM78388k;
                    iArr[iM78388k] = i17;
                    this.f105108I++;
                    this.f105107H++;
                    if (i14 > this.f105104E) {
                        this.f105104E = i14;
                    }
                    return i16;
                }
                if (AbstractC22676k.m65745e(this.f105113w[i15 - 1], obj)) {
                    return -i15;
                }
                i14++;
                if (i14 > i13) {
                    m78389l(this.f105116z.length * 2);
                    break;
                }
                iM78388k = iM78388k == 0 ? this.f105116z.length - 1 : iM78388k - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C26463f m78380b() {
        m78381c();
        this.f105112M = true;
        if (this.f105108I > 0) {
            return this;
        }
        C26463f c26463f = f105103N;
        AbstractC22676k.m65748h(c26463f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c26463f;
    }

    /* JADX INFO: renamed from: c */
    public final void m78381c() {
        if (this.f105112M) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m78381c();
        int i13 = this.f105105F - 1;
        if (i13 >= 0) {
            int i14 = 0;
            while (true) {
                int[] iArr = this.f105115y;
                int i15 = iArr[i14];
                if (i15 >= 0) {
                    this.f105116z[i15] = 0;
                    iArr[i14] = -1;
                }
                if (i14 == i13) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        AbstractC37056f.m118974b0(0, this.f105105F, this.f105113w);
        Object[] objArr = this.f105114x;
        if (objArr != null) {
            AbstractC37056f.m118974b0(0, this.f105105F, objArr);
        }
        this.f105108I = 0;
        this.f105105F = 0;
        this.f105107H++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m78386i(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m78387j(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m78382d(boolean z4) {
        int i13;
        Object[] objArr = this.f105114x;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i13 = this.f105105F;
            if (i14 >= i13) {
                break;
            }
            int[] iArr = this.f105115y;
            int i16 = iArr[i14];
            if (i16 >= 0) {
                Object[] objArr2 = this.f105113w;
                objArr2[i15] = objArr2[i14];
                if (objArr != null) {
                    objArr[i15] = objArr[i14];
                }
                if (z4) {
                    iArr[i15] = i16;
                    this.f105116z[i16] = i15 + 1;
                }
                i15++;
            }
            i14++;
        }
        AbstractC37056f.m118974b0(i15, i13, this.f105113w);
        if (objArr != null) {
            AbstractC37056f.m118974b0(i15, this.f105105F, objArr);
        }
        this.f105105F = i15;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m78383e(Collection m10) {
        AbstractC22676k.m65750j(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!m78384g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C26464g c26464g = this.f105111L;
        if (c26464g != null) {
            return c26464g;
        }
        C26464g c26464g2 = new C26464g(this);
        this.f105111L = c26464g2;
        return c26464g2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f105108I == map.size() && m78383e(map.entrySet());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m78384g(Map.Entry entry) {
        AbstractC22676k.m65750j(entry, "entry");
        int iM78386i = m78386i(entry.getKey());
        if (iM78386i < 0) {
            return false;
        }
        Object[] objArr = this.f105114x;
        AbstractC22676k.m65747g(objArr);
        return AbstractC22676k.m65745e(objArr[iM78386i], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM78386i = m78386i(obj);
        if (iM78386i < 0) {
            return null;
        }
        Object[] objArr = this.f105114x;
        AbstractC22676k.m65747g(objArr);
        return objArr[iM78386i];
    }

    /* JADX INFO: renamed from: h */
    public final void m78385h(int i13) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f105113w;
        int length = objArr.length;
        int i14 = this.f105105F;
        int i15 = length - i14;
        int i16 = i14 - this.f105108I;
        if (i15 < i13 && i15 + i16 >= i13 && i16 >= objArr.length / 4) {
            m78382d(true);
            return;
        }
        int i17 = i14 + i13;
        if (i17 < 0) {
            throw new OutOfMemoryError();
        }
        if (i17 > objArr.length) {
            int length2 = objArr.length;
            int i18 = length2 + (length2 >> 1);
            if (i18 - i17 < 0) {
                i18 = i17;
            }
            if (i18 - 2147483639 > 0) {
                i18 = i17 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i18);
            AbstractC22676k.m65749i(objArrCopyOf2, "copyOf(...)");
            this.f105113w = objArrCopyOf2;
            Object[] objArr2 = this.f105114x;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i18);
                AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f105114x = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f105115y, i18);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f105115y = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i18 >= 1 ? i18 : 1) * 3);
            if (iHighestOneBit > this.f105116z.length) {
                m78389l(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C26461d c26461d = new C26461d(this, 0);
        int i13 = 0;
        while (c26461d.hasNext()) {
            int i14 = c26461d.f70443w;
            C26463f c26463f = (C26463f) c26461d.f70446z;
            if (i14 >= c26463f.f105105F) {
                throw new NoSuchElementException();
            }
            c26461d.f70443w = i14 + 1;
            c26461d.f70444x = i14;
            Object obj = c26463f.f105113w[i14];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c26463f.f105114x;
            AbstractC22676k.m65747g(objArr);
            Object obj2 = objArr[c26461d.f70444x];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c26461d.m52084c();
            i13 += iHashCode ^ iHashCode2;
        }
        return i13;
    }

    /* JADX INFO: renamed from: i */
    public final int m78386i(Object obj) {
        int iM78388k = m78388k(obj);
        int i13 = this.f105104E;
        while (true) {
            int i14 = this.f105116z[iM78388k];
            if (i14 == 0) {
                return -1;
            }
            if (i14 > 0) {
                int i15 = i14 - 1;
                if (AbstractC22676k.m65745e(this.f105113w[i15], obj)) {
                    return i15;
                }
            }
            i13--;
            if (i13 < 0) {
                return -1;
            }
            iM78388k = iM78388k == 0 ? this.f105116z.length - 1 : iM78388k - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f105108I == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int m78387j(Object obj) {
        int i13 = this.f105105F;
        while (true) {
            i13--;
            if (i13 < 0) {
                return -1;
            }
            if (this.f105115y[i13] >= 0) {
                Object[] objArr = this.f105114x;
                AbstractC22676k.m65747g(objArr);
                if (AbstractC22676k.m65745e(objArr[i13], obj)) {
                    return i13;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m78388k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f105106G;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C34400g c34400g = this.f105109J;
        if (c34400g != null) {
            return c34400g;
        }
        C34400g c34400g2 = new C34400g(this, 2);
        this.f105109J = c34400g2;
        return c34400g2;
    }

    /* JADX INFO: renamed from: l */
    public final void m78389l(int i13) {
        int[] iArr;
        this.f105107H++;
        int i14 = 0;
        if (this.f105105F > this.f105108I) {
            m78382d(false);
        }
        this.f105116z = new int[i13];
        this.f105106G = Integer.numberOfLeadingZeros(i13) + 1;
        while (i14 < this.f105105F) {
            int i15 = i14 + 1;
            int iM78388k = m78388k(this.f105113w[i14]);
            int i16 = this.f105104E;
            while (true) {
                iArr = this.f105116z;
                if (iArr[iM78388k] == 0) {
                    break;
                }
                i16--;
                if (i16 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM78388k = iM78388k == 0 ? iArr.length - 1 : iM78388k - 1;
            }
            iArr[iM78388k] = i15;
            this.f105115y[i14] = iM78388k;
            i14 = i15;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m78390m(int i13) {
        Object[] objArr = this.f105113w;
        AbstractC22676k.m65750j(objArr, "<this>");
        objArr[i13] = null;
        Object[] objArr2 = this.f105114x;
        if (objArr2 != null) {
            objArr2[i13] = null;
        }
        int length = this.f105115y[i13];
        int i14 = this.f105104E * 2;
        int length2 = this.f105116z.length / 2;
        if (i14 > length2) {
            i14 = length2;
        }
        int i15 = i14;
        int i16 = 0;
        int i17 = length;
        do {
            length = length == 0 ? this.f105116z.length - 1 : length - 1;
            i16++;
            if (i16 > this.f105104E) {
                this.f105116z[i17] = 0;
            } else {
                int[] iArr = this.f105116z;
                int i18 = iArr[length];
                if (i18 == 0) {
                    iArr[i17] = 0;
                } else {
                    if (i18 < 0) {
                        iArr[i17] = -1;
                    } else {
                        int i19 = i18 - 1;
                        int iM78388k = m78388k(this.f105113w[i19]) - length;
                        int[] iArr2 = this.f105116z;
                        if ((iM78388k & (iArr2.length - 1)) >= i16) {
                            iArr2[i17] = i18;
                            this.f105115y[i19] = i17;
                        }
                        i15--;
                    }
                    i17 = length;
                    i16 = 0;
                    i15--;
                }
            }
            this.f105115y[i13] = -1;
            this.f105108I--;
            this.f105107H++;
        } while (i15 >= 0);
        this.f105116z[i17] = -1;
        this.f105115y[i13] = -1;
        this.f105108I--;
        this.f105107H++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m78381c();
        int iM78379a = m78379a(obj);
        Object[] objArr = this.f105114x;
        if (objArr == null) {
            int length = this.f105113w.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f105114x = objArr;
        }
        if (iM78379a >= 0) {
            objArr[iM78379a] = obj2;
            return null;
        }
        int i13 = (-iM78379a) - 1;
        Object obj3 = objArr[i13];
        objArr[i13] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC22676k.m65750j(from, "from");
        m78381c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m78385h(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM78379a = m78379a(entry.getKey());
            Object[] objArr = this.f105114x;
            if (objArr == null) {
                int length = this.f105113w.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f105114x = objArr;
            }
            if (iM78379a >= 0) {
                objArr[iM78379a] = entry.getValue();
            } else {
                int i13 = (-iM78379a) - 1;
                if (!AbstractC22676k.m65745e(entry.getValue(), objArr[i13])) {
                    objArr[i13] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m78381c();
        int iM78386i = m78386i(obj);
        if (iM78386i < 0) {
            return null;
        }
        Object[] objArr = this.f105114x;
        AbstractC22676k.m65747g(objArr);
        Object obj2 = objArr[iM78386i];
        m78390m(iM78386i);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f105108I;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder((this.f105108I * 3) + 2);
        sb4.append("{");
        int i13 = 0;
        C26461d c26461d = new C26461d(this, 0);
        while (c26461d.hasNext()) {
            if (i13 > 0) {
                sb4.append(", ");
            }
            int i14 = c26461d.f70443w;
            C26463f c26463f = (C26463f) c26461d.f70446z;
            if (i14 >= c26463f.f105105F) {
                throw new NoSuchElementException();
            }
            c26461d.f70443w = i14 + 1;
            c26461d.f70444x = i14;
            Object obj = c26463f.f105113w[i14];
            if (obj == c26463f) {
                sb4.append("(this Map)");
            } else {
                sb4.append(obj);
            }
            sb4.append('=');
            Object[] objArr = c26463f.f105114x;
            AbstractC22676k.m65747g(objArr);
            Object obj2 = objArr[c26461d.f70444x];
            if (obj2 == c26463f) {
                sb4.append("(this Map)");
            } else {
                sb4.append(obj2);
            }
            c26461d.m52084c();
            i13++;
        }
        sb4.append("}");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C26465h c26465h = this.f105110K;
        if (c26465h != null) {
            return c26465h;
        }
        C26465h c26465h2 = new C26465h(this);
        this.f105110K = c26465h2;
        return c26465h2;
    }

    public C26463f(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i13];
        int[] iArr = new int[i13];
        int iHighestOneBit = Integer.highestOneBit((i13 < 1 ? 1 : i13) * 3);
        this.f105113w = objArr;
        this.f105114x = null;
        this.f105115y = iArr;
        this.f105116z = new int[iHighestOneBit];
        this.f105104E = 2;
        this.f105105F = 0;
        this.f105106G = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
