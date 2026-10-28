package p596ww;

import androidx.health.platform.client.proto.C1533u;
import com.nimbusds.jose.shaded.gson.stream.MalformedJsonException;
import ih0.AbstractC18489d0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import live.hms.video.factories.MediaConstraintsFactory;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p499t9.C33647p;
import p555vl.AbstractC36095b;

/* JADX INFO: renamed from: ww.a */
/* JADX INFO: loaded from: classes6.dex */
public class C37653a implements Closeable {

    /* JADX INFO: renamed from: H */
    public long f161365H;

    /* JADX INFO: renamed from: I */
    public int f161366I;

    /* JADX INFO: renamed from: J */
    public String f161367J;

    /* JADX INFO: renamed from: K */
    public int[] f161368K;

    /* JADX INFO: renamed from: M */
    public String[] f161370M;

    /* JADX INFO: renamed from: N */
    public int[] f161371N;

    /* JADX INFO: renamed from: w */
    public final StringReader f161373w;

    /* JADX INFO: renamed from: O */
    public int f161372O = 2;

    /* JADX INFO: renamed from: x */
    public final char[] f161374x = new char[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];

    /* JADX INFO: renamed from: y */
    public int f161375y = 0;

    /* JADX INFO: renamed from: z */
    public int f161376z = 0;

    /* JADX INFO: renamed from: E */
    public int f161362E = 0;

    /* JADX INFO: renamed from: F */
    public int f161363F = 0;

    /* JADX INFO: renamed from: G */
    public int f161364G = 0;

    /* JADX INFO: renamed from: L */
    public int f161369L = 1;

    static {
        C33647p.f140433x = new C33647p(14);
    }

    public C37653a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f161368K = iArr;
        iArr[0] = 6;
        this.f161370M = new String[32];
        this.f161371N = new int[32];
        this.f161373w = stringReader;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m121048F0(char c3) throws MalformedJsonException {
        do {
            int i13 = this.f161375y;
            int i14 = this.f161376z;
            while (i13 < i14) {
                int i15 = i13 + 1;
                char c7 = this.f161374x[i13];
                if (c7 == c3) {
                    this.f161375y = i15;
                    return;
                }
                if (c7 == '\\') {
                    this.f161375y = i15;
                    m121066x0();
                    i13 = this.f161375y;
                    i14 = this.f161376z;
                } else {
                    if (c7 == '\n') {
                        this.f161362E++;
                        this.f161363F = i15;
                    }
                    i13 = i15;
                }
            }
            this.f161375y = i13;
        } while (m121059i(1));
        m121052S0("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: J */
    public final int m121049J(boolean z4) throws IOException {
        int i13 = this.f161375y;
        int i14 = this.f161376z;
        while (true) {
            if (i13 == i14) {
                this.f161375y = i13;
                if (!m121059i(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m121064s());
                }
                i13 = this.f161375y;
                i14 = this.f161376z;
            }
            int i15 = i13 + 1;
            char[] cArr = this.f161374x;
            char c3 = cArr[i13];
            if (c3 == '\n') {
                this.f161362E++;
                this.f161363F = i15;
            } else if (c3 != ' ' && c3 != '\r' && c3 != '\t') {
                if (c3 == '/') {
                    this.f161375y = i15;
                    if (i15 == i14) {
                        this.f161375y = i13;
                        boolean zM121059i = m121059i(2);
                        this.f161375y++;
                        if (!zM121059i) {
                        }
                        return c3;
                    }
                    m121056b();
                    int i16 = this.f161375y;
                    char c7 = cArr[i16];
                    if (c7 == '*') {
                        this.f161375y = i16 + 1;
                        while (true) {
                            if (this.f161375y + 2 > this.f161376z && !m121059i(2)) {
                                m121052S0("Unterminated comment");
                                throw null;
                            }
                            int i17 = this.f161375y;
                            if (cArr[i17] != '\n') {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 2) {
                                        i13 = this.f161375y + 2;
                                        i14 = this.f161376z;
                                        break;
                                    }
                                    if (cArr[this.f161375y + i18] != "*/".charAt(i18)) {
                                        break;
                                    }
                                    i18++;
                                }
                            } else {
                                this.f161362E++;
                                this.f161363F = i17 + 1;
                            }
                            this.f161375y++;
                        }
                    } else {
                        if (c7 != '/') {
                            return c3;
                        }
                        this.f161375y = i16 + 1;
                        m121050M0();
                        i13 = this.f161375y;
                        i14 = this.f161376z;
                    }
                } else {
                    if (c3 != '#') {
                        this.f161375y = i15;
                        return c3;
                    }
                    this.f161375y = i15;
                    m121056b();
                    m121050M0();
                    i13 = this.f161375y;
                    i14 = this.f161376z;
                }
            }
            i13 = i15;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m121050M0() {
        char c3;
        do {
            if (this.f161375y >= this.f161376z && !m121059i(1)) {
                return;
            }
            int i13 = this.f161375y;
            int i14 = i13 + 1;
            this.f161375y = i14;
            c3 = this.f161374x[i13];
            if (c3 == '\n') {
                this.f161362E++;
                this.f161363F = i14;
                return;
            }
        } while (c3 != '\r');
    }

    /* JADX INFO: renamed from: R0 */
    public final void m121051R0() throws MalformedJsonException {
        do {
            int i13 = 0;
            while (true) {
                int i14 = this.f161375y;
                if (i14 + i13 < this.f161376z) {
                    char c3 = this.f161374x[i14 + i13];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i13++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        m121056b();
                    }
                    this.f161375y += i13;
                    return;
                }
                this.f161375y = i14 + i13;
            }
        } while (m121059i(1));
    }

    /* JADX INFO: renamed from: S0 */
    public final void m121052S0(String str) throws MalformedJsonException {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        sbM53374o.append(m121064s());
        sbM53374o.append("\nSee ");
        sbM53374o.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(sbM53374o.toString());
    }

    /* JADX INFO: renamed from: T */
    public final void m121053T() {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h != 7) {
            throw m121054T0("null");
        }
        this.f161364G = 0;
        int[] iArr = this.f161371N;
        int i13 = this.f161369L - 1;
        iArr[i13] = iArr[i13] + 1;
    }

