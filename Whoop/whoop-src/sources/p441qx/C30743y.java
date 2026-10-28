package p441qx;

import java.io.IOException;
import live.hms.video.factories.MediaConstraintsFactory;
import ne3.InterfaceC26618i;

/* JADX INFO: renamed from: qx.y */
/* JADX INFO: loaded from: classes.dex */
public final class C30743y extends AbstractC30704c0 {

    /* JADX INFO: renamed from: M */
    public static final String[] f126564M = new String[128];

    /* JADX INFO: renamed from: J */
    public final InterfaceC26618i f126565J;

    /* JADX INFO: renamed from: K */
    public String f126566K = ":";

    /* JADX INFO: renamed from: L */
    public String f126567L;

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f126564M[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f126564M;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C30743y(InterfaceC26618i interfaceC26618i) {
        if (interfaceC26618i == null) {
            throw new NullPointerException("sink == null");
        }
        this.f126565J = interfaceC26618i;
        m94377a0(6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: j1 */
    public static void m94414j1(InterfaceC26618i interfaceC26618i, String str) {
        String str2;
        interfaceC26618i.writeByte(34);
        int length = str.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt < 128) {
                str2 = f126564M[cCharAt];
                if (str2 != null) {
                    if (i13 < i14) {
                        interfaceC26618i.mo79186L0(i13, i14, str);
                    }
                    interfaceC26618i.mo79193S(str2);
                    i13 = i14 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i13 < i14) {
                    interfaceC26618i.mo79186L0(i13, i14, str);
                }
                interfaceC26618i.mo79193S(str2);
                i13 = i14 + 1;
            }
        }
        if (i13 < length) {
            interfaceC26618i.mo79186L0(i13, length, str);
        }
        interfaceC26618i.writeByte(34);
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: F0 */
    public final AbstractC30704c0 mo94362F0(String str) {
        if (str == null) {
            mo94363J();
            return this;
        }
        if (this.f126435H) {
            this.f126435H = false;
            mo94373x(str);
            return this;
        }
        m94419k1();
        m94415R0();
        m94414j1(this.f126565J, str);
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
        if (this.f126567L != null) {
            if (!this.f126434G) {
                this.f126567L = null;
                return this;
            }
            m94419k1();
        }
        m94415R0();
        this.f126565J.mo79193S("null");
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
        m94419k1();
        m94415R0();
        this.f126565J.mo79193S(z4 ? MediaConstraintsFactory.kValueTrue : MediaConstraintsFactory.kValueFalse);
        int[] iArr = this.f126440z;
        int i13 = this.f126437w - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m94415R0() {
        int iM94376T = m94376T();
        int i13 = 2;
        if (iM94376T != 1) {
            InterfaceC26618i interfaceC26618i = this.f126565J;
            if (iM94376T == 2) {
                interfaceC26618i.writeByte(44);
                m94417T0();
            } else if (iM94376T == 4) {
                interfaceC26618i.mo79193S(this.f126566K);
                i13 = 5;
            } else {
                if (iM94376T == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iM94376T != 6) {
                    if (iM94376T != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f126433F) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                i13 = 7;
            }
        } else {
            m94417T0();
        }
        this.f126438x[this.f126437w - 1] = i13;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m94416S0(int i13, int i14, char c3) {
        int iM94376T = m94376T();
        if (iM94376T != i14 && iM94376T != i13) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f126567L != null) {
            throw new IllegalStateException("Dangling name: " + this.f126567L);
        }
        int i15 = this.f126437w;
        int i16 = ~this.f126436I;
        if (i15 == i16) {
            this.f126436I = i16;
            return;
        }
        int i17 = i15 - 1;
        this.f126437w = i17;
        this.f126439y[i17] = null;
        int[] iArr = this.f126440z;
        int i18 = i15 - 2;
        iArr[i18] = iArr[i18] + 1;
        if (iM94376T == i14) {
            m94417T0();
        }
        this.f126565J.writeByte(c3);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m94417T0() {
        if (this.f126432E == null) {
            return;
        }
        InterfaceC26618i interfaceC26618i = this.f126565J;
        interfaceC26618i.writeByte(10);
        int i13 = this.f126437w;
        for (int i14 = 1; i14 < i13; i14++) {
            interfaceC26618i.mo79193S(this.f126432E);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m94418X0(int i13, int i14, char c3) {
        int i15;
        int i16 = this.f126437w;
        int i17 = this.f126436I;
        if (i16 == i17 && ((i15 = this.f126438x[i16 - 1]) == i13 || i15 == i14)) {
            this.f126436I = ~i17;
            return;
        }
        m94415R0();
        m94379i();
        m94377a0(i13);
        this.f126440z[this.f126437w - 1] = 0;
        this.f126565J.writeByte(c3);
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: b */
    public final AbstractC30704c0 mo94367b() {
        if (this.f126435H) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m94380s());
        }
        m94419k1();
        m94418X0(1, 2, '[');
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: b0 */
    public final void mo94378b0(String str) {
        super.mo94378b0(str);
        this.f126566K = !str.isEmpty() ? ": " : ":";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f126565J.close();
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
        this.f126565J.flush();
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: h */
    public final AbstractC30704c0 mo94368h() {
        if (this.f126435H) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m94380s());
        }
        m94419k1();
        m94418X0(3, 5, '{');
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: k */
    public final AbstractC30704c0 mo94369k() {
        m94416S0(1, 2, ']');
        return this;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m94419k1() {
        if (this.f126567L != null) {
            int iM94376T = m94376T();
            InterfaceC26618i interfaceC26618i = this.f126565J;
            if (iM94376T == 5) {
                interfaceC26618i.writeByte(44);
            } else if (iM94376T != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m94417T0();
            this.f126438x[this.f126437w - 1] = 4;
            m94414j1(interfaceC26618i, this.f126567L);
            this.f126567L = null;
        }
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: m */
    public final AbstractC30704c0 mo94370m() {
        this.f126435H = false;
        m94416S0(3, 5, '}');
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: o0 */
    public final AbstractC30704c0 mo94371o0(double d3) {
        if (!this.f126433F && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
        if (this.f126435H) {
            this.f126435H = false;
            mo94373x(Double.toString(d3));
            return this;
        }
        m94419k1();
        m94415R0();
        this.f126565J.mo79193S(Double.toString(d3));
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
        m94419k1();
        m94415R0();
        this.f126565J.mo79193S(Long.toString(j7));
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
        int iM94376T = m94376T();
        if ((iM94376T != 3 && iM94376T != 5) || this.f126567L != null || this.f126435H) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f126567L = str;
        this.f126439y[this.f126437w - 1] = str;
        return this;
    }

    @Override // p441qx.AbstractC30704c0
    /* JADX INFO: renamed from: x0 */
    public final AbstractC30704c0 mo94374x0(Float f13) {
        if (f13 == null) {
            mo94363J();
            return this;
        }
        String string = f13.toString();
        if (!this.f126433F && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f13);
        }
        if (this.f126435H) {
            this.f126435H = false;
            mo94373x(string);
            return this;
        }
        m94419k1();
        m94415R0();
        this.f126565J.mo79193S(string);
        int[] iArr = this.f126440z;
        int i13 = this.f126437w - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }
}
