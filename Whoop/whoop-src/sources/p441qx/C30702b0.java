package p441qx;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: qx.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C30702b0 extends AbstractC30704c0 {

    /* JADX INFO: renamed from: J */
    public Object[] f126424J = new Object[32];

    /* JADX INFO: renamed from: K */
    public String f126425K;

    public C30702b0() {
        m94377a0(6);
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: F0 */
    public final AbstractC30704c0 mo94362F0(String str) {
        if (this.f126435H) {
            this.f126435H = false;
            mo94373x(str);
            return this;
        }
        m94365R0(str);
        int[] iArr = this.f126440z;
        int i13 = this.f126437w - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: J */
    public final AbstractC30704c0 mo94363J() {
        if (this.f126435H) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m94380s());
        }
        m94365R0(null);
        int[] iArr = this.f126440z;
        int i13 = this.f126437w - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: M0 */
    public final AbstractC30704c0 mo94364M0(boolean z4) {
        if (this.f126435H) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m94380s());
        }
        m94365R0(Boolean.valueOf(z4));
        int[] iArr = this.f126440z;
        int i13 = this.f126437w - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m94365R0(Serializable serializable) {
        String str;
        Object objPut;
        int iM94376T = m94376T();
        int i13 = this.f126437w;
        if (i13 == 1) {
            if (iM94376T != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            int i14 = i13 - 1;
            this.f126438x[i14] = 7;
            this.f126424J[i14] = serializable;
            return;
        }
        if (iM94376T != 3 || (str = this.f126425K) == null) {
            if (iM94376T == 1) {
                ((List) this.f126424J[i13 - 1]).add(serializable);
                return;
            } else {
                if (iM94376T != 9) {
                    throw new IllegalStateException("Nesting problem.");
                }
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
        }
        if ((serializable == null && !this.f126434G) || (objPut = ((Map) this.f126424J[i13 - 1]).put(str, serializable)) == null) {
            this.f126425K = null;
            return;
        }
        throw new IllegalArgumentException("Map key '" + this.f126425K + "' has multiple values at path " + m94380s() + ": " + objPut + " and " + serializable);
    }

    /* JADX INFO: renamed from: S0 */
    public final Object m94366S0() {
        int i13 = this.f126437w;
        if (i13 > 1 || (i13 == 1 && this.f126438x[i13 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f126424J[0];
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: b */
    public final AbstractC30704c0 mo94367b() {
        if (this.f126435H) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m94380s());
        }
        int i13 = this.f126437w;
        int i14 = this.f126436I;
        if (i13 == i14 && this.f126438x[i13 - 1] == 1) {
            this.f126436I = ~i14;
            return this;
        }
        m94379i();
        ArrayList arrayList = new ArrayList();
        m94365R0(arrayList);
        Object[] objArr = this.f126424J;
        int i15 = this.f126437w;
        objArr[i15] = arrayList;
        this.f126440z[i15] = 0;
        m94377a0(1);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i13 = this.f126437w;
        if (i13 > 1 || (i13 == 1 && this.f126438x[i13 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f126437w = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f126437w == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: h */
    public final AbstractC30704c0 mo94368h() {
        if (this.f126435H) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m94380s());
        }
        int i13 = this.f126437w;
        int i14 = this.f126436I;
        if (i13 == i14 && this.f126438x[i13 - 1] == 3) {
            this.f126436I = ~i14;
            return this;
        }
        m94379i();
        C30714h0 c30714h0 = new C30714h0();
        m94365R0(c30714h0);
        this.f126424J[this.f126437w] = c30714h0;
        m94377a0(3);
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: k */
    public final AbstractC30704c0 mo94369k() {
        if (m94376T() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i13 = this.f126437w;
        int i14 = this.f126436I;
        if (i13 == (~i14)) {
            this.f126436I = ~i14;
            return this;
        }
        int i15 = i13 - 1;
        this.f126437w = i15;
        this.f126424J[i15] = null;
        int[] iArr = this.f126440z;
        int i16 = i13 - 2;
        iArr[i16] = iArr[i16] + 1;
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: m */
    public final AbstractC30704c0 mo94370m() {
        if (m94376T() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f126425K != null) {
            throw new IllegalStateException("Dangling name: " + this.f126425K);
        }
        int i13 = this.f126437w;
        int i14 = this.f126436I;
        if (i13 == (~i14)) {
            this.f126436I = ~i14;
            return this;
        }
        this.f126435H = false;
        int i15 = i13 - 1;
        this.f126437w = i15;
        this.f126424J[i15] = null;
        this.f126439y[i15] = null;
        int[] iArr = this.f126440z;
        int i16 = i13 - 2;
        iArr[i16] = iArr[i16] + 1;
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: o0 */
    public final AbstractC30704c0 mo94371o0(double d3) {
        if (!this.f126433F && (Double.isNaN(d3) || d3 == Double.NEGATIVE_INFINITY || d3 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
        if (this.f126435H) {
            this.f126435H = false;
            mo94373x(Double.toString(d3));
            return this;
        }
        m94365R0(Double.valueOf(d3));
        int[] iArr = this.f126440z;
        int i13 = this.f126437w - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: p0 */
    public final AbstractC30704c0 mo94372p0(long j7) {
        if (this.f126435H) {
            this.f126435H = false;
            mo94373x(Long.toString(j7));
            return this;
        }
        m94365R0(Long.valueOf(j7));
        int[] iArr = this.f126440z;
        int i13 = this.f126437w - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: x */
    public final AbstractC30704c0 mo94373x(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f126437w == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (m94376T() != 3 || this.f126425K != null || this.f126435H) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f126425K = str;
        this.f126439y[this.f126437w - 1] = str;
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: x0 */
    public final AbstractC30704c0 mo94374x0(Float f13) {
        if (f13 != null) {
            mo94371o0(f13.doubleValue());
            return this;
        }
        if (f13 == null) {
            mo94363J();
            return this;
        }
        BigDecimal bigDecimal = new BigDecimal(f13.toString());
        if (this.f126435H) {
            this.f126435H = false;
            mo94373x(bigDecimal.toString());
            return this;
        }
        m94365R0(bigDecimal);
        int[] iArr = this.f126440z;
        int i13 = this.f126437w - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }
}
