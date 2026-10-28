package p596ww;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import live.hms.video.factories.MediaConstraintsFactory;
import p384ow.C28413i;

/* JADX INFO: renamed from: ww.b */
/* JADX INFO: loaded from: classes6.dex */
public class C37654b implements Closeable, Flushable {

    /* JADX INFO: renamed from: L */
    public static final Pattern f161377L = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: M */
    public static final String[] f161378M = new String[128];

    /* JADX INFO: renamed from: N */
    public static final String[] f161379N;

    /* JADX INFO: renamed from: E */
    public String f161380E;

    /* JADX INFO: renamed from: F */
    public String f161381F;

    /* JADX INFO: renamed from: G */
    public boolean f161382G;

    /* JADX INFO: renamed from: H */
    public int f161383H;

    /* JADX INFO: renamed from: I */
    public boolean f161384I;

    /* JADX INFO: renamed from: J */
    public String f161385J;

    /* JADX INFO: renamed from: K */
    public boolean f161386K;

    /* JADX INFO: renamed from: w */
    public final Writer f161387w;

    /* JADX INFO: renamed from: x */
    public int[] f161388x;

    /* JADX INFO: renamed from: y */
    public int f161389y;

    /* JADX INFO: renamed from: z */
    public C28413i f161390z;

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f161378M[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f161378M;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f161379N = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C37654b(Writer writer) {
        int[] iArr = new int[32];
        this.f161388x = iArr;
        this.f161389y = 0;
        if (iArr.length == 0) {
            this.f161388x = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f161388x;
        int i13 = this.f161389y;
        this.f161389y = i13 + 1;
        iArr2[i13] = 6;
        this.f161383H = 2;
        this.f161386K = true;
        Objects.requireNonNull(writer, "out == null");
        this.f161387w = writer;
        m121080x(C28413i.f114605d);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m121067F0() throws IOException {
        if (this.f161385J != null) {
            int iM121079s = m121079s();
            if (iM121079s == 5) {
                this.f161387w.write(this.f161381F);
            } else if (iM121079s != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m121075k();
            this.f161388x[this.f161389y - 1] = 4;
            m121069T(this.f161385J);
            this.f161385J = null;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m121068J(int i13) {
        if (i13 == 0) {
            throw null;
        }
        this.f161383H = i13;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: T */
    public final void m121069T(String str) throws IOException {
        String str2;
        String[] strArr = this.f161384I ? f161379N : f161378M;
        Writer writer = this.f161387w;
        writer.write(34);
        int length = str.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i13 < i14) {
                        writer.write(str, i13, i14 - i13);
                    }
                    writer.write(str2);
                    i13 = i14 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i13 < i14) {
                    writer.write(str, i13, i14 - i13);
                }
                writer.write(str2);
                i13 = i14 + 1;
            }
        }
        if (i13 < length) {
            writer.write(str, i13, length - i13);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: a0 */
    public void m121070a0(double d3) throws IOException {
        m121067F0();
        if (this.f161383H == 1 || !(Double.isNaN(d3) || Double.isInfinite(d3))) {
            m121071b();
            this.f161387w.append((CharSequence) Double.toString(d3));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m121071b() throws IOException {
        int iM121079s = m121079s();
        if (iM121079s == 1) {
            this.f161388x[this.f161389y - 1] = 2;
            m121075k();
            return;
        }
        Writer writer = this.f161387w;
        if (iM121079s == 2) {
            writer.append((CharSequence) this.f161381F);
            m121075k();
        } else {
            if (iM121079s == 4) {
                writer.append((CharSequence) this.f161380E);
                this.f161388x[this.f161389y - 1] = 5;
                return;
            }
            if (iM121079s != 6) {
                if (iM121079s != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f161383H != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f161388x[this.f161389y - 1] = 7;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m121072b0(long j7) throws IOException {
        m121067F0();
        m121071b();
        this.f161387w.write(Long.toString(j7));
    }

    public void beginArray() throws IOException {
        m121067F0();
        m121071b();
        int i13 = this.f161389y;
        int[] iArr = this.f161388x;
        if (i13 == iArr.length) {
            this.f161388x = Arrays.copyOf(iArr, i13 * 2);
        }
        int[] iArr2 = this.f161388x;
        int i14 = this.f161389y;
        this.f161389y = i14 + 1;
        iArr2[i14] = 1;
        this.f161387w.write(91);
    }

    public void beginObject() throws IOException {
        m121067F0();
        m121071b();
        int i13 = this.f161389y;
        int[] iArr = this.f161388x;
        if (i13 == iArr.length) {
            this.f161388x = Arrays.copyOf(iArr, i13 * 2);
        }
        int[] iArr2 = this.f161388x;
        int i14 = this.f161389y;
        this.f161389y = i14 + 1;
        iArr2[i14] = 3;
        this.f161387w.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f161387w.close();
        int i13 = this.f161389y;
        if (i13 > 1 || (i13 == 1 && this.f161388x[i13 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f161389y = 0;
    }

    public void endArray() throws IOException {
        m121073h(1, 2, ']');
    }

    public void endObject() throws IOException {
        m121073h(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f161389y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f161387w.flush();
    }

    /* JADX INFO: renamed from: h */
    public final void m121073h(int i13, int i14, char c3) throws IOException {
        int iM121079s = m121079s();
        if (iM121079s != i14 && iM121079s != i13) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f161385J != null) {
            throw new IllegalStateException("Dangling name: " + this.f161385J);
        }
        this.f161389y--;
        if (iM121079s == i14) {
            m121075k();
        }
        this.f161387w.write(c3);
    }

    /* JADX INFO: renamed from: i */
    public void m121074i(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f161385J != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM121079s = m121079s();
        if (iM121079s != 3 && iM121079s != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f161385J = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m121075k() throws IOException {
        if (this.f161382G) {
            return;
        }
        String str = this.f161390z.f114606a;
        Writer writer = this.f161387w;
        writer.write(str);
        int i13 = this.f161389y;
        for (int i14 = 1; i14 < i13; i14++) {
            writer.write(this.f161390z.f114607b);
        }
    }

    /* JADX INFO: renamed from: m */
    public C37654b m121076m() throws IOException {
        if (this.f161385J != null) {
            if (!this.f161386K) {
                this.f161385J = null;
                return this;
            }
            m121067F0();
        }
        m121071b();
        this.f161387w.write("null");
        return this;
    }

    /* JADX INFO: renamed from: o0 */
    public void m121077o0(Number number) throws IOException {
        if (number == null) {
            m121076m();
            return;
        }
        m121067F0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f161383H != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f161377L.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m121071b();
        this.f161387w.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: p0 */
    public void m121078p0(String str) throws IOException {
        if (str == null) {
            m121076m();
            return;
        }
        m121067F0();
        m121071b();
        m121069T(str);
    }

    /* JADX INFO: renamed from: s */
    public final int m121079s() {
        int i13 = this.f161389y;
        if (i13 != 0) {
            return this.f161388x[i13 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: x */
    public final void m121080x(C28413i c28413i) {
        Objects.requireNonNull(c28413i);
        this.f161390z = c28413i;
        this.f161381F = ",";
        if (c28413i.f114608c) {
            this.f161380E = ": ";
            if (c28413i.f114606a.isEmpty()) {
                this.f161381F = ", ";
            }
        } else {
            this.f161380E = ":";
        }
        this.f161382G = this.f161390z.f114606a.isEmpty() && this.f161390z.f114607b.isEmpty();
    }

    /* JADX INFO: renamed from: x0 */
    public void m121081x0(boolean z4) throws IOException {
        m121067F0();
        m121071b();
        this.f161387w.write(z4 ? MediaConstraintsFactory.kValueTrue : MediaConstraintsFactory.kValueFalse);
    }
}