    /* JADX INFO: renamed from: T0 */
    public final IllegalStateException m121054T0(String str) {
        String str2 = m121062o0() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Expected ", str, " but was ");
        sbM53375p.append(AbstractC36095b.m114672B(m121062o0()));
        sbM53375p.append(m121064s());
        sbM53375p.append("\nSee ");
        sbM53375p.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM53375p.toString());
    }

    /* JADX INFO: renamed from: a0 */
    public final String m121055a0(char c3) throws MalformedJsonException {
        int i13;
        char[] cArr;
        StringBuilder sb4 = null;
        do {
            int i14 = this.f161375y;
            int i15 = this.f161376z;
            while (true) {
                int i16 = i15;
                i13 = i14;
                while (true) {
                    cArr = this.f161374x;
                    if (i14 < i16) {
                        int i17 = i14 + 1;
                        char c7 = cArr[i14];
                        if (this.f161372O == 3 && c7 < ' ') {
                            m121052S0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c7 == c3) {
                            this.f161375y = i17;
                            int i18 = (i17 - i13) - 1;
                            if (sb4 == null) {
                                return new String(cArr, i13, i18);
                            }
                            sb4.append(cArr, i13, i18);
                            return sb4.toString();
                        }
                        if (c7 == '\\') {
                            this.f161375y = i17;
                            int i19 = i17 - i13;
                            int i24 = i19 - 1;
                            if (sb4 == null) {
                                sb4 = new StringBuilder(Math.max(i19 * 2, 16));
                            }
                            sb4.append(cArr, i13, i24);
                            sb4.append(m121066x0());
                            i14 = this.f161375y;
                            i15 = this.f161376z;
                        } else {
                            if (c7 == '\n') {
                                this.f161362E++;
                                this.f161363F = i17;
                            }
                            i14 = i17;
                        }
                    }
                }
            }
            if (sb4 == null) {
                sb4 = new StringBuilder(Math.max((i14 - i13) * 2, 16));
            }
            sb4.append(cArr, i13, i14 - i13);
            this.f161375y = i14;
        } while (m121059i(1));
        m121052S0("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m121056b() throws MalformedJsonException {
        if (this.f161372O == 1) {
            return;
        }
        m121052S0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: b0 */
    public final String m121057b0() throws MalformedJsonException {
        String string;
        StringBuilder sb4 = null;
        int i13 = 0;
        while (true) {
            int i14 = 0;
            while (true) {
                int i15 = this.f161375y;
                int i16 = i15 + i14;
                int i17 = this.f161376z;
                char[] cArr = this.f161374x;
                if (i16 < i17) {
                    char c3 = cArr[i15 + i14];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i14++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m121056b();
                    }
                    i13 = i14;
                } else if (i14 >= cArr.length) {
                    if (sb4 == null) {
                        sb4 = new StringBuilder(Math.max(i14, 16));
                    }
                    sb4.append(cArr, this.f161375y, i14);
                    this.f161375y += i14;
                    if (!m121059i(1)) {
                    }
                } else if (!m121059i(i14 + 1)) {
                    i13 = i14;
                }
                if (sb4 == null) {
                    string = new String(cArr, this.f161375y, i13);
                } else {
                    sb4.append(cArr, this.f161375y, i13);
                    string = sb4.toString();
                }
                this.f161375y += i13;
                return string;
            }
        }
    }

    public final void beginArray() {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h != 3) {
            throw m121054T0("BEGIN_ARRAY");
        }
        m121063p0(1);
        this.f161371N[this.f161369L - 1] = 0;
        this.f161364G = 0;
    }

    public final void beginObject() {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h != 1) {
            throw m121054T0("BEGIN_OBJECT");
        }
        m121063p0(3);
        this.f161364G = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f161364G = 0;
        this.f161368K[0] = 8;
        this.f161369L = 1;
        this.f161373w.close();
    }

    public final void endArray() {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h != 4) {
            throw m121054T0("END_ARRAY");
        }
        int i13 = this.f161369L;
        this.f161369L = i13 - 1;
        int[] iArr = this.f161371N;
        int i14 = i13 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f161364G = 0;
    }

    public final void endObject() {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h != 2) {
            throw m121054T0("END_OBJECT");
        }
        int i13 = this.f161369L;
        int i14 = i13 - 1;
        this.f161369L = i14;
        this.f161370M[i14] = null;
        int[] iArr = this.f161371N;
        int i15 = i13 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f161364G = 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0189  */
    /* JADX WARN: Code duplicated, block: B:123:0x019b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b2 A[PHI: r4 r14
      0x01b2: PHI (r4v10 int) = (r4v9 int), (r4v15 int) binds: [B:122:0x0199, B:129:0x01ac] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r14v6 int) = (r14v5 int), (r14v7 int) binds: [B:122:0x0199, B:129:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01be  */
    /* JADX WARN: Code duplicated, block: B:172:0x021d  */
    /* JADX WARN: Code duplicated, block: B:173:0x021f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240 A[DONT_INVERT, PHI: r13
      0x0240: PHI (r13v24 int) = (r13v23 int), (r13v25 int) binds: [B:171:0x021b, B:177:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x0242  */
    /* JADX WARN: Code duplicated, block: B:199:0x025f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0262  */
    /* JADX WARN: Code duplicated, block: B:204:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x0270 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x0271  */
    /* JADX WARN: Code duplicated, block: B:211:0x027b  */
    /* JADX WARN: Code duplicated, block: B:213:0x0281  */
    /* JADX WARN: Code duplicated, block: B:215:0x0287  */
    /* JADX WARN: Code duplicated, block: B:217:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x028c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0290  */
    /* JADX WARN: Code duplicated, block: B:230:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:232:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:273:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136  */
    /* JADX WARN: Code duplicated, block: B:99:0x013e  */
    /* JADX INFO: renamed from: h */
    public final int m121058h() throws IOException {
        int iM121049J;
        int i13;
        int iM121049J2;
        char c3;
        String str;
        String str2;
        int i14;
        int i15;
        int length;
        int i16;
        char c7;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z4;
        char c14;
        int i25;
        int i26;
        int[] iArr = this.f161368K;
        int i27 = this.f161369L - 1;
        int i28 = iArr[i27];
        char[] cArr = this.f161374x;
        if (i28 == 1) {
            iArr[i27] = 2;
        } else if (i28 == 2) {
            int iM121049J3 = m121049J(true);
            if (iM121049J3 != 44) {
                if (iM121049J3 != 59) {
                    if (iM121049J3 == 93) {
                        this.f161364G = 4;
                        return 4;
                    }
                    m121052S0("Unterminated array");
                    throw null;
                }
                m121056b();
            }
        } else {
            if (i28 == 3 || i28 == 5) {
                iArr[i27] = 4;
                if (i28 == 5 && (iM121049J = m121049J(true)) != 44) {
                    if (iM121049J != 59) {
                        if (iM121049J == 125) {
                            this.f161364G = 2;
                            return 2;
                        }
                        m121052S0("Unterminated object");
                        throw null;
                    }
                    m121056b();
                }
                int iM121049J4 = m121049J(true);
                if (iM121049J4 == 34) {
                    this.f161364G = 13;
                    return 13;
                }
                if (iM121049J4 == 39) {
                    m121056b();
                    this.f161364G = 12;
                    return 12;
                }
                if (iM121049J4 == 125) {
                    if (i28 != 5) {
                        this.f161364G = 2;
                        return 2;
                    }
                    m121052S0("Expected name");
                    throw null;
                }
                m121056b();
                this.f161375y--;
                if (m121061m((char) iM121049J4)) {
                    this.f161364G = 14;
                    return 14;
                }
                m121052S0("Expected name");
                throw null;
            }
            if (i28 != 4) {
                if (i28 == 6) {
                    if (this.f161372O == 1) {
                        m121049J(true);
                        int i29 = this.f161375y;
                        this.f161375y = i29 - 1;
                        if (i29 + 4 <= this.f161376z || m121059i(5)) {
                            int i34 = this.f161375y;
                            if (cArr[i34] == ')' && cArr[i34 + 1] == ']' && cArr[i34 + 2] == '}' && cArr[i34 + 3] == '\'' && cArr[i34 + 4] == '\n') {
                                this.f161375y = i34 + 5;
                            }
                        }
                    }
                    this.f161368K[this.f161369L - 1] = 7;
                } else if (i28 == 7) {
                    i13 = 0;
                    if (m121049J(false) == -1) {
                        this.f161364G = 17;
                        return 17;
                    }
                    m121056b();
                    this.f161375y--;
                } else {
                    i13 = 0;
                    if (i28 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iM121049J2 = m121049J(true);
                if (iM121049J2 != 34) {
                    this.f161364G = 9;
                    return 9;
                }
                if (iM121049J2 != 39) {
                    m121056b();
                    this.f161364G = 8;
                    return 8;
                }
                if (iM121049J2 != 44 && iM121049J2 != 59) {
                    if (iM121049J2 != 91) {
                        this.f161364G = 3;
                        return 3;
                    }
                    if (iM121049J2 != 93) {
                        if (iM121049J2 != 123) {
                            this.f161364G = 1;
                            return 1;
                        }
                        int i35 = this.f161375y - 1;
                        this.f161375y = i35;
                        c3 = cArr[i35];
                        if (c3 != 't' || c3 == 'T') {
                            str = MediaConstraintsFactory.kValueTrue;
                            str2 = "TRUE";
                            i14 = 5;
                        } else {
                            if (c3 != 'f' && c3 != 'F') {
                                if (c3 != 'n' && c3 != 'N') {
                                    i14 = i13;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i14 = 7;
                                if (i14 != 0) {
                                    return i14;
                                }
                                int i36 = this.f161375y;
                                i17 = this.f161376z;
                                i18 = i13;
                                i19 = i18;
                                int i37 = i19;
                                i24 = i36;
                                z4 = true;
                                long j7 = 0;
                                while (true) {
                                    if (i24 + i19 != i17) {
                                        c14 = cArr[i24 + i19];
                                        if (c14 != '+') {
                                            if (c14 != 'E' || c14 == 'e') {
                                                if (i18 != 2 || i18 == 4) {
                                                    i18 = 5;
                                                    i19++;
                                                }
                                            } else if (c14 == '-') {
                                                if (i18 == 0) {
                                                    i18 = 1;
                                                    i37 = 1;
                                                } else {
                                                    if (i18 != 5) {
                                                    }
                                                    i18 = 6;
                                                }
                                                i19++;
                                            } else if (c14 != '.') {
                                                if (c14 >= '0' && c14 <= '9') {
                                                    if (i18 == 1 || i18 == 0) {
                                                        j7 = -(c14 - '0');
                                                        i18 = 2;
                                                    } else if (i18 == 2) {
                                                        if (j7 != 0) {
                                                            long j13 = (10 * j7) - ((long) (c14 - '0'));
                                                            z4 &= j7 > -922337203685477580L || (j7 == -922337203685477580L && j13 < j7);
                                                            j7 = j13;
                                                        }
                                                    } else if (i18 == 3) {
                                                        i18 = 4;
                                                    } else if (i18 == 5 || i18 == 6) {
                                                        i18 = 7;
                                                    }
                                                    i19++;
                                                } else if (!m121061m(c14)) {
                                                    i26 = 2;
                                                    if (i18 != 2) {
                                                        if (i18 != i26 || i18 == 4 || i18 == 7) {
                                                            this.f161366I = i19;
                                                            i25 = 16;
                                                            this.f161364G = 16;
                                                        }
                                                    } else if (z4 || ((j7 == Long.MIN_VALUE && i37 == 0) || (j7 == 0 && i37 != 0))) {
                                                        i26 = 2;
                                                        if (i18 != i26) {
                                                        }
                                                        this.f161366I = i19;
                                                        i25 = 16;
                                                        this.f161364G = 16;
                                                    } else {
                                                        if (i37 == 0) {
                                                            j7 = -j7;
                                                        }
                                                        this.f161365H = j7;
                                                        this.f161375y += i19;
                                                        i25 = 15;
                                                        this.f161364G = 15;
                                                    }
                                                }
                                            } else if (i18 == 2) {
                                                i18 = 3;
                                                i19++;
                                            }
                                            if (i25 != 0) {
                                                return i25;
                                            }
                                            if (m121061m(cArr[this.f161375y])) {
                                                m121052S0("Expected value");
                                                throw null;
                                            }
                                            m121056b();
                                            this.f161364G = 10;
                                            return 10;
                                        }
                                        if (i18 != 5) {
                                        }
                                        i18 = 6;
                                        i19++;
                                    } else if (i19 != cArr.length) {
                                        if (m121059i(i19 + 1)) {
                                            i24 = this.f161375y;
                                            i17 = this.f161376z;
                                            c14 = cArr[i24 + i19];
                                            if (c14 != '+') {
                                                if (c14 != 'E') {
                                                    if (i18 != 2) {
                                                    }
                                                    i18 = 5;
                                                    i19++;
                                                } else {
                                                    if (i18 != 2) {
                                                    }
                                                    i18 = 5;
                                                    i19++;
                                                }
                                                if (i25 != 0) {
                                                    return i25;
                                                }
                                                if (m121061m(cArr[this.f161375y])) {
                                                    m121052S0("Expected value");
                                                    throw null;
                                                }
                                                m121056b();
                                                this.f161364G = 10;
                                                return 10;
                                            }
                                            if (i18 != 5) {
                                            }
                                            i18 = 6;
                                            i19++;
                                        }
                                        i26 = 2;
                                        if (i18 != 2) {
                                            if (i18 != i26) {
                                            }
                                            this.f161366I = i19;
                                            i25 = 16;
                                            this.f161364G = 16;
                                        } else {
                                            if (z4) {
                                            }
                                            i26 = 2;
                                            if (i18 != i26) {
                                            }
                                            this.f161366I = i19;
                                            i25 = 16;
                                            this.f161364G = 16;
                                        }
                                        if (i25 != 0) {
                                            return i25;
                                        }
                                        if (m121061m(cArr[this.f161375y])) {
                                            m121052S0("Expected value");
                                            throw null;
                                        }
                                        m121056b();
                                        this.f161364G = 10;
                                        return 10;
                                    }
                                    i25 = 0;
                                    if (i25 != 0) {
                                        return i25;
                                    }
                                    if (m121061m(cArr[this.f161375y])) {
                                        m121052S0("Expected value");
                                        throw null;
                                    }
                                    m121056b();
                                    this.f161364G = 10;
                                    return 10;
                                }
                            }
                            str = MediaConstraintsFactory.kValueFalse;
                            str2 = "FALSE";
                            i14 = 6;
                        }
                        if (this.f161372O != 3) {
                            i15 = 1;
                        } else {
                            i15 = i13;
                        }
                        length = str.length();
                        i16 = i13;
                        while (true) {
                            if (i16 >= length) {
                                if ((this.f161375y + length < this.f161376z && !m121059i(length + 1)) || !m121061m(cArr[this.f161375y + length])) {
                                    this.f161375y += length;
                                    this.f161364G = i14;
                                    break;
                                }
                                break;
                            }
                            if ((this.f161375y + i16 >= this.f161376z || m121059i(i16 + 1)) && ((c7 = cArr[this.f161375y + i16]) == str.charAt(i16) || (i15 != 0 && c7 == str2.charAt(i16)))) {
                            }
                            i14 = i13;
                            break;
                        }
                        if (i14 != 0) {
                            return i14;
                        }
                        int i38 = this.f161375y;
                        i17 = this.f161376z;
                        i18 = i13;
                        i19 = i18;
                        int i39 = i19;
                        i24 = i38;
                        z4 = true;
                        long j14 = 0;
                        while (true) {
                            if (i24 + i19 != i17) {
                                c14 = cArr[i24 + i19];
                                if (c14 != '+') {
                                    if (c14 != 'E') {
                                        if (i18 != 2) {
                                        }
                                        i18 = 5;
                                        i19++;
                                    } else {
                                        if (i18 != 2) {
                                        }
                                        i18 = 5;
                                        i19++;
                                    }
                                    if (i25 != 0) {
                                        return i25;
                                    }
                                    if (m121061m(cArr[this.f161375y])) {
                                        m121052S0("Expected value");
                                        throw null;
                                    }
                                    m121056b();
                                    this.f161364G = 10;
                                    return 10;
                                }
                                if (i18 != 5) {
                                }
                                i18 = 6;
                                i19++;
                            } else if (i19 != cArr.length) {
                                if (m121059i(i19 + 1)) {
                                    i24 = this.f161375y;
                                    i17 = this.f161376z;
                                    c14 = cArr[i24 + i19];
                                    if (c14 != '+') {
                                        if (c14 != 'E') {
                                            if (i18 != 2) {
                                            }
                                            i18 = 5;
                                            i19++;
                                        } else {
                                            if (i18 != 2) {
                                            }
                                            i18 = 5;
                                            i19++;
                                        }
                                        if (i25 != 0) {
                                            return i25;
                                        }
                                        if (m121061m(cArr[this.f161375y])) {
                                            m121052S0("Expected value");
                                            throw null;
                                        }
                                        m121056b();
                                        this.f161364G = 10;
                                        return 10;
                                    }
                                    if (i18 != 5) {
                                    }
                                    i18 = 6;
                                    i19++;
                                }
                                i26 = 2;
                                if (i18 != 2) {
                                    if (i18 != i26) {
                                    }
                                    this.f161366I = i19;
                                    i25 = 16;
                                    this.f161364G = 16;
                                } else {
                                    if (z4) {
                                    }
                                    i26 = 2;
                                    if (i18 != i26) {
                                    }
                                    this.f161366I = i19;
                                    i25 = 16;
                                    this.f161364G = 16;
                                }
                                if (i25 != 0) {
                                    return i25;
                                }
                                if (m121061m(cArr[this.f161375y])) {
                                    m121052S0("Expected value");
                                    throw null;
                                }
                                m121056b();
                                this.f161364G = 10;
                                return 10;
                            }
                            i25 = 0;
                            if (i25 != 0) {
                                return i25;
                            }
                            if (m121061m(cArr[this.f161375y])) {
                                m121052S0("Expected value");
                                throw null;
                            }
                            m121056b();
                            this.f161364G = 10;
                            return 10;
                        }
                    }
                    if (i28 == 1) {
                        this.f161364G = 4;
                        return 4;
                    }
                }
                if (i28 == 1 && i28 != 2) {
                    m121052S0("Unexpected value");
                    throw null;
                }
                m121056b();
                this.f161375y--;
                this.f161364G = 7;
                return 7;
            }
            iArr[i27] = 5;
            int iM121049J5 = m121049J(true);
            if (iM121049J5 != 58) {
                if (iM121049J5 != 61) {
                    m121052S0("Expected ':'");
                    throw null;
                }
                m121056b();
                if (this.f161375y < this.f161376z || m121059i(1)) {
                    int i44 = this.f161375y;
                    if (cArr[i44] == '>') {
                        this.f161375y = i44 + 1;
                    }
                }
            }
        }
        i13 = 0;
        iM121049J2 = m121049J(true);
        if (iM121049J2 != 34) {
            this.f161364G = 9;
            return 9;
        }
        if (iM121049J2 != 39) {
            m121056b();
            this.f161364G = 8;
            return 8;
        }
        if (iM121049J2 != 44) {
            if (iM121049J2 != 91) {
                this.f161364G = 3;
                return 3;
            }
            if (iM121049J2 != 93) {
                if (iM121049J2 != 123) {
                    this.f161364G = 1;
                    return 1;
                }
                int i310 = this.f161375y - 1;
                this.f161375y = i310;
                c3 = cArr[i310];
                if (c3 != 't') {
                    str = MediaConstraintsFactory.kValueTrue;
                    str2 = "TRUE";
                    i14 = 5;
                    if (this.f161372O != 3) {
                        i15 = 1;
                    } else {
                        i15 = i13;
                    }
                    length = str.length();
                    i16 = i13;
                    while (true) {
                        if (i16 >= length) {
                            if (this.f161375y + length < this.f161376z) {
                            }
                            this.f161375y += length;
                            this.f161364G = i14;
                            break;
                        }
                        i16 = this.f161375y + i16 >= this.f161376z ? i16 + 1 : i16 + 1;
                    }
                    if (i14 != 0) {
                        return i14;
                    }
                    int i311 = this.f161375y;
                    i17 = this.f161376z;
                    i18 = i13;
                    i19 = i18;
                    int i312 = i19;
                    i24 = i311;
                    z4 = true;
                    long j15 = 0;
                    while (true) {
                        if (i24 + i19 != i17) {
                            c14 = cArr[i24 + i19];
                            if (c14 != '+') {
                                if (c14 != 'E') {
                                    if (i18 != 2) {
                                    }
                                    i18 = 5;
                                    i19++;
                                } else {
                                    if (i18 != 2) {
                                    }
                                    i18 = 5;
                                    i19++;
                                }
                                if (i25 != 0) {
                                    return i25;
                                }
                                if (m121061m(cArr[this.f161375y])) {
                                    m121052S0("Expected value");
                                    throw null;
                                }
                                m121056b();
                                this.f161364G = 10;
                                return 10;
                            }
                            if (i18 != 5) {
                            }
                            i18 = 6;
                            i19++;
                        } else if (i19 != cArr.length) {
                            if (m121059i(i19 + 1)) {
                                i24 = this.f161375y;
                                i17 = this.f161376z;
                                c14 = cArr[i24 + i19];
                                if (c14 != '+') {
                                    if (c14 != 'E') {
                                        if (i18 != 2) {
                                        }
                                        i18 = 5;
                                        i19++;
                                    } else {
                                        if (i18 != 2) {
                                        }
                                        i18 = 5;
                                        i19++;
                                    }
                                    if (i25 != 0) {
                                        return i25;
                                    }
                                    if (m121061m(cArr[this.f161375y])) {
                                        m121052S0("Expected value");
                                        throw null;
                                    }
                                    m121056b();
                                    this.f161364G = 10;
                                    return 10;
                                }
                                if (i18 != 5) {
                                }
                                i18 = 6;
                                i19++;
                            }
                            i26 = 2;
                            if (i18 != 2) {
                                if (i18 != i26) {
                                }
                                this.f161366I = i19;
                                i25 = 16;
                                this.f161364G = 16;
                            } else {
                                if (z4) {
                                }
                                i26 = 2;
                                if (i18 != i26) {
                                }
                                this.f161366I = i19;
                                i25 = 16;
                                this.f161364G = 16;
                            }
                            if (i25 != 0) {
                                return i25;
                            }
                            if (m121061m(cArr[this.f161375y])) {
                                m121052S0("Expected value");
                                throw null;
                            }
                            m121056b();
                            this.f161364G = 10;
                            return 10;
                        }
                        i25 = 0;
                        if (i25 != 0) {
                            return i25;
                        }
                        if (m121061m(cArr[this.f161375y])) {
                            m121052S0("Expected value");
                            throw null;
                        }
                        m121056b();
                        this.f161364G = 10;
                        return 10;
                    }
                }
                str = MediaConstraintsFactory.kValueTrue;
                str2 = "TRUE";
                i14 = 5;
                if (this.f161372O != 3) {
                    i15 = 1;
                } else {
                    i15 = i13;
                }
                length = str.length();
                i16 = i13;
                while (true) {
                    if (i16 >= length) {
                        if (this.f161375y + length < this.f161376z) {
                        }
                        this.f161375y += length;
                        this.f161364G = i14;
                        break;
                    }
                    if (this.f161375y + i16 >= this.f161376z) {
                    }
                }
                if (i14 != 0) {
                    return i14;
                }
                int i313 = this.f161375y;
                i17 = this.f161376z;
                i18 = i13;
                i19 = i18;
                int i314 = i19;
                i24 = i313;
                z4 = true;
                long j16 = 0;
                while (true) {
                    if (i24 + i19 != i17) {
                        c14 = cArr[i24 + i19];
                        if (c14 != '+') {
                            if (c14 != 'E') {
                                if (i18 != 2) {
                                }
                                i18 = 5;
                                i19++;
                            } else {
                                if (i18 != 2) {
                                }
                                i18 = 5;
                                i19++;
                            }
                            if (i25 != 0) {
                                return i25;
                            }
                            if (m121061m(cArr[this.f161375y])) {
                                m121052S0("Expected value");
                                throw null;
                            }
                            m121056b();
                            this.f161364G = 10;
                            return 10;
                        }
                        if (i18 != 5) {
                        }
                        i18 = 6;
                        i19++;
                    } else if (i19 != cArr.length) {
                        if (m121059i(i19 + 1)) {
                            i24 = this.f161375y;
                            i17 = this.f161376z;
                            c14 = cArr[i24 + i19];
                            if (c14 != '+') {
                                if (c14 != 'E') {
                                    if (i18 != 2) {
                                    }
                                    i18 = 5;
                                    i19++;
                                } else {
                                    if (i18 != 2) {
                                    }
                                    i18 = 5;
                                    i19++;
                                }
                                if (i25 != 0) {
                                    return i25;
                                }
                                if (m121061m(cArr[this.f161375y])) {
                                    m121052S0("Expected value");
                                    throw null;
                                }
                                m121056b();
                                this.f161364G = 10;
                                return 10;
                            }
                            if (i18 != 5) {
                            }
                            i18 = 6;
                            i19++;
                        }
                        i26 = 2;
                        if (i18 != 2) {
                            if (i18 != i26) {
                            }
                            this.f161366I = i19;
                            i25 = 16;
                            this.f161364G = 16;
                        } else {
                            if (z4) {
                            }
                            i26 = 2;
                            if (i18 != i26) {
                            }
                            this.f161366I = i19;
                            i25 = 16;
                            this.f161364G = 16;
                        }
                        if (i25 != 0) {
                            return i25;
                        }
                        if (m121061m(cArr[this.f161375y])) {
                            m121052S0("Expected value");
                            throw null;
                        }
                        m121056b();
                        this.f161364G = 10;
                        return 10;
                    }
                    i25 = 0;
                    if (i25 != 0) {
                        return i25;
                    }
                    if (m121061m(cArr[this.f161375y])) {
                        m121052S0("Expected value");
                        throw null;
                    }
                    m121056b();
                    this.f161364G = 10;
                    return 10;
                }
                i14 = i13;
                if (i14 != 0) {
                    return i14;
                }
                int i315 = this.f161375y;
                i17 = this.f161376z;
                i18 = i13;
                i19 = i18;
                int i316 = i19;
                i24 = i315;
                z4 = true;
                long j17 = 0;
                while (true) {
                    if (i24 + i19 != i17) {
                        c14 = cArr[i24 + i19];
                        if (c14 != '+') {
                            if (c14 != 'E') {
                                if (i18 != 2) {
                                }
                                i18 = 5;
                                i19++;
                            } else {
                                if (i18 != 2) {
                                }
                                i18 = 5;
                                i19++;
                            }
                            if (i25 != 0) {
                                return i25;
                            }
                            if (m121061m(cArr[this.f161375y])) {
                                m121052S0("Expected value");
                                throw null;
                            }
                            m121056b();
                            this.f161364G = 10;
                            return 10;
                        }
                        if (i18 != 5) {
                        }
                        i18 = 6;
                        i19++;
                    } else if (i19 != cArr.length) {
                        if (m121059i(i19 + 1)) {
                            i24 = this.f161375y;
                            i17 = this.f161376z;
                            c14 = cArr[i24 + i19];
                            if (c14 != '+') {
                                if (c14 != 'E') {
                                    if (i18 != 2) {
                                    }
                                    i18 = 5;
                                    i19++;
                                } else {
                                    if (i18 != 2) {
                                    }
                                    i18 = 5;
                                    i19++;
                                }
                                if (i25 != 0) {
                                    return i25;
                                }
                                if (m121061m(cArr[this.f161375y])) {
                                    m121052S0("Expected value");
                                    throw null;
                                }
                                m121056b();
                                this.f161364G = 10;
                                return 10;
                            }
                            if (i18 != 5) {
                            }
                            i18 = 6;
                            i19++;
                        }
                        i26 = 2;
                        if (i18 != 2) {
                            if (i18 != i26) {
                            }
                            this.f161366I = i19;
                            i25 = 16;
                            this.f161364G = 16;
                        } else {
                            if (z4) {
                            }
                            i26 = 2;
                            if (i18 != i26) {
                            }
                            this.f161366I = i19;
                            i25 = 16;
                            this.f161364G = 16;
                        }
                        if (i25 != 0) {
                            return i25;
                        }
                        if (m121061m(cArr[this.f161375y])) {
                            m121052S0("Expected value");
                            throw null;
                        }
                        m121056b();
                        this.f161364G = 10;
                        return 10;
                    }
                    i25 = 0;
                    if (i25 != 0) {
                        return i25;
                    }
                    if (m121061m(cArr[this.f161375y])) {
                        m121052S0("Expected value");
                        throw null;
                    }
                    m121056b();
                    this.f161364G = 10;
                    return 10;
                }
            }
            if (i28 == 1) {
                this.f161364G = 4;
                return 4;
            }
        }
        if (i28 == 1) {
        }
        m121056b();
        this.f161375y--;
        this.f161364G = 7;
        return 7;
    }

    public final boolean hasNext() throws IOException {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        return (iM121058h == 2 || iM121058h == 4 || iM121058h == 17) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m121059i(int i13) throws IOException {
        int i14;
        int i15;
        int i16 = this.f161363F;
        int i17 = this.f161375y;
        this.f161363F = i16 - i17;
        int i18 = this.f161376z;
        char[] cArr = this.f161374x;
        if (i18 != i17) {
            int i19 = i18 - i17;
            this.f161376z = i19;
            System.arraycopy(cArr, i17, cArr, 0, i19);
        } else {
            this.f161376z = 0;
        }
        this.f161375y = 0;
        do {
            int i24 = this.f161376z;
            int i25 = this.f161373w.read(cArr, i24, cArr.length - i24);
            if (i25 == -1) {
                return false;
            }
            i14 = this.f161376z + i25;
            this.f161376z = i14;
            if (this.f161362E == 0 && (i15 = this.f161363F) == 0 && i14 > 0 && cArr[0] == 65279) {
                this.f161375y++;
                this.f161363F = i15 + 1;
                i13++;
            }
        } while (i14 < i13);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final String m121060k(boolean z4) {
        StringBuilder sb4 = new StringBuilder("$");
        int i13 = 0;
        while (true) {
            int i14 = this.f161369L;
            if (i13 >= i14) {
                return sb4.toString();
            }
            int i15 = this.f161368K[i13];
            switch (i15) {
                case 1:
                case 2:
                    int i16 = this.f161371N[i13];
                    if (z4 && i16 > 0 && i13 == i14 - 1) {
                        i16--;
                    }
                    sb4.append('[');
                    sb4.append(i16);
                    sb4.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb4.append('.');
                    String str = this.f161370M[i13];
                    if (str != null) {
                        sb4.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC2875y.m8295h(i15, "Unknown scope value: "));
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m121061m(char c3) throws MalformedJsonException {
        if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (c3 != '/' && c3 != '=') {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m121056b();
        return false;
    }

    public final double nextDouble() throws IOException {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h == 15) {
            this.f161364G = 0;
            int[] iArr = this.f161371N;
            int i13 = this.f161369L - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f161365H;
        }
        if (iM121058h == 16) {
            this.f161367J = new String(this.f161374x, this.f161375y, this.f161366I);
            this.f161375y += this.f161366I;
        } else if (iM121058h == 8 || iM121058h == 9) {
            this.f161367J = m121055a0(iM121058h == 8 ? '\'' : '\"');
        } else if (iM121058h == 10) {
            this.f161367J = m121057b0();
        } else if (iM121058h != 11) {
            throw m121054T0("a double");
        }
        this.f161364G = 11;
        double d3 = Double.parseDouble(this.f161367J);
        if (this.f161372O != 1 && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            m121052S0("JSON forbids NaN and infinities: " + d3);
            throw null;
        }
        this.f161367J = null;
        this.f161364G = 0;
        int[] iArr2 = this.f161371N;
        int i14 = this.f161369L - 1;
        iArr2[i14] = iArr2[i14] + 1;
        return d3;
    }

    public final int nextInt() {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h == 15) {
            long j7 = this.f161365H;
            int i13 = (int) j7;
            if (j7 != i13) {
                throw new NumberFormatException("Expected an int but was " + this.f161365H + m121064s());
            }
            this.f161364G = 0;
            int[] iArr = this.f161371N;
            int i14 = this.f161369L - 1;
            iArr[i14] = iArr[i14] + 1;
            return i13;
        }
        if (iM121058h == 16) {
            this.f161367J = new String(this.f161374x, this.f161375y, this.f161366I);
            this.f161375y += this.f161366I;
        } else {
            if (iM121058h != 8 && iM121058h != 9 && iM121058h != 10) {
                throw m121054T0("an int");
            }
            if (iM121058h == 10) {
                this.f161367J = m121057b0();
            } else {
                this.f161367J = m121055a0(iM121058h == 8 ? '\'' : '\"');
            }
            try {
                int i15 = Integer.parseInt(this.f161367J);
                this.f161364G = 0;
                int[] iArr2 = this.f161371N;
                int i16 = this.f161369L - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return i15;
            } catch (NumberFormatException unused) {
            }
        }
        this.f161364G = 11;
        double d3 = Double.parseDouble(this.f161367J);
        int i17 = (int) d3;
        if (i17 != d3) {
            throw new NumberFormatException("Expected an int but was " + this.f161367J + m121064s());
        }
        this.f161367J = null;
        this.f161364G = 0;
        int[] iArr3 = this.f161371N;
        int i18 = this.f161369L - 1;
        iArr3[i18] = iArr3[i18] + 1;
        return i17;
    }

    public final long nextLong() throws IOException {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h == 15) {
            this.f161364G = 0;
            int[] iArr = this.f161371N;
            int i13 = this.f161369L - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f161365H;
        }
        if (iM121058h == 16) {
            this.f161367J = new String(this.f161374x, this.f161375y, this.f161366I);
            this.f161375y += this.f161366I;
        } else {
            if (iM121058h != 8 && iM121058h != 9 && iM121058h != 10) {
                throw m121054T0("a long");
            }
            if (iM121058h == 10) {
                this.f161367J = m121057b0();
            } else {
                this.f161367J = m121055a0(iM121058h == 8 ? '\'' : '\"');
            }
            try {
                long j7 = Long.parseLong(this.f161367J);
                this.f161364G = 0;
                int[] iArr2 = this.f161371N;
                int i14 = this.f161369L - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return j7;
            } catch (NumberFormatException unused) {
            }
        }
        this.f161364G = 11;
        double d3 = Double.parseDouble(this.f161367J);
        long j13 = (long) d3;
        if (j13 != d3) {
            throw new NumberFormatException("Expected a long but was " + this.f161367J + m121064s());
        }
        this.f161367J = null;
        this.f161364G = 0;
        int[] iArr3 = this.f161371N;
        int i15 = this.f161369L - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return j13;
    }

    public final String nextName() {
        String strM121055a0;
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h == 14) {
            strM121055a0 = m121057b0();
        } else if (iM121058h == 12) {
            strM121055a0 = m121055a0('\'');
        } else {
            if (iM121058h != 13) {
                throw m121054T0("a name");
            }
            strM121055a0 = m121055a0('\"');
        }
        this.f161364G = 0;
        this.f161370M[this.f161369L - 1] = strM121055a0;
        return strM121055a0;
    }

    public final String nextString() {
        String str;
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h == 10) {
            str = m121057b0();
        } else if (iM121058h == 8) {
            str = m121055a0('\'');
        } else if (iM121058h == 9) {
            str = m121055a0('\"');
        } else if (iM121058h == 11) {
            str = this.f161367J;
            this.f161367J = null;
        } else if (iM121058h == 15) {
            str = Long.toString(this.f161365H);
        } else {
            if (iM121058h != 16) {
                throw m121054T0("a string");
            }
            str = new String(this.f161374x, this.f161375y, this.f161366I);
            this.f161375y += this.f161366I;
        }
        this.f161364G = 0;
        int[] iArr = this.f161371N;
        int i13 = this.f161369L - 1;
        iArr[i13] = iArr[i13] + 1;
        return str;
    }

    /* JADX INFO: renamed from: o0 */
    public final int m121062o0() {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        switch (iM121058h) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m121063p0(int i13) throws MalformedJsonException {
        int i14 = this.f161369L;
        if (i14 - 1 >= 255) {
            throw new MalformedJsonException("Nesting limit 255 reached" + m121064s());
        }
        int[] iArr = this.f161368K;
        if (i14 == iArr.length) {
            int i15 = i14 * 2;
            this.f161368K = Arrays.copyOf(iArr, i15);
            this.f161371N = Arrays.copyOf(this.f161371N, i15);
            this.f161370M = (String[]) Arrays.copyOf(this.f161370M, i15);
        }
        int[] iArr2 = this.f161368K;
        int i16 = this.f161369L;
        this.f161369L = i16 + 1;
        iArr2[i16] = i13;
    }

    /* JADX INFO: renamed from: s */
    public final String m121064s() {
        StringBuilder sbM30465s = AbstractC11266d.m30465s(this.f161362E + 1, (this.f161375y - this.f161363F) + 1, " at line ", " column ", " path ");
        sbM30465s.append(m121060k(false));
        return sbM30465s.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void skipValue() {
        int i13 = 0;
        do {
            int iM121058h = this.f161364G;
            if (iM121058h == 0) {
                iM121058h = m121058h();
            }
            switch (iM121058h) {
                case 1:
                    m121063p0(3);
                    i13++;
                    this.f161364G = 0;
                    break;
                case 2:
                    if (i13 == 0) {
                        this.f161370M[this.f161369L - 1] = null;
                    }
                    this.f161369L--;
                    i13--;
                    this.f161364G = 0;
                    break;
                case 3:
                    m121063p0(1);
                    i13++;
                    this.f161364G = 0;
                    break;
                case 4:
                    this.f161369L--;
                    i13--;
                    this.f161364G = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f161364G = 0;
                    break;
                case 8:
                    m121048F0('\'');
                    this.f161364G = 0;
                    break;
                case 9:
                    m121048F0('\"');
                    this.f161364G = 0;
                    break;
                case 10:
                    m121051R0();
                    this.f161364G = 0;
                    break;
                case 12:
                    m121048F0('\'');
                    if (i13 == 0) {
                        this.f161370M[this.f161369L - 1] = "<skipped>";
                    }
                    this.f161364G = 0;
                    break;
                case 13:
                    m121048F0('\"');
                    if (i13 == 0) {
                        this.f161370M[this.f161369L - 1] = "<skipped>";
                    }
                    this.f161364G = 0;
                    break;
                case 14:
                    m121051R0();
                    if (i13 == 0) {
                        this.f161370M[this.f161369L - 1] = "<skipped>";
                    }
                    this.f161364G = 0;
                    break;
                case 16:
                    this.f161375y += this.f161366I;
                    this.f161364G = 0;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    break;
            }
            return;
        } while (i13 > 0);
        int[] iArr = this.f161371N;
        int i14 = this.f161369L - 1;
        iArr[i14] = iArr[i14] + 1;
    }

    public final String toString() {
        return C37653a.class.getSimpleName() + m121064s();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m121065x() {
        int iM121058h = this.f161364G;
        if (iM121058h == 0) {
            iM121058h = m121058h();
        }
        if (iM121058h == 5) {
            this.f161364G = 0;
            int[] iArr = this.f161371N;
            int i13 = this.f161369L - 1;
            iArr[i13] = iArr[i13] + 1;
            return true;
        }
        if (iM121058h != 6) {
            throw m121054T0("a boolean");
        }
        this.f161364G = 0;
        int[] iArr2 = this.f161371N;
        int i14 = this.f161369L - 1;
        iArr2[i14] = iArr2[i14] + 1;
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public final char m121066x0() throws MalformedJsonException {
        int i13;
        if (this.f161375y == this.f161376z && !m121059i(1)) {
            m121052S0("Unterminated escape sequence");
            throw null;
        }
        int i14 = this.f161375y;
        int i15 = i14 + 1;
        this.f161375y = i15;
        char[] cArr = this.f161374x;
        char c3 = cArr[i14];
        if (c3 != '\n') {
            if (c3 != '\"') {
                if (c3 != '\'') {
                    if (c3 != '/' && c3 != '\\') {
                        if (c3 == 'b') {
                            return '\b';
                        }
                        if (c3 == 'f') {
                            return '\f';
                        }
                        if (c3 == 'n') {
                            return '\n';
                        }
                        if (c3 == 'r') {
                            return '\r';
                        }
                        if (c3 == 't') {
                            return '\t';
                        }
                        if (c3 != 'u') {
                            m121052S0("Invalid escape sequence");
                            throw null;
                        }
                        if (i14 + 5 > this.f161376z && !m121059i(4)) {
                            m121052S0("Unterminated escape sequence");
                            throw null;
                        }
                        int i16 = this.f161375y;
                        int i17 = i16 + 4;
                        int i18 = 0;
                        while (i16 < i17) {
                            char c7 = cArr[i16];
                            int i19 = i18 << 4;
                            if (c7 >= '0' && c7 <= '9') {
                                i13 = c7 - '0';
                            } else if (c7 >= 'a' && c7 <= 'f') {
                                i13 = c7 - 'W';
                            } else {
                                if (c7 < 'A' || c7 > 'F') {
                                    m121052S0("Malformed Unicode escape \\u".concat(new String(cArr, this.f161375y, 4)));
                                    throw null;
                                }
                                i13 = c7 - '7';
                            }
                            i18 = i13 + i19;
                            i16++;
                        }
                        this.f161375y += 4;
                        return (char) i18;
                    }
                }
            }
            return c3;
        }
        if (this.f161372O == 3) {
            m121052S0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f161362E++;
        this.f161363F = i15;
        if (this.f161372O == 3) {
            m121052S0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c3;
    }
}
