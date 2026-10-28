package p441qx;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.squareup.moshi.JsonReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: qx.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C30700a0 extends JsonReader {

    /* JADX INFO: renamed from: H */
    public static final Object f126421H = new Object();

    /* JADX INFO: renamed from: G */
    public Object[] f126422G;

    public C30700a0(Object obj) {
        int[] iArr = this.f22078x;
        int i13 = this.f22077w;
        iArr[i13] = 7;
        Object[] objArr = new Object[32];
        this.f126422G = objArr;
        this.f22077w = i13 + 1;
        objArr[i13] = obj;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m94357F0() {
        int i13 = this.f22077w;
        int i14 = i13 - 1;
        this.f22077w = i14;
        Object[] objArr = this.f126422G;
        objArr[i14] = null;
        this.f22078x[i14] = 0;
        if (i14 > 0) {
            int[] iArr = this.f22080z;
            int i15 = i13 - 2;
            iArr[i15] = iArr[i15] + 1;
            Object obj = objArr[i13 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    m94359x0(it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final Object m94358M0(Class cls, EnumC30741w enumC30741w) {
        int i13 = this.f22077w;
        Object obj = i13 != 0 ? this.f126422G[i13 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && enumC30741w == EnumC30741w.f126546I) {
            return null;
        }
        if (obj == f126421H) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m16734p0(obj, enumC30741w);
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: T */
    public final int mo16725T(C30740v c30740v) {
        EnumC30741w enumC30741w = EnumC30741w.f126542E;
        Map.Entry entry = (Map.Entry) m94358M0(Map.Entry.class, enumC30741w);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw m16734p0(key, enumC30741w);
        }
        String str = (String) key;
        int length = c30740v.f126540a.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (c30740v.f126540a[i13].equals(str)) {
                this.f126422G[this.f22077w - 1] = entry.getValue();
                this.f22079y[this.f22077w - 2] = str;
                return i13;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: a0 */
    public final int mo16726a0(C30740v c30740v) {
        int i13 = this.f22077w;
        Object obj = i13 != 0 ? this.f126422G[i13 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f126421H) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = c30740v.f126540a.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (c30740v.f126540a[i14].equals(str)) {
                m94357F0();
                return i14;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: b0 */
    public final void mo16728b0() {
        if (!this.f22076F) {
            this.f126422G[this.f22077w - 1] = ((Map.Entry) m94358M0(Map.Entry.class, EnumC30741w.f126542E)).getValue();
            this.f22079y[this.f22077w - 2] = "null";
        } else {
            EnumC30741w enumC30741wMo16731k = mo16731k();
            nextName();
            throw new JsonDataException("Cannot skip unexpected " + enumC30741wMo16731k + " at " + m16727b());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginArray() {
        List list = (List) m94358M0(List.class, EnumC30741w.f126549w);
        C30744z c30744z = new C30744z(EnumC30741w.f126550x, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f126422G;
        int i13 = this.f22077w;
        objArr[i13 - 1] = c30744z;
        this.f22078x[i13 - 1] = 1;
        this.f22080z[i13 - 1] = 0;
        if (c30744z.hasNext()) {
            m94359x0(c30744z.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginObject() {
        Map map = (Map) m94358M0(Map.class, EnumC30741w.f126551y);
        C30744z c30744z = new C30744z(EnumC30741w.f126552z, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f126422G;
        int i13 = this.f22077w;
        objArr[i13 - 1] = c30744z;
        this.f22078x[i13 - 1] = 3;
        if (c30744z.hasNext()) {
            m94359x0(c30744z.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill(this.f126422G, 0, this.f22077w, (Object) null);
        this.f126422G[0] = f126421H;
        this.f22078x[0] = 8;
        this.f22077w = 1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endArray() {
        EnumC30741w enumC30741w = EnumC30741w.f126550x;
        C30744z c30744z = (C30744z) m94358M0(C30744z.class, enumC30741w);
        if (c30744z.f126568w != enumC30741w || c30744z.hasNext()) {
            throw m16734p0(c30744z, enumC30741w);
        }
        m94357F0();
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endObject() {
        EnumC30741w enumC30741w = EnumC30741w.f126552z;
        C30744z c30744z = (C30744z) m94358M0(C30744z.class, enumC30741w);
        if (c30744z.f126568w != enumC30741w || c30744z.hasNext()) {
            throw m16734p0(c30744z, enumC30741w);
        }
        this.f22079y[this.f22077w - 1] = null;
        m94357F0();
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: h */
    public final boolean mo16729h() {
        Boolean bool = (Boolean) m94358M0(Boolean.class, EnumC30741w.f126545H);
        m94357F0();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean hasNext() {
        int i13 = this.f22077w;
        if (i13 == 0) {
            return false;
        }
        Object obj = this.f126422G[i13 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: i */
    public final void mo16730i() {
        m94358M0(Void.class, EnumC30741w.f126546I);
        m94357F0();
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: k */
    public final EnumC30741w mo16731k() {
        int i13 = this.f22077w;
        if (i13 == 0) {
            return EnumC30741w.f126547J;
        }
        Object obj = this.f126422G[i13 - 1];
        if (obj instanceof C30744z) {
            return ((C30744z) obj).f126568w;
        }
        if (obj instanceof List) {
            return EnumC30741w.f126549w;
        }
        if (obj instanceof Map) {
            return EnumC30741w.f126551y;
        }
        if (obj instanceof Map.Entry) {
            return EnumC30741w.f126542E;
        }
        if (obj instanceof String) {
            return EnumC30741w.f126543F;
        }
        if (obj instanceof Boolean) {
            return EnumC30741w.f126545H;
        }
        if (obj instanceof Number) {
            return EnumC30741w.f126544G;
        }
        if (obj == null) {
            return EnumC30741w.f126546I;
        }
        if (obj == f126421H) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m16734p0(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: m */
    public final JsonReader mo16732m() {
        C30700a0 c30700a0 = new C30700a0((JsonReader) this);
        c30700a0.f126422G = (Object[]) this.f126422G.clone();
        for (int i13 = 0; i13 < c30700a0.f22077w; i13++) {
            Object[] objArr = c30700a0.f126422G;
            Object obj = objArr[i13];
            if (obj instanceof C30744z) {
                C30744z c30744z = (C30744z) obj;
                objArr[i13] = new C30744z(c30744z.f126568w, c30744z.f126569x, c30744z.f126570y);
            }
        }
        return c30700a0;
    }

    @Override // com.squareup.moshi.JsonReader
    public final double nextDouble() throws JsonEncodingException {
        double dDoubleValue;
        EnumC30741w enumC30741w = EnumC30741w.f126544G;
        Object objM94358M0 = m94358M0(Object.class, enumC30741w);
        if (objM94358M0 instanceof Number) {
            dDoubleValue = ((Number) objM94358M0).doubleValue();
        } else {
            if (!(objM94358M0 instanceof String)) {
                throw m16734p0(objM94358M0, enumC30741w);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objM94358M0);
            } catch (NumberFormatException unused) {
                throw m16734p0(objM94358M0, enumC30741w);
            }
        }
        if (this.f22075E || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            m94357F0();
            return dDoubleValue;
        }
        StringBuilder sbM8306s = AbstractC2875y.m8306s("JSON forbids NaN and infinities: ", dDoubleValue, " at path ");
        sbM8306s.append(m16727b());
        throw new JsonEncodingException(sbM8306s.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final int nextInt() {
        int iIntValueExact;
        EnumC30741w enumC30741w = EnumC30741w.f126544G;
        Object objM94358M0 = m94358M0(Object.class, enumC30741w);
        if (objM94358M0 instanceof Number) {
            iIntValueExact = ((Number) objM94358M0).intValue();
        } else {
            if (!(objM94358M0 instanceof String)) {
                throw m16734p0(objM94358M0, enumC30741w);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objM94358M0);
                } catch (NumberFormatException unused) {
                    throw m16734p0(objM94358M0, enumC30741w);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objM94358M0).intValueExact();
            }
        }
        m94357F0();
        return iIntValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public final long nextLong() {
        long jLongValueExact;
        EnumC30741w enumC30741w = EnumC30741w.f126544G;
        Object objM94358M0 = m94358M0(Object.class, enumC30741w);
        if (objM94358M0 instanceof Number) {
            jLongValueExact = ((Number) objM94358M0).longValue();
        } else {
            if (!(objM94358M0 instanceof String)) {
                throw m16734p0(objM94358M0, enumC30741w);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objM94358M0);
                } catch (NumberFormatException unused) {
                    throw m16734p0(objM94358M0, enumC30741w);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objM94358M0).longValueExact();
            }
        }
        m94357F0();
        return jLongValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextName() {
        EnumC30741w enumC30741w = EnumC30741w.f126542E;
        Map.Entry entry = (Map.Entry) m94358M0(Map.Entry.class, enumC30741w);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw m16734p0(key, enumC30741w);
        }
        String str = (String) key;
        this.f126422G[this.f22077w - 1] = entry.getValue();
        this.f22079y[this.f22077w - 2] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextString() {
        int i13 = this.f22077w;
        Object obj = i13 != 0 ? this.f126422G[i13 - 1] : null;
        if (obj instanceof String) {
            m94357F0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            m94357F0();
            return obj.toString();
        }
        if (obj == f126421H) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m16734p0(obj, EnumC30741w.f126543F);
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: s */
    public final void mo16735s() {
        if (hasNext()) {
            m94359x0(nextName());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipValue() {
        if (this.f22076F) {
            throw new JsonDataException("Cannot skip unexpected " + mo16731k() + " at " + m16727b());
        }
        int i13 = this.f22077w;
        if (i13 > 1) {
            this.f22079y[i13 - 2] = "null";
        }
        Object obj = i13 != 0 ? this.f126422G[i13 - 1] : null;
        if (obj instanceof C30744z) {
            throw new JsonDataException("Expected a value but was " + mo16731k() + " at path " + m16727b());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f126422G;
            int i14 = i13 - 1;
            objArr[i14] = ((Map.Entry) objArr[i14]).getValue();
        } else {
            if (i13 > 0) {
                m94357F0();
                return;
            }
            throw new JsonDataException("Expected a value but was " + mo16731k() + " at path " + m16727b());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m94359x0(Object obj) {
        int i13 = this.f22077w;
        if (i13 == this.f126422G.length) {
            if (i13 == 256) {
                throw new JsonDataException("Nesting too deep at " + m16727b());
            }
            int[] iArr = this.f22078x;
            this.f22078x = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f22079y;
            this.f22079y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f22080z;
            this.f22080z = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f126422G;
            this.f126422G = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f126422G;
        int i14 = this.f22077w;
        this.f22077w = i14 + 1;
        objArr2[i14] = obj;
    }
}
